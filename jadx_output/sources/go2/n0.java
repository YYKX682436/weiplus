package go2;

/* loaded from: classes8.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f274022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f274023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f274024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f274026h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f274027i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274028m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f274029n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f274030o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f274031p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f274032q;

    public n0(go2.a1 a1Var, android.widget.TextView textView, android.widget.Button button, android.view.View view, android.widget.TextView textView2, android.widget.TextView textView3, android.view.View view2, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.TextView textView6, android.widget.CheckBox checkBox) {
        this.f274022d = a1Var;
        this.f274023e = textView;
        this.f274024f = button;
        this.f274025g = view;
        this.f274026h = textView2;
        this.f274027i = textView3;
        this.f274028m = view2;
        this.f274029n = textView4;
        this.f274030o = textView5;
        this.f274031p = textView6;
        this.f274032q = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        go2.a1 a1Var = this.f274022d;
        a1Var.f273947d = false;
        this.f274023e.setVisibility(4);
        this.f274024f.setText(a1Var.getContext().getString(com.tencent.mm.R.string.em_));
        android.view.View payMonthlyLayout = this.f274025g;
        kotlin.jvm.internal.o.f(payMonthlyLayout, "$payMonthlyLayout");
        android.widget.TextView payMonthlyType = this.f274026h;
        kotlin.jvm.internal.o.f(payMonthlyType, "$payMonthlyType");
        android.widget.TextView payMonthlyPrice = this.f274027i;
        kotlin.jvm.internal.o.f(payMonthlyPrice, "$payMonthlyPrice");
        a1Var.T6(false, payMonthlyLayout, payMonthlyType, payMonthlyPrice);
        android.view.View payOneLayout = this.f274028m;
        kotlin.jvm.internal.o.f(payOneLayout, "$payOneLayout");
        android.widget.TextView payOneType = this.f274029n;
        kotlin.jvm.internal.o.f(payOneType, "$payOneType");
        android.widget.TextView payOnePrice = this.f274030o;
        kotlin.jvm.internal.o.f(payOnePrice, "$payOnePrice");
        a1Var.T6(true, payOneLayout, payOneType, payOnePrice);
        android.widget.TextView agreement = this.f274031p;
        kotlin.jvm.internal.o.f(agreement, "$agreement");
        android.widget.CheckBox checkbox = this.f274032q;
        kotlin.jvm.internal.o.f(checkbox, "$checkbox");
        a1Var.S6(agreement, checkbox, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
