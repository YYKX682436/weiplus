package ur0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Matrix f430281a;

    public a(boolean z17, int i17, android.graphics.RectF previewRect, android.graphics.RectF cameraDriverRect) {
        kotlin.jvm.internal.o.g(previewRect, "previewRect");
        kotlin.jvm.internal.o.g(cameraDriverRect, "cameraDriverRect");
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(z17 ? -1.0f : 1.0f, 1.0f);
        matrix.postRotate(i17);
        matrix.mapRect(previewRect);
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.setRectToRect(previewRect, cameraDriverRect, android.graphics.Matrix.ScaleToFit.FILL);
        matrix.setConcat(matrix2, matrix);
        this.f430281a = matrix;
    }
}
