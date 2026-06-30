package xc5;

/* loaded from: classes12.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.s2 f453555d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(xc5.s2 s2Var) {
        super(1);
        this.f453555d = s2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.media.view.ShrinkBox a17;
        java.lang.String str;
        pf3.b visibility = (pf3.b) obj;
        kotlin.jvm.internal.o.g(visibility, "$this$visibility");
        xc5.s2 s2Var = this.f453555d;
        em.i2 i2Var = s2Var.f453564v;
        if (i2Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox f17 = i2Var.f();
        kotlin.jvm.internal.o.f(f17, "getBtnShare(...)");
        visibility.c(f17);
        em.i2 i2Var2 = s2Var.f453564v;
        if (i2Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox e17 = i2Var2.e();
        kotlin.jvm.internal.o.f(e17, "getBtnSave(...)");
        visibility.c(e17);
        em.i2 i2Var3 = s2Var.f453564v;
        if (i2Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox d17 = i2Var3.d();
        kotlin.jvm.internal.o.f(d17, "getBtnMore(...)");
        visibility.c(d17);
        if (s2Var.h0()) {
            em.i2 i2Var4 = s2Var.f453564v;
            if (i2Var4 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            a17 = i2Var4.c();
            str = "getBtnLocate(...)";
        } else {
            em.i2 i2Var5 = s2Var.f453564v;
            if (i2Var5 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            a17 = i2Var5.a();
            str = "getBtnGrid(...)";
        }
        kotlin.jvm.internal.o.f(a17, str);
        visibility.c(a17);
        em.i2 i2Var6 = s2Var.f453564v;
        if (i2Var6 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.download.MediaDownloadText b17 = i2Var6.b();
        kotlin.jvm.internal.o.f(b17, "getBtnHd(...)");
        visibility.c(b17);
        return jz5.f0.f302826a;
    }
}
