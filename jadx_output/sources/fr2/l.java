package fr2;

/* loaded from: classes2.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f265730d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f265731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fr2.p f265732f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(fr2.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265732f = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        fr2.l lVar = new fr2.l(this.f265732f, continuation);
        lVar.f265731e = obj;
        return lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fr2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f265730d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fr2.p pVar = this.f265732f;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = pVar.f265747r;
            jz5.f0 f0Var2 = null;
            if (finderObject != null) {
                if (!(pVar.f265744o && pVar.f265745p > 0 && !pVar.f265736d.contains(new java.lang.Long(finderObject.getId())))) {
                    finderObject = null;
                }
                if (finderObject != null) {
                    com.tencent.mars.xlog.Log.i("FinderLivePlayTogetherBottomBarUIC", "onClick: use cache finderObject");
                    fr2.p.O6(pVar, finderObject);
                    f0Var2 = f0Var;
                }
            }
            if (f0Var2 == null) {
                this.f265730d = 1;
                if (fr2.p.Q6(pVar, false, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
