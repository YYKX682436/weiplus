package ku1;

/* loaded from: classes5.dex */
public class i0 extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f312103b;

    @Override // ku1.m
    public void c() {
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f312103b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardThirdFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardThirdFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ku1.m
    public void e() {
        if (this.f312103b == null) {
            this.f312103b = ((android.view.ViewStub) b(com.tencent.mm.R.id.bc_)).inflate();
        }
        r45.w50 w50Var = ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).E.i0().f385195u;
        android.view.View view = this.f312103b;
        if (view != null) {
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o5x)).setText(w50Var.f388878d);
            ((android.widget.TextView) this.f312103b.findViewById(com.tencent.mm.R.id.o5w)).setText(w50Var.f388879e);
            if ((((hu1.a) ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).f94937f).w() && ((hu1.a) ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).f94937f).v()) ? false : true) {
                ((android.widget.LinearLayout.LayoutParams) ((android.widget.LinearLayout) this.f312103b).getLayoutParams()).bottomMargin = 0;
            } else {
                ((android.widget.LinearLayout.LayoutParams) ((android.widget.LinearLayout) this.f312103b).getLayoutParams()).bottomMargin = ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).f94936e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.it);
            }
        }
    }
}
