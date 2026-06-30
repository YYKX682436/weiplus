package xc5;

/* loaded from: classes12.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.y0 f453585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(xc5.y0 y0Var) {
        super(1);
        this.f453585d = y0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pf3.b visibilityState = (pf3.b) obj;
        kotlin.jvm.internal.o.g(visibilityState, "$this$visibilityState");
        xc5.y0 y0Var = this.f453585d;
        em.b2 b2Var = y0Var.f453593v;
        if (b2Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.live.LivePlayButton c17 = b2Var.c();
        kotlin.jvm.internal.o.f(c17, "getBtnLive(...)");
        visibilityState.c(c17);
        em.b2 b2Var2 = y0Var.f453593v;
        if (b2Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox f17 = b2Var2.f();
        kotlin.jvm.internal.o.f(f17, "getBtnSave(...)");
        visibilityState.c(f17);
        em.b2 b2Var3 = y0Var.f453593v;
        if (b2Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox e17 = b2Var3.e();
        kotlin.jvm.internal.o.f(e17, "getBtnMore(...)");
        visibilityState.c(e17);
        return jz5.f0.f302826a;
    }
}
