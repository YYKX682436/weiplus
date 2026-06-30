package yw3;

/* loaded from: classes11.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI f466934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466934d = repairerImageLoaderDemoUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw3.y2(this.f466934d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yw3.y2 y2Var = (yw3.y2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean a17 = com.tencent.mm.contact.d.f64855g.a();
        g95.d dVar = g95.e.f269801a;
        p75.m c17 = dVar.g().c(a17 ? dm.e2.Y1.l(kz5.b0.c("0")) : dm.e2.P1.t("'%@%'"));
        p75.d dVar2 = dm.e2.P1;
        p75.m d17 = c17.d(dVar2.j("weixin"));
        p75.i0 g17 = dm.e2.N1.g(kz5.b0.c(dVar2));
        com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI = this.f466934d;
        java.lang.String tag = repairerImageLoaderDemoUI.d;
        kotlin.jvm.internal.o.g(tag, "tag");
        g17.f352656c = tag;
        g17.f352657d = d17;
        g17.f352659f = dVar.h();
        p75.l0 a18 = g17.a();
        l75.k0 k0Var = gm0.j1.u().f273153f;
        if (!k0Var.isOpen()) {
            k0Var = null;
        }
        java.util.List l17 = a18.l(k0Var);
        java.lang.String str = (java.lang.String) kz5.n0.a0(l17, new java.util.Random().nextInt(((java.util.ArrayList) l17).size()));
        if (str != null) {
            kv.b0 b0Var = (kv.b0) i95.n0.c(kv.b0.class);
            em.d3 d3Var = (em.d3) ((jz5.n) repairerImageLoaderDemoUI.e).getValue();
            if (d3Var.f254233e == null) {
                d3Var.f254233e = (android.widget.ImageView) d3Var.f254229a.findViewById(com.tencent.mm.R.id.a9x);
            }
            android.widget.ImageView imageView = d3Var.f254233e;
            kotlin.jvm.internal.o.f(imageView, "getAvatarContentIv(...)");
            ((hn1.s) b0Var).Ai(imageView, str);
        }
        return jz5.f0.f302826a;
    }
}
