package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class w0 implements com.tencent.mm.plugin.wallet_core.ui.aa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUI f148509a;

    public w0(com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI) {
        this.f148509a = mallIndexUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.aa
    public void agree(android.content.Intent intent) {
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.aa
    public void cancel() {
        this.f148509a.finish();
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.aa
    public void nothing() {
    }
}
