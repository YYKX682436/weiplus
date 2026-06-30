package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes5.dex */
public class h1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI f179386d;

    public h1(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI wcPayRealnameInputAddressUI) {
        this.f179386d = wcPayRealnameInputAddressUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI wcPayRealnameInputAddressUI = this.f179386d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameInputAddressUI", "[onMenuItemClick] mIsKeyBoardShow：%s", java.lang.Boolean.valueOf(wcPayRealnameInputAddressUI.f179257r));
        if (wcPayRealnameInputAddressUI.f179257r) {
            wcPayRealnameInputAddressUI.hideVKB();
            wcPayRealnameInputAddressUI.f179257r = false;
        } else {
            wcPayRealnameInputAddressUI.setResult(0);
            wcPayRealnameInputAddressUI.finish();
        }
        return false;
    }
}
