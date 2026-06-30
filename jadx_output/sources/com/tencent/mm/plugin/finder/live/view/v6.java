package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class v6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f116738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f116739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView f116740f;

    public v6(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView) {
        this.f116738d = bitmap;
        this.f116739e = imageView;
        this.f116740f = finderLiveMiniView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f116738d;
        pm0.v.X(new com.tencent.mm.plugin.finder.live.view.u6(this.f116739e, this.f116740f, com.tencent.mm.sdk.platformtools.x.S(bitmap, bitmap.getHeight(), (int) (bitmap.getHeight() / (com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a).y / com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a).x)), true, false)));
    }
}
