package app.aaps.core.keys

enum class UnitDoubleKey(
    override val key: String,
    override val defaultValue: Double,
    override val minMgdl: Int,
    override val maxMgdl: Int,
    override val defaultedBySM: Boolean = false,
    override val showInApsMode: Boolean = true,
    override val showInNsClientMode: Boolean = true,
    override val showInPumpControlMode: Boolean = true,
    override val dependency: BooleanPreferenceKey? = null,
    override val negativeDependency: BooleanPreferenceKey? = null,
    override val hideParentScreenIfHidden: Boolean = false
) : UnitDoublePreferenceKey {

    OverviewEatingSoonTarget("key_eating_soon_target", 90.0, 72, 160, defaultedBySM = true),
    OverviewActivityTarget("key_activity_target", 140.0, 108, 180, defaultedBySM = true),
    OverviewHypoTarget("key_hypo_target", 160.0, 108, 180, defaultedBySM = true),
    OverviewLowMark("key_low_mark", 72.0, 25, 160, showInNsClientMode = false, hideParentScreenIfHidden = true),
    OverviewHighMark("key_high_mark", 180.0, 90, 250, showInNsClientMode = false),
    ApsLgsThreshold("key_dynamic_isf_lgs_threshold", 65.0, 65, 120, defaultedBySM = true, dependency =BooleanKey.ApsUseDynamicSensitivity),
    ApsAutoIsfSmbDeliveryRatioBgRange("key_openapsama_smb_delivery_ratio_bg_range", 0.0, 0, 100, defaultedBySM = true),
    //FslCalOffset("key_fslCal_Offset", 0.0, -50, 50, defaultedBySM = true),  // applied factor 18 twice
}