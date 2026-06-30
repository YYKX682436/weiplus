package qi5;

/* loaded from: classes.dex */
public final class w extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f363847d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f363848e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f363849f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashSet f363850g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f363851h;

    public w(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f363847d = activity;
        this.f363848e = jz5.h.b(qi5.r.f363840d);
        this.f363849f = new java.util.ArrayList();
        this.f363850g = new java.util.HashSet();
        this.f363851h = jz5.h.b(new qi5.v(this));
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        vi5.f fVar;
        ri5.j a17;
        j75.f stateCenter;
        wi5.n0 n0Var;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        java.util.ArrayList arrayList = this.f363849f;
        int size = arrayList.size();
        int i17 = request.f463144b;
        if (i17 < size) {
            int size2 = arrayList.size();
            int i18 = request.f463145c + i17;
            if (size2 > i18) {
                dVar.f463148b = true;
            } else {
                i18 = arrayList.size();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (i17 < i18) {
                arrayList2.add(arrayList.get(i17));
                i17++;
            }
            java.util.List d17 = g95.x.f269827a.d(kz5.c0.i(dm.i2.L, dm.i2.Q, dm.i2.T), arrayList2);
            java.util.Map d18 = d75.b.d(g95.e.f269801a.f(arrayList2), qi5.t.f363844d);
            java.util.Iterator it = ((java.util.ArrayList) d17).iterator();
            int i19 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) next;
                com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) ((java.util.LinkedHashMap) d18).get(l4Var.h1());
                if (z3Var == null) {
                    z3Var = new com.tencent.mm.storage.z3(l4Var.h1());
                }
                com.tencent.mm.storage.z3 z3Var2 = z3Var;
                boolean J2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().J(l4Var);
                java.lang.String h17 = l4Var.h1();
                kotlin.jvm.internal.o.f(h17, "getUsername(...)");
                boolean b18 = kotlin.jvm.internal.o.b(h17, "message_fold");
                androidx.appcompat.app.AppCompatActivity activity = this.f363847d;
                if (b18) {
                    com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity = activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity ? (com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity : null;
                    fVar = new vi5.d(l4Var.w0(), l4Var.G0(), null, null, 0, 0, J2, (baseMvvmActivity == null || (stateCenter = baseMvvmActivity.getStateCenter()) == null || (n0Var = (wi5.n0) stateCenter.getState()) == null) ? false : n0Var.f446322r, f(), 60, null);
                } else {
                    fVar = new vi5.f(l4Var.w0(), l4Var.G0(), null, null, 0, 0, J2, 60, null);
                }
                vi5.f fVar2 = fVar;
                java.lang.String h18 = l4Var.h1();
                kotlin.jvm.internal.o.f(h18, "getUsername(...)");
                int i28 = kotlin.jvm.internal.o.b(h18, "message_fold") ? ri5.j.f396106p0 : ri5.j.Z;
                ri5.h hVar = ri5.j.I;
                int i29 = ri5.j.Z;
                java.lang.String d19 = z3Var2.d1();
                kotlin.jvm.internal.o.f(d19, "getUsername(...)");
                java.lang.String id6 = hVar.a(d19, i28, 0);
                java.util.Set set = c01.e2.f37117a;
                boolean z17 = set != null && ((java.util.HashSet) set).contains(l4Var.h1());
                vi5.e eVar = vi5.f.f437620h;
                if (z17) {
                    kotlin.jvm.internal.o.g(activity, "activity");
                    kotlin.jvm.internal.o.g(id6, "id");
                    a17 = eVar.a(activity, id6, z3Var2, i28, fVar2, i29);
                    a17.f396129z = true;
                    a17.A = true;
                } else {
                    a17 = eVar.a(this.f363847d, id6, z3Var2, i28, fVar2, i29);
                }
                dVar.f463149c.add(a17);
                i19 = i27;
            }
        }
        v65.i.b(scope, null, new qi5.s(b17, dVar, null), 1, null);
        return b17;
    }

    public final java.util.List d(java.util.List list) {
        java.util.List b17 = g95.e.f269801a.b(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            java.lang.String str = (java.lang.String) next;
            boolean z17 = false;
            if (!this.f363850g.contains(str) && !r26.n0.D(str, ",", false, 2, null)) {
                z17 = true;
            }
            if (z17) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final jm0.l e() {
        return (jm0.l) ((jz5.n) this.f363848e).getValue();
    }

    public final int f() {
        j75.f stateCenter;
        wi5.n0 n0Var;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f363847d;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity = appCompatActivity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity ? (com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) appCompatActivity : null;
        if (baseMvvmActivity == null || (stateCenter = baseMvvmActivity.getStateCenter()) == null || (n0Var = (wi5.n0) stateCenter.getState()) == null) {
            return 0;
        }
        return n0Var.f446323s;
    }

    @Override // ym3.f
    public int getPriority() {
        return 0;
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.List V0;
        j75.f stateCenter;
        java.util.ArrayList arrayList = this.f363849f;
        arrayList.clear();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        jz5.g gVar = this.f363851h;
        if (((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue()) {
            p75.n0 n0Var = dm.i2.K;
            p75.d dVar = dm.i2.L;
            p75.i0 g17 = n0Var.g(kz5.b0.c(dVar));
            p75.d dVar2 = dm.i2.W;
            g17.f352657d = dVar2.m();
            g17.f352659f = kz5.b0.c(new g95.v());
            java.util.List l17 = g17.a().l(e().Q4());
            p75.i0 g18 = n0Var.g(kz5.c0.i(dVar, dm.i2.T));
            g18.f352657d = dVar2.m().c(dm.i2.M.o(0));
            g18.f352659f = kz5.b0.c(new g95.v());
            java.util.List k17 = g18.a().k(e().Q4(), com.tencent.mm.storage.l4.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) k17).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().J((com.tencent.mm.storage.l4) next)) {
                    arrayList2.add(next);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((com.tencent.mm.storage.l4) it6.next()).h1());
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it7 = ((java.util.ArrayList) l17).iterator();
            while (it7.hasNext()) {
                java.lang.Object next2 = it7.next();
                if (!arrayList3.contains((java.lang.String) next2)) {
                    arrayList4.add(next2);
                }
            }
            java.util.List b17 = g95.x.f269827a.b();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.addAll(b17);
            arrayList5.addAll(arrayList3);
            int size = ((java.util.ArrayList) d(arrayList5)).size();
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f363847d;
            wi5.n0 n0Var2 = null;
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity = appCompatActivity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity ? (com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) appCompatActivity : null;
            if (baseMvvmActivity != null && (stateCenter = baseMvvmActivity.getStateCenter()) != null) {
                n0Var2 = (wi5.n0) stateCenter.getState();
            }
            if (n0Var2 != null) {
                n0Var2.f446323s = size;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactDataSource", "getTotalConversationNames() called initFoldCount:" + f());
            V0 = kz5.n0.V0(arrayList4);
        } else {
            p75.i0 g19 = dm.i2.K.g(kz5.b0.c(dm.i2.L));
            p75.d dVar3 = dm.i2.W;
            g19.f352657d = dVar3.m().d(dVar3.j("message_fold"));
            g19.f352659f = kz5.b0.c(new g95.v());
            V0 = g19.a().l(e().Q4());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactDataSource", "getTotalConversationNames() called cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " isPlaceTopFoldStatus:" + ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue());
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.addAll(d(new java.util.ArrayList(V0)));
        arrayList.add("message_fold");
        arrayList.addAll(arrayList6);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactDataSource", "onCreate blockList=" + this.f363850g + " contactListSize=" + arrayList.size() + " isPlaceTopFoldStatus：" + ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue() + " initFoldCount:" + f());
    }
}
