package fl1;

/* loaded from: classes7.dex */
public final class z1 implements fl1.b2, si1.j0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.r1 f263899d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f263900e;

    /* renamed from: f, reason: collision with root package name */
    public final xi1.g f263901f;

    /* renamed from: g, reason: collision with root package name */
    public fl1.g2 f263902g;

    /* renamed from: h, reason: collision with root package name */
    public final int f263903h;

    /* renamed from: i, reason: collision with root package name */
    public int f263904i;

    /* renamed from: m, reason: collision with root package name */
    public int f263905m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f263906n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f263907o;

    public z1(com.tencent.mm.plugin.appbrand.jsapi.r1 r1Var, java.lang.String str, android.content.Context context, int i17, xi1.g windowAndroid) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(windowAndroid, "windowAndroid");
        this.f263899d = r1Var;
        this.f263900e = context;
        this.f263901f = windowAndroid;
        int a17 = com.tencent.mm.ui.zk.a(context, com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1);
        a17 = a17 < i17 ? i17 : a17;
        this.f263903h = a17;
        this.f263904i = e();
        if (r1Var == null) {
            com.tencent.mars.xlog.Log.w("Luggage.FULL.DialogExplainDialog", "<init> get NULL webviewOpener");
        }
        this.f263905m = 2;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488061fs, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f263907o = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.kug);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f263906n = findViewById;
        findViewById.setMinimumHeight(a17);
        findViewById.addOnLayoutChangeListener(new fl1.w1(this));
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.kuh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        zk1.m.f473414l.a(imageView, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & 256) != 0 ? null : 17, (r27 & 512) != 0 ? null : null, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479672c9) : null);
        imageView.setOnClickListener(new fl1.x1(this));
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.kuj);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        ((android.widget.TextView) findViewById3).setText(inflate.getContext().getText(com.tencent.mm.R.string.a3c));
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.kui);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        textView.setText(kk1.d.a(str, false, new fl1.y1(this)));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setLinkTextColor(android.graphics.Color.parseColor("#FF576B95"));
        n3.l1.d(textView);
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    public final void c() {
        java.lang.Object systemService = this.f263900e.getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager != null) {
            fl1.i2 i2Var = fl1.i2.f263792a;
            android.content.Context context = this.f263907o.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            i2Var.a(context, this.f263907o, null, windowManager.getDefaultDisplay().getRotation(), this.f263901f, false);
        }
    }

    @Override // android.content.DialogInterface
    public void cancel() {
    }

    @Override // fl1.b2
    public boolean d() {
        return true;
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        fl1.g2 g2Var = this.f263902g;
        if (g2Var != null) {
            g2Var.a(this);
        }
    }

    public final int e() {
        int i17 = (int) (r0.getResources().getDisplayMetrics().heightPixels * (2 == this.f263900e.getResources().getConfiguration().orientation ? 1.0f : 0.75f));
        com.tencent.mars.xlog.Log.i("Luggage.FULL.DialogExplainDialog", "calculateMaxHeight, maxHeight: " + i17);
        return i17;
    }

    @Override // fl1.b2
    public android.view.View getContentView() {
        return this.f263907o;
    }

    @Override // fl1.b2
    public int getPosition() {
        return this.f263905m;
    }

    @Override // fl1.b2
    public boolean j() {
        return true;
    }

    public final void k(int i17) {
        this.f263905m = i17;
        android.content.Context context = this.f263900e;
        android.view.View view = this.f263907o;
        if (i17 == 1) {
            view.setBackground(b3.l.getDrawable(context, com.tencent.mm.R.drawable.f480857ea));
        } else {
            if (i17 != 2) {
                return;
            }
            view.setBackground(b3.l.getDrawable(context, com.tencent.mm.R.drawable.e_));
        }
    }

    @Override // fl1.b2
    public void m() {
        zk1.a.a(this.f263907o);
    }

    @Override // fl1.b2
    public void onCancel() {
    }

    @Override // si1.i0
    public void r(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        kotlin.jvm.internal.o.g(component, "component");
        k(this.f263905m);
        i(component).c(this);
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        this.f263902g = g2Var;
        c();
    }

    @Override // fl1.b2
    public void y(int i17) {
        c();
        this.f263904i = e();
    }
}
