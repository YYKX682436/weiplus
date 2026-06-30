package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f188973a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f188974b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f188975c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f188976d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f188977e;

    public l() {
        this.f188974b = null;
        this.f188975c = null;
        this.f188976d = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4("AppIconServiceTimer", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.pluginsdk.model.app.j(this), false);
        this.f188977e = b4Var;
        this.f188973a = new com.tencent.mm.pluginsdk.model.app.k(this, gm0.j1.e().a());
        this.f188974b = new java.util.ArrayList();
        this.f188975c = new java.util.ArrayList();
        this.f188976d = new java.util.concurrent.ConcurrentHashMap();
        b4Var.c(600000L, 600000L);
    }

    public void a(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppIconService", "push fail, appId is null");
            return;
        }
        com.tencent.mm.pluginsdk.model.app.f3 f3Var = new com.tencent.mm.pluginsdk.model.app.f3(str, i17);
        java.util.List list = this.f188974b;
        if (((java.util.ArrayList) list).contains(f3Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppIconService", "push, appId = " + str + ", iconType = " + i17 + " already in running list");
            return;
        }
        if (((java.util.ArrayList) list).size() < 5) {
            if (b(f3Var)) {
                ((java.util.ArrayList) list).add(f3Var);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppIconService", "running list has reached the max count");
            java.util.List list2 = this.f188975c;
            if (((java.util.ArrayList) list2).contains(f3Var)) {
                return;
            }
            ((java.util.ArrayList) list2).add(f3Var);
        }
    }

    public final boolean b(com.tencent.mm.pluginsdk.model.app.f3 f3Var) {
        boolean z17;
        java.lang.String str;
        if (f3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppIconService", "startDownload fail, geticoninfo is null");
            return false;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f188976d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) concurrentHashMap.get(f3Var.toString()), 0));
        if (valueOf.intValue() >= 5) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppIconService", "increaseCounter fail, has reached the max try count");
            z17 = false;
        } else {
            concurrentHashMap.put(f3Var.toString(), java.lang.Integer.valueOf(valueOf.intValue() + 1));
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppIconService", "increaseCounter fail");
            return false;
        }
        com.tencent.mm.pluginsdk.model.app.z Ri = zo3.p.Ri();
        java.lang.String str2 = f3Var.f188890a;
        com.tencent.mm.pluginsdk.model.app.m z07 = Ri.z0(str2);
        if (z07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppIconService", "push, appinfo does not exist, appId = " + str2);
            return false;
        }
        int i17 = f3Var.f188891b;
        if (i17 == 1) {
            java.lang.String str3 = z07.field_appIconUrl;
            if (str3 == null || str3.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppIconService", "push, appIconUrl is null, appId = " + str2);
                return false;
            }
            str = z07.field_appIconUrl;
        } else if (i17 == 2) {
            java.lang.String str4 = z07.field_appWatermarkUrl;
            if (str4 == null || str4.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppIconService", "push, appWatermarkUrl is null, appId = " + str2);
                return false;
            }
            str = z07.field_appWatermarkUrl;
        } else if (i17 == 3) {
            java.lang.String str5 = z07.R;
            if (str5 == null || str5.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppIconService", "push, appSuggestionIconUrl is null, appId = " + str2);
                return false;
            }
            str = z07.R;
        } else if (i17 == 4) {
            java.lang.String str6 = z07.f238393y0;
            if (str6 == null || str6.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppIconService", "push, servicePanelIconUrl is null, appId = " + str2);
                return false;
            }
            str = z07.f238393y0;
        } else {
            if (i17 != 5) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppIconService", "push, unknown iconType = " + i17);
                return false;
            }
            java.lang.String str7 = z07.f238375l1;
            if (str7 == null || str7.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppIconService", "push, serviceListIconUrl is null, appId = " + str2);
                return false;
            }
            str = z07.f238375l1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppIconService", "appIconUrl = " + str);
        s75.d.b(new com.tencent.mm.pluginsdk.model.app.g3(this.f188973a, str2, i17, str), "AppIconService_getIcon");
        return true;
    }
}
