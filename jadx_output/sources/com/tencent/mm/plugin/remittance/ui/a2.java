package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class a2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.b2 f157628d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.tencent.mm.plugin.remittance.ui.b2 b2Var) {
        super(false);
        this.f157628d = b2Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.ui.b2 b2Var = this.f157628d;
        android.view.View.OnClickListener onClickListener = b2Var.f157646f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
            b2Var.dismiss();
        }
    }
}
