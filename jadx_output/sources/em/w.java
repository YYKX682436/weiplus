package em;

/* loaded from: classes9.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254876a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.FrameLayout f254877b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f254878c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f254879d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f254880e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f254881f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f254882g;

    public w(android.view.View view) {
        this.f254876a = view;
    }

    public android.widget.FrameLayout a() {
        if (this.f254880e == null) {
            this.f254880e = (android.widget.FrameLayout) this.f254876a.findViewById(com.tencent.mm.R.id.v0n);
        }
        return this.f254880e;
    }

    public android.widget.FrameLayout b() {
        if (this.f254879d == null) {
            this.f254879d = (android.widget.FrameLayout) this.f254876a.findViewById(com.tencent.mm.R.id.v0r);
        }
        return this.f254879d;
    }

    public android.widget.FrameLayout c() {
        if (this.f254877b == null) {
            this.f254877b = (android.widget.FrameLayout) this.f254876a.findViewById(com.tencent.mm.R.id.v0s);
        }
        return this.f254877b;
    }
}
