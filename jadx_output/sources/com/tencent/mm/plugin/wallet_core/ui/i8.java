package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class i8 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f180339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Orders f180340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.n8 f180341f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(com.tencent.mm.plugin.wallet_core.ui.n8 n8Var, android.content.Context context, com.tencent.mm.plugin.wallet_core.model.Orders orders) {
        super(false);
        this.f180341f = n8Var;
        this.f180339d = context;
        this.f180340e = orders;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.ui.n8 n8Var = this.f180341f;
        n8Var.f180541y.setVisibility(8);
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = n8Var.X;
        com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 12, "");
        com.tencent.mm.plugin.wallet_core.ui.m4.c(this.f180339d, this.f180340e, n8Var.H.f179667d, new com.tencent.mm.plugin.wallet_core.ui.h8(this), null);
    }
}
