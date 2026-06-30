package em;

/* loaded from: classes9.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254405a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f254406b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.view.StretchFrameLayout f254407c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewStub f254408d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254409e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254410f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f254411g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f254412h;

    public i(android.view.View view) {
        this.f254405a = view;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView a() {
        if (this.f254409e == null) {
            this.f254409e = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f254405a.findViewById(com.tencent.mm.R.id.sxt);
        }
        return this.f254409e;
    }

    public com.tencent.mm.ui.widget.MMTextView b() {
        if (this.f254412h == null) {
            this.f254412h = (com.tencent.mm.ui.widget.MMTextView) this.f254405a.findViewById(com.tencent.mm.R.id.cal);
        }
        return this.f254412h;
    }
}
