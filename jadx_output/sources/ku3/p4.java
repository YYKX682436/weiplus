package ku3;

/* loaded from: classes5.dex */
public final class p4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ku3.s4 f312363e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(ku3.s4 s4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312363e = s4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.p4(this.f312363e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ku3.p4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f312362d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bs0.j jVar = this.f312363e.f312409d.f475577e;
            this.f312362d = 1;
            obj = jVar.f(0, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMenuPortraitPlugin", "set none mode >> " + ((java.lang.Boolean) obj).booleanValue());
        return jz5.f0.f302826a;
    }
}
