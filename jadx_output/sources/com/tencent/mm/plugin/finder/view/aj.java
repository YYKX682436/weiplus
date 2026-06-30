package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class aj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f131650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f131651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        super(0);
        this.f131650d = bitmap;
        this.f131651e = imageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = this.f131651e;
        android.graphics.Bitmap bitmap = this.f131650d;
        if (bitmap != null) {
            imageView.setVisibility(0);
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setVisibility(8);
            com.tencent.mars.xlog.Log.i("FinderQuickShareShopWindowDialog", "load url get null");
        }
        return jz5.f0.f302826a;
    }
}
