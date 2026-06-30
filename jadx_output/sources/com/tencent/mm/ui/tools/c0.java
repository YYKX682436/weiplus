package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class c0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.AddFavoriteUI f210308a;

    public c0(com.tencent.mm.ui.tools.AddFavoriteUI addFavoriteUI) {
        this.f210308a = addFavoriteUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        boolean z17;
        int i17 = com.tencent.mm.ui.tools.AddFavoriteUI.f209975p;
        com.tencent.mm.ui.tools.AddFavoriteUI addFavoriteUI = this.f210308a;
        addFavoriteUI.X6();
        android.content.Intent intent = addFavoriteUI.getIntent();
        addFavoriteUI.f209977e = intent;
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddFavoriteUI", "intent is null");
        } else {
            java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "android.intent.extra.TEXT");
            if (l17 != null && l17.length() != 0) {
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(new com.tencent.mm.opensdk.modelmsg.WXTextObject(l17));
                wXMediaMessage.description = l17;
                com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
                req.transaction = null;
                req.message = wXMediaMessage;
                int type = wXMediaMessage.getType();
                android.os.Bundle bundle = new android.os.Bundle();
                req.toBundle(bundle);
                bundle.putInt(com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION, com.tencent.mm.opensdk.constants.Build.SDK_INT);
                bundle.putString(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE, "com.tencent.mm.openapi");
                bundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
                z17 = true;
                if (!c01.d9.h() || gm0.m.r()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AddFavoriteUI", "not logged in, jump to simple login");
                    com.tencent.mm.ui.MMWizardActivity.Y6(addFavoriteUI, new android.content.Intent(addFavoriteUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.SimpleLoginUI.class), addFavoriteUI.getIntent().addFlags(67108864));
                    addFavoriteUI.finish();
                } else {
                    com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                    java.lang.String str = com.tencent.mm.vfs.w6.q(addFavoriteUI.f209979g) + "." + com.tencent.mm.vfs.w6.n(addFavoriteUI.f209979g);
                    if (type == 1) {
                        com.tencent.mm.pluginsdk.model.a2.m(doFavoriteEvent, l17, 13);
                    } else {
                        com.tencent.mm.pluginsdk.model.a2.k(doFavoriteEvent, 13, addFavoriteUI.f209979g, str, "", "");
                    }
                    am.c4 c4Var = doFavoriteEvent.f54090g;
                    c4Var.f6323i = addFavoriteUI;
                    c4Var.f6329o = new com.tencent.mm.ui.tools.u(addFavoriteUI);
                    c4Var.f6330p = new com.tencent.mm.ui.tools.v(addFavoriteUI);
                    addFavoriteUI.f209978f = doFavoriteEvent;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(l17);
                    com.tencent.mm.modelsimple.c0 c0Var = new com.tencent.mm.modelsimple.c0(5, arrayList, addFavoriteUI.getCallerPackage());
                    c01.d9.e().a(837, addFavoriteUI);
                    gm0.j1.d().g(c0Var);
                    addFavoriteUI.Z6();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "dealWithText: %b", java.lang.Boolean.valueOf(z17));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "text is null");
        }
        z17 = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.AddFavoriteUI", "dealWithText: %b", java.lang.Boolean.valueOf(z17));
    }
}
