package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class q1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI f179479d;

    public q1(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI) {
        this.f179479d = wcPayRealnameVerifyCodeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI = this.f179479d;
        com.tencent.mm.wallet_core.h process = wcPayRealnameVerifyCodeUI.getProcess();
        if (process != null) {
            process.c(wcPayRealnameVerifyCodeUI.getContext(), 0);
        } else {
            wcPayRealnameVerifyCodeUI.finish();
        }
        return false;
    }
}
