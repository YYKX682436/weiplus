package go2;

/* loaded from: classes5.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f274045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f274046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f274047f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274048g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f274049h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274050i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f274051m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f274052n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274053o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f274054p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f274055q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f274056r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ yz5.l f274057s;

    public p0(int i17, go2.a1 a1Var, android.widget.CheckBox checkBox, android.view.View view, android.widget.Button button, android.view.View view2, android.view.View view3, com.tencent.mm.ui.widget.dialog.y1 y1Var, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, int i18, yz5.l lVar) {
        this.f274045d = i17;
        this.f274046e = a1Var;
        this.f274047f = checkBox;
        this.f274048g = view;
        this.f274049h = button;
        this.f274050i = view2;
        this.f274051m = view3;
        this.f274052n = y1Var;
        this.f274053o = str;
        this.f274054p = num;
        this.f274055q = num2;
        this.f274056r = i18;
        this.f274057s = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f274045d;
        go2.a1 a1Var = this.f274046e;
        if (i17 == 1) {
            db5.t7.m(a1Var.getContext(), a1Var.getContext().getResources().getString(com.tencent.mm.R.string.f491902m42));
            yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!this.f274047f.isChecked()) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(a1Var.getActivity().getApplicationContext(), com.tencent.mm.R.anim.f477787bg);
            kotlin.jvm.internal.o.f(loadAnimation, "loadAnimation(...)");
            this.f274048g.startAnimation(loadAnimation);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f274049h.setClickable(false);
        this.f274050i.setClickable(false);
        this.f274051m.setClickable(false);
        boolean z17 = a1Var.f273947d;
        this.f274052n.q();
        a1Var.f273950g = true;
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new go2.o0(z17, this.f274046e, this.f274053o, this.f274054p, this.f274055q, this.f274056r, this.f274049h, this.f274050i, this.f274051m, this.f274057s, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
