package in5;

/* loaded from: classes2.dex */
public final class f extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Set f293036a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.i f293037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f293038c;

    public f(in5.i iVar, yz5.l lVar) {
        this.f293037b = iVar;
        this.f293038c = lVar;
    }

    @Override // ym5.m0
    public boolean a(androidx.recyclerview.widget.k3 k3Var) {
        kotlin.jvm.internal.o.d(k3Var);
        android.view.View itemView = k3Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        return ((java.lang.Boolean) this.f293038c.invoke(itemView)).booleanValue();
    }

    @Override // ym5.m0
    public float b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return 0.0f;
    }

    @Override // ym5.m0
    public long c(androidx.recyclerview.widget.k3 k3Var) {
        in5.i iVar = this.f293037b;
        return iVar != null ? iVar.b(k3Var) : super.c(k3Var);
    }

    @Override // ym5.m0
    public boolean d() {
        in5.i iVar = this.f293037b;
        if (iVar != null) {
            return true ^ (iVar instanceof com.tencent.mm.plugin.finder.convert.ye);
        }
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        java.lang.Object a17;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        boolean isEmpty = exposedHolders.isEmpty();
        in5.i iVar = this.f293037b;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EasyExposeTimeRecordListener", "current exposed exposeHolders is empty");
            in5.h.a(this.f293036a);
            if (iVar != null) {
                iVar.c(this.f293036a);
            }
            this.f293036a.clear();
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            if (iVar != null && (a17 = iVar.a(k3Var)) != null) {
                in5.e eVar = new in5.e(a17);
                if (!this.f293036a.contains(eVar)) {
                    eVar.f293023b = hq.d.a();
                    eVar.f293026e = k3Var.getAdapterPosition();
                    eVar.f293027f = k3Var.itemView;
                    this.f293036a.add(eVar);
                    com.tencent.mars.xlog.Log.i("MicroMsg.EasyExposeTimeRecordListener", "add new record: " + eVar);
                    iVar.d(eVar);
                }
                hashSet.add(eVar);
            }
        }
        if (this.f293036a.size() > hashSet.size()) {
            java.util.Set g17 = kz5.q1.g(this.f293036a, hashSet);
            com.tencent.mars.xlog.Log.i("MicroMsg.EasyExposeTimeRecordListener", "find diff record: size = " + g17.size());
            in5.h.a(g17);
            if (iVar != null) {
                iVar.c(g17);
            }
            java.util.Set g18 = kz5.q1.g(this.f293036a, g17);
            if (!kotlin.jvm.internal.m0.i(g18)) {
                g18 = null;
            }
            if (g18 != null) {
                this.f293036a = g18;
            }
        }
    }
}
