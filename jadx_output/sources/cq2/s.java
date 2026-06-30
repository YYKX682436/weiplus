package cq2;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final cq2.s f221445a = new cq2.s();

    public final void a(android.content.Context context, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, java.lang.String username, int i17) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        kotlin.jvm.internal.o.g(username, "username");
        r45.xk e17 = hc2.f0.e(finderItem);
        if (e17 != null) {
            java.lang.String string = e17.getString(0);
            if (string == null || string.length() == 0) {
                com.tencent.mars.xlog.Log.e("NewSquareUtil", "jumpProfile: error username is null, feedId=".concat(pm0.v.u(finderItem.getId())));
                return;
            }
            zl2.q4 q4Var = zl2.q4.f473933a;
            java.lang.String string2 = e17.getString(0);
            java.lang.String str = string2 == null ? "" : string2;
            r45.nw1 liveInfo = finderItem.getLiveInfo();
            q4Var.G(str, "", context, 0L, liveInfo != null ? pm0.v.u(liveInfo.getLong(0)) : "", 0);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.content.Intent intent = new android.content.Intent();
            ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
            rq2.x xVar = rq2.x.f398914a;
            intent.putExtra("key_click_tab_context_id", rq2.x.f398919f);
            intent.putExtra("finder_username", username);
            intent.putExtra("key_from_comment_scene", i17);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
            ((c61.l7) b6Var).Cj(rq2.x.f398915b, intent);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(context, intent);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveSquareTabLifeCycleReport", "enterProfile");
        ip2.a.f293615d = "page_profile";
    }
}
