package gy4;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.ob f277616e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c01.ob obVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277616e = obVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gy4.n(this.f277616e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gy4.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277615d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                gy4.m mVar = new gy4.m(this.f277616e, null);
                this.f277615d = 1;
                obj = kotlinx.coroutines.a4.c(30000L, mVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return (java.lang.String) obj;
        } catch (java.util.concurrent.CancellationException unused) {
            return null;
        }
    }
}
