package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class q3 implements com.tencent.mm.plugin.wallet_core.ui.ba {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI f179481a;

    public q3(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI wcPayRealnameVerifyMainUI) {
        this.f179481a = wcPayRealnameVerifyMainUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.ba
    public android.content.Context getContext() {
        return this.f179481a.getContext();
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.ba
    public int getShowAgreenRequestCode() {
        return 1;
    }
}
