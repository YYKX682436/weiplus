package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class u0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI f179500d;

    public u0(com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI switchRealnameVerifyModeUI) {
        this.f179500d = switchRealnameVerifyModeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
        com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI switchRealnameVerifyModeUI = this.f179500d;
        com.tencent.mm.wallet_core.ui.r1.r0(18, 1, i17, switchRealnameVerifyModeUI.f179222y);
        com.tencent.mm.wallet_core.ui.r1.V(switchRealnameVerifyModeUI.getContext(), switchRealnameVerifyModeUI.f179218u, false);
        return true;
    }
}
