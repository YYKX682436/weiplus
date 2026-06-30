package st2;

/* loaded from: classes3.dex */
public final class r2 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f412435a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f412436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f412437c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f412438d;

    public r2(tt2.e1 e1Var, r45.qt2 qt2Var, gk2.e eVar) {
        this.f412436b = e1Var;
        this.f412437c = qt2Var;
        this.f412438d = eVar;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            int adapterPosition = ((androidx.recyclerview.widget.k3) it.next()).getAdapterPosition();
            tt2.e1 e1Var = this.f412436b;
            e1Var.getClass();
            so2.j5 P = e1Var.P(adapterPosition);
            if (P instanceof cm2.m0) {
                java.util.HashSet hashSet = this.f412435a;
                cm2.m0 m0Var = (cm2.m0) P;
                if (!hashSet.contains(java.lang.Long.valueOf(m0Var.f43369w))) {
                    hashSet.add(java.lang.Long.valueOf(m0Var.f43369w));
                    if (h0Var.f310123d == null) {
                        h0Var.f310123d = new java.util.LinkedList();
                    }
                    java.util.LinkedList linkedList = (java.util.LinkedList) h0Var.f310123d;
                    if (linkedList != null) {
                        linkedList.add(java.lang.Long.valueOf(m0Var.f43369w));
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "[onChildExposeChanged] exposed=" + h0Var.f310123d);
        boolean z17 = false;
        if (((java.util.LinkedList) h0Var.f310123d) != null && (!r6.isEmpty())) {
            z17 = true;
        }
        if (z17) {
            pm0.v.O("FinderLiveShoppingListExpose", new st2.q2(h0Var, this, this.f412437c, this.f412438d));
        }
    }
}
