package qi5;

/* loaded from: classes.dex */
public final class d extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f363810d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f363811e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f363812f;

    public d(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f363810d = activity;
        jz5.h.b(qi5.a.f363794d);
        this.f363811e = new java.util.ArrayList();
        this.f363812f = kz5.p0.f313996d;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        j75.f stateCenter;
        wi5.n0 n0Var;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        java.util.ArrayList arrayList = this.f363811e;
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
            java.util.List d17 = g95.x.f269827a.d(kz5.p0.f313996d, arrayList2);
            java.util.Map d18 = d75.b.d(g95.e.f269801a.f(arrayList2), qi5.c.f363809d);
            int d19 = kz5.b1.d(kz5.d0.q(d17, 10));
            if (d19 < 16) {
                d19 = 16;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d19);
            java.util.Iterator it = ((java.util.ArrayList) d17).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                linkedHashMap.put(((com.tencent.mm.storage.l4) next).h1(), next);
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                java.lang.String str = (java.lang.String) it6.next();
                com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) ((java.util.LinkedHashMap) d18).get(str);
                if (z3Var == null) {
                    z3Var = new com.tencent.mm.storage.z3(str);
                }
                boolean z17 = linkedHashMap.get(str) != null;
                vi5.a aVar = new vi5.a(z17, z17 ? java.lang.System.currentTimeMillis() : 0L);
                ri5.h hVar = ri5.j.I;
                int i19 = ri5.j.Z;
                java.lang.String a17 = hVar.a(str, i19, 0);
                java.lang.String g27 = z3Var.g2();
                kotlin.jvm.internal.o.d(g27);
                ri5.j jVar = new ri5.j(a17, i19, str, g27, aVar, 0, 32, null);
                androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f363810d;
                if ((appCompatActivity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) && (stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) appCompatActivity).getStateCenter()) != null && (n0Var = (wi5.n0) stateCenter.getState()) != null) {
                    jVar.f396127x = n0Var.e();
                    java.lang.String str2 = jVar.f396111f;
                    jVar.f396126w = n0Var.f(str2);
                    jVar.f396125v = n0Var.d(str2);
                }
                dVar.f463149c.add(jVar);
            }
        }
        v65.i.b(scope, null, new qi5.b(b17, dVar, null), 1, null);
        return b17;
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.List list;
        java.util.ArrayList arrayList = this.f363811e;
        arrayList.clear();
        android.content.Intent intent = this.f363810d.getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("already_select_contact") : null;
        if (stringExtra != null) {
            java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
            list = new java.util.ArrayList();
            for (java.lang.Object obj : f07) {
                if (((java.lang.String) obj).length() > 0) {
                    list.add(obj);
                }
            }
        } else {
            list = kz5.p0.f313996d;
        }
        this.f363812f = list;
        if (list.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Forward.ClawBotDataSource", "onCreate no clawbot usernames provided");
            return;
        }
        jz5.g gVar = px.g.f358747a;
        java.util.List usernames = this.f363812f;
        kotlin.jvm.internal.o.g(usernames, "usernames");
        arrayList.addAll(kz5.n0.F0(usernames, px.f.f358746d));
        com.tencent.mars.xlog.Log.i("MicroMsg.Forward.ClawBotDataSource", "onCreate clawBotConversationListSize=" + arrayList.size());
    }
}
