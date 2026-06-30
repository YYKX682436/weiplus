package hn5;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.view.ratio.RatioLayout f282613a;

    public abstract int a();

    public abstract java.lang.Object b(int i17);

    public abstract android.view.View c(int i17, java.lang.Object obj);

    public final com.tencent.mm.view.ratio.RatioLayout d() {
        com.tencent.mm.view.ratio.RatioLayout ratioLayout = this.f282613a;
        if (ratioLayout != null) {
            return ratioLayout;
        }
        kotlin.jvm.internal.o.o("layout");
        throw null;
    }

    public abstract hn5.b e(int i17);

    public void f() {
        if (this.f282613a != null) {
            d().getLayoutManager().b();
        }
    }

    public void g(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }
}
