package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class yi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f133396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f133397e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        super(0);
        this.f133396d = bitmap;
        this.f133397e = imageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = this.f133397e;
        android.graphics.Bitmap bitmap = this.f133396d;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setVisibility(8);
            com.tencent.mars.xlog.Log.i("FinderQuickShareShopWindowDialog", "load url get null");
        }
        return jz5.f0.f302826a;
    }
}
