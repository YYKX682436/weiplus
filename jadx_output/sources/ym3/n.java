package ym3;

/* loaded from: classes.dex */
public final class n extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f463174d;

    /* renamed from: e, reason: collision with root package name */
    public int f463175e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f463176f;

    public n(ym3.f... dataSource) {
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f463174d = arrayList;
        kz5.h0.w(arrayList, dataSource);
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new ym3.m());
        }
        this.f463176f = new java.util.HashMap();
    }

    public static final java.lang.Object d(ym3.n nVar, v65.i iVar, ym3.c cVar, ym3.d dVar, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        java.lang.Object emit;
        ym3.f fVar = (ym3.f) kz5.n0.a0(nVar.f463174d, nVar.f463175e);
        return ((fVar == null || v65.i.b(iVar, null, new ym3.l(fVar, iVar, cVar, dVar, nVar, i2Var, null), 1, null) == null) && (emit = i2Var.emit(dVar, continuation)) == pz5.a.f359186d) ? emit : jz5.f0.f302826a;
    }

    @Override // ym3.a
    public ym3.f b(ym3.f dataSource) {
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f463174d);
        if (dataSource instanceof ym3.n) {
            arrayList.addAll(((ym3.n) dataSource).f463174d);
        } else {
            arrayList.add(dataSource);
        }
        ym3.f[] fVarArr = (ym3.f[]) arrayList.toArray(new ym3.f[0]);
        return new ym3.n((ym3.f[]) java.util.Arrays.copyOf(fVarArr, fVarArr.length));
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getData request:");
        int i17 = request.f463144b;
        sb6.append(i17);
        sb6.append(" dataSourceIndex:");
        sb6.append(this.f463175e);
        sb6.append(" dataSourceSize:");
        sb6.append(this.f463174d.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.MergeDataSource", sb6.toString());
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        java.util.HashMap hashMap = this.f463176f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f463175e);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = 0;
            hashMap.put(valueOf, obj);
        }
        v65.i.b(scope, null, new ym3.j(this, scope, new ym3.c(request.f463143a, i17 - ((java.lang.Number) obj).intValue(), request.f463145c, null, 8, null), new ym3.d(request), b17, null), 1, null);
        return b17;
    }

    @Override // ym3.f
    public void onCreate() {
        this.f463175e = 0;
        java.util.HashMap hashMap = this.f463176f;
        hashMap.clear();
        hashMap.put(0, 0);
        java.util.Iterator it = this.f463174d.iterator();
        while (it.hasNext()) {
            ((ym3.f) it.next()).onCreate();
        }
    }
}
