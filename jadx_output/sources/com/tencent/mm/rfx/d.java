package com.tencent.mm.rfx;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.rfx.RfxPagView f192225d;

    public d(com.tencent.mm.rfx.RfxPagView rfxPagView) {
        this.f192225d = rfxPagView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.rfx.RfxPagView rfxPagView = this.f192225d;
        boolean isOpaque = rfxPagView.isOpaque();
        rfxPagView.setOpaque(!isOpaque);
        rfxPagView.setOpaque(isOpaque);
    }
}
