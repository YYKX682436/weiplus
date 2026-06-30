package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f180911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f180912e;

    public k(com.tencent.mm.plugin.wallet_core.utils.l lVar, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f180911d = imageView;
        this.f180912e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f180911d.setImageBitmap(this.f180912e);
    }
}
