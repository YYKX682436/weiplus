package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f180908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f180909e;

    public j(com.tencent.mm.plugin.wallet_core.utils.l lVar, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f180908d = imageView;
        this.f180909e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f180908d.setImageBitmap(this.f180909e);
    }
}
