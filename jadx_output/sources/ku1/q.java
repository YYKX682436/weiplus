package ku1;

/* loaded from: classes5.dex */
public class q extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f312138b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f312139c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f312140d = false;

    @Override // ku1.m
    public void c() {
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f312138b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDetailTableView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardDetailTableView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ku1.m
    public void e() {
        if (this.f312138b == null) {
            this.f312138b = ((android.view.ViewStub) b(com.tencent.mm.R.id.b9o)).inflate();
        }
        r45.ee0 ee0Var = ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).E.i0().f385200z;
        ((android.widget.TextView) this.f312138b.findViewById(com.tencent.mm.R.id.cwf)).setText(ee0Var.f373353d);
        java.util.LinkedList linkedList = ee0Var.f373356g;
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.f312138b.findViewById(com.tencent.mm.R.id.cwe);
        this.f312139c = linearLayout;
        linearLayout.removeAllViews();
        java.util.LinkedList linkedList2 = ee0Var.f373356g;
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).f94936e.getSystemService("layout_inflater");
        if (ee0Var.f373355f >= linkedList2.size() || this.f312140d) {
            android.view.View findViewById = this.f312138b.findViewById(com.tencent.mm.R.id.cwd);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDetailTableView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/view/CardDetailTableView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            for (int i17 = 0; i17 < linkedList2.size(); i17++) {
                android.widget.TextView textView = (android.widget.TextView) layoutInflater.inflate(com.tencent.mm.R.layout.f488367re, (android.view.ViewGroup) null, false);
                textView.setText(((r45.w50) linkedList2.get(i17)).f388878d);
                this.f312139c.addView(textView);
            }
            this.f312139c.invalidate();
            return;
        }
        for (int i18 = 0; i18 < ee0Var.f373355f; i18++) {
            android.widget.TextView textView2 = (android.widget.TextView) layoutInflater.inflate(com.tencent.mm.R.layout.f488367re, (android.view.ViewGroup) null, false);
            textView2.setText(((r45.w50) linkedList2.get(i18)).f388878d);
            this.f312139c.addView(textView2);
        }
        this.f312139c.invalidate();
        android.view.View findViewById2 = this.f312138b.findViewById(com.tencent.mm.R.id.cwd);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDetailTableView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/card/ui/view/CardDetailTableView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f312138b.findViewById(com.tencent.mm.R.id.cwd).setOnClickListener(new ku1.p(this, ee0Var, linkedList2, layoutInflater));
    }
}
