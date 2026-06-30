package mn2;

/* loaded from: classes5.dex */
public final class s0 extends dp0.d {
    @Override // zo0.k
    public hp0.g a(cp0.n targetView, vo0.h reaper, hp0.g input) {
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        kotlin.jvm.internal.o.g(input, "input");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) input.f282913a;
        android.view.View b17 = targetView.b();
        if (b17 == null) {
            return input;
        }
        int width = b17.getWidth();
        float width2 = (width * 1.0f) / bitmap.getWidth();
        float height = (b17.getHeight() - (bitmap.getHeight() * width2)) * 0.5f;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(width2, width2);
        matrix.postTranslate(0.0f, height);
        ((ku5.t0) ku5.t0.f312615d).B(new mn2.r0(b17, matrix));
        return input;
    }

    @Override // zo0.k
    public java.lang.String b(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        return source;
    }
}
