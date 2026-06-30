package com.tencent.wevision2.modules.ocr;

/* loaded from: classes14.dex */
public class Certificate {
    public static final int DEFECT_BLUR = 8;
    public static final int DEFECT_IMCOMPLETED = 1;
    public static final int DEFECT_OCCLUDED = 2;
    public static final int DEFECT_REFLECTION = 4;
    public static final int FACE_BACK = 2;
    public static final int FACE_FRONT = 1;
    public static final int FACE_UNKNOWN = 0;
    public static final int PITCH_STATE_BACK = 4;
    public static final int PITCH_STATE_BAD = 0;
    public static final int PITCH_STATE_FRONT = 3;
    public static final int PITCH_STATE_HORIZONTAL = 2;
    public static final int PITCH_STATE_NOT_HORIZONTAL = 1;
    public static final int TYPE_IDCARD = 0;
    public static final int TYPE_PASSPORT = 1;
    public android.graphics.PointF[] box;
    public android.graphics.PointF[] contours;
    public int defects;
    public int face;
    public int occludedPixels;
    public int reflectionPixels;

    static {
        int i17 = fx5.a.f267157a;
    }

    public Certificate(int i17, int i18, int i19, int i27, android.graphics.PointF[] pointFArr, android.graphics.PointF[] pointFArr2) {
        this.defects = i17;
        this.occludedPixels = i18;
        this.reflectionPixels = i19;
        this.face = i27;
        this.box = pointFArr;
        this.contours = pointFArr2;
    }

    public native int getPitchState(double d17, double d18, double d19);
}
