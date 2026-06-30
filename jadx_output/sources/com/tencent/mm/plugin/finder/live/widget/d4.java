package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f118050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f118051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118052f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, java.lang.String str) {
        super(0);
        this.f118050d = bitmap;
        this.f118051e = imageView;
        this.f118052f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f118050d;
        if (bitmap != null) {
            this.f118051e.setImageBitmap(bitmap);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveAfterRecommendProductWidget", this.f118052f + " resource is null");
        }
        return jz5.f0.f302826a;
    }
}
