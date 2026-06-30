package ur2;

/* loaded from: classes10.dex */
public final class o implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f430407d;

    /* renamed from: e, reason: collision with root package name */
    public final ry2.e f430408e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f430409f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f430410g;

    /* renamed from: h, reason: collision with root package name */
    public int f430411h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f430412i;

    /* renamed from: m, reason: collision with root package name */
    public int f430413m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f430414n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.EditText f430415o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f430416p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f430417q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f430418r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.f5 f430419s;

    public o(androidx.appcompat.app.AppCompatActivity activity, ry2.e eVar, yz5.l lVar, yz5.a aVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f430407d = activity;
        this.f430408e = eVar;
        this.f430409f = lVar;
        this.f430410g = aVar;
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.tencent.mm.R.layout.edf, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f430414n = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.tsr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.EditText editText = (android.widget.EditText) findViewById;
        this.f430415o = editText;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.tsl);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f430416p = findViewById2;
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(activity);
        this.f430419s = f5Var;
        inflate.findViewById(com.tencent.mm.R.id.tsj).setOnClickListener(new ur2.d(this));
        inflate.findViewById(com.tencent.mm.R.id.tsi).setOnClickListener(new ur2.e(this));
        findViewById2.setOnClickListener(ur2.f.f430395d);
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.tsk);
        findViewById3.setOnClickListener(new ur2.g(this));
        findViewById3.setEnabled(false);
        this.f430417q = findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.tss);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f430418r = textView;
        textView.setClickable(true);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.tst)).getPaint(), 0.8f);
        textView.setOnClickListener(new ur2.j(this));
        f5Var.f210400e = this;
        activity.getWindow().getDecorView().post(new ur2.k(this));
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        editText.addTextChangedListener(new ur2.m(this, r26.i0.t("[^a-zA-Z0-9一-龥#]", "#", r26.i0.t(com.tencent.mm.plugin.finder.storage.t70.f127590a.f1(), "_", "", false), false), ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126403b).getValue()).r()).intValue()));
    }

    public final void a() {
        android.widget.EditText editText = this.f430415o;
        editText.clearFocus();
        this.f430419s.d();
        java.lang.Object systemService = this.f430407d.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
        this.f430412i = false;
        android.view.View view = this.f430414n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen", "onHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen", "onHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f430416p;
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), this.f430413m);
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        if (this.f430412i || this.f430416p.getPaddingBottom() == this.f430413m + i17) {
            return;
        }
        ur2.l lVar = new ur2.l(i17, this);
        lVar.setDuration(i17 != 0 ? 200L : 300L);
        this.f430414n.startAnimation(lVar);
    }
}
