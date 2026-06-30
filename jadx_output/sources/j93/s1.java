package j93;

/* loaded from: classes.dex */
public final class s1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f298494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j93.w1 f298495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.z f298496f;

    public s1(java.util.HashMap hashMap, j93.w1 w1Var, wi5.z zVar) {
        this.f298494d = hashMap;
        this.f298495e = w1Var;
        this.f298496f = zVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.storage.z3 n17;
        p13.v vVar = (p13.v) obj;
        java.lang.Integer num = new java.lang.Integer(0);
        java.util.HashMap hashMap = this.f298494d;
        hashMap.put(num, vVar);
        j93.w1 w1Var = this.f298495e;
        j75.f Q6 = w1Var.Q6();
        if (Q6 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List list = vVar.f351160e;
            if (list != null) {
                int i17 = 0;
                for (java.lang.Object obj2 : list) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str = ((p13.y) obj2).f351187e;
                    if (!x51.t1.b(str) && ((java.util.List) ((jz5.n) w1Var.f298530g).getValue()).contains(str) && (n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true)) != null && !n17.s2()) {
                        ti5.d dVar = new ti5.d(null, null, 0, 0, 0, 0, null, false, 255, null);
                        ri5.h hVar = ri5.j.I;
                        int i19 = ri5.j.W;
                        kotlin.jvm.internal.o.d(str);
                        arrayList.add(ti5.d.f419663i.b(w1Var.getActivity(), hVar.a(str, i19, 0), n17, ri5.j.Z, dVar));
                    }
                    i17 = i18;
                }
            }
            Q6.B3(new wi5.v(this.f298496f, hashMap, arrayList));
        }
        return jz5.f0.f302826a;
    }
}
