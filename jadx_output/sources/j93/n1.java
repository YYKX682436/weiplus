package j93;

/* loaded from: classes.dex */
public final class n1 extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f298460d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f298461e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f298462f;

    public n1(androidx.appcompat.app.AppCompatActivity activity, java.lang.String labelId) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(labelId, "labelId");
        this.f298460d = activity;
        this.f298461e = labelId;
        new java.util.ArrayList();
        this.f298462f = new java.util.ArrayList();
        jz5.h.b(j93.m1.f298439d);
        new java.util.HashSet();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f298462f;
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
                if (z3Var.r2()) {
                    ti5.d dVar2 = new ti5.d(null, null, 0, 0, 0, 0, null, false, 255, null);
                    ri5.h hVar = ri5.j.I;
                    java.lang.String d17 = z3Var.d1();
                    kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                    int i19 = ri5.j.Z;
                    dVar.f463149c.add(ti5.d.f419663i.b(this.f298460d, hVar.a(d17, i19, 0), z3Var, i19, dVar2));
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
        java.util.ArrayList P1 = b93.r.wi().P1(this.f298461e);
        if (P1 != null) {
            java.util.ArrayList arrayList = this.f298462f;
            arrayList.clear();
            arrayList.addAll(P1);
        }
    }
}
