package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameCenterUI5 f141689d;

    public o0(com.tencent.mm.plugin.game.ui.GameCenterUI5 gameCenterUI5) {
        this.f141689d = gameCenterUI5;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.Class<lt.i0> cls;
        java.lang.String str2;
        byte[] D0 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().D0("pb_index_4");
        if (D0 == null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.m0(this));
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.n0(this, new com.tencent.mm.plugin.game.model.x1(D0, false)));
        }
        com.tencent.mm.plugin.game.model.a wi6 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).wi();
        com.tencent.mm.plugin.game.ui.GameCenterUI5 gameCenterUI5 = this.f141689d;
        wi6.a(gameCenterUI5);
        java.util.LinkedList e17 = com.tencent.mm.plugin.game.model.f.e(gameCenterUI5);
        boolean z17 = r53.f.f392653a;
        java.lang.Class<lt.i0> cls2 = lt.i0.class;
        if (!com.tencent.mm.sdk.platformtools.t8.L0(e17)) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = e17.iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                ((kt.c) ((lt.i0) i95.n0.c(cls2))).getClass();
                com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str3);
                if (h17 != null && com.tencent.mm.sdk.platformtools.t8.K0(h17.field_openId)) {
                    linkedList.add(str3);
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
                zo3.p.Ui().c(linkedList);
            }
        }
        gm0.j1.d().g(new com.tencent.mm.plugin.game.model.e3(com.tencent.mm.sdk.platformtools.m2.d(), com.tencent.mm.plugin.game.model.f.e(gameCenterUI5), gameCenterUI5.f140701m, gameCenterUI5.f140702n, gameCenterUI5.f140703o, gameCenterUI5.f140699h));
        androidx.appcompat.app.AppCompatActivity context = gameCenterUI5.getContext();
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        java.lang.String str4 = "game_center_pref";
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("game_center_pref", 0);
        java.lang.String string = sharedPreferences.getString("download_app_id_time_map", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            str = "game_center_pref";
        } else {
            java.lang.String[] split = string.split(",");
            java.lang.String str5 = new java.lang.String();
            int length = split.length;
            int i17 = 0;
            while (i17 < length) {
                java.lang.String str6 = split[i17];
                java.lang.String[] split2 = str6.split("-");
                java.lang.String str7 = split2[0];
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                    ((kt.c) ((lt.i0) i95.n0.c(cls2))).getClass();
                    if (!com.tencent.mm.pluginsdk.model.app.w.r(context, str7)) {
                        cls = cls2;
                        str2 = str4;
                        if (currentTimeMillis - com.tencent.mm.sdk.platformtools.t8.V(split2[1], 0L) < 86400) {
                            str5 = str5 + str6 + ",";
                        } else {
                            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(str7);
                            com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterLogic", "checkGameDownloadTime, status = %d, id = %d", java.lang.Integer.valueOf(q17.f96963f), java.lang.Long.valueOf(q17.f96961d));
                            int i18 = q17.f96963f;
                            if (i18 == 2) {
                                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                                com.tencent.mm.plugin.downloader.model.r0.i().t(q17.f96961d);
                            } else if ((i18 == 0 || i18 == 4) && com.tencent.mm.vfs.w6.j(q17.f96964g)) {
                                com.tencent.mm.vfs.w6.h(q17.f96964g);
                            }
                        }
                        i17++;
                        cls2 = cls;
                        str4 = str2;
                    }
                }
                cls = cls2;
                str2 = str4;
                i17++;
                cls2 = cls;
                str4 = str2;
            }
            str = str4;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                if (str5.charAt(str5.length() - 1) == ',') {
                    str5 = str5.substring(0, str5.length() - 1);
                }
                sharedPreferences.edit().putString("download_app_id_time_map", str5.toString()).apply();
            }
        }
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(str, 0).edit().putString("game_center_pref_lang", com.tencent.mm.sdk.platformtools.m2.d()).commit();
        r53.b.f392640a.b();
    }
}
