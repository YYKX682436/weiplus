package ry4;

/* loaded from: classes.dex */
public final class y0 extends androidx.recyclerview.widget.e1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f401689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(ry4.d1 d1Var) {
        super(3, 0);
        this.f401689c = d1Var;
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean onMove(androidx.recyclerview.widget.RecyclerView rv6, androidx.recyclerview.widget.k3 from, androidx.recyclerview.widget.k3 to6) {
        kotlin.jvm.internal.o.g(rv6, "rv");
        kotlin.jvm.internal.o.g(from, "from");
        kotlin.jvm.internal.o.g(to6, "to");
        int adapterPosition = from.getAdapterPosition();
        int adapterPosition2 = to6.getAdapterPosition();
        if (adapterPosition < 0 || adapterPosition2 < 0) {
            return false;
        }
        ry4.d1 d1Var = this.f401689c;
        ((java.util.ArrayList) d1Var.f401610f).add(adapterPosition2, (com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem) ((java.util.ArrayList) d1Var.f401610f).remove(adapterPosition));
        ry4.g gVar = d1Var.f401609e;
        if (gVar != null) {
            java.util.Set set = gVar.f401630n;
            boolean remove = set.remove(java.lang.Integer.valueOf(adapterPosition));
            int i17 = adapterPosition < adapterPosition2 ? -1 : 1;
            e06.k kVar = adapterPosition < adapterPosition2 ? new e06.k(adapterPosition + 1, adapterPosition2) : e06.p.m(adapterPosition2, adapterPosition);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : set) {
                int intValue = ((java.lang.Number) obj).intValue();
                if (intValue <= kVar.f246210e && kVar.f246209d <= intValue) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue2 = ((java.lang.Number) it.next()).intValue();
                set.remove(java.lang.Integer.valueOf(intValue2));
                set.add(java.lang.Integer.valueOf(intValue2 + i17));
            }
            if (remove) {
                set.add(java.lang.Integer.valueOf(adapterPosition2));
            }
        }
        ry4.g gVar2 = d1Var.f401609e;
        if (gVar2 != null) {
            gVar2.notifyItemMoved(adapterPosition, adapterPosition2);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSwiped(androidx.recyclerview.widget.k3 viewHolder, int i17) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
    }
}
