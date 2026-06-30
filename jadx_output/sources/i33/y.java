package i33;

/* loaded from: classes10.dex */
public final class y implements u23.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i33.a0 f288289a;

    public y(i33.a0 a0Var) {
        this.f288289a = a0Var;
    }

    @Override // u23.p
    public void a(java.util.List deleted, boolean z17) {
        java.util.Set set;
        java.util.List list;
        java.util.List list2;
        kotlin.jvm.internal.o.g(deleted, "deleted");
        i33.a0 a0Var = this.f288289a;
        android.app.Activity context = a0Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((i33.b1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(i33.b1.class)).f288162g.B = deleted.size();
        a0Var.getClass();
        java.util.Set X0 = kz5.n0.X0(deleted);
        if (deleted.isEmpty()) {
            return;
        }
        yz5.a aVar = a0Var.f288145g;
        e33.b0 b0Var = aVar != null ? (e33.b0) aVar.invoke() : null;
        java.lang.String str = a0Var.f288144f;
        if (b0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "removeDeleted: failed");
            return;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i(str, "removeDeleted: skip refreshUI");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = (java.util.ArrayList) a0Var.f288149n;
        java.util.ListIterator listIterator = arrayList.listIterator();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        while (listIterator.hasNext()) {
            v23.b bVar = (v23.b) listIterator.next();
            boolean removeAll = kotlin.jvm.internal.m0.a(bVar.f432887b).removeAll(X0);
            if (kotlin.jvm.internal.o.b(bVar.f432886a, a0Var.X6())) {
                v23.b bVar2 = a0Var.f288151p;
                if (kotlin.jvm.internal.o.b(bVar.f432888c, bVar2 != null ? bVar2.f432888c : null) && removeAll) {
                    c0Var.f310112d = true;
                    v23.b bVar3 = a0Var.f288151p;
                    if (bVar3 != null && (list2 = bVar3.f432887b) != null) {
                        list2.size();
                    }
                }
            }
            if (bVar.f432887b.isEmpty() && arrayList.size() > 1) {
                listIterator.remove();
            }
        }
        java.util.ArrayList arrayList2 = b0Var.f247131g;
        kotlin.jvm.internal.o.f(arrayList2, "getSelectedMediaItems(...)");
        java.util.Set d07 = kz5.n0.d0(arrayList2, X0);
        v23.b bVar4 = a0Var.f288151p;
        boolean z18 = false;
        boolean z19 = (bVar4 != null && (list = bVar4.f432887b) != null && list.isEmpty()) && (arrayList.isEmpty() ^ true);
        if (!z19 && (c0Var.f310112d || (!d07.isEmpty()))) {
            z18 = true;
        }
        if (z18) {
            java.util.ArrayList arrayList3 = b0Var.f247130f;
            kotlin.jvm.internal.o.f(arrayList3, "getAllMediaItems(...)");
            set = kz5.n0.d0(arrayList3, X0);
        } else {
            set = kz5.r0.f314002d;
        }
        com.tencent.mars.xlog.Log.i(str, "removeDeleted: " + d07.size() + ", " + set.size() + ", " + java.lang.Thread.currentThread().getName() + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
        t23.p0.n().c(new i33.z(a0Var, d07, z19, z18, set, c0Var));
    }
}
