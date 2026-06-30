package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class c3 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f179348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179349b;

    public c3(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f179349b = wcPayRealnameVerifyIdInputUI;
        this.f179348a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        this.f179348a.B();
        com.tencent.mm.wallet_core.ui.r1.r0(21, 1, com.tencent.mm.sdk.platformtools.t8.i1(), this.f179349b.U);
    }
}
