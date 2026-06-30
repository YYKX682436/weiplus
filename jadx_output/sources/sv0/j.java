package sv0;

/* loaded from: classes5.dex */
public final class j extends gv0.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yz5.p onItemClickListener) {
        super(null, onItemClickListener, 0L, 5, null);
        kotlin.jvm.internal.o.g(onItemClickListener, "onItemClickListener");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.dgj, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new sv0.i(inflate);
    }

    public final void unselectAll() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = this.f275970d;
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            vv0.n nVar = (vv0.n) obj;
            if (nVar.f440401d) {
                linkedHashMap.put(java.lang.Integer.valueOf(i17), vv0.n.a(nVar, null, null, 0, false, false, 23, null));
            }
            i17 = i18;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            vv0.n nVar2 = (vv0.n) linkedHashMap.get(java.lang.Integer.valueOf(intValue));
            if (nVar2 != null) {
                arrayList.set(intValue, nVar2);
                notifyItemChanged(intValue);
            }
        }
    }

    public final void z(int i17, vv0.n nVar) {
        java.util.ArrayList arrayList = this.f275970d;
        if (nVar == null) {
            nVar = (vv0.n) kz5.n0.a0(arrayList, i17);
        }
        vv0.n nVar2 = nVar;
        if (nVar2 != null) {
            arrayList.set(i17, vv0.n.a(nVar2, null, null, 0, true, false, 23, null));
            notifyItemChanged(i17);
        }
    }
}
