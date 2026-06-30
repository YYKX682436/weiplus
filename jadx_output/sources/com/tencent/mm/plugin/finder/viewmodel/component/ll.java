package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class ll extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC f135070d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135070d = finderHomeUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.ll(this.f135070d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.ll llVar = (com.tencent.mm.plugin.finder.viewmodel.component.ll) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        llVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Di() != null) {
            java.lang.String finderUsername = xy2.c.e(this.f135070d.getContext());
            kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
            on3.a aVar2 = on3.a.f347102a;
            boolean z17 = false;
            if (aVar2.a(finderUsername).getBoolean("NewLifeHasMigratedPictureLocation", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeInnerFeatureService", "migratePictureLocationPermission has migrated once");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeInnerFeatureService", "migratePictureLocationPermission set has migrated");
                aVar2.a(finderUsername).putBoolean("NewLifeHasMigratedPictureLocation", true);
                if (hc2.s.c(ya2.h.f460484a.b(finderUsername))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeInnerFeatureService", "migratePictureLocationPermission has new permission");
                } else {
                    d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
                    d85.g0 g0Var = d85.g0.IMAGE_LOCATION_DATA;
                    java.lang.String str = d85.f0.Q.f227176d;
                    d85.d1 d1Var = (d85.d1) m0Var;
                    d1Var.getClass();
                    java.lang.String str2 = g0Var.f227192d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    com.tencent.mm.sdk.platformtools.o4 Zi = d1Var.Zi(str2);
                    if (Zi != null) {
                        if (str == null) {
                            str = "";
                        }
                        z17 = Zi.getBoolean(str, false);
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeInnerFeatureService", "migratePictureLocationPermission migrated old permission to new");
                        com.tencent.mars.xlog.Log.i("Finder.FinderPoiHelper", "modMaterialPoiSwitchCallback, isEnable:true");
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        hb2.s0.f280090e.o(true, new la2.c(true, finderUsername), finderUsername);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeInnerFeatureService", "migratePictureLocationPermission doesn't have old permission");
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
