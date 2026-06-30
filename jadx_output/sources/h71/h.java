package h71;

/* loaded from: classes15.dex */
public final class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI f279391d;

    public h(com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI mySafeDeviceDetailUI) {
        this.f279391d = mySafeDeviceDetailUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI mySafeDeviceDetailUI = this.f279391d;
        ((cy1.a) rVar).Cj("view_clk", dialogInterface, kz5.c1.k(new jz5.l("view_id", "delete_device_confirm_alert_confirm_btn"), new jz5.l("is_login", java.lang.Integer.valueOf(mySafeDeviceDetailUI.f73200h ? 1 : 0)), new jz5.l("is_main_device", java.lang.Integer.valueOf(mySafeDeviceDetailUI.W6() ? 1 : 0))), 28198);
        e71.e eVar = new e71.e(mySafeDeviceDetailUI.f73197e);
        gm0.j1.d().g(eVar);
        mySafeDeviceDetailUI.f73206q = db5.e1.Q(mySafeDeviceDetailUI.getContext(), "", i65.a.r(mySafeDeviceDetailUI.getContext(), com.tencent.mm.R.string.f490605zr), true, true, new h71.g(eVar));
    }
}
