package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class n6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f141680d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.b f141681e;

    /* renamed from: f, reason: collision with root package name */
    public int f141682f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f141683g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f141684h;

    public n6(android.content.Context context) {
        this.f141680d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameTMAssistClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.tencent.mm.plugin.game.model.b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameTMAssistClickListener", "No GameAppInfo");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameTMAssistClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f141681e = (com.tencent.mm.plugin.game.model.b) view.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTMAssistClickListener", "Clicked appid = " + this.f141681e.field_appId);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = this.f141681e.field_appId;
        ((kt.c) i0Var).getClass();
        android.content.Context context = this.f141680d;
        if (com.tencent.mm.pluginsdk.model.app.w.r(context, str)) {
            com.tencent.mm.plugin.game.model.b bVar = this.f141681e;
            java.lang.String str2 = bVar.field_appId;
            java.lang.String str3 = bVar.field_packageName;
            java.lang.String str4 = bVar.field_openId;
            com.tencent.mm.game.report.l.f(this.f141680d, bVar.f140212o2, bVar.f140213p2, bVar.f140214q2, 3, str2, this.f141682f, this.f141683g);
            com.tencent.mm.plugin.game.model.f.j(context, this.f141681e.field_appId);
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameTMAssistClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.model.z3 a17 = com.tencent.mm.plugin.game.model.z3.a();
        java.lang.String str5 = this.f141681e.V;
        a17.getClass();
        int i17 = -1;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus, params is null or nil");
        } else {
            try {
                com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo downloadTaskState = com.tencent.mm.plugin.game.model.z3.a().b().getDownloadTaskState(new com.tencent.mm.plugin.game.model.y3(null).a(str5));
                if (downloadTaskState != null) {
                    i17 = downloadTaskState.mState;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus failed : %s", e17.getMessage());
            }
        }
        this.f141684h = i17;
        java.lang.String str6 = this.f141681e.V;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
            str6 = str6.replace("ANDROIDWX.GAMECENTER", "ANDROIDWX.YYB.GAMECENTER");
        }
        if (this.f141681e.f140204g2 == 3) {
            com.tencent.mm.plugin.game.model.z3.a().getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus, params is null or nil");
            } else {
                try {
                    com.tencent.mm.plugin.game.model.z3.a().b().startToAuthorized(context, new com.tencent.mm.plugin.game.model.y3(null).a(str6), "1");
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.QQDownloaderSDKWrapper", "startToAuthorized fail, ex = %s", e18.getMessage());
                }
            }
        } else {
            com.tencent.mm.plugin.game.model.z3.a().getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.QQDownloaderSDKWrapper", "add download task failed, params is null or nil");
            } else if (context == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.QQDownloaderSDKWrapper", "add download task failed, context is null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.QQDownloaderSDKWrapper", "add download task to qqdownloader:[%s]", str6);
                try {
                    com.tencent.mm.plugin.game.model.z3.a().b().startToDownloadTaskList(context, new com.tencent.mm.plugin.game.model.y3(null).a(str6), true, true);
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.QQDownloaderSDKWrapper", e19, "", new java.lang.Object[0]);
                }
            }
        }
        com.tencent.mm.plugin.game.model.b bVar2 = this.f141681e;
        int i18 = bVar2.f140204g2 == 3 ? 10 : 5;
        if (this.f141684h == 4) {
            i18 = 8;
        }
        com.tencent.mm.game.report.l.g(this.f141680d, bVar2.f140212o2, bVar2.f140213p2, bVar2.f140214q2, i18, bVar2.field_appId, this.f141682f, bVar2.f140210m2, this.f141683g);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameTMAssistClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
