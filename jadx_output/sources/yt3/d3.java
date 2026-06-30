package yt3;

/* loaded from: classes10.dex */
public final class d3 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f465405d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465406e;

    /* renamed from: f, reason: collision with root package name */
    public final et0.q f465407f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f465408g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f465409h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f465410i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f465411m;

    public d3(com.tencent.mm.ui.widget.imageview.WeImageView view, ju3.d0 status, et0.q qVar) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465405d = view;
        this.f465406e = status;
        this.f465407f = qVar;
        this.f465409h = true;
        this.f465411m = true;
        view.setOnClickListener(new yt3.b3(this));
        if (z65.c.a()) {
            view.setOnLongClickListener(new yt3.c3(this));
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
    }

    public final void a(boolean z17) {
        nu3.i.f340218a.n("KEY_RECORD_IS_BEAUTIFY", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f465405d;
        weImageView.setIconColor(z17 ? weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.a0m) : -1);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_BEAUTIFY_ENABLE", z17);
        this.f465406e.w(ju3.c0.f301905u, bundle);
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (this.f465408g) {
            this.f465405d.setVisibility(i17);
        }
    }
}
