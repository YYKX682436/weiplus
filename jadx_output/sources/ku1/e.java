package ku1;

/* loaded from: classes15.dex */
public class e extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f312072b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f312073c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f312074d;

    @Override // ku1.m
    public void c() {
        this.f312072b = b(com.tencent.mm.R.id.f482766ng);
        this.f312073c = (android.widget.TextView) b(com.tencent.mm.R.id.f482767nh);
        this.f312074d = (android.widget.TextView) b(com.tencent.mm.R.id.bbj);
        this.f312073c.setOnClickListener(((com.tencent.mm.plugin.card.ui.b0) this.f312132a).X);
        android.view.View view = this.f312072b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f312072b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ku1.m
    public void e() {
        com.tencent.mm.plugin.card.ui.b0 b0Var = (com.tencent.mm.plugin.card.ui.b0) this.f312132a;
        tt1.j jVar = b0Var.E;
        com.tencent.mm.ui.MMActivity mMActivity = b0Var.f94936e;
        android.view.View view = this.f312072b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (android.text.TextUtils.isEmpty(jVar.s0().F)) {
            this.f312073c.setVisibility(8);
        } else {
            this.f312073c.setVisibility(0);
            this.f312073c.setText(jVar.s0().F);
            if (jVar.i() || (jVar.B() && jVar.d())) {
                this.f312073c.setTextColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            } else if (jVar.B() && jVar.o()) {
                this.f312073c.setTextColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.f478778gy));
                this.f312072b.setBackgroundColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.aaw));
            } else {
                this.f312073c.setTextColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            }
        }
        android.view.View findViewById = this.f312072b.findViewById(com.tencent.mm.R.id.f483583bc0);
        if (!((com.tencent.mm.plugin.card.ui.b0) this.f312132a).f94937f.f()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f312074d.setText(mMActivity.getString(com.tencent.mm.R.string.av6));
        this.f312074d.setTextColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        int dimensionPixelOffset = mMActivity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.i_);
        android.widget.Button button = (android.widget.Button) this.f312072b.findViewById(com.tencent.mm.R.id.bbh);
        android.graphics.drawable.ShapeDrawable l17 = lu1.a0.l(mMActivity, mMActivity.getResources().getColor(com.tencent.mm.R.color.aaw), dimensionPixelOffset);
        android.graphics.drawable.ShapeDrawable n17 = lu1.a0.n(mMActivity, mMActivity.getResources().getColor(com.tencent.mm.R.color.aaw), dimensionPixelOffset);
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, n17);
        stateListDrawable.addState(new int[0], l17);
        button.setBackgroundDrawable(stateListDrawable);
        button.setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, new int[0]}, new int[]{lu1.a0.d(jVar.s0().f388555p), mMActivity.getResources().getColor(com.tencent.mm.R.color.aaw)}));
        button.setOnClickListener(((com.tencent.mm.plugin.card.ui.b0) this.f312132a).X);
        android.view.View findViewById2 = this.f312072b.findViewById(com.tencent.mm.R.id.f485924jk1);
        android.view.View findViewById3 = this.f312072b.findViewById(com.tencent.mm.R.id.b_q);
        if (jVar.s0().U == 1) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(findViewById3, arrayList7.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/card/ui/view/CardAdvertiseView", "updateAdvertise", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
