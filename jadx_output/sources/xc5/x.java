package xc5;

/* loaded from: classes12.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.h0 f453584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(xc5.h0 h0Var) {
        super(1);
        this.f453584d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pf3.b visibility = (pf3.b) obj;
        kotlin.jvm.internal.o.g(visibility, "$this$visibility");
        xc5.h0 h0Var = this.f453584d;
        em.z1 z1Var = h0Var.f453464v;
        if (z1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox e17 = z1Var.e();
        kotlin.jvm.internal.o.f(e17, "getBtnSave(...)");
        visibility.c(e17);
        em.z1 z1Var2 = h0Var.f453464v;
        if (z1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox d17 = z1Var2.d();
        kotlin.jvm.internal.o.f(d17, "getBtnMore(...)");
        visibility.c(d17);
        return jz5.f0.f302826a;
    }
}
