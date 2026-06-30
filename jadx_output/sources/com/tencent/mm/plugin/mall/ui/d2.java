package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2.AnonymousClass5 f148355d;

    public d2(com.tencent.mm.plugin.mall.ui.MallIndexUIv2.AnonymousClass5 anonymousClass5) {
        this.f148355d = anonymousClass5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexUIv2", "offlineUseCaseEvent dropServiceHome finish");
        com.tencent.mm.plugin.mall.ui.MallIndexUIv2.AnonymousClass5 anonymousClass5 = this.f148355d;
        if (com.tencent.mm.plugin.mall.ui.MallIndexUIv2.this.isFinishing() || com.tencent.mm.plugin.mall.ui.MallIndexUIv2.this.hasFinish() || com.tencent.mm.plugin.mall.ui.MallIndexUIv2.this.isDestroyed()) {
            return;
        }
        com.tencent.mm.plugin.mall.ui.MallIndexUIv2.this.finish();
    }
}
