package p61;

/* loaded from: classes5.dex */
public class t2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI f352381d;

    public t2(com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI bindMobileVerifyUI) {
        this.f352381d = bindMobileVerifyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI bindMobileVerifyUI = this.f352381d;
        java.lang.String trim = bindMobileVerifyUI.f73050e.getText().toString().trim();
        if (trim.equals("")) {
            db5.e1.i(bindMobileVerifyUI, com.tencent.mm.R.string.ahp, com.tencent.mm.R.string.f490573yv);
            return true;
        }
        bindMobileVerifyUI.hideVKB();
        com.tencent.mm.autogen.events.GetSafeDeviceNameEvent getSafeDeviceNameEvent = new com.tencent.mm.autogen.events.GetSafeDeviceNameEvent();
        getSafeDeviceNameEvent.f54407g.f6951a = bindMobileVerifyUI;
        getSafeDeviceNameEvent.e();
        java.lang.String str = getSafeDeviceNameEvent.f54408h.f7032a;
        com.tencent.mm.autogen.events.GetSafeDeviceTypeEvent getSafeDeviceTypeEvent = new com.tencent.mm.autogen.events.GetSafeDeviceTypeEvent();
        getSafeDeviceTypeEvent.e();
        r61.e1 e1Var = new r61.e1(bindMobileVerifyUI.f73051f, 2, trim, 0, "", str, getSafeDeviceTypeEvent.f54409g.f7148a);
        gm0.j1.d().g(e1Var);
        com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI bindMobileVerifyUI2 = this.f352381d;
        bindMobileVerifyUI2.f73052g = db5.e1.Q(bindMobileVerifyUI2, bindMobileVerifyUI2.getString(com.tencent.mm.R.string.f490573yv), bindMobileVerifyUI.getString(com.tencent.mm.R.string.ahe), true, true, new p61.s2(this, e1Var));
        return true;
    }
}
