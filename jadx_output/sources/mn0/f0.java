package mn0;

/* loaded from: classes5.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f329732d;

    public f0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mn0.f0(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new mn0.f0((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f329732d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("PlayerCountReport", "start report create wait");
            this.f329732d = 1;
            if (kotlinx.coroutines.k1.b(300000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        mn0.g0 g0Var = mn0.i0.H;
        java.util.Map map = mn0.i0.f329740J;
        synchronized (map) {
            hashMap.putAll(map);
            map.clear();
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Map map2 = mn0.i0.K;
        synchronized (map2) {
            hashMap2.putAll(map2);
            map2.clear();
        }
        mn0.e0 e0Var = mn0.e0.f329730d;
        com.tencent.mars.xlog.Log.i("PlayerCountReport", "start createReportMap sum: " + hashMap.size() + " leakReportMap sum: " + hashMap2.size());
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            e0Var.invoke(entry.getKey(), new java.lang.Integer(10), java.lang.String.valueOf(((java.lang.Number) entry.getValue()).intValue()));
            com.tencent.mars.xlog.Log.i("PlayerCountReport", "report create count playScene: " + entry.getKey() + " sum: " + ((java.lang.Number) entry.getValue()).intValue());
        }
        for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
            e0Var.invoke(entry2.getKey(), new java.lang.Integer(11), java.lang.String.valueOf(((java.lang.Number) entry2.getValue()).intValue()));
            com.tencent.mars.xlog.Log.i("PlayerCountReport", "report leak count playScene: " + entry2.getKey() + " sum: " + ((java.lang.Number) entry2.getValue()).intValue());
        }
        return jz5.f0.f302826a;
    }
}
