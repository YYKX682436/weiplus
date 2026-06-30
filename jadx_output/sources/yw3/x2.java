package yw3;

/* loaded from: classes9.dex */
public final class x2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk0.k f466926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI f466927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(gk0.k kVar, com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466926d = kVar;
        this.f466927e = repairerImageLoaderDemoUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw3.x2(this.f466926d, this.f466927e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yw3.x2 x2Var = (yw3.x2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        byte[] bytes = "https://gtimg.wechatpay.cn/pay/img/home/solution/1.jpg".getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String d17 = by5.x.d(bytes);
        kotlin.jvm.internal.o.d(d17);
        y01.a aVar2 = new y01.a(d17);
        aVar2.f458573b = "https://gtimg.wechatpay.cn/pay/img/home/solution/1.jpg";
        java.lang.String wi6 = ((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).wi(this.f466926d, aVar2);
        i95.m c17 = i95.n0.c(gk0.n0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        gk0.n0 n0Var = (gk0.n0) c17;
        gk0.k kVar = this.f466926d;
        com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI = this.f466927e;
        em.d3 d3Var = (em.d3) ((jz5.n) repairerImageLoaderDemoUI.e).getValue();
        if (d3Var.f254231c == null) {
            d3Var.f254231c = (android.widget.ImageView) d3Var.f254229a.findViewById(com.tencent.mm.R.id.h5e);
        }
        g75.z x66 = gk0.n0.x6(n0Var, wi6, kVar, d3Var.f254231c, null, 8, null);
        x66.l("KeyCdnParams", aVar2);
        gk0.j.b((gk0.j) ((jz5.n) repairerImageLoaderDemoUI.g).getValue(), x66, null, 2, null);
        return jz5.f0.f302826a;
    }
}
