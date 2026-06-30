package com.tencent.youtu.ytcommon.tools;

/* loaded from: classes14.dex */
public class YTFaceUtils {
    private static final java.lang.String TAG = "FaceUtils";

    /* loaded from: classes6.dex */
    public interface ShelterJudge {
        public static final int SHELTER_CHIN = 2;
        public static final int SHELTER_LEFTEYE = 7;
        public static final int SHELTER_LEFTFACE = 1;
        public static final int SHELTER_MOUTH = 3;
        public static final int SHELTER_NOSE = 5;
        public static final int SHELTER_PARAM_ERROR = -2;
        public static final int SHELTER_PARAM_NULL = -1;
        public static final int SHELTER_PASS = 0;
        public static final int SHELTER_RIGHTEYE = 6;
        public static final int SHELTER_RIGHTFACE = 4;
    }

    public static android.graphics.Rect getFaceScreen(com.tencent.youtu.ytfacetrack.YTFaceTrack.FaceStatus faceStatus) {
        float[] fArr = faceStatus.xys;
        float f17 = fArr[0];
        float f18 = fArr[1];
        float f19 = f17;
        float f27 = f19;
        int i17 = 0;
        float f28 = f18;
        while (i17 < 180) {
            float[] fArr2 = faceStatus.xys;
            float f29 = fArr2[i17];
            if (f19 >= f29) {
                f19 = f29;
            }
            if (f27 <= f29) {
                f27 = f29;
            }
            int i18 = i17 + 1;
            float f37 = fArr2[i18];
            if (f18 >= f37) {
                f18 = f37;
            }
            if (f28 <= f37) {
                f28 = f37;
            }
            i17 = i18 + 1;
        }
        return new android.graphics.Rect((int) f19, (int) f18, (int) f27, (int) f28);
    }

    public static int shelterJudge(float[] fArr) {
        if (fArr == null) {
            com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "[YTFaceTraceInterface.blockJudge] input pointsVis is null.");
            return -1;
        }
        if (fArr.length != 90) {
            com.tencent.youtu.ytcommon.tools.YTLogger.i(TAG, "[YTFaceTraceInterface.blockJudge] input pointsVis.length != 90. current pointsVis.length: " + fArr.length);
            return -2;
        }
        int i17 = 0;
        for (int i18 = 33; i18 <= 45; i18++) {
            if (fArr[i18 - 1] < 0.7f) {
                i17++;
            }
        }
        if (i17 >= 4) {
            return 5;
        }
        int i19 = 0;
        for (int i27 = 46; i27 <= 67; i27++) {
            if (fArr[i27 - 1] < 0.7f) {
                i19++;
            }
        }
        if (i19 >= 4) {
            return 3;
        }
        int i28 = 0;
        for (int i29 = 9; i29 <= 16; i29++) {
            if (fArr[i29 - 1] < 0.7f) {
                i28++;
            }
        }
        for (int i37 = 25; i37 <= 32; i37++) {
            if (fArr[i37 - 1] < 0.7f) {
                i28++;
            }
        }
        if (fArr[89] < 0.7f) {
            i28++;
        }
        if (i28 >= 4) {
            return 6;
        }
        int i38 = 0;
        for (int i39 = 1; i39 <= 8; i39++) {
            if (fArr[i39 - 1] < 0.7f) {
                i38++;
            }
        }
        for (int i47 = 17; i47 <= 24; i47++) {
            if (fArr[i47 - 1] < 0.7f) {
                i38++;
            }
        }
        if (fArr[88] < 0.7f) {
            i38++;
        }
        if (i38 >= 4) {
            return 7;
        }
        int i48 = 0;
        for (int i49 = 68; i49 < 74; i49++) {
            if (fArr[i49 - 1] < 0.7f) {
                i48++;
            }
        }
        if (i48 >= 3) {
            return 1;
        }
        int i57 = 0;
        for (int i58 = 82; i58 <= 88; i58++) {
            if (fArr[i58 - 1] < 0.7f) {
                i57++;
            }
        }
        if (i57 >= 3) {
            return 4;
        }
        int i59 = 0;
        for (int i66 = 75; i66 <= 81; i66++) {
            if (fArr[i66 - 1] < 0.7f) {
                i59++;
            }
        }
        return i59 >= 3 ? 2 : 0;
    }
}
