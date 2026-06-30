package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class z1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef3.d f148520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2 f148521e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2, ef3.d dVar) {
        super(false);
        this.f148521e = mallIndexUIv2;
        this.f148520d = dVar;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        new android.content.Intent();
        com.tencent.mm.wallet_core.ui.r1.Z(this.f148521e, this.f148520d.f252405a);
    }
}
