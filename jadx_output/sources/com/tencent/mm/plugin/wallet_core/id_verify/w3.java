package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class w3 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI f179523a;

    public w3(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI wcPayRealnameVerifySuccessUI) {
        this.f179523a = wcPayRealnameVerifySuccessUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI wcPayRealnameVerifySuccessUI = this.f179523a;
        java.lang.String string = wcPayRealnameVerifySuccessUI.getInput().getString("realname_verify_process_finish_bottom_username");
        java.lang.String string2 = wcPayRealnameVerifySuccessUI.getInput().getString("realname_verify_process_finish_bottom_url");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mm.wallet_core.ui.r1.b0(string, string2, 0, 1034);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                return;
            }
            com.tencent.mm.wallet_core.ui.r1.V(wcPayRealnameVerifySuccessUI.getContext(), string2, true);
        }
    }
}
