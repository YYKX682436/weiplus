package qi5;

/* loaded from: classes.dex */
public final class q extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f363836d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f363837e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f363838f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashSet f363839g;

    public q(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f363836d = activity;
        this.f363837e = jz5.h.b(qi5.n.f363831d);
        this.f363838f = new java.util.ArrayList();
        this.f363839g = new java.util.HashSet();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        ri5.j a17;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        java.util.ArrayList arrayList = this.f363838f;
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
            java.util.Map d18 = d75.b.d(g95.e.f269801a.f(arrayList2), qi5.p.f363835d);
            int i19 = 0;
            for (java.lang.Object obj : d17) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) obj;
                com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) ((java.util.LinkedHashMap) d18).get(l4Var.h1());
                if (z3Var == null) {
                    z3Var = new com.tencent.mm.storage.z3(l4Var.h1());
                }
                com.tencent.mm.storage.z3 z3Var2 = z3Var;
                vi5.f fVar = new vi5.f(l4Var.w0(), l4Var.G0(), null, null, 0, 0, false, 124, null);
                ri5.h hVar = ri5.j.I;
                int i28 = ri5.j.Z;
                java.lang.String d19 = z3Var2.d1();
                kotlin.jvm.internal.o.f(d19, "getUsername(...)");
                java.lang.String id6 = hVar.a(d19, i28, 0);
                java.util.Set set = c01.e2.f37117a;
                boolean z17 = set != null && ((java.util.HashSet) set).contains(l4Var.h1());
                vi5.e eVar = vi5.f.f437620h;
                if (z17) {
                    int i29 = (32 & 32) != 0 ? i28 : 0;
                    androidx.appcompat.app.AppCompatActivity activity = this.f363836d;
                    kotlin.jvm.internal.o.g(activity, "activity");
                    kotlin.jvm.internal.o.g(id6, "id");
                    a17 = eVar.a(activity, id6, z3Var2, i28, fVar, i29);
                    a17.f396129z = true;
                    a17.A = true;
                } else {
                    a17 = eVar.a(this.f363836d, id6, z3Var2, i28, fVar, (r14 & 32) != 0 ? i28 : 0);
                }
                dVar.f463149c.add(a17);
                i19 = i27;
            }
        }
        v65.i.b(scope, null, new qi5.o(b17, dVar, null), 1, null);
        return b17;
    }

    @Override // ym3.f
    public int getPriority() {
        return 0;
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.ArrayList arrayList = this.f363838f;
        arrayList.clear();
        p75.i0 g17 = dm.i2.K.g(kz5.b0.c(dm.i2.L));
        p75.d dVar = dm.i2.W;
        g17.f352657d = dVar.m().d(dVar.j("message_fold"));
        g17.f352659f = kz5.b0.c(new g95.v());
        java.util.List l17 = g17.a().l(((jm0.l) ((jz5.n) this.f363837e).getValue()).Q4());
        java.util.Iterator it = ((java.util.ArrayList) l17).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (r26.n0.D(str, "@", false, 2, null)) {
                if (com.tencent.mm.storage.z3.m4(str)) {
                    arrayList.add(str);
                }
                it.remove();
            }
        }
        for (java.lang.String str2 : g95.e.f269801a.b(l17)) {
            if (!this.f363839g.contains(str2) && !r26.n0.D(str2, ",", false, 2, null)) {
                arrayList.add(str2);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentContactConversationDataSource", "onCreate blockList=" + this.f363839g + " contactListSize=" + arrayList.size());
    }
}
