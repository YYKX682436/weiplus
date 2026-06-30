package w51;

/* loaded from: classes8.dex */
public abstract class d {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f442963d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f442964e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f442965f;

    /* renamed from: g, reason: collision with root package name */
    public u51.a f442966g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f442967h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.animation.Animation f442968i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.animation.Animation f442969m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnKeyListener f442970n = new w51.b(this);

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnTouchListener f442971o = new w51.c(this);

    public d(android.content.Context context) {
        this.f442963d = context;
    }

    public void a() {
        if (c() || this.f442967h) {
            return;
        }
        this.f442968i.setAnimationListener(new w51.a(this));
        this.f442964e.startAnimation(this.f442968i);
        this.f442967h = true;
    }

    public void b() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2, 80);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.f442963d);
        this.f442966g.getClass();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) from.inflate(com.tencent.mm.R.layout.bnt, (android.view.ViewGroup) null, false);
        this.f442965f = viewGroup;
        viewGroup.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f442966g.getClass();
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.f442965f.findViewById(com.tencent.mm.R.id.cgz);
        this.f442964e = viewGroup2;
        viewGroup2.setLayoutParams(layoutParams);
        android.view.ViewGroup viewGroup3 = c() ? null : this.f442965f;
        viewGroup3.setFocusable(true);
        viewGroup3.setFocusableInTouchMode(true);
        viewGroup3.setOnKeyListener(this.f442970n);
    }

    public abstract boolean c();
}
