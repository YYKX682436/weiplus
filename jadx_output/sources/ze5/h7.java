package ze5;

/* loaded from: classes9.dex */
public final class h7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.i7 f471971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v05.b f471973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z05.c f471974g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471975h;

    public h7(ze5.i7 i7Var, yb5.d dVar, v05.b bVar, z05.c cVar, com.tencent.mm.storage.f9 f9Var) {
        this.f471971d = i7Var;
        this.f471972e = dVar;
        this.f471973f = bVar;
        this.f471974g = cVar;
        this.f471975h = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemLiteAppMvvm$preDealData$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.f9 f9Var = this.f471975h;
        kotlin.jvm.internal.o.d(view);
        ze5.i7 i7Var = this.f471971d;
        i7Var.getClass();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1293L, 34L, 1L);
        z05.c cVar = this.f471974g;
        java.lang.String id6 = cVar.getId();
        if (com.tencent.mm.sdk.platformtools.t8.K0(id6)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemLiteApp", "handleLiteAppClick: appId is null");
        } else {
            java.lang.String path = cVar.getPath();
            java.lang.String p17 = cVar.p();
            java.lang.String n17 = cVar.n();
            boolean z17 = true;
            boolean z18 = cVar.r() == 1;
            v05.b bVar = this.f471973f;
            boolean z19 = !com.tencent.mm.sdk.platformtools.t8.K0(bVar.getString(bVar.f368365d + 9));
            if (z19 && !((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Lj(id6)) {
                z17 = false;
            }
            if (z17) {
                g0Var.C(1293L, 83L, 1L);
                q80.d0 d0Var = new q80.d0();
                d0Var.f360649a = id6;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(path)) {
                    d0Var.f360650b = path;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(p17)) {
                    d0Var.f360651c = p17;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(n17)) {
                    d0Var.f360654f = n17;
                }
                d0Var.f360652d = java.lang.Boolean.valueOf(z18);
                com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
                yb5.d dVar = this.f471972e;
                liteAppReferrerInfo.scene = dVar.D() ? com.tencent.liteapp.gen.LiteAppOpenScene.GROUP_CHAT : com.tencent.liteapp.gen.LiteAppOpenScene.SINGLE_CHAT;
                d0Var.f360674z = liteAppReferrerInfo;
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(dVar.g(), d0Var, new ze5.y6(db5.e1.Q(dVar.g(), dVar.g().getString(com.tencent.mm.R.string.f490573yv), dVar.g().getString(com.tencent.mm.R.string.f490604zq), true, true, ze5.z6.f472347d), z19, view, dVar, f9Var, i7Var, bVar));
            } else {
                g0Var.C(1293L, 84L, 1L);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemLiteAppMvvm$preDealData$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
