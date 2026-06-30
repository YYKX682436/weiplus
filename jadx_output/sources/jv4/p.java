package jv4;

/* loaded from: classes12.dex */
public final class p extends androidx.recyclerview.widget.f2 implements jv4.i {

    /* renamed from: d, reason: collision with root package name */
    public final jv4.k f302261d;

    /* renamed from: e, reason: collision with root package name */
    public final jv4.f f302262e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f302263f;

    public p(jv4.k boxMgr, jv4.f uicDelegate) {
        kotlin.jvm.internal.o.g(boxMgr, "boxMgr");
        kotlin.jvm.internal.o.g(uicDelegate, "uicDelegate");
        this.f302261d = boxMgr;
        this.f302262e = uicDelegate;
        this.f302263f = kz5.p0.f313996d;
        boxMgr.f302241a.c(this);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f302261d.a()).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        jv4.m type;
        jv4.n nVar = (jv4.n) kz5.n0.a0(this.f302261d.a(), i17);
        if (nVar != null && (type = nVar.getType()) != null) {
            return type.f302258d;
        }
        jv4.l lVar = jv4.m.f302242e;
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        jv4.n nVar = (jv4.n) kz5.n0.a0(this.f302261d.a(), i17);
        if (nVar != null) {
            nVar.c(holder);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(parent, "parent");
        jv4.h hVar = this.f302261d.f302241a;
        jv4.m.f302242e.getClass();
        java.util.Iterator it = ((kz5.h) jv4.m.f302257w).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jv4.m) obj).f302258d == i17) {
                break;
            }
        }
        jv4.m mVar = (jv4.m) obj;
        if (mVar == null) {
            mVar = jv4.m.f302243f;
        }
        return hVar.a(parent, mVar);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewRecycled(androidx.recyclerview.widget.k3 holder) {
        android.view.ViewParent parent;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder.itemView.isAttachedToWindow() && (parent = holder.itemView.getParent()) != null && (parent instanceof android.view.ViewGroup)) {
            ((android.view.ViewGroup) parent).removeView(holder.itemView);
        }
        super.onViewRecycled(holder);
    }

    public org.json.JSONObject x() {
        return ((jv4.e) this.f302262e).f302235a.d();
    }

    public void y(boolean z17) {
        if (z17) {
            this.f302263f = kz5.p0.f313996d;
            notifyDataSetChanged();
            return;
        }
        java.util.List<jv4.n> a17 = this.f302261d.a();
        androidx.recyclerview.widget.c0 a18 = androidx.recyclerview.widget.h0.a(new jv4.o(this.f302263f, a17), true);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        for (jv4.n nVar : a17) {
            arrayList.add(new mv4.g(nVar.v(), nVar.getType()));
        }
        this.f302263f = arrayList;
        a18.b(this);
    }
}
