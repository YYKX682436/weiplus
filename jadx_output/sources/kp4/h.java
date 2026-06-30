package kp4;

/* loaded from: classes10.dex */
public final class h extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f311109d = "MicroMsg.EditFrameListAdapter";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f311110e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f311111f = -1;

    /* renamed from: g, reason: collision with root package name */
    public kp4.g f311112g;

    public h() {
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f311110e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return ((kp4.c1) this.f311110e.get(i17)).f311079i;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (((kp4.c1) this.f311110e.get(i17)).e()) {
            return 1;
        }
        return super.getItemViewType(i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        kp4.c viewHolder = (kp4.c) k3Var;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        java.lang.Object obj = this.f311110e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        viewHolder.i((kp4.c1) obj);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            return new kp4.d(this, new android.view.View(parent.getContext()));
        }
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489600d43, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new kp4.f(this, inflate, parent.getHeight());
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewRecycled(androidx.recyclerview.widget.k3 k3Var) {
        kp4.c holder = (kp4.c) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewRecycled(holder);
        holder.j();
    }

    public final void x(int i17) {
        int i18;
        if (i17 != this.f311111f) {
            java.util.LinkedList linkedList = this.f311110e;
            java.util.Iterator it = linkedList.iterator();
            int i19 = 0;
            while (true) {
                i18 = -1;
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                } else {
                    if (((kp4.c1) it.next()).f311079i == this.f311111f) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            if (i19 >= 0) {
                notifyItemChanged(i19, java.lang.Boolean.FALSE);
            }
            java.util.Iterator it6 = linkedList.iterator();
            int i27 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (((kp4.c1) it6.next()).f311079i == i17) {
                    i18 = i27;
                    break;
                }
                i27++;
            }
            if (i18 >= 0) {
                notifyItemChanged(i18, java.lang.Boolean.TRUE);
            }
            this.f311111f = i17;
        }
    }

    public final void y(java.util.List tracks) {
        kotlin.jvm.internal.o.g(tracks, "tracks");
        java.util.LinkedList linkedList = this.f311110e;
        linkedList.clear();
        linkedList.addAll(tracks);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext() && !((kp4.c1) it.next()).e()) {
        }
        java.util.ListIterator listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            if (((kp4.c1) listIterator.previous()).e()) {
                listIterator.nextIndex();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        kp4.c viewHolder = (kp4.c) k3Var;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        java.lang.Object Z = kz5.n0.Z(payloads);
        java.lang.Boolean bool = Z instanceof java.lang.Boolean ? (java.lang.Boolean) Z : null;
        java.util.LinkedList linkedList = this.f311110e;
        if (bool == null) {
            java.lang.Object obj = linkedList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            viewHolder.i((kp4.c1) obj);
        } else {
            java.lang.Object obj2 = linkedList.get(i17);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            viewHolder.k((kp4.c1) obj2, bool.booleanValue());
        }
    }
}
