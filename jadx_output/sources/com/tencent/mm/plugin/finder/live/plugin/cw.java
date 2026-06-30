package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class cw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f112200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f112201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f112202f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112203g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f112204h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112205i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f112206m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f112207n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f112208o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f112209p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f112210q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.live.plugin.ow owVar, int i17, java.lang.String str, int i18, int i19, android.graphics.PointF pointF, android.graphics.PointF pointF2, android.graphics.PointF pointF3, android.graphics.PointF pointF4, android.graphics.PointF pointF5) {
        super(0);
        this.f112200d = bitmap;
        this.f112201e = owVar;
        this.f112202f = i17;
        this.f112203g = str;
        this.f112204h = i18;
        this.f112205i = i19;
        this.f112206m = pointF;
        this.f112207n = pointF2;
        this.f112208o = pointF3;
        this.f112209p = pointF4;
        this.f112210q = pointF5;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ow owVar = this.f112201e;
        android.graphics.Bitmap bitmap = this.f112200d;
        if (bitmap != null) {
            android.widget.ImageView imageView = new android.widget.ImageView(owVar.f365323d.getContext());
            imageView.setImageBitmap(bitmap);
            int i17 = this.f112202f;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(i17, i17);
            marginLayoutParams.setMarginStart(this.f112204h);
            marginLayoutParams.topMargin = this.f112205i;
            imageView.setLayoutParams(marginLayoutParams);
            owVar.B1().addView(imageView);
            imageView.setAlpha(0.0f);
            imageView.post(new com.tencent.mm.plugin.finder.live.plugin.bw(imageView, this.f112201e, this.f112206m, this.f112207n, this.f112208o, this.f112209p, this.f112210q));
        } else {
            com.tencent.mars.xlog.Log.w(owVar.f113787p, "loadOthersAvatar fail: " + this.f112203g);
        }
        return jz5.f0.f302826a;
    }
}
