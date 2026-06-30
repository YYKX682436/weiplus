package em;

/* loaded from: classes11.dex */
public class e4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f254288a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.FrameLayout f254289b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f254290c;

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.material.card.MaterialCardView f254291d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f254292e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f254293f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f254294g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f254295h;

    public e4(android.view.View view) {
        this.f254288a = view;
    }

    public androidx.constraintlayout.widget.ConstraintLayout a() {
        if (this.f254292e == null) {
            this.f254292e = (androidx.constraintlayout.widget.ConstraintLayout) this.f254288a.findViewById(com.tencent.mm.R.id.v6o);
        }
        return this.f254292e;
    }

    public android.widget.TextView b() {
        if (this.f254290c == null) {
            this.f254290c = (android.widget.TextView) this.f254288a.findViewById(com.tencent.mm.R.id.vkc);
        }
        return this.f254290c;
    }

    public com.tencent.mm.view.recyclerview.WxRecyclerView c() {
        if (this.f254294g == null) {
            this.f254294g = (com.tencent.mm.view.recyclerview.WxRecyclerView) this.f254288a.findViewById(com.tencent.mm.R.id.vkd);
        }
        return this.f254294g;
    }
}
