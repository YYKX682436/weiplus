package yn1;

/* loaded from: classes11.dex */
public final class c3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f463628f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f463629g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f463630h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f463631i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(yn1.a4 a4Var, java.lang.String str, long j17, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463626d = a4Var;
        this.f463627e = str;
        this.f463628f = j17;
        this.f463629g = arrayList;
        this.f463630h = arrayList2;
        this.f463631i = arrayList3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.c3(this.f463626d, this.f463627e, this.f463628f, this.f463629g, this.f463630h, this.f463631i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.c3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yn1.a4 a4Var = this.f463626d;
        yn1.a4.a(a4Var);
        xn1.k kVar = new xn1.k();
        co1.g gVar = co1.g.f43768a;
        java.lang.String str = this.f463627e;
        boolean b17 = gVar.b(str);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!b17) {
            com.tencent.wechat.aff.migration.a aVar2 = a4Var.f463609d;
            if (aVar2 != null) {
                aVar2.m(this.f463628f, 0L, new java.util.ArrayList());
            }
            return f0Var;
        }
        java.lang.String str2 = a4Var.f463606a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[filterRestoreMediaAsync] taskId=");
        long j17 = this.f463628f;
        sb6.append(j17);
        sb6.append(", convId=");
        sb6.append(str);
        sb6.append(", scopeTimer_step1=");
        sb6.append(kVar);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        jz5.l f17 = gVar.f(str, this.f463629g, this.f463630h, this.f463631i);
        long longValue = ((java.lang.Number) f17.f302833d).longValue();
        java.util.ArrayList arrayList = (java.util.ArrayList) f17.f302834e;
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[filterRestoreMediaAsync] taskId=" + j17 + ", convId=" + str + ", scopeTimer_step2=" + kVar);
        com.tencent.wechat.aff.migration.a aVar3 = a4Var.f463609d;
        if (aVar3 != null) {
            aVar3.m(this.f463628f, longValue, arrayList);
        }
        return f0Var;
    }
}
