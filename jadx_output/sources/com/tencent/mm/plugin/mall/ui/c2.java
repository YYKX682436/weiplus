package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2.AnonymousClass4 f148347d;

    public c2(com.tencent.mm.plugin.mall.ui.MallIndexUIv2.AnonymousClass4 anonymousClass4) {
        this.f148347d = anonymousClass4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2 = com.tencent.mm.plugin.mall.ui.MallIndexUIv2.this;
        if (mallIndexUIv2.G) {
            return;
        }
        mallIndexUIv2.G = true;
        mallIndexUIv2.finish();
    }
}
