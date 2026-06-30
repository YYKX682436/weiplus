package wv1;

/* loaded from: classes12.dex */
public class r extends androidx.recyclerview.widget.k3 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f449972t = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f449973d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f449974e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f449975f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f449976g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.CheckBox f449977h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f449978i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f449979m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f449980n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f449981o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f449982p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ProgressBar f449983q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMPinProgressBtn f449984r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f449985s;

    public r(android.view.View view) {
        super(view);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.cgc);
        this.f449973d = linearLayout;
        this.f449974e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a_4);
        this.f449975f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.k3s);
        this.f449976g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o7z);
        this.f449977h = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.mie);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f486813mj2);
        this.f449978i = findViewById;
        this.f449979m = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.dhh);
        this.f449980n = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h6y);
        this.f449981o = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.odf);
        this.f449982p = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cwk);
        this.f449984r = (com.tencent.mm.ui.widget.MMPinProgressBtn) view.findViewById(com.tencent.mm.R.id.d4_);
        this.f449983q = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.imb);
        this.f449985s = view.findViewById(com.tencent.mm.R.id.d0v);
        linearLayout.setOnClickListener(new wv1.p(this));
        findViewById.setOnClickListener(new wv1.q(this));
    }
}
