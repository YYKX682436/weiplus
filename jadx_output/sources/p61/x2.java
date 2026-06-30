package p61;

/* loaded from: classes5.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI f352409d;

    public x2(com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI bindMobileVerifyUI) {
        this.f352409d = bindMobileVerifyUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI bindMobileVerifyUI = this.f352409d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(bindMobileVerifyUI.f73056n.intValue() - 1);
        bindMobileVerifyUI.f73056n = valueOf;
        if (valueOf.intValue() > 0) {
            bindMobileVerifyUI.f73054i.setText(bindMobileVerifyUI.getResources().getQuantityString(com.tencent.mm.R.plurals.f489684v, bindMobileVerifyUI.f73056n.intValue(), bindMobileVerifyUI.f73056n));
            return;
        }
        bindMobileVerifyUI.f73054i.setText(bindMobileVerifyUI.getResources().getQuantityString(com.tencent.mm.R.plurals.f489684v, 0, 0));
        com.tencent.mm.sdk.platformtools.b4 b4Var = bindMobileVerifyUI.f73058p;
        if (b4Var != null && !b4Var.e()) {
            bindMobileVerifyUI.f73058p.d();
        }
        bindMobileVerifyUI.f73058p = null;
    }
}
