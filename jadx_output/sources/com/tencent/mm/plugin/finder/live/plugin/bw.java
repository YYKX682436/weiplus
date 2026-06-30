package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bw implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f112078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f112079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f112080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f112081g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f112082h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f112083i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f112084m;

    public bw(android.widget.ImageView imageView, com.tencent.mm.plugin.finder.live.plugin.ow owVar, android.graphics.PointF pointF, android.graphics.PointF pointF2, android.graphics.PointF pointF3, android.graphics.PointF pointF4, android.graphics.PointF pointF5) {
        this.f112078d = imageView;
        this.f112079e = owVar;
        this.f112080f = pointF;
        this.f112081g = pointF2;
        this.f112082h = pointF3;
        this.f112083i = pointF4;
        this.f112084m = pointF5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView = this.f112078d;
        android.view.ViewPropertyAnimator animate = imageView.animate();
        com.tencent.mm.plugin.finder.live.plugin.ow owVar = this.f112079e;
        animate.setDuration(owVar.L).setInterpolator(new com.tencent.mm.plugin.finder.live.plugin.nv(new android.graphics.PointF(0.18f, 0.3f))).setUpdateListener(new com.tencent.mm.plugin.finder.live.plugin.zv(this.f112078d, this.f112079e, this.f112080f, this.f112081g, this.f112082h, this.f112083i, this.f112084m)).setListener(new com.tencent.mm.plugin.finder.live.plugin.aw(owVar, imageView)).start();
    }
}
