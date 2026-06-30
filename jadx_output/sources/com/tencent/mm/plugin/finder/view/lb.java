package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class lb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f132589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f132590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f132591f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132592g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(android.graphics.Bitmap bitmap, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, int i17, java.lang.String str) {
        super(0);
        this.f132589d = bitmap;
        this.f132590e = weImageView;
        this.f132591f = i17;
        this.f132592g = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f132590e;
        android.graphics.Bitmap bitmap = this.f132589d;
        if (bitmap == null) {
            weImageView.setVisibility(8);
        } else {
            weImageView.setImageBitmap(bitmap);
            weImageView.setIconColor(this.f132591f);
        }
        com.tencent.mars.xlog.Log.i("Finder.HomeTabRedDotTipsBubbleView", "getImage resource :" + bitmap + " iconUrl:" + this.f132592g);
        return jz5.f0.f302826a;
    }
}
