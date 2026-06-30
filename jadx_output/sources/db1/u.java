package db1;

/* loaded from: classes9.dex */
public final class u implements fl1.b2 {

    /* renamed from: d, reason: collision with root package name */
    public final fl1.g2 f227874d;

    /* renamed from: e, reason: collision with root package name */
    public final int f227875e;

    /* renamed from: f, reason: collision with root package name */
    public final int f227876f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f227877g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f227878h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f227879i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f227880m;

    public u(fl1.g2 g2Var, java.lang.String title, java.lang.String content, android.content.Context context, int i17, int i18, yz5.l handler) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f227874d = g2Var;
        this.f227875e = i17;
        this.f227876f = i18;
        this.f227877g = handler;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488061fs, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f227880m = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.kuf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f227878h = findViewById;
        findViewById.setMinimumHeight(i17);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.kug);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f227879i = findViewById2;
        findViewById2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        findViewById2.setMinimumHeight(i17);
        findViewById2.setPadding(0, 0, 0, i65.a.f(context, com.tencent.mm.R.dimen.f479866hf));
        findViewById2.addOnLayoutChangeListener(new db1.r(this));
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.kuh);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        ((android.widget.ImageView) findViewById3).setOnClickListener(new db1.s(this));
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.kuj);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        ((android.widget.TextView) findViewById4).setText(title);
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.kui);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        textView.setText(kk1.d.a(content, false, new db1.t(this)));
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            textView.setLineHeight(i65.a.b(context, 28));
        } else {
            textView.setLineSpacing(i65.a.g(context) * 12.5f, 1.0f);
        }
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setLinkTextColor(android.graphics.Color.parseColor("#FF576B95"));
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
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
    }

    @Override // fl1.b2
    public android.view.View getContentView() {
        return this.f227880m;
    }

    @Override // fl1.b2
    public int getPosition() {
        return 2;
    }

    @Override // fl1.b2
    public boolean j() {
        return true;
    }

    @Override // fl1.b2
    public void m() {
    }

    @Override // fl1.b2
    public void onCancel() {
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
    }

    @Override // fl1.b2
    public void y(int i17) {
    }
}
