package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class s3 implements com.tencent.mm.plugin.wallet_core.ui.aa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.t3 f179492a;

    public s3(com.tencent.mm.plugin.wallet_core.id_verify.t3 t3Var) {
        this.f179492a = t3Var;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.aa
    public void agree(android.content.Intent intent) {
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI.U6(this.f179492a.f179497e, intent);
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.aa
    public void cancel() {
        this.f179492a.f179497e.f179305h.f180179d = false;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.aa
    public void nothing() {
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI.U6(this.f179492a.f179497e, null);
    }
}
