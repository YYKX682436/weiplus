package f14;

@j95.b
/* loaded from: classes9.dex */
public class j extends i95.w {

    /* renamed from: e, reason: collision with root package name */
    public static java.util.List f258687e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.z0 f258688d = new f14.i(this);

    public static void wi() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CROWDTEST_APPLY_EXPIRE_LONG, 0L);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CROWDTEST_APPLY_LINK_STRING, "");
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().p(262157, false);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreSetting", "SubCoreSetting onAccountPostReset:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CROWDTEST_CLIENT_VERSION_INT, java.lang.Integer.valueOf(o45.wf.f343029g))).intValue();
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CROWDTEST_APPLY_EXPIRE_LONG, 0L)).longValue();
        if (intValue <= o45.wf.f343029g || longValue < java.lang.System.currentTimeMillis()) {
            wi();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreSetting", "SubCoreSetting onAccountPostReset flavorBlueCV: " + ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FLAVOR_BLUE_CLIENT_VERSION_INT, 0)).intValue() + ",CLIENT_VERSION:" + o45.wf.f343029g);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(14, null));
        boolean z17 = com.tencent.mm.sdk.platformtools.o4.M("updateNotificationShowDetail_" + gm0.m.i()).getBoolean("notification_show_detail", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreSetting", "prevCV:%s, uploadStatus:%s", java.lang.Integer.valueOf(q17), java.lang.Boolean.valueOf(z17));
        if (q17 == 0) {
            com.tencent.mm.sdk.platformtools.o4.M("updateNotificationShowDetail_" + gm0.m.i()).putBoolean("notification_show_detail", true);
        }
        if (gm0.j1.b().f273244g.f273257a) {
            gm0.j1.u().c().w(34, java.lang.Integer.valueOf(c01.z1.n() & (-1048577) & (-4194305)));
            r45.u85 u85Var = new r45.u85();
            u85Var.f387136d = 1048576;
            u85Var.f387137e = 0;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(39, u85Var));
            r45.u85 u85Var2 = new r45.u85();
            u85Var2.f387136d = 4194304;
            u85Var2.f387137e = 0;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(39, u85Var2));
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreSetting", "set void default open");
            if (!new z2.n1(com.tencent.mm.sdk.platformtools.x2.f193071a).a()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SubCoreSetting", "sys notification disable！");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 18L, 1L, false);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreSetting", "is update from %s", java.lang.Integer.valueOf(gm0.j1.b().f273244g.f273258b));
            java.util.HashSet hashSet = (java.util.HashSet) c01.uc.f37514c.d();
            if (hashSet.size() == 2) {
                java.lang.String[] strArr = new java.lang.String[2];
                java.util.Iterator it = hashSet.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    strArr[i17] = c01.uc.f37514c.c((java.lang.String) it.next(), "login_user_name");
                    i17++;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.N0(strArr[0], strArr[1]) && strArr[0].equals(strArr[1])) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SubCoreSetting", "old dirty data!!!");
                    c01.uc ucVar = c01.uc.f37514c;
                    ucVar.i(strArr[0]);
                    ucVar.i(strArr[1]);
                }
            }
            if (q17 != 0 && !z17 && c01.z1.e() == 1) {
                boolean a17 = ip.b.a();
                int p17 = c01.z1.p();
                int i18 = !a17 ? p17 | 2048 : p17 & (-2049);
                int i19 = a17 ? 2 : 1;
                r45.p53 p53Var = new r45.p53();
                p53Var.f382761d = 10;
                p53Var.f382762e = i19;
                ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
                gm0.j1.u().c().w(7, java.lang.Integer.valueOf(i18));
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreSetting", "upload Notification show detail: %s", java.lang.Boolean.valueOf(a17));
                com.tencent.mm.sdk.platformtools.o4.M("updateNotificationShowDetail_" + gm0.m.i()).putBoolean("notification_show_detail", true);
            }
        } else if (q17 != 0 && !z17 && c01.z1.e() == 1) {
            com.tencent.mm.sdk.platformtools.o4.M("updateNotificationShowDetail_" + gm0.m.i()).putBoolean("notification_show_detail", true);
        }
        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ShowTurnOnFriendVerificationSysmsgSwitch", 0) == 1 && (c01.z1.p() & 32) == 0) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.f258688d);
        }
        com.tencent.mm.ui.tools.f5.f210399x = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_keyboard_version_switch, 1);
        com.tencent.mm.ui.tools.b5.f210298b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_keyboard_apply_windowinsets_switch, 1);
        com.tencent.mm.ui.widget.snackbar.j.f212478b = j62.e.g().i("clicfg_open_wesnackbar_and", 1, false, true) == 1;
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreSetting", "SubCoreSetting onAccountRelease: " + java.lang.System.currentTimeMillis());
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f258688d);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
    }
}
