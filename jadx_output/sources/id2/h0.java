package id2;

/* loaded from: classes3.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290592d;

    public h0(id2.v1 v1Var) {
        this.f290592d = v1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.l lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zl2.r4.f473950a.T2(4);
        id2.v1 v1Var = this.f290592d;
        dl2.f0 f0Var = (dl2.f0) ((jz5.n) v1Var.f290850w).getValue();
        int i17 = v1Var.L;
        long j17 = v1Var.H;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList(v1Var.D);
        kz5.g0.t(linkedList2, new id2.g0(v1Var));
        java.util.Iterator it = linkedList2.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            r45.n30 n30Var = (r45.n30) it.next();
            if (n30Var.getInteger(1) > 0) {
                z17 = true;
            }
            linkedList.add(new dl2.f(z17, n30Var));
        }
        dl2.g gVar = new dl2.g(i17, j17, linkedList);
        f0Var.getClass();
        yz5.a aVar = f0Var.f235206j;
        if (aVar != null && (lVar = (jz5.l) aVar.invoke()) != null) {
            r45.qa1 qa1Var = (r45.qa1) lVar.f302833d;
            f0Var.f235208l = qa1Var.getLong(5);
            f0Var.f235209m = qa1Var.getLong(6);
            f0Var.f235210n = (java.util.LinkedHashMap) lVar.f302834e;
            java.util.LinkedList list = qa1Var.getList(4);
            kotlin.jvm.internal.o.f(list, "getLevel_config_list(...)");
            f0Var.f235211o = list;
            if (list.size() > 1) {
                kz5.g0.t(list, new dl2.e0());
            }
            f0Var.f235212p = qa1Var.getLong(3);
        }
        com.tencent.mars.xlog.Log.i(f0Var.f235198b, "[showPanel] data = " + gVar);
        f0Var.f235207k = gVar;
        f0Var.f235213q = gVar.f235220a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : gVar.f235222c) {
            dl2.f fVar = (dl2.f) obj;
            if (fVar.f235195a && fVar.f235196b.getInteger(1) > 0) {
                arrayList2.add(obj);
            }
        }
        f0Var.f235219w = arrayList2.size();
        ((dl2.p) ((jz5.n) f0Var.f235204h).getValue()).notifyDataSetChanged();
        f0Var.b();
        ((android.view.View) ((jz5.n) f0Var.f235200d).getValue()).post(new dl2.d0(f0Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
