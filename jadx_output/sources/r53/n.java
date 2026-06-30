package r53;

/* loaded from: classes8.dex */
public abstract class n {
    public static boolean a(com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2) {
        if (gameTabData2 == null || com.tencent.mm.sdk.platformtools.t8.L0(gameTabData2.a())) {
            return false;
        }
        java.util.Iterator it = ((java.util.ArrayList) gameTabData2.a()).iterator();
        loop0: while (it.hasNext()) {
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(tabItem.F)) {
                java.util.Iterator it6 = tabItem.F.iterator();
                while (it6.hasNext()) {
                    if (android.text.TextUtils.equals(((com.tencent.mm.plugin.game.model.LocalTabCornerSetting) it6.next()).f140176d, "chat")) {
                        break loop0;
                    }
                }
            }
        }
        return true;
    }

    public static void b(com.tencent.mm.pluginsdk.model.app.m mVar) {
        boolean z17;
        boolean update;
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameDataUtil", "Null appInfo");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameDataUtil", "Invalid appId");
            return;
        }
        java.lang.String str = mVar.field_appId;
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
        if (h17 == null) {
            h17 = new com.tencent.mm.pluginsdk.model.app.m();
            h17.field_appId = str;
            z17 = true;
        } else {
            z17 = false;
        }
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        if (d17.equals("zh_CN")) {
            h17.field_appName = mVar.field_appName;
        } else if (d17.equals("zh_TW") || d17.equals("zh_HK")) {
            h17.field_appName_tw = mVar.field_appName;
        } else {
            h17.field_appName_en = mVar.field_appName;
        }
        h17.field_appType = mVar.field_appType;
        h17.field_packageName = mVar.field_packageName;
        h17.z0(mVar.f238368J);
        h17.y0(mVar.P);
        h17.w0(mVar.T);
        h17.A0(mVar.Q);
        h17.W = mVar.W;
        h17.X = mVar.X;
        h17.U = mVar.U;
        h17.V = mVar.V;
        h17.Z = mVar.Z;
        h17.A = true;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mVar.M)) {
            h17.M = mVar.M;
            h17.A = true;
        }
        if (z17) {
            ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
            update = zo3.p.Ri().insert(h17);
            ((kt.a) ap3.e.a()).Ai(str);
        } else {
            int i17 = h17.field_appVersion;
            if (i17 < mVar.field_appVersion) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameDataUtil", "oldVersion = %s, newVersion = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(mVar.field_appVersion));
                ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                update = zo3.p.Ri().update(h17, new java.lang.String[0]);
                ((kt.a) ap3.e.a()).Ai(str);
            } else {
                if (com.tencent.mm.sdk.platformtools.t8.K0(h17.field_appIconUrl) ? true : com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appIconUrl) ? false : !h17.field_appIconUrl.equals(mVar.field_appIconUrl)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameDataUtil", "oldIcon = %s, newIcon = %s", h17.field_appIconUrl, mVar.field_appIconUrl);
                    h17.field_appIconUrl = mVar.field_appIconUrl;
                    ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                    update = zo3.p.Ri().update(h17, new java.lang.String[0]);
                    ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                    zo3.p.Di().a(str, 1);
                    ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                    zo3.p.Di().a(str, 2);
                    ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                    zo3.p.Di().a(str, 3);
                    ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                    zo3.p.Di().a(str, 4);
                    ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                    zo3.p.Di().a(str, 5);
                } else {
                    ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                    update = zo3.p.Ri().update(h17, new java.lang.String[0]);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDataUtil", "Saving AppInfo, appId: %s, insert?: %s, return: %s", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(update));
    }

    public static void c(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameDataUtil", "Null appInfos");
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            b((com.tencent.mm.pluginsdk.model.app.m) it.next());
        }
    }
}
