package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class w7 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.wallet.PayInfo f180769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f180770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.n8 f180771f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(com.tencent.mm.pluginsdk.wallet.PayInfo payInfo, android.view.View.OnClickListener onClickListener, com.tencent.mm.plugin.wallet_core.ui.n8 n8Var) {
        super(false);
        this.f180769d = payInfo;
        this.f180770e = onClickListener;
        this.f180771f = n8Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.ui.n8.f180519l1.put(this.f180769d.f192114m, java.lang.Boolean.TRUE);
        this.f180770e.onClick(view);
        if (this.f180771f.f180540x0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14530, 2);
        }
    }
}
