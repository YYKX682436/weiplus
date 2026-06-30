package dv2;

/* loaded from: classes2.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f243949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dv2.v f243950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f243951f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(dv2.v vVar, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243950e = vVar;
        this.f243951f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        dv2.u uVar = new dv2.u(this.f243950e, this.f243951f, continuation);
        uVar.f243949d = obj;
        return uVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dv2.u uVar = (dv2.u) create((dv2.i) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dv2.i iVar = (dv2.i) this.f243949d;
        dv2.k kVar = this.f243950e.f243961y;
        kotlin.jvm.internal.h0 h0Var = this.f243951f;
        dv2.i iVar2 = (dv2.i) h0Var.f310123d;
        kVar.getClass();
        if (iVar2 != iVar) {
            com.tencent.mars.xlog.Log.i("Finder.FollowAggregationTabUIC", "[FollowFreqReport] currentTab transition: " + iVar2 + " -> " + iVar);
            if (iVar2 != null) {
                kVar.a("page_out", iVar2.f243868d, kVar.f243880a > 0 ? android.os.SystemClock.elapsedRealtime() - kVar.f243880a : 0L);
                kVar.f243880a = 0L;
            }
            if (iVar != null) {
                kVar.f243880a = android.os.SystemClock.elapsedRealtime();
                kVar.a("page_in", iVar.f243868d, -1L);
            }
        }
        h0Var.f310123d = iVar;
        return jz5.f0.f302826a;
    }
}
