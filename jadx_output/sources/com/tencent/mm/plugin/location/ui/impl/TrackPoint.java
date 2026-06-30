package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class TrackPoint extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f144712d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f144713e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f144714f;

    /* renamed from: g, reason: collision with root package name */
    public double f144715g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f144716h;

    /* renamed from: i, reason: collision with root package name */
    public final double f144717i;

    /* renamed from: m, reason: collision with root package name */
    public final double f144718m;

    /* renamed from: n, reason: collision with root package name */
    public final double f144719n;

    /* renamed from: o, reason: collision with root package name */
    public final double f144720o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.location_soso.ViewManager f144721p;

    public TrackPoint(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f144715g = 0.0d;
        this.f144717i = -1.0d;
        this.f144718m = -1.0d;
        this.f144719n = -1.0d;
        this.f144720o = -1.0d;
        this.f144712d = context;
        b(0);
    }

    public void a() {
        this.f144713e.setVisibility(4);
        com.tencent.mm.plugin.location_soso.ViewManager viewManager = this.f144721p;
        if (viewManager != null) {
            viewManager.toggleViewVisible(this.f144713e);
        }
    }

    public final void b(int i17) {
        android.content.Context context = this.f144712d;
        this.f144713e = (android.widget.FrameLayout) android.view.View.inflate(context, com.tencent.mm.R.layout.d2_, null);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f144714f = imageView;
        if (i17 > 0) {
            imageView.setImageResource(i17);
        } else {
            imageView.setImageResource(com.tencent.mm.R.drawable.cja);
        }
        this.f144714f.setBackgroundResource(com.tencent.mm.R.drawable.f481981ap3);
        this.f144714f.setFocusable(true);
        this.f144714f.setFocusableInTouchMode(true);
    }

    public double getHeading() {
        return this.f144715g;
    }

    public double getLatOffest() {
        return this.f144717i - this.f144719n;
    }

    public double getLongOffset() {
        return this.f144718m - this.f144720o;
    }

    public void setAvatar(java.lang.String str) {
        if (str.equals(this.f144716h)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TrackPoint", "skip this set avatar");
            return;
        }
        this.f144716h = str;
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni((android.widget.ImageView) this.f144713e.findViewById(com.tencent.mm.R.id.f483041v0), str);
        com.tencent.mm.plugin.location_soso.ViewManager viewManager = this.f144721p;
        if (viewManager != null) {
            viewManager.updateMarkerView(this.f144713e);
        }
    }

    public void setHeading(double d17) {
        this.f144715g = d17;
    }

    public void setOnAvatarOnClickListener(android.view.View.OnClickListener onClickListener) {
    }

    public void setOnLocationOnClickListener(android.view.View.OnClickListener onClickListener) {
    }

    public TrackPoint(android.content.Context context, com.tencent.mm.plugin.location_soso.ViewManager viewManager) {
        super(context);
        this.f144715g = 0.0d;
        this.f144717i = -1.0d;
        this.f144718m = -1.0d;
        this.f144719n = -1.0d;
        this.f144720o = -1.0d;
        this.f144712d = context;
        this.f144721p = viewManager;
        b(0);
    }

    public TrackPoint(android.content.Context context, com.tencent.mm.plugin.location_soso.ViewManager viewManager, int i17) {
        super(context);
        this.f144715g = 0.0d;
        this.f144717i = -1.0d;
        this.f144718m = -1.0d;
        this.f144719n = -1.0d;
        this.f144720o = -1.0d;
        this.f144712d = context;
        this.f144721p = viewManager;
        b(i17);
    }
}
