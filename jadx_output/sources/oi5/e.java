package oi5;

/* loaded from: classes.dex */
public final class e extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f345655d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f345656e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f345657f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashSet f345658g;

    public e(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f345655d = activity;
        this.f345656e = new java.util.ArrayList();
        this.f345657f = jz5.h.b(oi5.d.f345654d);
        this.f345658g = new java.util.HashSet();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        androidx.appcompat.app.AppCompatActivity activity = this.f345655d;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(cj5.j1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f345656e;
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
            for (com.tencent.mm.storage.z3 z3Var : g95.e.f269801a.f(arrayList2)) {
                if (((int) z3Var.E2) != 0) {
                    ti5.d dVar2 = new ti5.d(null, null, 0, 0, 0, 32, null, false, 223, null);
                    ri5.h hVar = ri5.j.I;
                    int i19 = ri5.j.Y;
                    java.lang.String d17 = z3Var.d1();
                    kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                    dVar.f463149c.add(ti5.d.f419663i.b(this.f345655d, hVar.a(d17, i19, 0), z3Var, i19, dVar2));
                }
            }
        }
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    @Override // ym3.f
    public int getPriority() {
        return 1;
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.ArrayList arrayList = this.f345656e;
        arrayList.clear();
        boolean booleanExtra = this.f345655d.getIntent().getBooleanExtra("KBlockOpenImFav", true);
        p75.m g17 = dm.e2.T1.g(64, 64);
        g95.d dVar = g95.e.f269801a;
        p75.m c17 = g17.c(dVar.g());
        if (booleanExtra) {
            c17 = c17.c(com.tencent.mm.contact.d.f64855g.a() ? dm.e2.Y1.q(65536L) : dm.e2.P1.t("'%@openim'"));
        }
        p75.i0 g18 = dm.e2.N1.g(kz5.b0.c(dm.e2.P1));
        g18.f352656c = "MicroMsg.SelectContactFavorDataSource";
        g18.f352657d = c17;
        g18.f352659f = dVar.h();
        for (java.lang.String str : g18.a().l(((jm0.l) ((jz5.n) this.f345657f).getValue()).Q4())) {
            if (!this.f345658g.contains(str)) {
                arrayList.add(str);
            }
        }
    }
}
