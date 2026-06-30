package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes2.dex */
public final class v2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f115726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f115727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.an1 f115728f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, r45.an1 an1Var) {
        super(0);
        this.f115726d = bitmap;
        this.f115727e = imageView;
        this.f115728f = an1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f115726d;
        if (bitmap != null) {
            android.widget.ImageView imageView = this.f115727e;
            imageView.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(imageView.getContext().getResources(), bitmap));
        } else {
            com.tencent.mars.xlog.Log.i("SquareConvertUtil", "bindHighTagView background resource is null, url = " + this.f115728f + ".background_icon_url");
        }
        return jz5.f0.f302826a;
    }
}
