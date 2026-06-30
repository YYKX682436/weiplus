package rk4;

/* loaded from: classes3.dex */
public final class g5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f396677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396677e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.g5(this.f396677e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.g5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f396676d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        while (!rk4.i5.f396722f) {
            rk4.k5.c("waitForPluginAttached: not attached, delay 50ms", "TingFlutterPluginHelperImpl");
            this.f396676d = 1;
            if (kotlinx.coroutines.k1.b(50L, this) == aVar) {
                return aVar;
            }
        }
        rk4.k5.c("waitForPluginAttached: attached", "TingFlutterPluginHelperImpl");
        yz5.a aVar2 = this.f396677e;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return jz5.f0.f302826a;
    }
}
