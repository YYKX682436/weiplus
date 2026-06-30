package y20;

/* loaded from: classes.dex */
public final class n extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f459014d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f459015e;

    public n(java.util.List items, yz5.p onItemClick, int i17, kotlin.jvm.internal.i iVar) {
        items = (i17 & 1) != 0 ? kz5.p0.f313996d : items;
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(onItemClick, "onItemClick");
        this.f459014d = items;
        this.f459015e = onItemClick;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f459014d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        java.lang.Object obj = this.f459014d.get(i17);
        if (obj instanceof qq.e) {
            return 0;
        }
        if (obj instanceof qq.d) {
            return 1;
        }
        if (obj instanceof qq.g) {
            return 2;
        }
        if (obj instanceof y20.i) {
            return 3;
        }
        throw new java.lang.IllegalArgumentException("Unknown item type");
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        java.lang.Object obj;
        java.lang.String obj2;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj3 = this.f459014d.get(i17);
        if (holder instanceof y20.k) {
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.ecs.test.EcsTestModels.EcsSettingGroupTitle");
            ((y20.k) holder).f459009d.setText(((qq.e) obj3).f365865a);
            return;
        }
        boolean z17 = holder instanceof y20.h;
        yz5.p onItemClick = this.f459015e;
        if (z17) {
            y20.h hVar = (y20.h) holder;
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.ecs.test.EcsTestModels.EcsSettingButton");
            qq.d dVar = (qq.d) obj3;
            kotlin.jvm.internal.o.g(onItemClick, "onItemClick");
            hVar.f459007d.setText(dVar.f365862a);
            hVar.itemView.setOnClickListener(new y20.g(onItemClick, dVar));
            return;
        }
        if (!(holder instanceof y20.m)) {
            if (holder instanceof y20.j) {
                return;
            }
            return;
        }
        y20.m mVar = (y20.m) holder;
        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.ecs.test.EcsTestModels.EcsSettingSwitch<*>");
        qq.g gVar = (qq.g) obj3;
        kotlin.jvm.internal.o.g(onItemClick, "onItemClick");
        mVar.f459012d.setText(gVar.f365867a);
        qq.c0 c0Var = (qq.c0) i95.n0.c(qq.c0.class);
        java.lang.Object obj4 = gVar.f365870d;
        if (c0Var != null) {
            obj4 = ((qq.s) c0Var).Ai(gVar.f365871e, obj4);
        }
        java.util.Iterator it = gVar.f365869c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((qq.c) obj).f365861b, obj4)) {
                    break;
                }
            }
        }
        qq.c cVar = (qq.c) obj;
        if (cVar == null || (obj2 = cVar.f365860a) == null) {
            obj2 = obj4.toString();
        }
        mVar.f459013e.setText(obj2);
        mVar.itemView.setOnClickListener(new y20.l(onItemClick, gVar));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 0) {
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.e4p, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new y20.k(inflate);
        }
        if (i17 == 1) {
            android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.e4l, parent, false);
            kotlin.jvm.internal.o.d(inflate2);
            return new y20.h(inflate2);
        }
        if (i17 == 2) {
            android.view.View inflate3 = from.inflate(com.tencent.mm.R.layout.e4q, parent, false);
            kotlin.jvm.internal.o.d(inflate3);
            return new y20.m(inflate3);
        }
        if (i17 == 3) {
            android.view.View inflate4 = from.inflate(com.tencent.mm.R.layout.e4o, parent, false);
            kotlin.jvm.internal.o.d(inflate4);
            return new y20.j(inflate4);
        }
        throw new java.lang.IllegalArgumentException("Unknown view type: " + i17);
    }

    public final void x(java.util.List newItems) {
        kotlin.jvm.internal.o.g(newItems, "newItems");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = newItems.size();
        for (int i17 = 0; i17 < size; i17++) {
            qq.f fVar = (qq.f) newItems.get(i17);
            arrayList.add(fVar);
            boolean z17 = true;
            if (i17 < newItems.size() - 1) {
                qq.f fVar2 = (qq.f) newItems.get(i17 + 1);
                if ((!(fVar instanceof qq.e) || (!(fVar2 instanceof qq.d) && !(fVar2 instanceof qq.g))) && ((!(fVar instanceof qq.d) && !(fVar instanceof qq.g)) || (!(fVar2 instanceof qq.d) && !(fVar2 instanceof qq.g)))) {
                    z17 = false;
                }
                if (z17) {
                    arrayList.add(y20.i.f459008a);
                }
            }
        }
        this.f459014d = arrayList;
        notifyDataSetChanged();
    }
}
