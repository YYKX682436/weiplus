package zj3;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f473301a = new java.util.ArrayList();

    public final void a() {
        java.util.List list = this.f473301a;
        jz5.l lVar = (jz5.l) kz5.n0.k0(list);
        if (lVar != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
        }
    }

    public final void b() {
        ((java.util.ArrayList) this.f473301a).add(new jz5.l(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 0L));
    }

    public final void c() {
        jz5.l lVar = (jz5.l) kz5.n0.k0(this.f473301a);
        boolean z17 = false;
        if (lVar != null && ((java.lang.Number) lVar.f302834e).longValue() == 0) {
            z17 = true;
        }
        if (z17) {
            a();
        }
    }

    public final java.lang.String d() {
        return kz5.n0.g0(this.f473301a, ";", null, null, 0, null, zj3.e.f473300d, 30, null);
    }

    public final long e() {
        long j17 = 0;
        for (jz5.l lVar : this.f473301a) {
            long longValue = ((java.lang.Number) lVar.f302834e).longValue();
            java.lang.Object obj = lVar.f302833d;
            j17 += longValue > ((java.lang.Number) obj).longValue() ? ((java.lang.Number) lVar.f302834e).longValue() - ((java.lang.Number) obj).longValue() : 0L;
        }
        return j17 / 1000;
    }
}
