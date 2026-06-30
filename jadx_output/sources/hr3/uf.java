package hr3;

/* loaded from: classes.dex */
public final class uf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f284089d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf(yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f284089d = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.uf(this.f284089d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.uf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yz5.p pVar = this.f284089d;
        if (pVar == null) {
            return null;
        }
        pVar.invoke(null, null);
        return jz5.f0.f302826a;
    }
}
