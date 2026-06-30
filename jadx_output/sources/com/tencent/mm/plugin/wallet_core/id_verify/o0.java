package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class o0 implements com.tencent.mm.plugin.wallet_core.ui.ba {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI f179450a;

    public o0(com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI switchRealnameVerifyModeUI) {
        this.f179450a = switchRealnameVerifyModeUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.ba
    public android.content.Context getContext() {
        return this.f179450a;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.ba
    public int getShowAgreenRequestCode() {
        return 1;
    }
}
