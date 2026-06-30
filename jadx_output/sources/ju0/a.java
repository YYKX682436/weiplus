package ju0;

/* loaded from: classes5.dex */
public final class a extends ju0.f {

    /* renamed from: f, reason: collision with root package name */
    public final ju0.b f301679f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ju0.b imageListAdapter, ju0.e callback) {
        super(callback);
        kotlin.jvm.internal.o.g(imageListAdapter, "imageListAdapter");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f301679f = imageListAdapter;
    }

    public final boolean a(int i17, int i18) {
        boolean z17;
        java.util.List list = this.f301679f.f250921d;
        kotlin.jvm.internal.o.f(list, "getItems(...)");
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ku0.a) it.next()).f312060a.f475661a.getIdentifierType() == qg.a.Unknown) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return z17 && i17 == i18 - 1;
    }

    @Override // androidx.recyclerview.widget.a1
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        int adapterPosition = viewHolder.getAdapterPosition();
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        return (itemCount == 2 || a(adapterPosition, itemCount)) ? androidx.recyclerview.widget.a1.makeMovementFlags(0, 0) : androidx.recyclerview.widget.a1.makeMovementFlags(51, 0);
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder, androidx.recyclerview.widget.k3 target) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(target, "target");
        int adapterPosition = target.getAdapterPosition();
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (a(adapterPosition, adapter != null ? adapter.getItemCount() : 0)) {
            return false;
        }
        int adapterPosition2 = viewHolder.getAdapterPosition();
        int adapterPosition3 = target.getAdapterPosition();
        if (this.f301686d == -1) {
            this.f301686d = adapterPosition2;
        }
        this.f301687e = adapterPosition3;
        nu0.b4 b4Var = ((nu0.g2) this.f301683a).f339943a;
        ju0.b bVar = b4Var.K;
        bVar.f250921d.add(adapterPosition3, (ku0.a) bVar.f250921d.remove(adapterPosition2));
        bVar.notifyItemMoved(adapterPosition2, adapterPosition3);
        java.util.ArrayList arrayList = b4Var.f339887w;
        java.lang.Object remove = arrayList.remove(adapterPosition2);
        kotlin.jvm.internal.o.f(remove, "removeAt(...)");
        arrayList.add(adapterPosition3, (zu0.a) remove);
        return true;
    }
}
