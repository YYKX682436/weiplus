package xc5;

/* loaded from: classes12.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.y0 f453580d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(xc5.y0 y0Var) {
        super(1);
        this.f453580d = y0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.media.view.ShrinkBox a17;
        java.lang.String str;
        pf3.b visibilityState = (pf3.b) obj;
        kotlin.jvm.internal.o.g(visibilityState, "$this$visibilityState");
        xc5.y0 y0Var = this.f453580d;
        em.b2 b2Var = y0Var.f453593v;
        if (b2Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox g17 = b2Var.g();
        kotlin.jvm.internal.o.f(g17, "getBtnShare(...)");
        visibilityState.c(g17);
        em.b2 b2Var2 = y0Var.f453593v;
        if (b2Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox f17 = b2Var2.f();
        kotlin.jvm.internal.o.f(f17, "getBtnSave(...)");
        visibilityState.c(f17);
        if (y0Var.j0()) {
            em.b2 b2Var3 = y0Var.f453593v;
            if (b2Var3 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            a17 = b2Var3.d();
            str = "getBtnLocate(...)";
        } else {
            em.b2 b2Var4 = y0Var.f453593v;
            if (b2Var4 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            a17 = b2Var4.a();
            str = "getBtnGrid(...)";
        }
        kotlin.jvm.internal.o.f(a17, str);
        visibilityState.c(a17);
        em.b2 b2Var5 = y0Var.f453593v;
        if (b2Var5 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox e17 = b2Var5.e();
        kotlin.jvm.internal.o.f(e17, "getBtnMore(...)");
        visibilityState.c(e17);
        em.b2 b2Var6 = y0Var.f453593v;
        if (b2Var6 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.live.LivePlayButton c17 = b2Var6.c();
        kotlin.jvm.internal.o.f(c17, "getBtnLive(...)");
        visibilityState.c(c17);
        if (y0Var.h0() && !y0Var.i0()) {
            em.b2 b2Var7 = y0Var.f453593v;
            if (b2Var7 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            com.tencent.mm.plugin.media.view.download.MediaDownloadText b17 = b2Var7.b();
            kotlin.jvm.internal.o.f(b17, "getBtnHd(...)");
            visibilityState.c(b17);
        }
        return jz5.f0.f302826a;
    }
}
