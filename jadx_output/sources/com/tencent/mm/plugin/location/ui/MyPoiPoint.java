package com.tencent.mm.plugin.location.ui;

/* loaded from: classes13.dex */
public class MyPoiPoint extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public ab3.h f144614d;

    /* renamed from: e, reason: collision with root package name */
    public i11.e f144615e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f144616f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mapsdk.raster.model.Circle f144617g;

    /* renamed from: h, reason: collision with root package name */
    public final i11.c f144618h;

    public MyPoiPoint(android.content.Context context, ab3.h hVar) {
        super(context);
        this.f144616f = false;
        this.f144618h = new za3.g(this);
        a(context);
        this.f144614d = hVar;
    }

    public final void a(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c_3, (android.view.ViewGroup) this, true);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        this.f144615e = e17;
        e17.j(this.f144618h, true);
    }

    public void setIMapView(ab3.h hVar) {
        this.f144614d = hVar;
    }

    public MyPoiPoint(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f144616f = false;
        this.f144618h = new za3.g(this);
        a(context);
    }

    public MyPoiPoint(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f144616f = false;
        this.f144618h = new za3.g(this);
        a(context);
    }
}
