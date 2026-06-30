package hq5;

/* loaded from: classes5.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f283267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f283268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hq5.t0 f283269f;

    public s0(java.util.Set set, java.util.Set set2, hq5.t0 t0Var) {
        this.f283267d = set;
        this.f283268e = set2;
        this.f283269f = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/uic/ui/WeDropSelectFileUIC$setLastChooseStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Set set = this.f283267d;
        for (java.lang.Object obj : set) {
            if (com.tencent.mm.vfs.w6.j((java.lang.String) obj)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Set set2 = this.f283268e;
        for (java.lang.Object obj2 : set2) {
            if (com.tencent.mm.vfs.w6.j((java.lang.String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        int size = arrayList2.size() + arrayList3.size();
        int size2 = set.size() + set2.size();
        hq5.t0 t0Var = this.f283269f;
        if (size == size2) {
            com.tencent.mars.xlog.Log.i(t0Var.f283271d, "use last select, img count: " + arrayList2.size() + ", video count: " + arrayList3.size());
            t0Var.V6(arrayList2, arrayList3, true);
        } else {
            com.tencent.mars.xlog.Log.i(t0Var.f283271d, "use last select, img count: " + arrayList2.size() + '/' + set.size() + ", video count: " + arrayList3.size() + '/' + set2.size());
            int size3 = ((set.size() - arrayList2.size()) + set2.size()) - arrayList3.size();
            if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(t0Var.getContext());
                u1Var.u(t0Var.getContext().getString(com.tencent.mm.R.string.nze, java.lang.Integer.valueOf(size3)));
                u1Var.a(true);
                u1Var.j(t0Var.getContext().getString(com.tencent.mm.R.string.f490454vi));
                u1Var.f211996a.f211821b.V = t0Var.getContext().getColor(com.tencent.mm.R.color.Link_100);
                u1Var.i(hq5.q0.f283258a);
                u1Var.q(false);
            } else {
                com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(t0Var.getContext());
                u1Var2.u(t0Var.getContext().getString(com.tencent.mm.R.string.nzd, java.lang.Integer.valueOf(size3)));
                u1Var2.a(true);
                u1Var2.n(t0Var.getContext().getString(com.tencent.mm.R.string.nza));
                u1Var2.b(new hq5.r0(t0Var, arrayList2, arrayList3));
                u1Var2.q(false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropSelectFileUIC$setLastChooseStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
