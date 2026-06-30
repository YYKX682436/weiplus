package oi5;

/* loaded from: classes.dex */
public final class c extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f345650d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f345651e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f345652f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashSet f345653g;

    public c(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f345650d = activity;
        this.f345651e = jz5.h.b(oi5.b.f345649d);
        this.f345652f = new java.util.ArrayList();
        this.f345653g = new java.util.HashSet();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f345652f;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = dVar.f463149c;
        int i17 = request.f463144b;
        if (i17 < size) {
            int size2 = arrayList.size();
            int i18 = request.f463145c + i17;
            if (size2 > i18) {
                dVar.f463148b = true;
            } else {
                i18 = arrayList.size();
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            while (i17 < i18) {
                arrayList3.add(arrayList.get(i17));
                i17++;
            }
            for (com.tencent.mm.storage.z3 z3Var : g95.e.f269801a.f(arrayList3)) {
                if (((int) z3Var.E2) == 0 || z3Var.s2()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SelectContactDataSource", "contactID:%s, isDeleteContact:%s", java.lang.Integer.valueOf((int) z3Var.E2), java.lang.Boolean.valueOf(z3Var.s2()));
                } else {
                    ti5.d dVar2 = new ti5.d(null, null, 0, 0, 0, 0, null, false, 255, null);
                    ri5.h hVar = ri5.j.I;
                    int i19 = ri5.j.Z;
                    java.lang.String d17 = z3Var.d1();
                    kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                    arrayList2.add(ti5.d.f419663i.b(this.f345650d, hVar.a(d17, i19, 0), z3Var, i19, dVar2));
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactDataSource", "dataList add size:%s", java.lang.Integer.valueOf(arrayList2.size()));
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    @Override // ym3.f
    public int getPriority() {
        return 0;
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.ArrayList arrayList = this.f345652f;
        arrayList.clear();
        boolean a17 = com.tencent.mm.contact.d.f64855g.a();
        g95.d dVar = g95.e.f269801a;
        p75.m c17 = dVar.g().c(a17 ? dm.e2.Y1.l(kz5.b0.c("0")) : dm.e2.P1.t("'%@%'"));
        p75.d dVar2 = dm.e2.P1;
        p75.m c18 = c17.d(dVar2.j("weixin")).c(dm.e2.W1.i(0));
        p75.i0 g17 = dm.e2.N1.g(kz5.b0.c(dVar2));
        g17.f352656c = "MicroMsg.SelectContactDataSource";
        g17.f352657d = c18;
        g17.f352659f = dVar.h();
        for (java.lang.String str : g17.a().l(((jm0.l) ((jz5.n) this.f345651e).getValue()).Q4())) {
            if (!this.f345653g.contains(str)) {
                arrayList.add(str);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactDataSource", "onCreate blockList=" + this.f345653g + " contactListSize=" + arrayList.size());
    }
}
