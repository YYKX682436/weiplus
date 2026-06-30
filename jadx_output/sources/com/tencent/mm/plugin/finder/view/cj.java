package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class cj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f131780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f131781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        super(0);
        this.f131780d = bitmap;
        this.f131781e = imageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = this.f131781e;
        android.graphics.Bitmap bitmap = this.f131780d;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setVisibility(4);
            com.tencent.mars.xlog.Log.i("FinderQuickShareShopWindowDialog", "load url get null");
        }
        return jz5.f0.f302826a;
    }
}
