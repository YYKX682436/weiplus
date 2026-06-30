package kp4;

/* loaded from: classes10.dex */
public final class r extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f311135d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f311136e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f311137f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f311138g = -1;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f311139h;

    /* renamed from: i, reason: collision with root package name */
    public kp4.s0 f311140i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f311141m;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f311135d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (((kp4.a) this.f311135d.get(i17)).e()) {
            return 1;
        }
        return super.getItemViewType(i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        kp4.n viewHolder = (kp4.n) k3Var;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        java.lang.Object obj = this.f311135d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        viewHolder.i((kp4.a) obj);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            return new kp4.o(this, new android.view.View(parent.getContext()));
        }
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489601d44, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new kp4.q(this, inflate);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewRecycled(androidx.recyclerview.widget.k3 k3Var) {
        kp4.n holder = (kp4.n) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewRecycled(holder);
        holder.j();
    }

    public final kp4.a x(int i17) {
        java.lang.Object obj = this.f311135d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (kp4.a) obj;
    }

    public final void y(int i17) {
        if (i17 != this.f311138g) {
            java.util.LinkedList linkedList = this.f311135d;
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                if (((kp4.a) it.next()).f311079i == this.f311138g) {
                    break;
                }
            }
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                if (((kp4.a) it6.next()).f311079i == i17) {
                    break;
                }
            }
            this.f311138g = i17;
            notifyDataSetChanged();
        }
    }

    public final void z(java.util.List tracks) {
        int i17;
        kotlin.jvm.internal.o.g(tracks, "tracks");
        java.util.LinkedList linkedList = this.f311135d;
        linkedList.clear();
        linkedList.addAll(tracks);
        java.util.Iterator it = linkedList.iterator();
        int i18 = 0;
        while (true) {
            i17 = -1;
            if (!it.hasNext()) {
                i18 = -1;
                break;
            } else if (((kp4.a) it.next()).e()) {
                break;
            } else {
                i18++;
            }
        }
        this.f311136e = i18 + 1;
        java.util.ListIterator listIterator = linkedList.listIterator(linkedList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            } else if (((kp4.a) listIterator.previous()).e()) {
                i17 = listIterator.nextIndex();
                break;
            }
        }
        this.f311137f = i17 - 1;
    }
}
