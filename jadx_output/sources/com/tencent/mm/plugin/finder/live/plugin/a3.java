package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f111786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f111787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f111788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111789g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f111790h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, int i17, java.lang.String str, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        super(0);
        this.f111786d = bitmap;
        this.f111787e = imageView;
        this.f111788f = i17;
        this.f111789g = str;
        this.f111790h = v3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = this.f111787e;
        android.graphics.Bitmap bitmap = this.f111786d;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            int i17 = this.f111788f;
            if (i17 >= 0) {
                com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", this.f111789g + " resource is null");
                imageView.setImageDrawable(this.f111790h.f365323d.getContext().getResources().getDrawable(i17));
            }
        }
        return jz5.f0.f302826a;
    }
}
