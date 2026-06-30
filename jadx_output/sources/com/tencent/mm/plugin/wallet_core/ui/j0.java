package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class j0 implements com.tencent.mm.plugin.wallet_core.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.k0 f180352a;

    public j0(com.tencent.mm.plugin.wallet_core.ui.k0 k0Var) {
        this.f180352a = k0Var;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.a4
    public void onClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener = this.f180352a.S;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
