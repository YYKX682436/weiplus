package vt3;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f439986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f439987e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f439987e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new vt3.b(this.f439987e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((vt3.b) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f439986d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vt3.l lVar = vt3.l.f440005a;
            this.f439986d = 1;
            obj = vt3.l.a(lVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (booleanValue) {
            this.f439987e.invoke();
            return f0Var;
        }
        com.tencent.mars.xlog.Log.e("AssetInfoStatistics", "doAfterReady but init is error");
        return f0Var;
    }
}
