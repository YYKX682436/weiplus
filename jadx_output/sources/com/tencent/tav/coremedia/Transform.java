package com.tencent.tav.coremedia;

/* loaded from: classes15.dex */
public class Transform {
    public float degrees;
    public final float scaleX;
    public final float scaleY;
    public final float translateX;
    public final float translateY;

    public Transform(float f17, float f18, float f19, float f27, float f28) {
        this.scaleX = f17;
        this.scaleY = f18;
        this.translateX = f19;
        this.translateY = f27;
        this.degrees = f28;
    }

    public static com.tencent.tav.coremedia.Transform instanceFromScale(float f17, float f18) {
        return new com.tencent.tav.coremedia.Transform(f17, f18, 0.0f, 0.0f, 0.0f);
    }

    public static com.tencent.tav.coremedia.Transform instanceFromTranslate(float f17, float f18) {
        return new com.tencent.tav.coremedia.Transform(1.0f, 1.0f, f17, f18, 0.0f);
    }

    public android.graphics.Matrix toMatrix() {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(this.degrees);
        matrix.postScale(this.scaleX, this.scaleY);
        matrix.postTranslate(this.translateX, this.translateY);
        return matrix;
    }
}
