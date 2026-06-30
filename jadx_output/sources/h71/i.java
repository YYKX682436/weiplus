package h71;

/* loaded from: classes15.dex */
public final class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI f279393d;

    public i(com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI mySafeDeviceDetailUI) {
        this.f279393d = mySafeDeviceDetailUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI mySafeDeviceDetailUI = this.f279393d;
        ((cy1.a) rVar).Cj("view_clk", dialogInterface, kz5.c1.k(new jz5.l("view_id", "delete_device_confirm_alert_cancel_btn"), new jz5.l("is_login", java.lang.Integer.valueOf(mySafeDeviceDetailUI.f73200h ? 1 : 0)), new jz5.l("is_main_device", java.lang.Integer.valueOf(mySafeDeviceDetailUI.W6() ? 1 : 0))), 28198);
    }
}
