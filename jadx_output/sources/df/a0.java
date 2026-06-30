package df;

/* loaded from: classes7.dex */
public interface a0 {
    static /* synthetic */ void c(df.a0 a0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchToImage");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        a0Var.h(z17);
    }

    void a(boolean z17);

    void b(boolean z17);

    void d(io.flutter.embedding.android.RenderMode renderMode, java.lang.Runnable runnable);

    void e();

    void f(df.d dVar);

    void g();

    void h(boolean z17);

    void i(android.content.Context context);

    void j(android.view.ViewGroup viewGroup);

    default void k(io.flutter.embedding.android.RenderMode renderMode, java.lang.Runnable finish) {
        kotlin.jvm.internal.o.g(renderMode, "renderMode");
        kotlin.jvm.internal.o.g(finish, "finish");
    }

    void l();

    void m();

    void setBackgroundColor(int i17);
}
