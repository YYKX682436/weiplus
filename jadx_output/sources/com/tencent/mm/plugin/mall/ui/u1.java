package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class u1 implements com.tencent.mm.plugin.wallet_core.ui.aa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2 f148502a;

    public u1(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2) {
        this.f148502a = mallIndexUIv2;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.aa
    public void agree(android.content.Intent intent) {
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.aa
    public void cancel() {
        this.f148502a.finish();
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.aa
    public void nothing() {
    }
}
