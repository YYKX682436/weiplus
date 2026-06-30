package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class r0 implements com.tencent.mm.plugin.wallet_core.ui.aa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f179482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI f179483b;

    public r0(com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI switchRealnameVerifyModeUI, android.view.View view) {
        this.f179483b = switchRealnameVerifyModeUI;
        this.f179482a = view;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.aa
    public void agree(android.content.Intent intent) {
        android.view.View view = this.f179482a;
        com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI switchRealnameVerifyModeUI = this.f179483b;
        switchRealnameVerifyModeUI.onClickImp(view);
        switchRealnameVerifyModeUI.B = false;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.aa
    public void cancel() {
        this.f179483b.A.f180179d = false;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.aa
    public void nothing() {
        this.f179483b.onClickImp(this.f179482a);
    }
}
