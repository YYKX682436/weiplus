package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes5.dex */
public class e5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f180251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180252g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI, java.lang.String str, java.lang.String str2, int i17) {
        super(false);
        this.f180252g = walletOrderInfoNewUI;
        this.f180249d = str;
        this.f180250e = str2;
        this.f180251f = i17;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22110, 1, this.f180252g.f180032p);
        com.tencent.mm.wallet_core.ui.r1.b0(this.f180249d, this.f180250e, this.f180251f, 8);
    }
}
