package mo1;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f330300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f330301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI f330302f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.wechat.aff.affroam.g gVar, com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI createRoamLitePkgUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f330301e = gVar;
        this.f330302f = createRoamLitePkgUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mo1.m(this.f330301e, this.f330302f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mo1.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f330300d;
        com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI createRoamLitePkgUI = this.f330302f;
        try {
        } catch (com.tencent.mm.plugin.backup.roambackup.x1 unused) {
            com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
            this.f330300d = 3;
            obj = r0Var.f(false, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.backup.roambackup.r0 r0Var2 = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
            com.tencent.wechat.aff.affroam.g backupPackage = this.f330301e;
            kotlin.jvm.internal.o.f(backupPackage, "$backupPackage");
            this.f330300d = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            com.tencent.mm.plugin.backup.roambackup.u.f92737a.e().a(kz5.c0.d(backupPackage), new com.tencent.mm.plugin.backup.roambackup.x(nVar));
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(createRoamLitePkgUI);
                    u1Var.g(createRoamLitePkgUI.getString(com.tencent.mm.R.string.ofc));
                    u1Var.m(com.tencent.mm.R.string.f490454vi);
                    u1Var.l(new mo1.k(createRoamLitePkgUI));
                    u1Var.q(false);
                    return jz5.f0.f302826a;
                }
                if (i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                com.tencent.mars.xlog.Log.i("MM.Roam.CreateRoamLitePkgUI", "Create package failed, count of packages is " + arrayList.size());
                int i18 = arrayList.size() >= 100 ? com.tencent.mm.R.string.f492857mx5 : com.tencent.mm.R.string.oey;
                com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(createRoamLitePkgUI);
                u1Var2.g(createRoamLitePkgUI.getString(i18));
                u1Var2.m(com.tencent.mm.R.string.f490454vi);
                u1Var2.l(mo1.l.f330298a);
                u1Var2.q(false);
                createRoamLitePkgUI.f92708r = 2;
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        long longValue = ((java.lang.Number) obj).longValue();
        createRoamLitePkgUI.f92708r = 0;
        java.lang.String str = createRoamLitePkgUI.f92706p;
        if (str == null) {
            kotlin.jvm.internal.o.o(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            throw null;
        }
        createRoamLitePkgUI.V6(longValue, str, 0);
        createRoamLitePkgUI.f92707q = true;
        this.f330300d = 2;
        if (kotlinx.coroutines.k1.b(15000L, this) == aVar) {
            return aVar;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var3 = new com.tencent.mm.ui.widget.dialog.u1(createRoamLitePkgUI);
        u1Var3.g(createRoamLitePkgUI.getString(com.tencent.mm.R.string.ofc));
        u1Var3.m(com.tencent.mm.R.string.f490454vi);
        u1Var3.l(new mo1.k(createRoamLitePkgUI));
        u1Var3.q(false);
        return jz5.f0.f302826a;
    }
}
