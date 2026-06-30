package jj5;

/* loaded from: classes.dex */
public final class d extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f300039d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f300040e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f300041f;

    public d(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f300039d = activity;
        jz5.h.b(jj5.a.f300034d);
        this.f300040e = new java.util.ArrayList();
        new java.util.HashSet();
        this.f300041f = new java.util.ArrayList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        ri5.j a17;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        int size = this.f300040e.size();
        java.util.ArrayList arrayList = dVar.f463149c;
        int i17 = request.f463144b;
        if (i17 < size) {
            int size2 = this.f300040e.size();
            int i18 = request.f463145c + i17;
            if (size2 > i18) {
                dVar.f463148b = true;
            } else {
                i18 = this.f300040e.size();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (i17 < i18) {
                arrayList2.add(this.f300040e.get(i17));
                i17++;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectedDataSource", "usernameList=" + arrayList2);
            java.util.Map d17 = d75.b.d(g95.e.f269801a.f(arrayList2), jj5.c.f300038d);
            int i19 = 0;
            for (java.lang.Object obj : arrayList2) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String username = (java.lang.String) obj;
                com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) ((java.util.LinkedHashMap) d17).get(username);
                if (z3Var == null) {
                    z3Var = new com.tencent.mm.storage.z3(username);
                }
                com.tencent.mm.storage.z3 z3Var2 = z3Var;
                vi5.f fVar = new vi5.f(0L, 0L, null, null, 0, 0, false, 60, null);
                kotlin.jvm.internal.o.g(username, "username");
                int i28 = ri5.j.f396105J;
                ri5.h hVar = ri5.j.I;
                int i29 = ri5.j.Z;
                java.lang.String d18 = z3Var2.d1();
                kotlin.jvm.internal.o.f(d18, "getUsername(...)");
                java.lang.String id6 = hVar.a(d18, i28, 0);
                java.util.Set set = c01.e2.f37117a;
                boolean z17 = set != null && ((java.util.HashSet) set).contains(username);
                vi5.e eVar = vi5.f.f437620h;
                if (z17) {
                    androidx.appcompat.app.AppCompatActivity activity = this.f300039d;
                    kotlin.jvm.internal.o.g(activity, "activity");
                    kotlin.jvm.internal.o.g(id6, "id");
                    a17 = eVar.a(activity, id6, z3Var2, i28, fVar, i29);
                    a17.f396129z = true;
                    a17.A = true;
                } else {
                    a17 = eVar.a(this.f300039d, id6, z3Var2, i28, fVar, i29);
                }
                arrayList.add(a17);
                i19 = i27;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectedDataSource", "response.dataList=" + arrayList);
        v65.i.b(scope, null, new jj5.b(b17, dVar, null), 1, null);
        return b17;
    }

    @Override // ym3.f
    public int getPriority() {
        return 0;
    }

    @Override // ym3.f
    public void onCreate() {
        this.f300040e.clear();
        this.f300040e = this.f300041f;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectedDataSource", "conversationList=" + this.f300040e);
    }
}
