package gx0;

/* loaded from: classes5.dex */
public final class xc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.dd f277174e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(gx0.dd ddVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277174e = ddVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.xc(this.f277174e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.xc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277173d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf x76 = this.f277174e.x7();
            this.f277173d = 1;
            if (gx0.bf.d7(x76, null, null, false, this, 7, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
