package j93;

/* loaded from: classes.dex */
public final class t2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.v2 f298505d;

    public t2(int i17, j93.v2 v2Var) {
        this.f298505d = v2Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList;
        j75.f stateCenter;
        if (menuItem.getItemId() == 1) {
            j93.v2 v2Var = this.f298505d;
            v2Var.f298523m = true;
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = v2Var.P6();
            if (P6 != null && (stateCenter = P6.getStateCenter()) != null) {
                stateCenter.B3(new wi5.b());
            }
            java.util.ArrayList arrayList2 = v2Var.f298518e;
            int size = arrayList2.size();
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) v2Var.f298517d).getValue()).k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            int size2 = (a17 == null || (arrayList = a17.f152065o) == null) ? 0 : arrayList.size();
            b93.q.f18605a.a(1, 2, 1, 23, v2Var.f298519f, v2Var.T6(), 0, size, size2, size2 - size);
            v2Var.f298522i = 0;
            v2Var.f298521h = 0;
            v2Var.f298520g = false;
            java.lang.String stringExtra = v2Var.getIntent().getStringExtra("label_id");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (arrayList2.size() > 0) {
                arrayList2.size();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    kotlin.jvm.internal.o.e(next, "null cannot be cast to non-null type kotlin.String");
                    java.lang.String str = (java.lang.String) next;
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
                    if (n17 != null) {
                        java.lang.String D0 = n17.D0();
                        java.lang.String c17 = b93.n.c(D0, stringExtra);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SelectLabelRemoveContactUIC", "username:%s labels:%s mixLabelIds:%s", str, D0, c17);
                        if (!r26.i0.p(c17, D0, true)) {
                            r45.gw6 gw6Var = new r45.gw6();
                            gw6Var.f375581d = str;
                            gw6Var.f375582e = c17;
                            linkedList.add(gw6Var);
                        }
                        f0Var = jz5.f0.f302826a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.SelectLabelRemoveContactUIC", "doUpdateContactList: contact is null");
                    }
                }
                if (linkedList.size() > 0) {
                    androidx.appcompat.app.AppCompatActivity activity = v2Var.getActivity();
                    kotlin.jvm.internal.o.g(activity, "activity");
                    v2Var.f298524n = ((cj5.o) pf5.z.f353948a.a(activity).a(cj5.o.class)).T6();
                    r45.ip4 ip4Var = new r45.ip4();
                    ip4Var.f377256e = linkedList;
                    ip4Var.f377255d = linkedList.size();
                    ip4Var.b().l().K(new j93.q2(v2Var, ip4Var));
                }
            }
        }
    }
}
