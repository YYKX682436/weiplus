package ku1;

/* loaded from: classes15.dex */
public class g0 extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f312079b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f312080c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f312081d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f312082e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f312083f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f312084g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f312085h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f312086i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f312087j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View.OnClickListener f312088k = new ku1.f0(this);

    @Override // ku1.m
    public void c() {
        this.f312079b = b(com.tencent.mm.R.id.mtv);
        this.f312080c = b(com.tencent.mm.R.id.mtx);
        this.f312081d = (android.widget.ImageView) b(com.tencent.mm.R.id.mtp);
        this.f312082e = (android.widget.TextView) b(com.tencent.mm.R.id.mtq);
        this.f312083f = (android.widget.TextView) b(com.tencent.mm.R.id.mts);
        this.f312084g = (android.widget.ImageView) b(com.tencent.mm.R.id.mtr);
        android.view.View view = this.f312079b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f312085h = b(com.tencent.mm.R.id.mtt);
        this.f312086i = (android.widget.LinearLayout) b(com.tencent.mm.R.id.mtu);
        android.view.View view2 = this.f312085h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f312087j = ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).f94936e;
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f312079b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ku1.m
    public void e() {
        java.lang.String str;
        tt1.j jVar = ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).E;
        java.util.ArrayList h17 = eu1.f.h(jVar.f());
        hu1.g gVar = ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).f94937f;
        java.lang.String str2 = null;
        boolean z17 = false;
        java.lang.String str3 = "";
        if (!gVar.n()) {
            if (gVar.n()) {
                return;
            }
            android.view.View view = this.f312079b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUsersInfoLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUsersInfoLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f312081d.setVisibility(0);
            this.f312082e.setVisibility(0);
            this.f312083f.setVisibility(8);
            this.f312084g.setVisibility(8);
            if (android.text.TextUtils.isEmpty("") && !android.text.TextUtils.isEmpty(jVar.a())) {
                str3 = jVar.a();
            }
            if (android.text.TextUtils.isEmpty(str3)) {
                return;
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f312081d, str3, null);
            java.lang.String string = this.f312087j.getString(com.tencent.mm.R.string.avf, lu1.a0.p(str3));
            android.widget.TextView textView = this.f312082e;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            com.tencent.mm.ui.MMActivity mMActivity = this.f312087j;
            int dimensionPixelOffset = mMActivity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479897ia);
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.h(mMActivity, string, dimensionPixelOffset, true));
            return;
        }
        android.view.View view2 = this.f312079b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUsersInfoLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUsersInfoLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (eu1.f.d(jVar.f()) > 1) {
            this.f312080c.setOnClickListener(((com.tencent.mm.plugin.card.ui.b0) this.f312132a).X);
        } else {
            this.f312084g.setVisibility(8);
            android.view.View view3 = this.f312085h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUsersInfoLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUsersInfoLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f312086i.removeAllViews();
            ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).f94939h = false;
        }
        com.tencent.mm.plugin.card.ui.b0 b0Var = (com.tencent.mm.plugin.card.ui.b0) this.f312132a;
        tt1.j jVar2 = b0Var.E;
        if (b0Var.f94939h) {
            this.f312081d.setVisibility(8);
            this.f312082e.setVisibility(8);
            this.f312083f.setVisibility(0);
            this.f312084g.setImageResource(com.tencent.mm.R.drawable.f481127bz1);
            this.f312083f.setText(this.f312087j.getString(com.tencent.mm.R.string.ava));
        } else {
            this.f312081d.setVisibility(0);
            this.f312082e.setVisibility(0);
            this.f312083f.setVisibility(8);
            if (eu1.f.d(jVar2.f()) <= 1) {
                this.f312084g.setVisibility(8);
            } else {
                this.f312084g.setVisibility(0);
                this.f312084g.setImageResource(com.tencent.mm.R.drawable.f481126bz0);
            }
            if (h17.size() > 0) {
                for (int i17 = 0; i17 < h17.size(); i17++) {
                    fu1.p pVar = (fu1.p) h17.get(i17);
                    if (pVar.f266870e) {
                        str = pVar.f266866a;
                        break;
                    }
                }
            }
            str = "";
            if (android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(jVar2.a())) {
                str = jVar2.a();
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f312081d, str, null);
                java.lang.String string2 = this.f312087j.getString(com.tencent.mm.R.string.avf, lu1.a0.p(str));
                android.widget.TextView textView2 = this.f312082e;
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                com.tencent.mm.ui.MMActivity mMActivity2 = this.f312087j;
                int dimensionPixelOffset2 = mMActivity2.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479897ia);
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.h(mMActivity2, string2, dimensionPixelOffset2, true));
            }
        }
        if (!((com.tencent.mm.plugin.card.ui.b0) this.f312132a).f94939h) {
            android.view.View view4 = this.f312085h;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUserBottomLayout", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUserBottomLayout", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f312086i.removeAllViews();
            return;
        }
        android.view.View view5 = this.f312085h;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUserBottomLayout", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "updateShareUserBottomLayout", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f312086i.getChildCount() != 0) {
            for (int i18 = 0; i18 < this.f312086i.getChildCount(); i18++) {
                android.view.View childAt = this.f312086i.getChildAt(i18);
                fu1.p pVar2 = h17.size() >= this.f312086i.getChildCount() ? (fu1.p) h17.get(i18) : null;
                android.widget.ImageView imageView = (android.widget.ImageView) childAt.findViewById(com.tencent.mm.R.id.oug);
                android.widget.ImageView imageView2 = (android.widget.ImageView) childAt.findViewById(com.tencent.mm.R.id.ouf);
                if (pVar2 == null || !pVar2.f266870e) {
                    imageView.setVisibility(8);
                    imageView2.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                    imageView2.setVisibility(0);
                }
            }
            this.f312086i.invalidate();
            return;
        }
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f312087j.getSystemService("layout_inflater");
        java.util.Iterator it = h17.iterator();
        while (it.hasNext()) {
            fu1.p pVar3 = (fu1.p) it.next();
            android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.cn7, this.f312086i, z17);
            android.widget.ImageView imageView3 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.oue);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ouu);
            android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.msl);
            if (!android.text.TextUtils.isEmpty(pVar3.f266866a)) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView3, pVar3.f266866a, str2);
                java.lang.String p17 = lu1.a0.p(pVar3.f266866a);
                if (android.text.TextUtils.isEmpty(p17)) {
                    textView3.setText("");
                } else {
                    le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                    com.tencent.mm.ui.MMActivity mMActivity3 = this.f312087j;
                    int dimensionPixelOffset3 = mMActivity3.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479930ja);
                    ((ke0.e) xVar3).getClass();
                    textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.h(mMActivity3, p17, dimensionPixelOffset3, true));
                }
            }
            textView4.setText("x " + pVar3.f266868c);
            inflate.setTag(pVar3);
            inflate.setOnClickListener(this.f312088k);
            android.widget.ImageView imageView4 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.oug);
            android.widget.ImageView imageView5 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.ouf);
            if (pVar3.f266870e) {
                imageView4.setVisibility(0);
                imageView5.setVisibility(0);
            } else {
                imageView4.setVisibility(8);
                imageView5.setVisibility(8);
            }
            this.f312086i.addView(inflate);
            str2 = null;
            z17 = false;
        }
        this.f312086i.invalidate();
    }
}
