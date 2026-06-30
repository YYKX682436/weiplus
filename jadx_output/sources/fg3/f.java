package fg3;

/* loaded from: classes12.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg3.g f262432d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(fg3.g gVar) {
        super(1);
        this.f262432d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pf3.b visibility = (pf3.b) obj;
        kotlin.jvm.internal.o.g(visibility, "$this$visibility");
        fg3.g gVar = this.f262432d;
        em.m1 m1Var = gVar.f262433v;
        if (m1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout a17 = m1Var.a();
        kotlin.jvm.internal.o.f(a17, "getBtnMore(...)");
        visibility.c(a17);
        em.m1 m1Var2 = gVar.f262433v;
        if (m1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout b17 = m1Var2.b();
        kotlin.jvm.internal.o.f(b17, "getBtnSave(...)");
        visibility.c(b17);
        em.m1 m1Var3 = gVar.f262433v;
        if (m1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout c17 = m1Var3.c();
        kotlin.jvm.internal.o.f(c17, "getBtnShare(...)");
        visibility.c(c17);
        return jz5.f0.f302826a;
    }
}
