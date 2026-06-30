package ym3;

/* loaded from: classes.dex */
public final class k implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym3.d f463162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym3.n f463163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym3.c f463164f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f463165g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.i f463166h;

    public k(ym3.d dVar, ym3.n nVar, ym3.c cVar, kotlinx.coroutines.flow.i2 i2Var, v65.i iVar) {
        this.f463162d = dVar;
        this.f463163e = nVar;
        this.f463164f = cVar;
        this.f463165g = i2Var;
        this.f463166h = iVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Object emit;
        ym3.d dVar = (ym3.d) obj;
        ym3.d dVar2 = this.f463162d;
        dVar2.f463149c.addAll(dVar.f463149c);
        dVar2.f463148b = true;
        boolean z17 = dVar.f463148b;
        jz5.f0 f0Var = jz5.f0.f302826a;
        kotlinx.coroutines.flow.i2 i2Var = this.f463165g;
        if (z17) {
            emit = i2Var.emit(dVar2, continuation);
            if (emit != pz5.a.f359186d) {
                return f0Var;
            }
        } else {
            ym3.n nVar = this.f463163e;
            int i17 = nVar.f463175e + 1;
            nVar.f463175e = i17;
            java.util.HashMap hashMap = nVar.f463176f;
            boolean containsKey = hashMap.containsKey(new java.lang.Integer(i17));
            ym3.c cVar = this.f463164f;
            if (!containsKey) {
                hashMap.put(new java.lang.Integer(nVar.f463175e), new java.lang.Integer(cVar.f463144b + dVar.f463149c.size()));
            }
            java.util.ArrayList arrayList = dVar2.f463149c;
            if (arrayList.size() >= cVar.f463145c) {
                emit = i2Var.emit(dVar2, continuation);
                if (emit != pz5.a.f359186d) {
                    return f0Var;
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.MergeDataSource", "continue to request next datasource:" + nVar.f463175e);
                emit = ym3.n.d(this.f463163e, this.f463166h, new ym3.c(cVar.f463143a, 0, cVar.f463145c - arrayList.size(), null, 8, null), this.f463162d, this.f463165g, continuation);
                if (emit != pz5.a.f359186d) {
                    return f0Var;
                }
            }
        }
        return emit;
    }
}
