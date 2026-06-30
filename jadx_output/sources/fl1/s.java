package fl1;

/* loaded from: classes7.dex */
public final class s implements fl1.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f263854d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f263855e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f263856f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f263857g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.CheckBox f263858h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f263859i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.r1 f263860m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f263861n;

    /* renamed from: o, reason: collision with root package name */
    public fl1.j2 f263862o;

    public s(android.content.Context context, android.view.View view) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(view, "view");
        this.f263854d = context;
        this.f263855e = view;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.oud);
        this.f263856f = findViewById;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ouc);
        this.f263857g = textView;
        this.f263858h = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.oua);
        this.f263859i = view.findViewById(com.tencent.mm.R.id.oub);
        findViewById.setOnClickListener(new fl1.p(this));
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new fl1.q(this));
    }

    public boolean a() {
        if (!this.f263861n) {
            return false;
        }
        if (this.f263858h.isChecked()) {
            return true;
        }
        float dimensionPixelOffset = this.f263854d.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        float f17 = -dimensionPixelOffset;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.f263855e, "translationX", 0.0f, f17, dimensionPixelOffset, f17, 0.0f).setDuration(300L);
        kotlin.jvm.internal.o.f(duration, "setDuration(...)");
        duration.setInterpolator(new android.view.animation.LinearInterpolator());
        duration.start();
        if (b3.l.checkSelfPermission(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.VIBRATE") == 0) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("vibrator");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            ((android.os.Vibrator) systemService).vibrate(100L);
        }
        fl1.j2 j2Var = this.f263862o;
        if (j2Var != null) {
            j2Var.a();
        }
        return false;
    }

    public final boolean c() {
        return this.f263861n && this.f263855e.getVisibility() == 0;
    }

    public final boolean d() {
        return this.f263856f.getVisibility() == 0 && this.f263858h.isChecked();
    }

    @Override // fl1.e2
    public void setIExternalToolsHelper(com.tencent.mm.plugin.appbrand.jsapi.r1 r1Var) {
        this.f263860m = r1Var;
    }

    @Override // fl1.e2
    public void setUserAgreementCheckBoxWording(java.lang.String wording) {
        kotlin.jvm.internal.o.g(wording, "wording");
        if (wording.length() == 0) {
            return;
        }
        if (this.f263855e.getVisibility() != 0) {
            android.view.View view = this.f263855e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeUserAgreementComponent", "ensureUserAgreementLayoutVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeUserAgreementComponent", "ensureUserAgreementLayoutVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.CharSequence a17 = kk1.d.a(wording, false, new fl1.r(this));
        android.widget.TextView textView = this.f263857g;
        textView.setText(a17);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setLinkTextColor(b3.l.getColor(this.f263854d, com.tencent.mm.R.color.f478524a5));
        n3.l1.d(textView);
        this.f263861n = true;
    }

    @Override // fl1.e2
    public void setUserAgreementCheckedAlertListener(fl1.j2 j2Var) {
        this.f263862o = j2Var;
    }
}
