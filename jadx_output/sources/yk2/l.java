package yk2;

/* loaded from: classes3.dex */
public final class l extends yk2.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.view.ViewGroup root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
    }

    @Override // yk2.g
    public void a(r45.lk2 response) {
        kotlin.jvm.internal.o.g(response, "response");
        this.f462792e = response;
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3769i0).getValue()).r()).intValue();
        android.view.ViewGroup viewGroup = this.f462791d;
        if (intValue == 0) {
            com.tencent.mars.xlog.Log.i("LiveRecentWatchPersonal", "Recent watch experiment is close");
            viewGroup.setVisibility(8);
            return;
        }
        boolean z17 = dk2.ef.C;
        com.tencent.mars.xlog.Log.i("LiveRecentWatchPersonal", "checkPersonalItemShow enable_recent_watch: " + z17);
        if (!z17) {
            viewGroup.setVisibility(8);
            return;
        }
        if (!gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_LIVE_RECENT_WATCH_SETTING_BOOLEAN_SYNC, true)) {
            viewGroup.setVisibility(8);
            return;
        }
        if (viewGroup.getVisibility() == 0) {
            return;
        }
        viewGroup.setVisibility(0);
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        java.lang.String b17 = b();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.a(b17, "", b52.b.b(), "person_page_recent_viewed", "");
    }

    @Override // yk2.g
    public int c() {
        return 8;
    }

    @Override // yk2.g
    public void d() {
        kotlinx.coroutines.l.d(v65.m.a(this.f462791d), null, null, new yk2.k(this, null), 3, null);
    }
}
