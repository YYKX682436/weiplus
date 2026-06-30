package tr0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final android.graphics.RectF f421278b = new android.graphics.RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f);

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Matrix f421279a;

    public a(boolean z17, int i17, android.graphics.RectF previewRect) {
        kotlin.jvm.internal.o.g(previewRect, "previewRect");
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(z17 ? -1.0f : 1.0f, 1.0f);
        matrix.postRotate(i17);
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.setRectToRect(f421278b, previewRect, android.graphics.Matrix.ScaleToFit.FILL);
        matrix.setConcat(matrix2, matrix);
        android.graphics.Matrix matrix3 = new android.graphics.Matrix();
        matrix.invert(matrix3);
        this.f421279a = matrix3;
    }
}
