package rx3;

/* loaded from: classes10.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx3.s f401050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401051e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(rx3.s sVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f401050d = sVar;
        this.f401051e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rx3.r(this.f401050d, this.f401051e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return java.lang.Boolean.valueOf(((java.util.ArrayList) this.f401050d.f401055a).addAll(this.f401051e));
    }
}
