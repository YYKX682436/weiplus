package yw3;

/* loaded from: classes9.dex */
public final class w2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI f466917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk0.k f466918e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI, gk0.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466917d = repairerImageLoaderDemoUI;
        this.f466918e = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw3.w2(this.f466917d, this.f466918e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yw3.w2 w2Var = (yw3.w2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        p75.i0 i17 = dm.c8.f236162y0.i();
        i17.f352657d = dm.c8.f236160p1.i(new java.lang.Integer(3)).c(dm.c8.f236163y1.i(new java.lang.Integer(0)));
        i17.e(dm.c8.f236164z1.u());
        i17.c(1, 0);
        p75.l0 a17 = i17.a();
        l75.k0 k0Var = gm0.j1.u().f273153f;
        if (!k0Var.isOpen()) {
            k0Var = null;
        }
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) a17.o(k0Var, com.tencent.mm.storage.f9.class);
        if (f9Var != null) {
            java.lang.String r17 = com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? c01.w9.r(f9Var.j()) : f9Var.j();
            j15.d dVar = new j15.d();
            kotlin.jvm.internal.o.d(r17);
            dVar.fromXml(r17);
            java.lang.String str = "RepairerDragComponentDemoUI_" + f9Var.getMsgId() + "_mid";
            com.tencent.mm.plugin.repairer.ui.demo.RepairerImageLoaderDemoUI repairerImageLoaderDemoUI = this.f466917d;
            java.lang.String o17 = new com.tencent.mm.vfs.r6((com.tencent.mm.vfs.r6) ((jz5.n) repairerImageLoaderDemoUI.i).getValue(), str).o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            y01.a aVar2 = new y01.a(str);
            java.lang.String y17 = dVar.o().y();
            if (y17 == null || r26.n0.N(y17)) {
                java.lang.String k17 = dVar.o().k();
                if (k17 == null) {
                    k17 = "";
                }
                aVar2.f458573b = k17;
                java.lang.String aeskey = dVar.o().getAeskey();
                if (aeskey == null) {
                    aeskey = "";
                }
                aVar2.f458574c = aeskey;
                java.lang.String md52 = dVar.o().getMd5();
                aVar2.f458577f = md52 != null ? md52 : "";
                aVar2.f458578g = dVar.o().getLength();
                aVar2.f458575d = 2;
            } else {
                java.lang.String J2 = dVar.o().J();
                if (J2 == null) {
                    J2 = "";
                }
                aVar2.f458573b = J2;
                java.lang.String aeskey2 = dVar.o().getAeskey();
                if (aeskey2 == null) {
                    aeskey2 = "";
                }
                aVar2.f458574c = aeskey2;
                aVar2.f458575d = 19;
                java.lang.String md53 = dVar.o().getMd5();
                aVar2.f458577f = md53 != null ? md53 : "";
                aVar2.f458578g = dVar.o().C();
            }
            aVar2.f458576e = o17;
            rx.h hVar = (rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class));
            gk0.k kVar = this.f466918e;
            java.lang.String wi6 = hVar.wi(kVar, aVar2);
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            em.d3 d3Var = (em.d3) ((jz5.n) repairerImageLoaderDemoUI.e).getValue();
            if (d3Var.f254232d == null) {
                d3Var.f254232d = (android.widget.ImageView) d3Var.f254229a.findViewById(com.tencent.mm.R.id.bdm);
            }
            g75.z Ui = ((h83.g) n0Var).Ui(wi6, kVar, d3Var.f254232d, o17);
            Ui.l("KeyCdnParams", aVar2);
            com.tencent.mm.sdk.coroutines.LifecycleScope U6 = repairerImageLoaderDemoUI.U6();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(U6, kotlinx.coroutines.internal.b0.f310484a, null, new yw3.v2(repairerImageLoaderDemoUI, Ui, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
