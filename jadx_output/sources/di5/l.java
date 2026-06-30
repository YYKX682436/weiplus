package di5;

/* loaded from: classes12.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ di5.m f232804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(di5.m mVar) {
        super(1);
        this.f232804d = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pf3.b visibility = (pf3.b) obj;
        kotlin.jvm.internal.o.g(visibility, "$this$visibility");
        di5.m mVar = this.f232804d;
        em.j1 j1Var = mVar.f232805v;
        if (j1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout c17 = j1Var.c();
        kotlin.jvm.internal.o.f(c17, "getBtnShare(...)");
        visibility.c(c17);
        em.j1 j1Var2 = mVar.f232805v;
        if (j1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout b17 = j1Var2.b();
        kotlin.jvm.internal.o.f(b17, "getBtnSave(...)");
        visibility.c(b17);
        em.j1 j1Var3 = mVar.f232805v;
        if (j1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout a17 = j1Var3.a();
        kotlin.jvm.internal.o.f(a17, "getBtnMore(...)");
        visibility.c(a17);
        em.j1 j1Var4 = mVar.f232805v;
        if (j1Var4 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.LinearLayout d17 = j1Var4.d();
        kotlin.jvm.internal.o.f(d17, "getGalleryFinderPostBtn(...)");
        visibility.c(d17);
        return jz5.f0.f302826a;
    }
}
