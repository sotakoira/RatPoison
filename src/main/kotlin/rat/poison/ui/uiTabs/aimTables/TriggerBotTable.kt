package rat.poison.ui.uiTabs.aimTables

import com.kotcrab.vis.ui.widget.CollapsibleWidget
import com.kotcrab.vis.ui.widget.VisTable
import rat.poison.ui.uiElements.VisCheckBoxCustom
import rat.poison.ui.uiElements.aim.AimVisCheckBox
import rat.poison.ui.uiElements.aim.AimVisSlider
import rat.poison.ui.uiElements.binds.VisBindTableCustom

class TriggerBotTable: VisTable(false) {
    private val collapsibleTable = VisTable(false)
    val collapsibleWidget = CollapsibleWidget(collapsibleTable)

    //Init labels/sliders/boxes that show values here
    val boneTriggerEnableKey = VisCheckBoxCustom("Trigger On Key", "TRIGGER_ENABLE_KEY")
    val boneTriggerKey = VisBindTableCustom("Trigger Key", "TRIGGER_KEY", keyWidth = 225F)

    val trigEnable = AimVisCheckBox("Enable Trigger", "_TRIGGER") //Per weapon category

    val trigAimbot = AimVisCheckBox("Use Aim", "_TRIGGER_AIMBOT")
    val trigInCross = AimVisCheckBox("Check In Cross", "_TRIGGER_INCROSS")
    val trigInFov = AimVisCheckBox("Check In Fov", "_TRIGGER_INFOV")
    val trigFov = AimVisSlider("Trigger FOV", "_TRIGGER_FOV", .1F, 90F, .5F, false, 1, 225F, 225F)
    val trigShootBacktrack = AimVisCheckBox("Enable Backtrack", "_TRIGGER_BACKTRACK")
    val initTrigDelay = AimVisSlider("First Shot Delay", "_TRIGGER_INIT_SHOT_DELAY", 0F, 500F, 10F, true, 0, 225F, 225F)
    val perShotTrigDelay = AimVisSlider("Per Shot Delay", "_TRIGGER_PER_SHOT_DELAY", 0F, 500F, 10F, true, 0, 225F, 225F)

    init {
        //Set specific colors
        trigAimbot.backgroundImage.setColor(1F, .1F, .1F, 1F)

        collapsibleTable.apply {
            add(boneTriggerEnableKey).left().row()
            add(boneTriggerKey).left().row()
            add(trigEnable).left().padTop(8F).padBottom(8F).row()

            add(trigAimbot).left().row()
            add(trigInCross).left().row()
            add(trigInFov).left().row()
            add(trigShootBacktrack).left().row()
            add(trigFov).left().row()
            add(initTrigDelay).left().row()
            add(perShotTrigDelay).left().row()
        }

        add(collapsibleWidget).prefWidth(475F).growX()
    }
}