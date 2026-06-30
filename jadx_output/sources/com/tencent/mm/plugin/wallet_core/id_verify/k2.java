package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class k2 implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.l2 f179405a;

    public k2(com.tencent.mm.plugin.wallet_core.id_verify.l2 l2Var) {
        this.f179405a = l2Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.wallet_core.id_verify.l2 l2Var = this.f179405a;
        l2Var.f179413e.f179293t.d();
        if (z17) {
            com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = l2Var.f179413e;
            if (wcPayRealnameVerifyIdInputUI.f179293t.b() < ((java.util.ArrayList) wcPayRealnameVerifyIdInputUI.F).size()) {
                wcPayRealnameVerifyIdInputUI.A.f179461f.setValue((r45.mj5) ((java.util.ArrayList) wcPayRealnameVerifyIdInputUI.F).get(wcPayRealnameVerifyIdInputUI.f179293t.b()));
                l2Var.f179412d = wcPayRealnameVerifyIdInputUI.f179293t.b();
            }
        }
    }
}
