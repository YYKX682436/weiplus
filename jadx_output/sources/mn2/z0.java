package mn2;

/* loaded from: classes10.dex */
public final class z0 extends mn2.a0 {
    @Override // mn2.a0, zo0.i
    public hp0.g a(cp0.n targetView, vo0.h reaper, jp0.f input) {
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        kotlin.jvm.internal.o.g(input, "input");
        hp0.g a17 = super.a(targetView, reaper, input);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) a17.f282913a;
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return a17;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlinx.coroutines.l.f(null, new mn2.y0(h0Var, bitmap, targetView, null), 1, null);
        return new hp0.g(h0Var.f310123d);
    }
}
