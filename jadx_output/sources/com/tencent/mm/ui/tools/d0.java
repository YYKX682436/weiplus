package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class d0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.AddFavoriteUI f210337a;

    public d0(com.tencent.mm.ui.tools.AddFavoriteUI addFavoriteUI) {
        this.f210337a = addFavoriteUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        java.util.ArrayList<? extends android.os.Parcelable> arrayList;
        int i17 = com.tencent.mm.ui.tools.AddFavoriteUI.f209975p;
        com.tencent.mm.ui.tools.AddFavoriteUI addFavoriteUI = this.f210337a;
        addFavoriteUI.X6();
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "filepath:[%s]", addFavoriteUI.f209979g);
        int Y6 = addFavoriteUI.Y6(addFavoriteUI.getIntent().resolveType(addFavoriteUI));
        if (Y6 == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "launch, msgType is invalid");
            addFavoriteUI.finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "filepath:[%s] dealWithMultiItem msgType is %d", addFavoriteUI.f209979g, java.lang.Integer.valueOf(Y6));
        if (Y6 == 8 && !com.tencent.mm.sdk.platformtools.t8.K0(addFavoriteUI.f209979g)) {
            addFavoriteUI.W6(Y6, addFavoriteUI.f209979g, null, false);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.c2.c(addFavoriteUI.getIntent(), "Intro_Switch", false) || !c01.d9.h() || gm0.m.r()) {
            android.content.Intent intent = new android.content.Intent(addFavoriteUI, (java.lang.Class<?>) com.tencent.mm.ui.tools.AddFavoriteUI.class);
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            if (com.tencent.mm.sdk.platformtools.t8.L0(addFavoriteUI.f209981i)) {
                arrayList = new java.util.ArrayList<>(0);
            } else {
                arrayList = new java.util.ArrayList<>(addFavoriteUI.f209981i.size());
                java.util.Iterator it = addFavoriteUI.f209981i.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.tencent.mm.sdk.platformtools.i1.b(addFavoriteUI.getContext(), new com.tencent.mm.vfs.r6((java.lang.String) it.next())));
                }
            }
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            intent.addFlags(268435456).addFlags(32768);
            intent.setType(addFavoriteUI.getIntent().getType());
            com.tencent.mm.ui.MMWizardActivity.Y6(addFavoriteUI, new android.content.Intent(addFavoriteUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.SimpleLoginUI.class).addFlags(32768).addFlags(268435456), intent);
            addFavoriteUI.finish();
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        java.util.ArrayList<java.lang.String> arrayList2 = addFavoriteUI.f209981i;
        boolean z17 = com.tencent.mm.pluginsdk.model.a2.f188779a;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or paths is empty");
            c4Var.f6326l = com.tencent.mm.R.string.cac;
        } else if (arrayList2.size() > 9) {
            c4Var.f6326l = -20240419;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "do fill event info(fav simple images), paths %s sourceType %d", arrayList2, 13);
            r45.bq0 bq0Var = new r45.bq0();
            r45.jq0 jq0Var = new r45.jq0();
            for (java.lang.String str : arrayList2) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    r45.gp0 gp0Var = new r45.gp0();
                    gp0Var.h0(2);
                    gp0Var.A0(str);
                    gp0Var.z0(true);
                    bq0Var.f370964f.add(gp0Var);
                }
            }
            jq0Var.e(c01.z1.r());
            jq0Var.j(c01.z1.r());
            jq0Var.g(13);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            jq0Var.c(java.lang.System.currentTimeMillis());
            bq0Var.o(jq0Var);
            c4Var.f6318d = "";
            c4Var.f6315a = bq0Var;
            c4Var.f6317c = 2;
        }
        c4Var.f6323i = addFavoriteUI;
        c4Var.f6329o = new com.tencent.mm.ui.tools.f0(addFavoriteUI);
        c4Var.f6330p = new com.tencent.mm.ui.tools.g0(addFavoriteUI);
        c01.d9.e().a(837, addFavoriteUI);
        gm0.j1.d().g(new com.tencent.mm.modelsimple.c0(1, addFavoriteUI.f209981i, addFavoriteUI.getCallerPackage()));
        addFavoriteUI.Z6();
        addFavoriteUI.f209978f = doFavoriteEvent;
    }
}
