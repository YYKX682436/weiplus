package com.tencent.thumbplayer.tplayer.reportv2;

/* loaded from: classes16.dex */
public class TPReporterFactory {
    private static final java.lang.String TAG = "TPReporterFactory";

    public static com.tencent.thumbplayer.tplayer.reportv2.ITPReporter createReporterWithType(int i17) {
        if (i17 == 0) {
            return new com.tencent.thumbplayer.tplayer.reportv2.TPVodReporter();
        }
        if (i17 == 1) {
            return new com.tencent.thumbplayer.tplayer.reportv2.TPLiveReporter();
        }
        if (i17 == 2) {
            return new com.tencent.thumbplayer.tplayer.reportv2.TPPrepareFailReporter();
        }
        com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, "Type is not match ReporterType, return null");
        return null;
    }
}
