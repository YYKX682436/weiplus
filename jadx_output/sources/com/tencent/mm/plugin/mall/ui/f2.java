package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class f2 implements com.tencent.mm.plugin.wallet_core.ui.ba {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2 f148380a;

    public f2(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2) {
        this.f148380a = mallIndexUIv2;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.ba
    public android.content.Context getContext() {
        return this.f148380a;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.ba
    public int getShowAgreenRequestCode() {
        return 3;
    }
}
