package mu1;

/* loaded from: classes15.dex */
public class e extends mu1.a {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f331345g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f331346h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f331347i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.Button f331348j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.LinearLayout f331349k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f331350l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f331351m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f331352n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f331353o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f331354p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f331355q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f331356r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f331357s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f331358t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f331359u;

    @Override // mu1.a, mu1.j
    public void c(boolean z17) {
    }

    @Override // mu1.a, mu1.j
    public void d(boolean z17, boolean z18) {
        if (this.f331348j != null) {
            r45.w50 w50Var = this.f331334a.i0().f385199y;
            if (w50Var != null && !android.text.TextUtils.isEmpty(w50Var.f388878d) && w50Var.f388882h != 0 && this.f331334a.F()) {
                this.f331348j.setClickable(false);
                this.f331348j.setVisibility(0);
                this.f331351m.setVisibility(8);
                return;
            }
            if (this.f331334a.i0().f385198x != null && !android.text.TextUtils.isEmpty(this.f331334a.i0().f385198x.f388878d) && !android.text.TextUtils.isEmpty(this.f331334a.i0().f385198x.f388881g) && this.f331334a.F()) {
                this.f331348j.setVisibility(0);
                this.f331348j.setEnabled(true);
                if (android.text.TextUtils.isEmpty(this.f331334a.i0().f385189o) || this.f331334a.i0().f385190p == 0) {
                    this.f331351m.setVisibility(8);
                    return;
                } else {
                    this.f331351m.setVisibility(0);
                    return;
                }
            }
            if (z17 && !android.text.TextUtils.isEmpty(this.f331334a.i0().f385189o) && this.f331334a.F()) {
                this.f331348j.setVisibility(0);
                this.f331348j.setEnabled(z18);
                this.f331351m.setVisibility(8);
            } else if (!z17 || this.f331334a.F()) {
                this.f331348j.setVisibility(8);
                this.f331351m.setVisibility(8);
            } else {
                this.f331348j.setVisibility(0);
                this.f331348j.setEnabled(false);
                this.f331351m.setVisibility(8);
            }
        }
    }

    @Override // mu1.a, mu1.j
    public void e(int i17) {
    }

