package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class t0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI f179494d;

    public t0(com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI switchRealnameVerifyModeUI) {
        this.f179494d = switchRealnameVerifyModeUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f179494d.finish();
    }
}
