package wv1;

/* loaded from: classes12.dex */
public class o extends androidx.recyclerview.widget.k3 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f449958s = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f449959d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f449960e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMPinProgressBtn f449961f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f449962g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f449963h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f449964i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f449965m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f449966n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.CheckBox f449967o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f449968p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ProgressBar f449969q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f449970r;

    public o(android.view.View view) {
        super(view);
        this.f449959d = view.findViewById(com.tencent.mm.R.id.cgc);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.cl7);
        this.f449960e = imageView;
        this.f449961f = (com.tencent.mm.ui.widget.MMPinProgressBtn) view.findViewById(com.tencent.mm.R.id.d4_);
        this.f449969q = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.imb);
        this.f449964i = view.findViewById(com.tencent.mm.R.id.f487562p05);
        this.f449965m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.p0p);
        this.f449962g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.e2k);
        this.f449963h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.e2m);
        this.f449966n = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.jc6);
        this.f449967o = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.mie);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.mke);
        this.f449968p = findViewById;
        this.f449970r = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.dhh);
        imageView.setOnClickListener(new wv1.m(this));
        findViewById.setOnClickListener(new wv1.n(this));
    }
}
