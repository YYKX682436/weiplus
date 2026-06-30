package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class j3 implements com.tencent.mm.ui.widget.picker.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.o f179400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.k3 f179401b;

    public j3(com.tencent.mm.plugin.wallet_core.id_verify.k3 k3Var, com.tencent.mm.ui.widget.picker.o oVar) {
        this.f179401b = k3Var;
        this.f179400a = oVar;
    }

    @Override // com.tencent.mm.ui.widget.picker.n
    public void onResult(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            java.lang.String format = java.lang.String.format("%04d/%02d/%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179401b.f179406d;
            wcPayRealnameVerifyIdInputUI.I = i17;
            wcPayRealnameVerifyIdInputUI.f179279J = i18;
            wcPayRealnameVerifyIdInputUI.K = i19;
            wcPayRealnameVerifyIdInputUI.A.f179471s.setValue(format);
        }
        this.f179400a.b();
    }
}
