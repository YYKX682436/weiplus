package j23;

/* loaded from: classes12.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f297288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j23.y f297289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f297290f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f297291g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(j23.y yVar, long j17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f297289e = yVar;
        this.f297290f = j17;
        this.f297291g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j23.x(this.f297289e, this.f297290f, this.f297291g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j23.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f297288d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f297288d = 1;
            if (kotlinx.coroutines.k1.b(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        j23.y yVar = this.f297289e;
        synchronized (yVar.f297299r) {
            if (yVar.f297299r.get()) {
                z17 = true;
            } else {
                yVar.f297299r.set(true);
                z17 = false;
            }
        }
        if (!z17) {
            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
            java.lang.String str = this.f297291g;
            if (lifecycleScope != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.internal.b0.f310484a, null, new j23.w(yVar, str, null), 2, null);
            }
            if (str == null) {
                str = "";
            }
            long j17 = this.f297290f;
            android.content.Context context = yVar.f414559e;
            if (context instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) {
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity");
                j75.f stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) context).getStateCenter();
                if (stateCenter != null) {
                    stateCenter.B3(new fi0.j(j17, str, true));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
