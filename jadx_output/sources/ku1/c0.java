package ku1;

/* loaded from: classes15.dex */
public class c0 extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f312069b;

    @Override // ku1.m
    public void c() {
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f312069b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardOperateFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardOperateFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ku1.m
    public void e() {
        if (this.f312069b == null) {
            this.f312069b = ((android.view.ViewStub) b(com.tencent.mm.R.id.bb7)).inflate();
        }
        com.tencent.mm.plugin.card.ui.s4 s4Var = this.f312132a;
        tt1.j jVar = ((com.tencent.mm.plugin.card.ui.b0) s4Var).E;
        com.tencent.mm.ui.MMActivity mMActivity = ((com.tencent.mm.plugin.card.ui.b0) s4Var).f94936e;
        r45.w50 w50Var = jVar.i0().f385198x;
        android.view.View view = this.f312069b;
        if (view != null) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bb8);
            textView.setText(w50Var.f388878d);
            textView.setTextColor(lu1.a0.d(jVar.s0().f388555p));
            android.widget.TextView textView2 = (android.widget.TextView) this.f312069b.findViewById(com.tencent.mm.R.id.bb6);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.f312069b.findViewById(com.tencent.mm.R.id.bct);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            if (jVar.o()) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) textView.getLayoutParams();
                if (android.text.TextUtils.isEmpty(w50Var.f388880f)) {
                    textView2.setVisibility(8);
                    layoutParams.height = mMActivity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480187qt);
                } else {
                    textView2.setText(w50Var.f388880f);
                    textView2.setVisibility(0);
                    layoutParams.height = mMActivity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480186qs);
                    layoutParams2.bottomMargin = mMActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479563f);
                    android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) textView2.getLayoutParams();
                    layoutParams3.topMargin = mMActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479563f);
                    textView2.setLayoutParams(layoutParams3);
                    textView2.invalidate();
                }
                layoutParams2.height = mMActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480188qu);
                textView.setLayoutParams(layoutParams2);
                textView.invalidate();
                int dimensionPixelSize = mMActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480190qw);
                java.lang.String str = jVar.s0().f388555p;
                android.graphics.drawable.ShapeDrawable l17 = lu1.a0.l(mMActivity, lu1.a0.d(str), dimensionPixelSize);
                android.graphics.drawable.ShapeDrawable n17 = lu1.a0.n(mMActivity, lu1.a0.d(str), dimensionPixelSize);
                android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, n17);
                stateListDrawable.addState(new int[0], l17);
                textView.setBackgroundDrawable(stateListDrawable);
                textView.setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, new int[0]}, new int[]{mMActivity.getResources().getColor(com.tencent.mm.R.color.f479549ab0), lu1.a0.d(jVar.s0().f388555p)}));
                linearLayout.setBackgroundDrawable(null);
                textView.setOnClickListener(((com.tencent.mm.plugin.card.ui.b0) this.f312132a).X);
            } else {
                if (android.text.TextUtils.isEmpty(w50Var.f388880f)) {
                    textView2.setVisibility(8);
                    layoutParams.height = mMActivity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480199r5);
                } else {
                    textView2.setText(w50Var.f388880f);
                    textView2.setVisibility(0);
                    layoutParams.height = mMActivity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480198r4);
                }
                linearLayout.setOnClickListener(((com.tencent.mm.plugin.card.ui.b0) this.f312132a).X);
            }
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.invalidate();
            this.f312069b.invalidate();
            if (jVar.o()) {
            }
        }
    }
}
