package org.webrtc;

/* loaded from: classes16.dex */
public class RendererCommon {
    private static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    /* renamed from: org.webrtc.RendererCommon$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RendererCommon$ScalingType;

        static {
            int[] iArr = new int[org.webrtc.RendererCommon.ScalingType.values().length];
            $SwitchMap$org$webrtc$RendererCommon$ScalingType = iArr;
            try {
                iArr[org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$RendererCommon$ScalingType[org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FILL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$RendererCommon$ScalingType[org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes16.dex */
    public interface GlDrawer {
        void drawOes(int i17, float[] fArr, int i18, int i19, int i27, int i28, int i29, int i37);

        void drawRgb(int i17, float[] fArr, int i18, int i19, int i27, int i28, int i29, int i37);

        void drawYuv(int[] iArr, float[] fArr, int i17, int i18, int i19, int i27, int i28, int i29);

        void release();
    }

    /* loaded from: classes16.dex */
    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i17, int i18, int i19);

        void onRenderStats(org.webrtc.PerformanceStatistics performanceStatistics);
    }

    /* loaded from: classes16.dex */
    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    /* loaded from: classes16.dex */
    public static class VideoLayoutMeasure {
        private float visibleFractionMatchOrientation;
        private float visibleFractionMismatchOrientation;

        public VideoLayoutMeasure() {
            org.webrtc.RendererCommon.ScalingType scalingType = org.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED;
            this.visibleFractionMatchOrientation = org.webrtc.RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = org.webrtc.RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
        }

        public android.graphics.Point measure(int i17, int i18, int i19, int i27) {
            int defaultSize = android.view.View.getDefaultSize(Integer.MAX_VALUE, i17);
            int defaultSize2 = android.view.View.getDefaultSize(Integer.MAX_VALUE, i18);
            if (i19 == 0 || i27 == 0 || defaultSize == 0 || defaultSize2 == 0) {
                return new android.graphics.Point(defaultSize, defaultSize2);
            }
            float f17 = i19 / i27;
            android.graphics.Point displaySize = org.webrtc.RendererCommon.getDisplaySize(((f17 > 1.0f ? 1 : (f17 == 1.0f ? 0 : -1)) > 0) == (((float) defaultSize) / ((float) defaultSize2) > 1.0f) ? this.visibleFractionMatchOrientation : this.visibleFractionMismatchOrientation, f17, defaultSize, defaultSize2);
            if (android.view.View.MeasureSpec.getMode(i17) == 1073741824) {
                displaySize.x = defaultSize;
            }
            if (android.view.View.MeasureSpec.getMode(i18) == 1073741824) {
                displaySize.y = defaultSize2;
            }
            return displaySize;
        }

        public void setScalingType(org.webrtc.RendererCommon.ScalingType scalingType) {
            setScalingType(scalingType, scalingType);
        }

        public void setVisibleFraction(float f17, float f18) {
            this.visibleFractionMatchOrientation = f17;
            this.visibleFractionMismatchOrientation = f18;
        }

        public void setScalingType(org.webrtc.RendererCommon.ScalingType scalingType, org.webrtc.RendererCommon.ScalingType scalingType2) {
            this.visibleFractionMatchOrientation = org.webrtc.RendererCommon.convertScalingTypeToVisibleFraction(scalingType);
            this.visibleFractionMismatchOrientation = org.webrtc.RendererCommon.convertScalingTypeToVisibleFraction(scalingType2);
        }
    }

    private static void adjustOrigin(float[] fArr) {
        float f17 = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[12] = f17;
        float f18 = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[13] = f18;
        fArr[12] = f17 + 0.5f;
        fArr[13] = f18 + 0.5f;
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static android.graphics.Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float convertScalingTypeToVisibleFraction(org.webrtc.RendererCommon.ScalingType scalingType) {
        int i17 = org.webrtc.RendererCommon.AnonymousClass1.$SwitchMap$org$webrtc$RendererCommon$ScalingType[scalingType.ordinal()];
        if (i17 == 1) {
            return 1.0f;
        }
        if (i17 == 2) {
            return 0.0f;
        }
        if (i17 == 3) {
            return BALANCED_VISIBLE_FRACTION;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static android.graphics.Point getDisplaySize(org.webrtc.RendererCommon.ScalingType scalingType, float f17, int i17, int i18) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f17, i17, i18);
    }

    public static float[] getLayoutMatrix(boolean z17, float f17, float f18) {
        float f19;
        float f27;
        if (f18 > f17) {
            f27 = f17 / f18;
            f19 = 1.0f;
        } else {
            f19 = f18 / f17;
            f27 = 1.0f;
        }
        if (z17) {
            f19 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f19, f27, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static android.graphics.Point getDisplaySize(float f17, float f18, int i17, int i18) {
        if (f17 != 0.0f && f18 != 0.0f) {
            return new android.graphics.Point(java.lang.Math.min(i17, java.lang.Math.round((i18 / f17) * f18)), java.lang.Math.min(i18, java.lang.Math.round((i17 / f17) / f18)));
        }
        return new android.graphics.Point(i17, i18);
    }
}
