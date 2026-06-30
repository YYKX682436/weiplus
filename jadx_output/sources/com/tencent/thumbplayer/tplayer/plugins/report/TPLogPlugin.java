package com.tencent.thumbplayer.tplayer.plugins.report;

/* loaded from: classes15.dex */
public class TPLogPlugin implements com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase {
    public static final java.lang.String TAG = "TPLogPlugin";

    @Override // com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase
    public void onAttach() {
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase
    public void onDetach() {
    }

    @Override // com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase
    public void onEvent(int i17, int i18, int i19, java.lang.String str, java.lang.Object obj) {
        switch (i17) {
            case 101:
                com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "create player adapter");
                return;
            case 102:
                com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "start prepare");
                return;
            case 103:
                com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "on prepared");
                return;
            case 104:
                com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "start play");
                return;
            case 105:
            default:
                return;
            case 106:
                com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "on paused");
                return;
            case 107:
                com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "on stoped");
                return;
            case 108:
                com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "on error:" + i18);
                return;
            case 109:
                com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "start seek");
                return;
            case 110:
                com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "seek complete");
                return;
            case 111:
                com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "on play complete");
                return;
            case 112:
                com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "on release");
                return;
            case 113:
                com.tencent.thumbplayer.utils.TPLogUtil.d(TAG, "on reset");
                return;
        }
    }
}
