package in5;

/* loaded from: classes2.dex */
public final class l extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Set f293083a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.p f293084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f293085c;

    public l(in5.p pVar, yz5.l lVar) {
        this.f293084b = pVar;
        this.f293085c = lVar;
    }

    @Override // ym5.m0
    public boolean a(androidx.recyclerview.widget.k3 k3Var) {
        kotlin.jvm.internal.o.d(k3Var);
        android.view.View itemView = k3Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        return ((java.lang.Boolean) this.f293085c.invoke(itemView)).booleanValue();
    }

    @Override // ym5.m0
    public float b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        in5.p pVar = this.f293084b;
        if (pVar != null) {
            return pVar.a(view);
        }
        return 0.0f;
    }

    @Override // ym5.m0
    public long c(androidx.recyclerview.widget.k3 k3Var) {
        if (this.f293084b == null) {
            return super.c(k3Var);
        }
        in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
        in5.c cVar = s0Var != null ? (in5.c) s0Var.f293125i : null;
        in5.c cVar2 = cVar instanceof in5.c ? cVar : null;
        if (cVar2 != null) {
            return cVar2.getItemId();
        }
        return 0L;
    }

    @Override // ym5.m0
    public boolean d() {
        in5.p pVar = this.f293084b;
        if (pVar != null) {
            return pVar.b();
        }
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        boolean isEmpty = exposedHolders.isEmpty();
        in5.p pVar = this.f293084b;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExposeTimeRecordListener", "current exposed exposeHolders is empty");
            in5.o.a(this.f293083a);
            if (pVar != null) {
                pVar.c(this.f293083a);
            }
            this.f293083a.clear();
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList<in5.s0> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : exposedHolders) {
            if (obj instanceof in5.s0) {
                arrayList.add(obj);
            }
        }
        for (in5.s0 s0Var : arrayList) {
            in5.c cVar = (in5.c) s0Var.f293125i;
            if (cVar != null) {
                in5.j jVar = new in5.j(cVar);
                if (!this.f293083a.contains(jVar)) {
                    jVar.f293071b = hq.d.a();
                    jVar.f293074e = s0Var.getAdapterPosition();
                    jVar.f293075f = s0Var.itemView;
                    this.f293083a.add(jVar);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ExposeTimeRecordListener", "add new record: " + jVar);
                    if (pVar != null) {
                        pVar.d(jVar);
                    }
                }
                hashSet.add(jVar);
            }
        }
        if (this.f293083a.size() > hashSet.size()) {
            java.util.Set g17 = kz5.q1.g(this.f293083a, hashSet);
            com.tencent.mars.xlog.Log.i("MicroMsg.ExposeTimeRecordListener", "find diff record: size = " + g17.size());
            in5.o.a(g17);
            if (pVar != null) {
                pVar.c(g17);
            }
            java.util.Set g18 = kz5.q1.g(this.f293083a, g17);
            if (!kotlin.jvm.internal.m0.i(g18)) {
                g18 = null;
            }
            if (g18 != null) {
                this.f293083a = g18;
            }
        }
    }
}
