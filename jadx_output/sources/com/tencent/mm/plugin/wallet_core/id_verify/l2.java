package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class l2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public int f179412d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179413e;

    public l2(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f179413e = wcPayRealnameVerifyIdInputUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179413e;
        wcPayRealnameVerifyIdInputUI.hideTenpayKB();
        if (bool == null || !bool.booleanValue()) {
            com.tencent.mm.ui.widget.picker.c0 c0Var = wcPayRealnameVerifyIdInputUI.f179293t;
            if (c0Var != null) {
                c0Var.d();
                return;
            }
            return;
        }
        java.util.List list = wcPayRealnameVerifyIdInputUI.F;
        if (((java.util.ArrayList) list).size() <= 0) {
            return;
        }
        java.lang.String[] strArr = new java.lang.String[((java.util.ArrayList) list).size()];
        wcPayRealnameVerifyIdInputUI.getResources().getIntArray(com.tencent.mm.R.array.f478039an);
        for (int i17 = 0; i17 < ((java.util.ArrayList) list).size(); i17++) {
            strArr[i17] = ((r45.mj5) ((java.util.ArrayList) list).get(i17)).f380583d.f376867e;
        }
        com.tencent.mm.ui.widget.picker.c0 c0Var2 = new com.tencent.mm.ui.widget.picker.c0(wcPayRealnameVerifyIdInputUI.getContext(), strArr);
        wcPayRealnameVerifyIdInputUI.f179293t = c0Var2;
        c0Var2.f212259t = new com.tencent.mm.plugin.wallet_core.id_verify.k2(this);
        c0Var2.i(this.f179412d);
        wcPayRealnameVerifyIdInputUI.f179293t.l();
    }
}
