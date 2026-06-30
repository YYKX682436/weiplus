package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f144393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI f144394e;

    public d2(java.lang.ref.WeakReference weakReference, com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI) {
        this.f144393d = weakReference;
        this.f144394e = wxaLiteAppSheetUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI) this.f144393d.get()) != null) {
            super/*com.tencent.mm.hellhoundlib.activities.HellActivity*/.finish();
        }
    }
}
