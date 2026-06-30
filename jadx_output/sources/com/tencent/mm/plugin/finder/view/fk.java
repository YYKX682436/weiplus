package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class fk implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.hk f132110d;

    public fk(com.tencent.mm.plugin.finder.view.hk hkVar) {
        this.f132110d = hkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.Object obj;
        ?? linkedList;
        java.util.LinkedList list;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj2 = holder.f293125i;
        kotlin.jvm.internal.o.f(obj2, "getAssociatedObject(...)");
        com.tencent.mm.plugin.finder.view.hk hkVar = this.f132110d;
        com.tencent.mm.plugin.finder.view.so soVar = (com.tencent.mm.plugin.finder.view.so) hkVar;
        soVar.getClass();
        java.lang.Object obj3 = ((com.tencent.mm.plugin.finder.view.dk) obj2).f131900d;
        r45.u24 u24Var = (r45.u24) obj3;
        if (u24Var.getInteger(1) == 7) {
            com.tencent.mm.ui.widget.dialog.y1 b17 = soVar.b();
            com.tencent.mm.plugin.finder.view.kp kpVar = soVar.f133071e;
            b17.h(kpVar);
            java.util.Iterator it = soVar.f132250c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.u24) ((com.tencent.mm.plugin.finder.view.dk) obj).f131900d).getInteger(1) == 7) {
                        break;
                    }
                }
            }
            com.tencent.mm.plugin.finder.view.dk dkVar = (com.tencent.mm.plugin.finder.view.dk) obj;
            if (dkVar != null) {
                r45.u24 u24Var2 = (r45.u24) dkVar.f131900d;
                r45.j73 j73Var = (r45.j73) u24Var2.getCustom(2);
                if (j73Var == null || (list = j73Var.getList(2)) == null) {
                    linkedList = new java.util.LinkedList();
                } else {
                    linkedList = new java.util.ArrayList(kz5.d0.q(list, 10));
                    java.util.Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        linkedList.add(java.lang.Integer.valueOf(((r45.ob0) it6.next()).getInteger(1)));
                    }
                }
                kpVar.getClass();
                java.util.ArrayList arrayList = kpVar.f132525g;
                arrayList.clear();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it7 = linkedList.iterator();
                while (it7.hasNext()) {
                    arrayList2.add(new com.tencent.mm.plugin.finder.view.ep(((java.lang.Number) it7.next()).intValue()));
                }
                arrayList.addAll(arrayList2);
                arrayList.add(new com.tencent.mm.plugin.finder.view.ep(0));
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = kpVar.f132526h;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
                r45.j73 j73Var2 = (r45.j73) u24Var2.getCustom(2);
                soVar.f133072f.f131796h = j73Var2 != null ? j73Var2.getInteger(0) : 0;
            }
        } else {
            soVar.f133070d.invoke(obj3, 0);
        }
        if (u24Var.getInteger(1) != 7) {
            hkVar.b().q();
        }
    }
}
