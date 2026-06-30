package xw2;

/* loaded from: classes2.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xw2.s f457713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(xw2.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457713e = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        xw2.q qVar = new xw2.q(this.f457713e, continuation);
        qVar.f457712d = obj;
        return qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xw2.q) create((java.util.List) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List list = (java.util.List) this.f457712d;
        int i17 = xw2.s.f457715o;
        return new java.lang.Integer(this.f457713e.c(list).size());
    }
}
