package com.tencent.mm.plugin.location.ui;

/* loaded from: classes13.dex */
public class MyLocationButton extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f144608d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageButton f144609e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f144610f;

    /* renamed from: g, reason: collision with root package name */
    public ab3.h f144611g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f144612h;

    /* renamed from: i, reason: collision with root package name */
    public final i11.c f144613i;

    public MyLocationButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f144612h = true;
        this.f144613i = new za3.f(this);
        this.f144608d = context;
        a();
    }

    public final void a() {
        android.view.View inflate = android.view.View.inflate(this.f144608d, com.tencent.mm.R.layout.c5t, this);
        this.f144609e = (android.widget.ImageButton) inflate.findViewById(com.tencent.mm.R.id.f485686in1);
        this.f144610f = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.lbl);
    }

    public android.widget.ImageButton getMyLocationBtn() {
        return this.f144609e;
    }

    public android.widget.LinearLayout getProgressBar() {
        return this.f144610f;
    }

    public void setAnimToSelf(boolean z17) {
        this.f144612h = z17;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f144609e.setOnClickListener(onClickListener);
    }

    public void setProgressBar(ab3.h hVar) {
        this.f144611g = hVar;
        this.f144610f.setVisibility(0);
        this.f144609e.setVisibility(8);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().j(this.f144613i, true);
    }

    public MyLocationButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f144612h = true;
        this.f144613i = new za3.f(this);
        this.f144608d = context;
        a();
    }
}
