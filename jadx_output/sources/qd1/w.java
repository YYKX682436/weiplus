package qd1;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f361680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f361681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f361682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f361683g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f361684h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361685i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f361686m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f361687n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361688o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361689p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ qd1.x f361690q;

    public w(qd1.x xVar, com.tencent.mm.plugin.appbrand.e9 e9Var, boolean z17, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17, int i18, java.lang.String str, int i19, boolean z18, java.lang.String str2, java.lang.String str3) {
        this.f361690q = xVar;
        this.f361680d = e9Var;
        this.f361681e = z17;
        this.f361682f = v5Var;
        this.f361683g = i17;
        this.f361684h = i18;
        this.f361685i = str;
        this.f361686m = i19;
        this.f361687n = z18;
        this.f361688o = str2;
        this.f361689p = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.drawable.Drawable drawable;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f361680d;
        if (!e9Var.isRunning()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShowToast", "service is not running");
            return;
        }
        boolean z17 = this.f361681e;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f361682f;
        android.view.View inflate = z17 ? android.view.LayoutInflater.from(v5Var.getContext()).inflate(com.tencent.mm.R.layout.f488091h1, (android.view.ViewGroup) v5Var.getContentView(), false) : android.view.LayoutInflater.from(v5Var.getContext()).inflate(com.tencent.mm.R.layout.f488092h2, (android.view.ViewGroup) v5Var.getContentView(), false);
        if (this.f361687n) {
            new qd1.s(this, inflate);
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
        java.lang.String str = this.f361685i;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setLineSpacing(0.0f, 1.0f);
            textView.setSpannableFactory(new qd1.v(this, i65.a.h(textView.getContext(), com.tencent.mm.R.dimen.f479933jd)));
            textView.setText(str, android.widget.TextView.BufferType.SPANNABLE);
            textView.setVisibility(0);
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new qd1.t(this, textView));
            if (!z17) {
                inflate.findViewById(com.tencent.mm.R.id.mvs).setPadding(0, i65.a.b(textView.getContext(), 27), 0, 0);
            }
        }
        if (!z17) {
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.hlr);
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) inflate.findViewById(com.tencent.mm.R.id.lbi);
            java.lang.String str2 = this.f361688o;
            if (str2.equals("loading")) {
                imageView.setVisibility(8);
                progressBar.setVisibility(0);
            } else {
                imageView.setVisibility(0);
                progressBar.setVisibility(8);
                java.lang.String str3 = this.f361689p;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    drawable = str2.equals("error") ? e9Var.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.bdc) : e9Var.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.bds);
                    drawable.mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP));
                } else {
                    android.graphics.Bitmap b17 = com.tencent.mm.plugin.appbrand.page.s5.b(e9Var.t3(), str3);
                    drawable = (b17 == null || b17.isRecycled()) ? null : new android.graphics.drawable.BitmapDrawable(imageView.getResources(), b17);
                }
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                }
            }
        }
        int i17 = this.f361683g;
        if (i17 != -1) {
            inflate.setTag(java.lang.Integer.valueOf(i17));
        }
        v5Var.P1().b(false);
        v5Var.P1().e(inflate, this.f361684h);
        inflate.post(new qd1.q(this, inflate));
        e9Var.a(this.f361686m, this.f361690q.o("ok"));
    }
}
