package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "SquarebotAlt")
public class SquarebotAlt extends OpMode {
    DcMotor lf, lb, rf, rb;
    TouchSensor touchSensor;
    double speedMultiplier = 0.25;

    public void init() {
        lf = hardwareMap.get(DcMotor.class, "lf");
        lb = hardwareMap.get(DcMotor.class, "lb");
        rf = hardwareMap.get(DcMotor.class, "rf");
        rb = hardwareMap.get(DcMotor.class, "rb");

        rf.setDirection(DcMotor.Direction.REVERSE);
        rb.setDirection(DcMotor.Direction.REVERSE);
        
             telemetry.setAutoClear(false);
    }

    public void loop() {
        telemetry.addData("test", gamepad1.dpad_up);
        telemetry.update();
        if (gamepad1.dpad_up) {
            lf.setPower(-1 * speedMultiplier);
            rf.setPower(-1 * speedMultiplier);
            lb.setPower(-1 * speedMultiplier);
            rb.setPower(-1 * speedMultiplier);
        } else if (gamepad1.dpad_down) {
            lf.setPower(1 * speedMultiplier);
            rf.setPower(1 * speedMultiplier);
            lb.setPower(1 * speedMultiplier);
            rb.setPower(1 * speedMultiplier);
        } else if (gamepad1.dpad_right) {
            lf.setPower(-1 * speedMultiplier);
            rf.setPower(1 * speedMultiplier);
            lb.setPower(-1 * speedMultiplier);
            rb.setPower(1 * speedMultiplier);
        } else if (gamepad1.dpad_left) {
            lf.setPower(1 * speedMultiplier);
            rf.setPower(-1 * speedMultiplier);
            lb.setPower(1 * speedMultiplier);
            rb.setPower(-1 * speedMultiplier);
        } else if (gamepad1.b) {
            lf.setPower(-1 * speedMultiplier);
            lb.setPower(1 * speedMultiplier);
            rf.setPower(1 * speedMultiplier);
            rb.setPower(-1 * speedMultiplier);
        } else if (gamepad1.x) {
            lf.setPower(1 * speedMultiplier);
            lb.setPower(-1 * speedMultiplier);
            rf.setPower(-1 * speedMultiplier);
            rb.setPower(1 * speedMultiplier);
        }else {
            lf.setPower(0);
            rf.setPower(0);
            lb.setPower(0);
            rb.setPower(0);
        }
    }
}
