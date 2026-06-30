package r62;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static java.util.Map f393009d;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f393010a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f393011b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f393012c = new r62.b(this);

    public d(android.content.Context context, java.lang.String str, boolean z17) {
        this.f393010a = "";
        this.f393011b = null;
        this.f393011b = context;
        this.f393010a = str;
    }

    public static void a(r62.d dVar, r45.iw5 iw5Var) {
        dVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("add_more_friend_search_scene", 3);
        if (iw5Var != null) {
            try {
                intent.putExtra("result", iw5Var.toByteArray());
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: IOException: %s", e17.toString());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: more than one contact is resolved. starting to ContactSearchResultUI");
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.n(intent, dVar.f393011b);
    }

    public final void b(java.lang.String str, r62.c cVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: username is null when put to cache");
            return;
        }
        if (f393009d == null) {
            f393009d = new java.util.HashMap();
        }
        f393009d.put(str, cVar);
    }

    public final int c(java.lang.String str, r45.iw5 iw5Var, r45.gw5 gw5Var) {
        if (this.f393011b == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RedirectToChattingByPhoneHelper", "hy: error param. start redirect param error: context is null");
            return -1;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && ((com.tencent.mm.storage.k4) c01.d9.b().q()).h(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: is friend. direct to chatting");
            d(str);
            return 0;
        }
        if (iw5Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: direct via searchResp");
            f(iw5Var);
            return 1;
        }
        if (gw5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: no matching for starting redirect");
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: direct via SearchContactItem");
        e(gw5Var);
        return 1;
    }

    public final void d(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("finish_direct", false);
        j45.l.u(this.f393011b, ".ui.chatting.ChattingUI", intent, null);
    }

    public final void e(r45.gw5 gw5Var) {
        if (gw5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start to profile failed: item or context is null");
            return;
        }
        java.lang.String g17 = x51.j1.g(gw5Var.f375561d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start failed: no user name");
            return;
        }
        b(this.f393010a, new r62.c(this, x51.j1.g(gw5Var.f375561d), null, gw5Var));
        if (((com.tencent.mm.storage.k4) c01.d9.b().q()).h(g17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: search item is friend. start to chatting");
            d(g17);
        } else {
            android.content.Intent intent = new android.content.Intent();
            ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).wi(intent, gw5Var, 15);
            intent.putExtra("add_more_friend_search_scene", 2);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, this.f393011b);
        }
    }

    public final void f(r45.iw5 iw5Var) {
        if (iw5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start to profile failed: resp or context is null");
            return;
        }
        java.lang.String g17 = x51.j1.g(iw5Var.f377356d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RedirectToChattingByPhoneHelper", "hy: start failed: no user name");
            return;
        }
        b(this.f393010a, new r62.c(this, x51.j1.g(iw5Var.f377356d), iw5Var, null));
        if (((com.tencent.mm.storage.k4) c01.d9.b().q()).h(g17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: search response is friend. start to chatting");
            d(g17);
        } else {
            android.content.Intent intent = new android.content.Intent();
            qk.p.a(intent, iw5Var, 15);
            intent.putExtra("add_more_friend_search_scene", 2);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, this.f393011b);
        }
    }
}
