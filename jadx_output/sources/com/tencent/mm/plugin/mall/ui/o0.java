package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2.AnonymousClass2 f148456d;

    public o0(com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2.AnonymousClass2 anonymousClass2) {
        this.f148456d = anonymousClass2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2 mallIndexOSUIv2 = com.tencent.mm.plugin.mall.ui.MallIndexOSUIv2.this;
        if (mallIndexOSUIv2.F) {
            return;
        }
        mallIndexOSUIv2.finish();
    }
}
