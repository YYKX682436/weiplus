package wh5;

/* loaded from: classes12.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh5.s f446081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(wh5.s sVar) {
        super(1);
        this.f446081d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pf3.b visibilityState = (pf3.b) obj;
        kotlin.jvm.internal.o.g(visibilityState, "$this$visibilityState");
        wh5.s sVar = this.f446081d;
        em.n1 n1Var = sVar.f446089v;
        if (n1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox f17 = n1Var.f();
        kotlin.jvm.internal.o.f(f17, "getBtnShare(...)");
        visibilityState.c(f17);
        em.n1 n1Var2 = sVar.f446089v;
        if (n1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox e17 = n1Var2.e();
        kotlin.jvm.internal.o.f(e17, "getBtnSave(...)");
        visibilityState.c(e17);
        em.n1 n1Var3 = sVar.f446089v;
        if (n1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox d17 = n1Var3.d();
        kotlin.jvm.internal.o.f(d17, "getBtnMore(...)");
        visibilityState.c(d17);
        em.n1 n1Var4 = sVar.f446089v;
        if (n1Var4 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        n1Var4.g().setAlpha(1.0f);
        em.n1 n1Var5 = sVar.f446089v;
        if (n1Var5 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.live.LivePlayButton c17 = n1Var5.c();
        kotlin.jvm.internal.o.f(c17, "getBtnLive(...)");
        visibilityState.c(c17);
        em.n1 n1Var6 = sVar.f446089v;
        if (n1Var6 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox a17 = n1Var6.a();
        kotlin.jvm.internal.o.f(a17, "getBtnGrid(...)");
        visibilityState.c(a17);
        if (sVar.h0()) {
            em.n1 n1Var7 = sVar.f446089v;
            if (n1Var7 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            com.tencent.mm.plugin.media.view.download.MediaDownloadText b17 = n1Var7.b();
            kotlin.jvm.internal.o.f(b17, "getBtnHd(...)");
            visibilityState.c(b17);
        }
        return jz5.f0.f302826a;
    }
}
