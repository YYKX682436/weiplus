package yt3;

/* loaded from: classes5.dex */
public final class u3 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f465690d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465691e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f465692f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f465693g;

    public u3(android.widget.ImageView view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465690d = view;
        this.f465691e = status;
        view.setImageDrawable(com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.raw.icons_filled_filters, -1));
        view.setOnClickListener(new yt3.t3(this));
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (this.f465692f) {
            this.f465690d.setVisibility(i17);
        }
    }
}
