package com.tencent.mm.plugin.sight.decode.model;

/* loaded from: classes13.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f162441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f162442e;

    public q(com.tencent.mm.plugin.sight.decode.model.r rVar, android.view.View view, android.graphics.Bitmap bitmap) {
        this.f162441d = view;
        this.f162442e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f162441d.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(this.f162442e));
    }
}
