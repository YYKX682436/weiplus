package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes8.dex */
public class n1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI f179445d;

    public n1(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI wcPayRealnameVerifyBindcardEntranceUI) {
        this.f179445d = wcPayRealnameVerifyBindcardEntranceUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI wcPayRealnameVerifyBindcardEntranceUI = this.f179445d;
        com.tencent.mm.wallet_core.h process = wcPayRealnameVerifyBindcardEntranceUI.getProcess();
        if (process != null) {
            process.c(wcPayRealnameVerifyBindcardEntranceUI.getContext(), 0);
        } else {
            wcPayRealnameVerifyBindcardEntranceUI.finish();
        }
        return false;
    }
}
