package ya2;

/* loaded from: classes2.dex */
public final class l1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f460507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f460508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(zy2.i5 i5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f460508e = i5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ya2.l1(this.f460508e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ya2.l1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object x17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f460507d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g92.b bVar = g92.b.f269769e;
            this.f460507d = 1;
            x17 = bVar.x1(8, this);
            if (x17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            x17 = ((kotlin.Result) obj).getValue();
        }
        if (kotlin.Result.m528isSuccessimpl(x17)) {
            this.f460508e.a((r45.lk2) x17);
        }
        if (kotlin.Result.m524exceptionOrNullimpl(x17) != null) {
            com.tencent.mars.xlog.Log.i("FinderUserApi", "requestUserPrepare failed");
        }
        return jz5.f0.f302826a;
    }
}
