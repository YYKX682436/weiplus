package em;

/* loaded from: classes12.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254491a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254492b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254493c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f254494d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f254495e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f254496f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f254497g;

    public k0(android.view.View view) {
        this.f254491a = view;
    }

    public android.view.View a() {
        if (this.f254495e == null) {
            this.f254495e = this.f254491a.findViewById(com.tencent.mm.R.id.lt8);
        }
        return this.f254495e;
    }

    public android.widget.TextView b() {
        if (this.f254496f == null) {
            this.f254496f = (android.widget.TextView) this.f254491a.findViewById(com.tencent.mm.R.id.ltk);
        }
        return this.f254496f;
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView c() {
        if (this.f254497g == null) {
            this.f254497g = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f254491a.findViewById(com.tencent.mm.R.id.f486606uy5);
        }
        return this.f254497g;
    }

    public android.widget.TextView d() {
        if (this.f254494d == null) {
            this.f254494d = (android.widget.TextView) this.f254491a.findViewById(com.tencent.mm.R.id.uy6);
        }
        return this.f254494d;
    }
}
