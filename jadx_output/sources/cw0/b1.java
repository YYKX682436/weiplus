package cw0;

/* loaded from: classes5.dex */
public final class b1 extends gv0.b {

    /* renamed from: h, reason: collision with root package name */
    public final yo0.i f222615h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(yz5.p onItemClickListener) {
        super(null, onItemClickListener, 0L, 5, null);
        kotlin.jvm.internal.o.g(onItemClickListener, "onItemClickListener");
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        this.f222615h = fVar.a();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        dw0.c cVar = (dw0.c) kz5.n0.a0(this.f275970d, i17);
        if (cVar != null) {
            com.tencent.maas.material.MJMaterialInfo mJMaterialInfo = dw0.c.f244083e;
            if (!kotlin.jvm.internal.o.b(cVar.f244086a, dw0.c.f244085g)) {
                cw0.z0 z0Var = cw0.a1.f222606e;
                return 1;
            }
        }
        cw0.z0 z0Var2 = cw0.a1.f222606e;
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(parent, "parent");
        cw0.a1.f222606e.getClass();
        java.util.Iterator it = ((kz5.h) cw0.a1.f222609h).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((cw0.a1) obj).f222610d == i17) {
                break;
            }
        }
        cw0.a1 a1Var = (cw0.a1) obj;
        if (a1Var == null) {
            a1Var = cw0.a1.f222607f;
        }
        int ordinal = a1Var.ordinal();
        if (ordinal == 0) {
            android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.djr, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new cw0.y0(this, inflate);
        }
        if (ordinal != 1) {
            throw new jz5.j();
        }
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new cw0.x0(this, new com.tencent.mm.mj_publisher.finder.movie_composing.widgets.TimbreDividerView(context, null, 0, 6, null));
    }

    public final void z(int i17, zu0.i loadedState) {
        kotlin.jvm.internal.o.g(loadedState, "loadedState");
        java.util.ArrayList arrayList = this.f275970d;
        boolean z17 = false;
        if (i17 >= 0 && i17 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            arrayList.set(i17, dw0.c.a((dw0.c) obj, null, null, loadedState, false, 11, null));
            notifyItemChanged(i17);
        }
    }
}
