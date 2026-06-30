package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class ce implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f128988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f128989e;

    public ce(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, android.graphics.Bitmap bitmap) {
        this.f128988d = finderSelectCoverUI;
        this.f128989e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f128988d;
        finderSelectCoverUI.f128685y0 = true;
        android.graphics.Bitmap imgBitmap = this.f128989e;
        kotlin.jvm.internal.o.f(imgBitmap, "$imgBitmap");
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.e7(finderSelectCoverUI, imgBitmap);
    }
}
