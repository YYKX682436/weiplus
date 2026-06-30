package xc5;

/* loaded from: classes12.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.h0 f453447d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(xc5.h0 h0Var) {
        super(1);
        this.f453447d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.media.view.ShrinkBox a17;
        java.lang.String str;
        pf3.b visibility = (pf3.b) obj;
        kotlin.jvm.internal.o.g(visibility, "$this$visibility");
        xc5.h0 h0Var = this.f453447d;
        em.z1 z1Var = h0Var.f453464v;
        if (z1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox f17 = z1Var.f();
        kotlin.jvm.internal.o.f(f17, "getBtnShare(...)");
        visibility.c(f17);
        em.z1 z1Var2 = h0Var.f453464v;
        if (z1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox e17 = z1Var2.e();
        kotlin.jvm.internal.o.f(e17, "getBtnSave(...)");
        visibility.c(e17);
        em.z1 z1Var3 = h0Var.f453464v;
        if (z1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox d17 = z1Var3.d();
        kotlin.jvm.internal.o.f(d17, "getBtnMore(...)");
        visibility.c(d17);
        if (h0Var.i0()) {
            em.z1 z1Var4 = h0Var.f453464v;
            if (z1Var4 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            a17 = z1Var4.c();
            str = "getBtnLocate(...)";
        } else {
            em.z1 z1Var5 = h0Var.f453464v;
            if (z1Var5 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            a17 = z1Var5.a();
            str = "getBtnGrid(...)";
        }
        kotlin.jvm.internal.o.f(a17, str);
        visibility.c(a17);
        em.z1 z1Var6 = h0Var.f453464v;
        if (z1Var6 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.download.MediaDownloadText b17 = z1Var6.b();
        kotlin.jvm.internal.o.f(b17, "getBtnHd(...)");
        visibility.c(b17);
        return jz5.f0.f302826a;
    }
}
