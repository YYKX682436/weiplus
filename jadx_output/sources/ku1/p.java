package ku1;

/* loaded from: classes5.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ee0 f312134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f312135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.LayoutInflater f312136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ku1.q f312137g;

    public p(ku1.q qVar, r45.ee0 ee0Var, java.util.LinkedList linkedList, android.view.LayoutInflater layoutInflater) {
        this.f312137g = qVar;
        this.f312134d = ee0Var;
        this.f312135e = linkedList;
        this.f312136f = layoutInflater;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/view/CardDetailTableView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ku1.q qVar = this.f312137g;
        qVar.f312140d = true;
        android.view.View findViewById = qVar.f312138b.findViewById(com.tencent.mm.R.id.cwd);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDetailTableView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/view/CardDetailTableView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = this.f312134d.f373355f;
        while (true) {
            java.util.LinkedList linkedList = this.f312135e;
            if (i17 >= linkedList.size()) {
                qVar.f312139c.invalidate();
                yj0.a.h(this, "com/tencent/mm/plugin/card/ui/view/CardDetailTableView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                android.widget.TextView textView = (android.widget.TextView) this.f312136f.inflate(com.tencent.mm.R.layout.f488367re, (android.view.ViewGroup) null, false);
                textView.setText(((r45.w50) linkedList.get(i17)).f388878d);
                qVar.f312139c.addView(textView);
                i17++;
            }
        }
    }
}
