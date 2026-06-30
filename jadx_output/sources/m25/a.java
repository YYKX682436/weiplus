package m25;

/* loaded from: classes2.dex */
public abstract class a {
    public static void a(android.content.Context context, android.content.Intent intent) {
        if (!b()) {
            com.tencent.mars.xlog.Log.i("NearbyHelper", "gotoNearBy");
            if (c()) {
                j45.l.h(context, "nearby", ".ui.NearbyFriendsUI");
                return;
            }
            gm0.j1.b().c();
            if (((com.tencent.mm.storage.u8) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).f() > 0) {
                j45.l.h(context, "nearby", ".ui.NearbyFriendShowSayHiUI");
                return;
            } else {
                j45.l.h(context, "nearby", ".ui.NearbyFriendsUI");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("NearbyHelper", "gotoNearByUILiveFriends");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Zi("", "enterFinderLbsLiveFriendsUI");
        tq2.d.f421230a.a("clickEnter");
        nq2.d dVar = nq2.d.f338980a;
        dVar.k(intent);
        rq2.s sVar = rq2.s.f398879a;
        c92.g gVar = c92.g.f39738a;
        sVar.c(true, gVar.b());
        if (gVar.b()) {
            dVar.l(intent, 88889, 0, "同城直播");
        } else if (!sVar.a()) {
            dVar.l(intent, 88890, 0, "推荐");
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.tencent.mm.plugin.finder.nearby.NearbyUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLbsLiveFriendsUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLbsLiveFriendsUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static boolean b() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        return vd2.t3.f435921a.g();
    }

    public static boolean c() {
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("EnableStrangerChat");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            d17 = "0";
        }
        return "1".equals(d17);
    }
}
