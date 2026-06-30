package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class s0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.h f179488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI f179489e;

    public s0(com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI switchRealnameVerifyModeUI, com.tencent.mm.wallet_core.h hVar) {
        this.f179489e = switchRealnameVerifyModeUI;
        this.f179488d = hVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.os.Bundle bundle = this.f179488d.f213801c;
        bundle.putInt("real_name_verify_mode", 3);
        bundle.putString("verify_card_flag", "1");
        com.tencent.mm.wallet_core.a.d(this.f179489e, bundle);
    }
}
