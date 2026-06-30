package j93;

/* loaded from: classes.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.n f298372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f298373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j93.n nVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f298372d = nVar;
        this.f298373e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j93.e(this.f298372d, this.f298373e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j93.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        j93.n nVar = this.f298372d;
        db5.e1.s(nVar.getActivity(), nVar.getString(com.tencent.mm.R.string.f490390tn), null);
        yz5.l lVar = this.f298373e;
        if (lVar == null) {
            return null;
        }
        lVar.invoke(java.lang.Boolean.FALSE);
        return jz5.f0.f302826a;
    }
}
