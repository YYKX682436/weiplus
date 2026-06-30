package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class x3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI f179527d;

    public x3(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI wcPayRealnameVerifySuccessUI) {
        this.f179527d = wcPayRealnameVerifySuccessUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI wcPayRealnameVerifySuccessUI = this.f179527d;
        com.tencent.mm.wallet_core.a.c(wcPayRealnameVerifySuccessUI.getContext(), wcPayRealnameVerifySuccessUI.getInput(), 0);
        return false;
    }
}
