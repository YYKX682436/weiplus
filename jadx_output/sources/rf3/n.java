package rf3;

/* loaded from: classes12.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf3.p f394996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(rf3.p pVar) {
        super(1);
        this.f394996d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pf3.b visibility = (pf3.b) obj;
        kotlin.jvm.internal.o.g(visibility, "$this$visibility");
        rf3.p pVar = this.f394996d;
        em.m1 m1Var = pVar.f394998v;
        if (m1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout b17 = m1Var.b();
        kotlin.jvm.internal.o.f(b17, "getBtnSave(...)");
        visibility.c(b17);
        em.m1 m1Var2 = pVar.f394998v;
        if (m1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout a17 = m1Var2.a();
        kotlin.jvm.internal.o.f(a17, "getBtnMore(...)");
        visibility.c(a17);
        return jz5.f0.f302826a;
    }
}
