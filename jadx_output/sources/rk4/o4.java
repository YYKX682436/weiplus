package rk4;

/* loaded from: classes2.dex */
public final class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f396881d;

    public o4(java.util.Map map) {
        this.f396881d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(gm4.a.f273557a.a("ting_listen_main_page_init_tab_type", false) ? 2 : 1);
        java.util.Map map = this.f396881d;
        map.put("jump_page", valueOf);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("tyt_discover_enter", "view_clk", this.f396881d, 5, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("tyt_discover_enter", "view_clk", map, 31087);
    }
}
