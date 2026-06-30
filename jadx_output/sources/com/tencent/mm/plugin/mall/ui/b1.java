package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class b1 implements com.tencent.mm.plugin.wallet_core.ui.ba {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUI f148341a;

    public b1(com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI) {
        this.f148341a = mallIndexUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.ba
    public android.content.Context getContext() {
        return this.f148341a;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.ba
    public int getShowAgreenRequestCode() {
        return 3;
    }
}
