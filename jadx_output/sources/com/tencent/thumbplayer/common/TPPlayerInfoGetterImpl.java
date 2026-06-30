package com.tencent.thumbplayer.common;

/* loaded from: classes16.dex */
public class TPPlayerInfoGetterImpl implements com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter {
    private static final java.lang.String TAG = "TPPlayerInfoGetterImpl";
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBase mPlayerBase;

    public TPPlayerInfoGetterImpl(com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase) {
        this.mPlayerBase = iTPPlayerBase;
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter
    public com.tencent.thumbplayer.core.player.TPDynamicStatisticParams getDynamicStatisticParams(boolean z17) {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "playerBase is null, return default dynamic statistic params");
            return new com.tencent.thumbplayer.core.player.TPDynamicStatisticParams();
        }
        com.tencent.thumbplayer.core.player.TPDynamicStatisticParams dynamicStatisticParams = iTPPlayerBase.getDynamicStatisticParams(z17);
        if (dynamicStatisticParams != null) {
            return dynamicStatisticParams;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "cannot get params from core, return default dynamic statistic params");
        return new com.tencent.thumbplayer.core.player.TPDynamicStatisticParams();
    }

    @Override // com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter
    public com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
        com.tencent.thumbplayer.adapter.player.ITPPlayerBase iTPPlayerBase = this.mPlayerBase;
        if (iTPPlayerBase == null) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "playerBase is null, return default general play flow params");
            return new com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams();
        }
        com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams generalPlayFlowParams = iTPPlayerBase.getGeneralPlayFlowParams();
        if (generalPlayFlowParams != null) {
            return generalPlayFlowParams;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "cannot get params from core, return default general play flow params");
        return new com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams();
    }
}
