package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class r3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI f179486d;

    public r3(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI wcPayRealnameVerifyMainUI) {
        this.f179486d = wcPayRealnameVerifyMainUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI wcPayRealnameVerifyMainUI = this.f179486d;
        com.tencent.mm.wallet_core.h process = wcPayRealnameVerifyMainUI.getProcess();
        if (process != null) {
            process.c(wcPayRealnameVerifyMainUI.getContext(), 0);
            return true;
        }
        wcPayRealnameVerifyMainUI.finish();
        return false;
    }
}
