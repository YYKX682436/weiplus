package p02;

/* loaded from: classes8.dex */
public class g extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f350378d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f350379e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f350380f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f350381g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f350382h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f350383i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f350384m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.Button f350385n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f350386o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f350387p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f350388q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f350389r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f350390s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f350391t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f350392u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f350393v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f350394w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p02.h f350395x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p02.h hVar, android.view.View view) {
        super(view);
        this.f350395x = hVar;
        this.f350378d = view;
        this.f350379e = view.findViewById(com.tencent.mm.R.id.f486766me4);
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.h0i)).setOnClickListener(new p02.a(this, hVar));
        this.f350380f = view.findViewById(com.tencent.mm.R.id.me8);
        this.f350381g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.men);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.mdv);
        this.f350382h = imageView;
        imageView.setOnClickListener(new p02.b(this, hVar));
        this.f350383i = view.findViewById(com.tencent.mm.R.id.mfe);
        this.f350384m = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483228a15);
        android.widget.Button button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.hh9);
        this.f350385n = button;
        button.setOnClickListener(new p02.c(this, hVar));
        this.f350386o = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.a1p);
        this.f350387p = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f483231a21);
        this.f350388q = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.a1x);
        this.f350389r = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gkx);
        this.f350390s = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485131go0);
        this.f350391t = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gpg);
        this.f350392u = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.l5k);
        this.f350393v = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.l5w);
        this.f350394w = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.qeu);
    }

    public final void i(int i17) {
        p02.h hVar = this.f350395x;
        android.widget.Button button = this.f350385n;
        if (i17 == com.tencent.mm.R.string.g1c) {
            button.setBackgroundResource(com.tencent.mm.R.drawable.f481060jo);
            button.setTextColor(b3.l.getColor(hVar.f350396d, com.tencent.mm.R.color.aaw));
        } else {
            button.setBackgroundResource(com.tencent.mm.R.drawable.f481068jy);
            button.setTextColor(b3.l.getColor(hVar.f350396d, com.tencent.mm.R.color.Brand_90));
        }
        button.setText(i17);
    }
}
