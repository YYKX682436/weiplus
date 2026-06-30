package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public abstract class q0 {
    public static final float a(android.graphics.Matrix matrix) {
        kotlin.jvm.internal.o.g(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float f17 = fArr[0];
        float f18 = fArr[3];
        return (float) java.lang.Math.sqrt((f17 * f17) + (f18 * f18));
    }

    public static final void b(android.graphics.Matrix matrix, android.graphics.RectF src, android.graphics.RectF dst) {
        kotlin.jvm.internal.o.g(matrix, "<this>");
        kotlin.jvm.internal.o.g(src, "src");
        kotlin.jvm.internal.o.g(dst, "dst");
        matrix.reset();
        float max = java.lang.Math.max(dst.height() / src.height(), dst.width() / src.width());
        matrix.postTranslate(-src.centerX(), -src.centerY());
        matrix.postScale(max, max);
        matrix.postTranslate(dst.centerX(), dst.centerY());
    }
}
