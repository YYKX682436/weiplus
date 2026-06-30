package com.tencent.mm.plugin.location.ui;

/* loaded from: classes3.dex */
public class LoaddingView extends android.widget.LinearLayout implements za3.c {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f144602d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f144603e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.animation.Animation f144604f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f144605g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f144606h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f144607i;

    public LoaddingView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f144606h = false;
        this.f144607i = "";
        a(context);
    }

    public final void a(android.content.Context context) {
        this.f144604f = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477910ey);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bsr, (android.view.ViewGroup) this, true);
        this.f144603e = (android.widget.ProgressBar) inflate.findViewById(com.tencent.mm.R.id.ine);
        this.f144602d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.inx);
        this.f144605g = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.in6);
        if (j65.e.b()) {
            this.f144605g.setImageResource(com.tencent.mm.R.drawable.c8k);
        }
        this.f144602d.setText("");
        this.f144602d.setVisibility(0);
        this.f144603e.setVisibility(0);
    }

    @Override // za3.c
    public java.lang.String getPreText() {
        return this.f144607i;
    }

    public void setPreText(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.f144607i = str + "\n";
    }

    public void setProgressAlwaysGone(boolean z17) {
        this.f144606h = z17;
        this.f144603e.setVisibility(8);
        this.f144602d.setVisibility(8);
    }

    @Override // za3.c
    public void setText(java.lang.String str) {
        if (this.f144602d == null || this.f144603e == null || this.f144606h) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f144602d.setText("");
            this.f144602d.setVisibility(0);
            this.f144603e.setVisibility(0);
            return;
        }
        this.f144602d.setText(str + "");
        this.f144603e.setVisibility(8);
        this.f144602d.setVisibility(0);
    }

    public LoaddingView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f144606h = false;
        this.f144607i = "";
        a(context);
    }
}
