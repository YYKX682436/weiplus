package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class d2 implements com.tencent.mm.ui.widget.picker.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.o f179358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.e2 f179359b;

    public d2(com.tencent.mm.plugin.wallet_core.id_verify.e2 e2Var, com.tencent.mm.ui.widget.picker.o oVar) {
        this.f179359b = e2Var;
        this.f179358a = oVar;
    }

    @Override // com.tencent.mm.ui.widget.picker.n
    public void onResult(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            java.lang.String format = java.lang.String.format("%04d/%02d/%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179359b.f179369d;
            wcPayRealnameVerifyIdInputUI.P = i17;
            wcPayRealnameVerifyIdInputUI.Q = i18;
            wcPayRealnameVerifyIdInputUI.R = i19;
            wcPayRealnameVerifyIdInputUI.A.f179474v.setValue(format);
        }
        this.f179358a.b();
    }
}
