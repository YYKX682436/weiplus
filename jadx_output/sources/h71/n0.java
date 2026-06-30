package h71;

/* loaded from: classes14.dex */
public class n0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI f279404d;

    public n0(com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI securityAccountVerifyUI) {
        this.f279404d = securityAccountVerifyUI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        r61.e1 e1Var;
        com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI securityAccountVerifyUI = this.f279404d;
        java.lang.String trim = securityAccountVerifyUI.f73234e.getText().toString().trim();
        if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
            db5.e1.i(securityAccountVerifyUI, com.tencent.mm.R.string.ahp, com.tencent.mm.R.string.f490573yv);
            return true;
        }
        securityAccountVerifyUI.hideVKB();
        securityAccountVerifyUI.f73241o = e71.j.a(securityAccountVerifyUI);
        java.lang.String str = android.os.Build.MANUFACTURER + "-" + wo.w0.m();
        securityAccountVerifyUI.getClass();
        if (securityAccountVerifyUI.f73244r) {
            e1Var = new r61.e1(securityAccountVerifyUI.f73239m, 11, trim, 0, "", securityAccountVerifyUI.f73241o, str);
        } else {
            java.lang.String str2 = securityAccountVerifyUI.f73239m;
            java.lang.String str3 = securityAccountVerifyUI.f73240n;
            java.lang.String str4 = securityAccountVerifyUI.f73241o;
            h11.e eVar = new h11.e(str2, 11, trim, 0, "", str3);
            r45.di diVar = ((o45.eh) eVar.f278071d.getReqObj()).f342922a;
            diVar.f372490o = str4;
            diVar.f372491p = str;
            e1Var = eVar;
        }
        gm0.j1.d().g(e1Var);
        securityAccountVerifyUI.f73243q = db5.e1.Q(securityAccountVerifyUI, securityAccountVerifyUI.getString(com.tencent.mm.R.string.f490573yv), securityAccountVerifyUI.getString(com.tencent.mm.R.string.ahe), true, true, new h71.m0(this, e1Var));
        return true;
    }
}