    @Override // mu1.a
    public void g() {
        this.f331345g = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.bcg);
        this.f331346h = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.bc8);
        this.f331347i = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.b7u);
        this.f331348j = (android.widget.Button) this.f331336c.findViewById(com.tencent.mm.R.id.b96);
        this.f331349k = (android.widget.LinearLayout) this.f331336c.findViewById(com.tencent.mm.R.id.pm9);
        this.f331359u = this.f331336c.findViewById(com.tencent.mm.R.id.cka);
        this.f331351m = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f331336c.findViewById(com.tencent.mm.R.id.b8y);
        this.f331350l = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.bb6);
        this.f331352n = (android.widget.ImageView) this.f331336c.findViewById(com.tencent.mm.R.id.f483170yk);
        this.f331355q = (android.view.ViewGroup) this.f331336c.findViewById(com.tencent.mm.R.id.ckb);
        this.f331356r = (android.widget.ImageView) this.f331336c.findViewById(com.tencent.mm.R.id.f486678m40);
        this.f331357s = (android.widget.TextView) this.f331336c.findViewById(com.tencent.mm.R.id.f486679m41);
        this.f331358t = (android.widget.ImageView) this.f331336c.findViewById(com.tencent.mm.R.id.m3z);
        this.f331353o = (android.widget.ImageView) this.f331336c.findViewById(com.tencent.mm.R.id.f483958ck4);
        this.f331354p = (android.widget.ImageView) this.f331336c.findViewById(com.tencent.mm.R.id.f483959ck5);
        com.tencent.mm.ui.bk.s0(this.f331338e.getPaint());
        com.tencent.mm.ui.bk.s0(this.f331345g.getPaint());
    }

    @Override // mu1.a
    public void h() {
        if (this.f331334a.s0().f388560s != null && this.f331334a.s0().f388560s.size() > 0) {
            r45.w50 w50Var = (r45.w50) this.f331334a.s0().f388560s.get(0);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388878d)) {
                this.f331345g.setText(w50Var.f388878d);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388879e)) {
                this.f331346h.setVisibility(8);
            } else {
                this.f331346h.setText(w50Var.f388879e);
                this.f331346h.setVisibility(0);
            }
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f331346h.getLayoutParams();
            if (com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388880f)) {
                this.f331347i.setVisibility(8);
                layoutParams.bottomMargin = this.f331335b.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479869hi);
            } else {
                this.f331347i.setText(w50Var.f388880f);
                this.f331347i.setVisibility(0);
                layoutParams.bottomMargin = 0;
            }
            this.f331346h.setLayoutParams(layoutParams);
            this.f331346h.invalidate();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f331334a.s0().A1)) {
            this.f331352n.setVisibility(8);
        } else {
            lu1.a0.I(this.f331352n, this.f331334a.s0().A1);
            this.f331352n.setVisibility(0);
        }
        if (this.f331334a.i0() != null) {
            if (this.f331334a.i0().G != null) {
                r45.w50 w50Var2 = this.f331334a.i0().G;
                this.f331355q.setVisibility(0);
                this.f331355q.setForeground(this.f331335b.getResources().getDrawable(com.tencent.mm.R.drawable.auq));
                lu1.a0.I(this.f331356r, w50Var2.f388889r);
                this.f331357s.setText(w50Var2.f388878d);
                lu1.a0.I(this.f331358t, w50Var2.f388890s);
                this.f331355q.setOnClickListener(new mu1.b(this, w50Var2));
            } else {
                this.f331355q.setVisibility(8);
            }
            if (this.f331334a.i0().H != null) {
                r45.w50 w50Var3 = this.f331334a.i0().H;
                this.f331353o.setVisibility(0);
                android.view.View view = this.f331359u;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetCommon", "refreshData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/card/widget/CardWidgetCommon", "refreshData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j(w50Var3.f388892u, this.f331353o, i65.a.b(this.f331335b, 1));
                if (com.tencent.mm.sdk.platformtools.t8.K0(w50Var3.f388893v)) {
                    this.f331354p.setVisibility(8);
                } else {
                    j(w50Var3.f388893v, this.f331354p, 0);
                    this.f331354p.setVisibility(0);
                }
                this.f331353o.setOnClickListener(new mu1.c(this, w50Var3));
            } else {
                this.f331353o.setVisibility(8);
                this.f331354p.setVisibility(8);
                android.view.View view2 = this.f331359u;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/widget/CardWidgetCommon", "refreshData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/card/widget/CardWidgetCommon", "refreshData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.card.ui.a0 a0Var = (com.tencent.mm.plugin.card.ui.a0) ((com.tencent.mm.ui.MMActivity) this.f331335b).component(com.tencent.mm.plugin.card.ui.a0.class);
            android.widget.ImageView imageView = (android.widget.ImageView) a0Var.findViewById(com.tencent.mm.R.id.f483959ck5);
            if (imageView == null || !imageView.isShown()) {
                a0Var.view(com.tencent.mm.R.layout.f488290p8, com.tencent.mm.R.id.f483958ck4).desc(new com.tencent.mm.plugin.card.ui.z(a0Var)).type(com.tencent.mm.accessibility.type.ViewType.Button);
            } else {
                a0Var.view(com.tencent.mm.R.layout.f488290p8, com.tencent.mm.R.id.f483958ck4).desc(new com.tencent.mm.plugin.card.ui.y(a0Var)).type(com.tencent.mm.accessibility.type.ViewType.Button);
            }
        }
        if (this.f331348j == null || this.f331351m == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardWidgetCommon", "consumeBtn == null || mCardCodeImg == null");
        } else if (this.f331334a.i0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo() == null");
            this.f331348j.setVisibility(8);
            this.f331351m.setVisibility(8);
        } else {
            if (this.f331334a.i0().f385198x != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardWidgetCommon", "operate_field.title is " + this.f331334a.i0().f385198x.f388878d);
                java.lang.String str = this.f331334a.i0().f385198x.f388881g;
                com.tencent.mars.xlog.Log.i("MicroMsg.CardWidgetCommon", "operate_field.aux_title is " + this.f331334a.i0().f385198x.f388880f);
            }
            r45.w50 w50Var4 = this.f331334a.i0().f385199y;
            if (w50Var4 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardWidgetCommon", "limit_field.title is " + w50Var4.f388878d);
                com.tencent.mars.xlog.Log.i("MicroMsg.CardWidgetCommon", "limit_field.show_flag is " + w50Var4.f388882h);
                com.tencent.mars.xlog.Log.i("MicroMsg.CardWidgetCommon", "limit_field.aux_title is " + w50Var4.f388880f);
            }
            r45.jv6 jv6Var = this.f331334a.s0().N;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.f331349k.findViewById(com.tencent.mm.R.id.b9k);
            if (jv6Var == null || com.tencent.mm.sdk.platformtools.t8.L0(jv6Var.f378141g)) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
                linearLayout.removeAllViews();
                java.util.Iterator it = jv6Var.f378141g.iterator();
                while (it.hasNext()) {
                    r45.w50 w50Var5 = (r45.w50) it.next();
                    android.view.View inflate = android.view.LayoutInflater.from(this.f331335b).inflate(com.tencent.mm.R.layout.p_, (android.view.ViewGroup) linearLayout, false);
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b9n);
                    android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b9j);
                    textView.setText(w50Var5.f388878d);
                    textView2.setText(w50Var5.f388879e);
                    linearLayout.addView(inflate);
                }
            }
            if (w50Var4 != null && !android.text.TextUtils.isEmpty(w50Var4.f388878d) && w50Var4.f388882h != 0 && this.f331334a.F()) {
                this.f331348j.setClickable(false);
                this.f331348j.setVisibility(0);
                this.f331348j.setTextColor(this.f331335b.getResources().getColor(com.tencent.mm.R.color.f478553an));
                this.f331348j.setText(w50Var4.f388878d);
                if (android.text.TextUtils.isEmpty(w50Var4.f388879e)) {
                    this.f331350l.setVisibility(8);
                } else {
                    this.f331350l.setText(w50Var4.f388879e);
                    this.f331350l.setVisibility(0);
                }
                this.f331351m.setVisibility(8);
                long j17 = w50Var4.f388882h;
                if ((2 & j17) > 0) {
                    this.f331348j.setBackgroundDrawable(lu1.a0.m(this.f331335b, lu1.a0.e(this.f331334a.s0().f388555p, 150)));
                } else if ((j17 & 4) > 0) {
                    android.widget.Button button = this.f331348j;
                    android.content.Context context = this.f331335b;
                    button.setBackgroundDrawable(lu1.a0.m(context, context.getResources().getColor(com.tencent.mm.R.color.f479303vj)));
                    this.f331348j.setTextColor(this.f331335b.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5));
                } else {
                    this.f331348j.setBackgroundDrawable(lu1.a0.m(this.f331335b, lu1.a0.d(this.f331334a.s0().f388555p)));
                }
            } else if (this.f331334a.i0().f385198x != null && !android.text.TextUtils.isEmpty(this.f331334a.i0().f385198x.f388878d) && !android.text.TextUtils.isEmpty(this.f331334a.i0().f385198x.f388881g) && this.f331334a.F()) {
                this.f331348j.setClickable(true);
                this.f331348j.setForeground(this.f331335b.getResources().getDrawable(com.tencent.mm.R.drawable.f481100kq));
                this.f331348j.setVisibility(0);
                this.f331348j.setBackgroundDrawable(lu1.a0.m(this.f331335b, lu1.a0.d(this.f331334a.s0().f388555p)));
                this.f331348j.setTextColor(this.f331335b.getResources().getColorStateList(com.tencent.mm.R.color.f478553an));
                this.f331348j.setText(this.f331334a.i0().f385198x.f388878d);
                if (this.f331334a.i0().f385198x == null || android.text.TextUtils.isEmpty(this.f331334a.i0().f385198x.f388880f)) {
                    this.f331350l.setVisibility(8);
                } else {
                    this.f331350l.setText(this.f331334a.i0().f385198x.f388880f);
                    this.f331350l.setVisibility(0);
                }
                if (android.text.TextUtils.isEmpty(this.f331334a.i0().f385189o)) {
                    this.f331351m.setVisibility(8);
                } else {
                    this.f331351m.setVisibility(0);
                }
            } else if (!android.text.TextUtils.isEmpty(this.f331334a.i0().f385189o) && this.f331334a.F()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo().code is valid");
                this.f331351m.setVisibility(8);
                this.f331350l.setVisibility(8);
                this.f331348j.setClickable(true);
                this.f331348j.setForeground(this.f331335b.getResources().getDrawable(com.tencent.mm.R.drawable.f481100kq));
                this.f331348j.setVisibility(0);
                this.f331348j.setBackgroundDrawable(lu1.a0.m(this.f331335b, lu1.a0.d(this.f331334a.s0().f388555p)));
                this.f331348j.setTextColor(this.f331335b.getResources().getColorStateList(com.tencent.mm.R.color.f478553an));
                this.f331348j.setText(com.tencent.mm.R.string.avs);
            } else if (this.f331334a.F()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardWidgetCommon", "operate_field and code is empty!");
                this.f331348j.setVisibility(8);
                this.f331350l.setVisibility(8);
                this.f331351m.setVisibility(8);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo().status is " + this.f331334a.i0().f385181d);
                this.f331351m.setVisibility(8);
                this.f331350l.setVisibility(8);
                this.f331348j.setClickable(true);
                this.f331348j.setVisibility(0);
                this.f331348j.setTextColor(this.f331335b.getResources().getColor(com.tencent.mm.R.color.f479211sz));
                android.widget.Button button2 = this.f331348j;
                android.content.Context context2 = this.f331335b;
                button2.setBackgroundDrawable(lu1.a0.m(context2, context2.getResources().getColor(com.tencent.mm.R.color.f478777gx)));
                if (android.text.TextUtils.isEmpty(this.f331334a.s0().T)) {
                    lu1.g0.e(this.f331348j, this.f331334a.i0().f385181d);
                } else {
                    this.f331348j.setText(this.f331334a.s0().T);
                }
            }
        }
        this.f331336c.post(new mu1.d(this));
        this.f331336c.invalidate();
    }

    public final void j(java.lang.String str, android.widget.ImageView imageView, int i17) {
        o11.f fVar = new o11.f();
        fVar.f342083g = lp0.b.D();
        fVar.f342082f = xt1.q.m(str);
        fVar.f342078b = true;
        if (i17 > 0) {
            fVar.f342097u = i17;
            fVar.f342096t = true;
        } else {
            fVar.f342096t = false;
        }
        fVar.f342077a = true;
        n11.a.b().h(str, imageView, fVar.a());
    }

    @Override // mu1.a, mu1.j
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f331339f = onClickListener;
        android.widget.Button button = this.f331348j;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f331351m;
        if (weImageView != null) {
            weImageView.setOnClickListener(onClickListener);
        }
    }
}
