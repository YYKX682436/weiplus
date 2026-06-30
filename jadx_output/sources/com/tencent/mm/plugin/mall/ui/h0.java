package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexOSUI.AnonymousClass2 f148386d;

    public h0(com.tencent.mm.plugin.mall.ui.MallIndexOSUI.AnonymousClass2 anonymousClass2) {
        this.f148386d = anonymousClass2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mall.ui.MallIndexOSUI mallIndexOSUI = com.tencent.mm.plugin.mall.ui.MallIndexOSUI.this;
        if (mallIndexOSUI.D) {
            return;
        }
        mallIndexOSUI.finish();
    }
}
