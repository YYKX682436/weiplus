package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class a2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef3.d f148330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2 f148331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2, ef3.d dVar) {
        super(false);
        this.f148331e = mallIndexUIv2;
        this.f148330d = dVar;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f148331e.getContext(), this.f148330d.f252405a, true);
    }
}
