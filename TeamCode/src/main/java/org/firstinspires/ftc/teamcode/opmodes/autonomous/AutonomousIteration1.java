package org.firstinspires.ftc.teamcode.opmodes.autonomous;

import static com.qualcomm.robotcore.util.ElapsedTime.Resolution.SECONDS;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;


import org.firstinspires.ftc.robotcore.external.tfod.Recognition;
import org.firstinspires.ftc.teamcode.subsystems.MecanumDrive;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.tfod.TfodProcessor;


import java.util.List;

public class AutonomousIteration1 extends LinearOpMode{
    public static String TEAM_NAME = "Tx-Rx";
    public static int TEAM_NUMBER = 21386;
    public MecanumDrive drive;

    //Define and declare Robot Starting Locations
    public enum START_POSITION{
        BLUE_LEFT,
        BLUE_RIGHT,
        RED_LEFT,
        RED_RIGHT
    }
    public enum ALLIANCE{
        BLUE,
        RED
    }
    public static START_POSITION startPosition;
    public static ALLIANCE alliance;
    //initializing poses
    Pose2d initpose;
    Pose2d specimenpose;
    Pose2d parkpose;
    Pose2d basketpose, specimenpickpose;
    @Override
    public void runOpMode() throws InterruptedException {
        startPosition = START_POSITION.BLUE_LEFT;
        while (!isStopRequested() && !opModeIsActive()) {
            telemetry.addData("Selected Starting Position", startPosition);

        }
       /* public void selectStartingPosition() {
            telemetry.setAutoClear(true);
            telemetry.clearAll();
            //******select start pose*****
            while(!isStopRequested()){
                telemetry.addData("Initializing Autonomous adopted for Team:",
                        TEAM_NAME, " ", TEAM_NUMBER);
                telemetry.addData("---------------------------------------","");
                telemetry.addData("Select Starting Position using XYAB on Logitech Gamepad 1:","");
                telemetry.addData("    Blue Left   ", "(X)");
                telemetry.addData("    Blue Right ", "(Y)");
                telemetry.addData("    Red Left    ", "(B)");
                telemetry.addData("    Red Right  ", "(A)");
                if(gamepad1.x){
                    startPosition = START_POSITION.BLUE_LEFT;
                    alliance = ALLIANCE.BLUE;
                    break;
                }
                if(gamepad1.y){
                    startPosition = START_POSITION.BLUE_RIGHT;
                    alliance = ALLIANCE.BLUE;
                    break;
                }
                if(gamepad1.b){
                    startPosition = START_POSITION.RED_LEFT;
                    alliance = ALLIANCE.RED;
                    break;
                }
                if(gamepad1.a){
                    startPosition = START_POSITION.RED_RIGHT;
                    alliance = ALLIANCE.RED;
                    break;
                }
                telemetry.update();
            }
            telemetry.clearAll();

        }

        */
    }
}
