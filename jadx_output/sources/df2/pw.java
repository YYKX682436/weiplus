package df2;

/* loaded from: classes3.dex */
public final class pw extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.xw f231116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(df2.xw xwVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231116d = xwVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.pw(this.f231116d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.pw) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        fe2.q qVar = (fe2.q) this.f231116d.R6(fe2.q.class);
        if (qVar == null) {
            return null;
        }
        qVar.C1();
        return jz5.f0.f302826a;
    }
}
