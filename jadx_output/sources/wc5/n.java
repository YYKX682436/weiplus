package wc5;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.q f444608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f444609e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wc5.q qVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444608d = qVar;
        this.f444609e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wc5.n(this.f444608d, this.f444609e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wc5.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return new java.lang.Integer(this.f444608d.W6(this.f444609e));
    }
}
