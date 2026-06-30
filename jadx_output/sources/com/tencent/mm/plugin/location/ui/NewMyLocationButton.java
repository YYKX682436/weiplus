package com.tencent.mm.plugin.location.ui;

/* loaded from: classes13.dex */
public class NewMyLocationButton extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f144619d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageButton f144620e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f144621f;

    /* renamed from: g, reason: collision with root package name */
    public ab3.h f144622g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f144623h;

    /* renamed from: i, reason: collision with root package name */
    public final i11.c f144624i;

    public NewMyLocationButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f144623h = true;
        this.f144624i = new za3.j(this);
        this.f144619d = context;
        a();
    }

    public final void a() {
        android.view.View inflate = android.view.View.inflate(this.f144619d, com.tencent.mm.R.layout.c7p, this);
        this.f144620e = (android.widget.ImageButton) inflate.findViewById(com.tencent.mm.R.id.k9o);
        this.f144621f = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.k9x);
    }

    public void setAnimToSelf(boolean z17) {
        this.f144623h = z17;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f144620e.setOnClickListener(onClickListener);
    }

    public void setProgressBar(ab3.h hVar) {
        this.f144622g = hVar;
        this.f144621f.setVisibility(0);
        this.f144620e.setVisibility(8);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().j(this.f144624i, true);
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        if (z17 != this.f144620e.isSelected()) {
            this.f144620e.setSelected(z17);
        }
    }

    public NewMyLocationButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f144623h = true;
        this.f144624i = new za3.j(this);
        this.f144619d = context;
        a();
    }
}
