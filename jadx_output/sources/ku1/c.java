package ku1;

/* loaded from: classes15.dex */
public class c extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f312064b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f312065c;

    /* renamed from: d, reason: collision with root package name */
    public tt1.j f312066d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f312067e;

    /* renamed from: f, reason: collision with root package name */
    public hu1.g f312068f;

    @Override // ku1.m
    public void c() {
        com.tencent.mm.plugin.card.ui.s4 s4Var = this.f312132a;
        this.f312067e = ((com.tencent.mm.plugin.card.ui.b0) s4Var).f94936e;
        this.f312068f = ((com.tencent.mm.plugin.card.ui.b0) s4Var).f94937f;
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f312064b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ku1.m
    public void e() {
        if (this.f312064b == null) {
            android.view.View inflate = ((android.view.ViewStub) b(com.tencent.mm.R.id.b7f)).inflate();
            this.f312064b = inflate;
            inflate.findViewById(com.tencent.mm.R.id.b76).setOnClickListener(((com.tencent.mm.plugin.card.ui.b0) this.f312132a).X);
        }
        com.tencent.mm.plugin.card.ui.s4 s4Var = this.f312132a;
        this.f312066d = ((com.tencent.mm.plugin.card.ui.b0) s4Var).E;
        hu1.g gVar = ((com.tencent.mm.plugin.card.ui.b0) s4Var).f94937f;
        this.f312068f = gVar;
        boolean m17 = gVar.m();
        boolean z17 = ((hu1.a) this.f312068f).f285073f;
        if (!m17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptView", "updateAcceptView(), mAcceptCardView is Gone");
            android.view.View view = this.f312064b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f312064b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptView", "updateAcceptView() acceptViewVisible:" + m17 + " acceptViewEnabled:" + z17);
        android.widget.Button button = (android.widget.Button) this.f312064b.findViewById(com.tencent.mm.R.id.b76);
        android.view.View findViewById = this.f312064b.findViewById(com.tencent.mm.R.id.b7e);
        findViewById.setBackgroundDrawable(null);
        findViewById.setOnClickListener(null);
        int dimensionPixelSize = this.f312067e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480190qw);
        if (z17) {
            if (!android.text.TextUtils.isEmpty(this.f312066d.s0().D)) {
                button.setText(this.f312066d.s0().D);
            }
            if (this.f312066d.o()) {
                button.setTextColor(lu1.a0.d(this.f312066d.s0().f388555p));
                android.graphics.drawable.ShapeDrawable l17 = lu1.a0.l(this.f312067e, lu1.a0.d(this.f312066d.s0().f388555p), dimensionPixelSize);
                android.graphics.drawable.ShapeDrawable n17 = lu1.a0.n(this.f312067e, lu1.a0.d(this.f312066d.s0().f388555p), dimensionPixelSize);
                android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, n17);
                stateListDrawable.addState(new int[0], l17);
                int[] iArr = {this.f312067e.getResources().getColor(com.tencent.mm.R.color.aaw), lu1.a0.d(this.f312066d.s0().f388555p)};
                int[][] iArr2 = {new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, new int[0]};
                button.setBackgroundDrawable(stateListDrawable);
                button.setTextColor(new android.content.res.ColorStateList(iArr2, iArr));
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f312064b.getLayoutParams();
                layoutParams.topMargin = this.f312067e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480170qb);
                this.f312064b.setLayoutParams(layoutParams);
                android.view.View findViewById2 = this.f312064b.findViewById(com.tencent.mm.R.id.d1o);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                wt1.k kVar = ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).H;
                this.f312064b.setBackgroundColor(this.f312067e.getResources().getColor(com.tencent.mm.R.color.aaw));
                android.widget.CheckBox checkBox = (android.widget.CheckBox) this.f312064b.findViewById(com.tencent.mm.R.id.b9z);
                kVar.b();
                if (kVar.b().f456445v) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptView", "updateFollowBox() show followbox");
                    checkBox.setVisibility(0);
                    r45.g43 g43Var = this.f312066d.s0().P;
                    if (g43Var == null || android.text.TextUtils.isEmpty(g43Var.f374867d)) {
                        checkBox.setText(kVar.b().f379843d);
                    } else {
                        checkBox.setText(g43Var.f374867d);
                    }
                    checkBox.setChecked(kVar.b().f456446w);
                    checkBox.setOnClickListener(new ku1.b(this, kVar));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardAcceptView", "updateFollowBox() not show followbox");
                    checkBox.setVisibility(8);
                }
            } else if (this.f312066d.d() || this.f312066d.i() || this.f312066d.X()) {
                android.graphics.drawable.ShapeDrawable n18 = lu1.a0.n(this.f312067e, lu1.a0.d(this.f312066d.s0().f388555p), dimensionPixelSize);
                android.graphics.drawable.ShapeDrawable n19 = lu1.a0.n(this.f312067e, lu1.a0.e(this.f312066d.s0().f388555p, 175), dimensionPixelSize);
                android.graphics.drawable.StateListDrawable stateListDrawable2 = new android.graphics.drawable.StateListDrawable();
                stateListDrawable2.addState(new int[]{android.R.attr.state_pressed}, n19);
                stateListDrawable2.addState(new int[0], n18);
                button.setBackgroundDrawable(stateListDrawable2);
                button.setTextColor(this.f312067e.getResources().getColor(com.tencent.mm.R.color.f479552ab3));
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
                layoutParams2.width = -1;
                button.setLayoutParams(layoutParams2);
            } else {
                android.graphics.drawable.ShapeDrawable n27 = lu1.a0.n(this.f312067e, lu1.a0.d(this.f312066d.s0().f388555p), dimensionPixelSize);
                android.graphics.drawable.ShapeDrawable n28 = lu1.a0.n(this.f312067e, lu1.a0.e(this.f312066d.s0().f388555p, 175), dimensionPixelSize);
                android.graphics.drawable.StateListDrawable stateListDrawable3 = new android.graphics.drawable.StateListDrawable();
                stateListDrawable3.addState(new int[]{android.R.attr.state_pressed}, n28);
                stateListDrawable3.addState(new int[0], n27);
                button.setBackgroundDrawable(stateListDrawable3);
                button.setTextColor(this.f312067e.getResources().getColor(com.tencent.mm.R.color.f479552ab3));
            }
        } else {
            this.f312064b.setEnabled(false);
            findViewById.setEnabled(false);
            button.setEnabled(false);
            button.setText(this.f312066d.o() ? this.f312066d.s0().D : ((hu1.a) this.f312068f).s());
            if (this.f312066d.o()) {
                button.setTextColor(lu1.a0.e(this.f312066d.s0().f388555p, 125));
                button.setBackgroundDrawable(lu1.a0.l(this.f312067e, lu1.a0.e(this.f312066d.s0().f388555p, 125), dimensionPixelSize));
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.f312064b.getLayoutParams();
                layoutParams3.topMargin = this.f312067e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480171qc);
                this.f312064b.setLayoutParams(layoutParams3);
                android.view.View findViewById3 = this.f312064b.findViewById(com.tencent.mm.R.id.d1o);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/card/ui/view/CardAcceptView", "updateAcceptView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (this.f312066d.d() || this.f312066d.i() || this.f312066d.X()) {
                button.setTextColor(this.f312067e.getResources().getColor(com.tencent.mm.R.color.f479211sz));
                com.tencent.mm.ui.MMActivity mMActivity = this.f312067e;
                button.setBackgroundDrawable(lu1.a0.m(mMActivity, mMActivity.getResources().getColor(com.tencent.mm.R.color.f478777gx)));
                android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
                layoutParams4.width = -1;
                button.setLayoutParams(layoutParams4);
            } else {
                button.setTextColor(this.f312067e.getResources().getColor(com.tencent.mm.R.color.f479211sz));
                com.tencent.mm.ui.MMActivity mMActivity2 = this.f312067e;
                button.setBackgroundDrawable(lu1.a0.m(mMActivity2, mMActivity2.getResources().getColor(com.tencent.mm.R.color.f478777gx)));
            }
        }
        if (this.f312066d.d() || this.f312066d.i()) {
            return;
        }
        if (this.f312066d.s0().Q == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f312066d.s0().Q.f385374d)) {
            android.widget.TextView textView = this.f312065c;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f312065c == null) {
            this.f312065c = (android.widget.TextView) this.f312064b.findViewById(com.tencent.mm.R.id.b7c);
        }
        this.f312065c.setText(this.f312066d.s0().Q.f385374d);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f312066d.s0().Q.f385375e)) {
            this.f312065c.setOnClickListener(((com.tencent.mm.plugin.card.ui.b0) this.f312132a).X);
            this.f312065c.setTextColor(lu1.a0.d(this.f312066d.s0().f388555p));
        }
        this.f312065c.setVisibility(0);
    }
}
