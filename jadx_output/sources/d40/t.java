package d40;

@j95.b
/* loaded from: classes12.dex */
public final class t extends jm0.o implements e40.c0 {
    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(f40.v.class);
    }

    public void Zi(java.util.Collection requests, yz5.p pVar) {
        kotlin.jvm.internal.o.g(requests, "requests");
        if (!jm0.g.class.isAssignableFrom(f40.v.class)) {
            throw new java.lang.IllegalArgumentException(d40.t.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(f40.v.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        f40.v vVar = (f40.v) ((jm0.g) a17);
        java.lang.Integer valueOf = pVar != null ? java.lang.Integer.valueOf(pVar.hashCode()) : null;
        kz5.n0.g0(requests, ",", null, null, 0, null, f40.p.f259445d, 30, null);
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) vVar.f259464f).getValue(), null, new f40.r(requests, valueOf, vVar, pVar, null), 1, null);
    }

    public void aj(java.util.Collection fileIdBatch) {
        kotlin.jvm.internal.o.g(fileIdBatch, "fileIdBatch");
        if (!jm0.g.class.isAssignableFrom(f40.v.class)) {
            throw new java.lang.IllegalArgumentException(d40.t.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(f40.v.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        kz5.n0.g0(fileIdBatch, ",", null, null, 0, null, null, 62, null);
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) ((f40.v) ((jm0.g) a17)).f259464f).getValue(), null, new f40.s(fileIdBatch, null), 1, null);
    }

    public java.util.Map bj(java.util.Collection fileIdBatch) {
        e40.b0 b0Var;
        kotlin.jvm.internal.o.g(fileIdBatch, "fileIdBatch");
        if (!jm0.g.class.isAssignableFrom(f40.v.class)) {
            throw new java.lang.IllegalArgumentException(d40.t.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(f40.v.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        java.util.Collection collection = fileIdBatch;
        kz5.n0.g0(collection, ",", null, null, 0, null, null, 62, null);
        lm.o oVar = (lm.o) ((jz5.n) ((lm.r) ((w65.n) i95.n0.c(w65.n.class))).f319331o).getValue();
        int d17 = kz5.b1.d(kz5.d0.q(collection, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj : collection) {
            java.lang.Float f17 = (java.lang.Float) oVar.get((java.lang.String) obj);
            if (f17 != null) {
                float floatValue = f17.floatValue();
                b0Var = new e40.b0();
                b0Var.f247612a = e40.a0.f247604g;
                b0Var.f247613b = java.lang.Float.valueOf(floatValue);
            } else {
                b0Var = new e40.b0();
            }
            linkedHashMap.put(obj, b0Var);
        }
        return linkedHashMap;
    }
}
