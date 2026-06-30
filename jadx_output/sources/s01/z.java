package s01;

/* loaded from: classes9.dex */
public class z {
    public final void a(java.lang.String str, java.lang.String str2, int i17) {
        long g17 = s01.r.g(str);
        if (g17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatStatusNotifyService", "qy_status_notify bizLocalId == -1,%s", str);
            return;
        }
        int i18 = r01.q3.aj().J0(g17).field_newUnReadCount;
        r01.q3.aj().o1(g17);
        s01.h z07 = r01.q3.Ui().z0(g17);
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str2);
        if (p17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatStatusNotifyService", "qy_status_notify cvs == null:%s", str2);
            return;
        }
        if (z07.t0(1)) {
            if (p17.f1() > i18) {
                p17.a2(p17.f1() - i18);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, str2);
                return;
            } else {
                p17.a2(0);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, str2);
                ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).h(str2);
                return;
            }
        }
        if (p17.d1() <= i18) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().b0(str2);
            ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).h(str2);
        } else {
            p17.i1(0);
            p17.Y1(p17.d1() - i18);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, str2);
        }
    }

    public void b(int i17, java.lang.String str, java.lang.String str2) {
        if ("EnterpriseChatStatus".equals(str)) {
            java.lang.String[] split = str2.split(";");
            java.lang.String str3 = split[0];
            java.lang.String str4 = split[1];
            int P = com.tencent.mm.sdk.platformtools.t8.P(split[2], 0);
            if (i17 == 7) {
                a(str4, str3, P);
            } else if (i17 == 8) {
                a(str4, str3, P);
            } else if (i17 == 9) {
                a(str4, str3, P);
            }
        }
    }
}
