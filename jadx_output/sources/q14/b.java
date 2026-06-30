package q14;

/* loaded from: classes5.dex */
public final class b implements al5.w4 {

    /* renamed from: a, reason: collision with root package name */
    public static final q14.b f359688a = new q14.b();

    @Override // al5.w4
    public final void onStatusChange(boolean z17) {
        if (z17) {
            js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
            js.a aVar = js.a.WCAccountLogoutEntry_NO_PWD;
            is.f fVar = (is.f) r0Var;
            fVar.getClass();
            com.tencent.mm.sdk.platformtools.o4 Ui = fVar.Ui();
            if (Ui != null) {
                Ui.A(fVar.Ni(aVar), Integer.MAX_VALUE);
            }
        }
        boolean Ri = ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Ri();
        ((is.f) ((js.r0) i95.n0.c(js.r0.class))).getClass();
        java.lang.String r17 = c01.z1.r();
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoService", "setNoPwdPermissionStatus[%b]， curUserName[%s]", java.lang.Boolean.valueOf(z17), r17);
        c01.uc.f37514c.h(r17, "last_logout_no_pwd_permission_status", z17 ? "1" : "0");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("switch_one_clk_login_status", "view_clk", kz5.c1.k(new jz5.l(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, wo.w0.k()), new jz5.l("switch_status_after", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("switch_status_before", java.lang.Integer.valueOf(Ri ? 1 : 0))), 34575);
    }
}
