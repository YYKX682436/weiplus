package dy3;

/* loaded from: classes.dex */
public final class c extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f244575d;

    public c() {
        jz5.h.b(dy3.b.f244574d);
        this.f244575d = new java.util.ArrayList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        int size;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f244575d;
        int size2 = arrayList.size();
        int i17 = request.f463144b;
        if (i17 < size2) {
            int size3 = arrayList.size();
            int i18 = request.f463145c;
            if (size3 > i17 + i18) {
                dVar.f463148b = true;
                size = i18 + i17;
            } else {
                size = arrayList.size();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (i17 < size) {
                arrayList2.add(arrayList.get(i17));
                i17++;
            }
            for (com.tencent.mm.storage.z3 z3Var : g95.e.f269801a.f(arrayList2)) {
                if (((int) z3Var.E2) != 0) {
                    dVar.f463149c.add(new dy3.p(0, z3Var, 2, null, 8, null));
                }
            }
        }
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    @Override // ym3.f
    public int getPriority() {
        return -1;
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.ArrayList arrayList = this.f244575d;
        arrayList.clear();
        android.database.Cursor K = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().K();
        if (K != null) {
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
            while (K.moveToNext()) {
                z3Var.convertFrom(K);
                arrayList.add(z3Var.d1());
            }
            K.close();
        }
        arrayList.remove(c01.z1.r());
        arrayList.remove("blogapp");
        arrayList.remove("tmessage");
        arrayList.remove("officialaccounts");
        arrayList.remove("service_officialaccounts");
        arrayList.remove("BrandEcsTemplateMsg@fakeuser");
        arrayList.remove("helper_entry");
        arrayList.remove("filehelper");
        arrayList.remove("weixin");
    }
}
