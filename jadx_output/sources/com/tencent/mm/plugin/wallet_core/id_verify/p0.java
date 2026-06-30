package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class p0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI f179456d;

    public p0(com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI switchRealnameVerifyModeUI) {
        this.f179456d = switchRealnameVerifyModeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI switchRealnameVerifyModeUI = this.f179456d;
        com.tencent.mm.wallet_core.h process = switchRealnameVerifyModeUI.getProcess();
        if (process == null) {
            switchRealnameVerifyModeUI.finish();
            return false;
        }
        com.tencent.mm.wallet_core.ui.r1.r0(14, 1, com.tencent.mm.sdk.platformtools.t8.i1(), switchRealnameVerifyModeUI.f179222y);
        process.c(switchRealnameVerifyModeUI, 0);
        return true;
    }
}
