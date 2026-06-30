package go2;

/* loaded from: classes8.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f274010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f274011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f274012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274013g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f274014h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f274015i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274016m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f274017n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f274018o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f274019p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f274020q;

    public m0(go2.a1 a1Var, android.widget.TextView textView, android.widget.Button button, android.view.View view, android.widget.TextView textView2, android.widget.TextView textView3, android.view.View view2, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.TextView textView6, android.widget.CheckBox checkBox) {
        this.f274010d = a1Var;
        this.f274011e = textView;
        this.f274012f = button;
        this.f274013g = view;
        this.f274014h = textView2;
        this.f274015i = textView3;
        this.f274016m = view2;
        this.f274017n = textView4;
        this.f274018o = textView5;
        this.f274019p = textView6;
        this.f274020q = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        go2.a1 a1Var = this.f274010d;
        a1Var.f273947d = true;
        this.f274011e.setVisibility(0);
        this.f274012f.setText(a1Var.getContext().getString(com.tencent.mm.R.string.f491905em2));
        android.view.View payMonthlyLayout = this.f274013g;
        kotlin.jvm.internal.o.f(payMonthlyLayout, "$payMonthlyLayout");
        android.widget.TextView payMonthlyType = this.f274014h;
        kotlin.jvm.internal.o.f(payMonthlyType, "$payMonthlyType");
        android.widget.TextView payMonthlyPrice = this.f274015i;
        kotlin.jvm.internal.o.f(payMonthlyPrice, "$payMonthlyPrice");
        a1Var.T6(true, payMonthlyLayout, payMonthlyType, payMonthlyPrice);
        android.view.View payOneLayout = this.f274016m;
        kotlin.jvm.internal.o.f(payOneLayout, "$payOneLayout");
        android.widget.TextView payOneType = this.f274017n;
        kotlin.jvm.internal.o.f(payOneType, "$payOneType");
        android.widget.TextView payOnePrice = this.f274018o;
        kotlin.jvm.internal.o.f(payOnePrice, "$payOnePrice");
        a1Var.T6(false, payOneLayout, payOneType, payOnePrice);
        android.widget.TextView agreement = this.f274019p;
        kotlin.jvm.internal.o.f(agreement, "$agreement");
        android.widget.CheckBox checkbox = this.f274020q;
        kotlin.jvm.internal.o.f(checkbox, "$checkbox");
        a1Var.S6(agreement, checkbox, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
