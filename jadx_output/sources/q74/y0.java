package q74;

/* loaded from: classes4.dex */
public class y0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f360571d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f360572e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f360573f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f360574g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f360575h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f360576i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f360577m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f360578n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.LinearLayout f360579o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ImageView f360580p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f360581q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.FrameLayout f360582r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ImageView f360583s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f360584t;

    public y0(android.view.View view, q74.w0 w0Var) {
        super(view);
        this.f360571d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n5i);
        this.f360572e = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.n5m);
        this.f360573f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n5k);
        this.f360574g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n5l);
        this.f360575h = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.n5n);
        this.f360576i = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.n1u);
        this.f360577m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
        this.f360578n = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484050cu2);
        this.f360579o = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f485298h75);
        this.f360580p = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f486991n41);
        this.f360581q = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486992n42);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.b0r);
        this.f360582r = frameLayout;
        this.f360583s = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.b0p);
        this.f360584t = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.b1m);
        frameLayout.setOnClickListener(w0Var);
    }

    public void i(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardSubItemViewHolder");
        a84.y0.p(this.f360571d, false);
        a84.y0.p(this.f360573f, false);
        a84.y0.p(this.f360576i, false);
        a84.y0.p(this.f360577m, false);
        a84.y0.p(this.f360578n, false);
        a84.y0.p(this.f360580p, false);
        a84.y0.p(this.f360581q, false);
        android.widget.FrameLayout frameLayout = this.f360582r;
        a84.y0.p(frameLayout, false);
        a84.y0.p(this.f360583s, false);
        a84.y0.p(this.f360584t, false);
        frameLayout.setTag(java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardSubItemViewHolder");
    }
}
