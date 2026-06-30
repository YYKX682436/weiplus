package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gw implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f112735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f112736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f112737f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f112738g;

    public gw(android.widget.ImageView imageView, com.tencent.mm.plugin.finder.live.plugin.ow owVar, android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        this.f112735d = imageView;
        this.f112736e = owVar;
        this.f112737f = pointF;
        this.f112738g = pointF2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView = this.f112735d;
        android.view.ViewPropertyAnimator animate = imageView.animate();
        com.tencent.mm.plugin.finder.live.plugin.ow owVar = this.f112736e;
        animate.setDuration(owVar.L).setInterpolator(new com.tencent.mm.plugin.finder.live.plugin.nv(new android.graphics.PointF(0.18f, 0.3f))).setUpdateListener(new com.tencent.mm.plugin.finder.live.plugin.ew(imageView, owVar, this.f112737f, this.f112738g)).setListener(new com.tencent.mm.plugin.finder.live.plugin.fw(owVar, imageView)).start();
    }
}
