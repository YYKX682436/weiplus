package mu1;

/* loaded from: classes15.dex */
public class h extends mu1.a {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f331371g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f331372h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f331373i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f331374j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f331375k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.ImageView f331376l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f331377m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f331378n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f331379o;

    @Override // mu1.a, mu1.j
    public void a(android.graphics.drawable.ShapeDrawable shapeDrawable) {
        if (!android.text.TextUtils.isEmpty(this.f331334a.i0().A)) {
            this.f331378n.setBackgroundDrawable(null);
            this.f331379o.setVisibility(0);
            j();
        } else if (this.f331336c != null) {
            this.f331378n.setBackgroundDrawable(shapeDrawable);
            this.f331379o.setVisibility(8);
        }
    }

    @Override // mu1.a, mu1.j
    public void b(boolean z17) {
        if (android.text.TextUtils.isEmpty(this.f331334a.i0().f385189o) || !z17 || this.f331334a.i0().f385190p == 0 || this.f331334a.s0().f388551l1) {
            this.f331375k.setVisibility(8);
            android.view.View view = this.f331374j;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "updateCodeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "updateCodeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f331375k.setVisibility(0);
        android.view.View view2 = this.f331374j;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "updateCodeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "updateCodeView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // mu1.a, mu1.j
    public void c(boolean z17) {
        if (android.text.TextUtils.isEmpty(this.f331334a.i0().A)) {
            this.f331377m.setVisibility(0);
            this.f331376l.setVisibility(0);
        } else {
            this.f331377m.setVisibility(8);
            this.f331376l.setVisibility(8);
        }
    }

    @Override // mu1.a, mu1.j
    public void d(boolean z17, boolean z18) {
    }

    @Override // mu1.a, mu1.j
    public void e(int i17) {
        if (!android.text.TextUtils.isEmpty(this.f331334a.i0().A)) {
            this.f331378n.setBackgroundDrawable(null);
            this.f331379o.setVisibility(0);
            j();
        } else if (this.f331336c != null) {
            this.f331378n.setBackgroundResource(i17);
            this.f331379o.setVisibility(8);
        }
    }

    @Override // mu1.a
    public void g() {
        this.f331371g = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.bcg);
        this.f331372h = (android.widget.RelativeLayout) this.f331336c.findViewById(com.tencent.mm.R.id.bax);
        this.f331373i = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.c0u);
        this.f331374j = this.f331336c.findViewById(com.tencent.mm.R.id.b8x);
        this.f331375k = (android.widget.ImageView) this.f331336c.findViewById(com.tencent.mm.R.id.b8y);
        this.f331376l = (android.widget.ImageView) this.f331336c.findViewById(com.tencent.mm.R.id.f485890jg0);
        this.f331377m = (android.widget.ImageView) this.f331336c.findViewById(com.tencent.mm.R.id.jfz);
        this.f331378n = (android.widget.ImageView) this.f331336c.findViewById(com.tencent.mm.R.id.bau);
        this.f331379o = (android.widget.ImageView) this.f331336c.findViewById(com.tencent.mm.R.id.baw);
    }

    @Override // mu1.a
    public void h() {
        android.widget.TextView textView = this.f331338e;
        if (textView != null) {
            textView.setText(this.f331334a.s0().f388552m);
        }
        if (this.f331334a.s0().f388560s != null && this.f331334a.s0().f388560s.size() > 0) {
            r45.w50 w50Var = (r45.w50) this.f331334a.s0().f388560s.get(0);
            if (android.text.TextUtils.isEmpty(w50Var.f388878d)) {
                this.f331371g.setText("");
            } else {
                this.f331371g.setText(w50Var.f388878d);
            }
        }
        if (this.f331334a.F()) {
            b(true);
            this.f331378n.setAlpha(255);
            if (this.f331378n.getBackground() != null) {
                this.f331378n.getBackground().setAlpha(255);
            }
            java.lang.String str = this.f331334a.i0().f385189o;
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardWidgetMembership", "don't updateCodeLayout, code is empty!");
                b(false);
                ((com.tencent.mm.plugin.card.ui.a0) ((com.tencent.mm.ui.MMActivity) this.f331335b).component(com.tencent.mm.plugin.card.ui.a0.class)).O6(false);
            } else {
                this.f331374j.setOnClickListener(this.f331339f);
                this.f331375k.setOnClickListener(this.f331339f);
                this.f331373i.setOnClickListener(this.f331339f);
                ((com.tencent.mm.plugin.card.ui.a0) ((com.tencent.mm.ui.MMActivity) this.f331335b).component(com.tencent.mm.plugin.card.ui.a0.class)).O6(true);
                int i17 = this.f331334a.i0().f385190p;
                if (i17 != 0) {
                    if (i17 == 1 || i17 == 2) {
                        if (str.length() > 40) {
                            this.f331373i.setText("");
                        } else if (this.f331334a.m()) {
                            this.f331373i.setText(lu1.g0.a(4, str, true));
                        } else {
                            this.f331373i.setText("");
                        }
                    }
                } else if (str.length() <= 40) {
                    this.f331373i.setText(lu1.g0.a(4, str, true));
                } else {
                    this.f331373i.setText("");
                }
            }
        } else {
            this.f331373i.setText("");
            this.f331375k.setVisibility(8);
            android.view.View view = this.f331374j;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/widget/CardWidgetMembership", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f331378n.setAlpha(90);
            if (this.f331378n.getBackground() != null) {
                this.f331378n.getBackground().setAlpha(90);
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f331372h.getLayoutParams();
        layoutParams.height = ((this.f331335b.getResources().getDisplayMetrics().widthPixels - (this.f331335b.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479869hi) * 2)) * 3) / 5;
        this.f331372h.setLayoutParams(layoutParams);
    }

    public final void j() {
        o11.f fVar = new o11.f();
        fVar.f342083g = lp0.b.D();
        fVar.f342082f = xt1.q.m(this.f331334a.i0().A);
        fVar.f342078b = true;
        fVar.f342096t = true;
        fVar.f342097u = this.f331335b.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480189qv);
        fVar.f342098v = true;
        fVar.f342077a = true;
        fVar.f342091o = com.tencent.mm.R.drawable.f481138lm;
        fVar.f342087k = i65.a.h(this.f331335b, com.tencent.mm.R.dimen.f480192qy);
        fVar.f342086j = i65.a.B(this.f331335b);
        n11.a.b().h(this.f331334a.i0().A, this.f331378n, fVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CardWidgetMembership", "the member back ground url is " + this.f331334a.i0().A);
    }
}
