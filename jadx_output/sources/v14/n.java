package v14;

/* loaded from: classes.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f432567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v14.p f432568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432569f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(v14.p pVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f432568e = pVar;
        this.f432569f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new v14.n(this.f432568e, this.f432569f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v14.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f432567d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kv.b0 b0Var = this.f432568e.f432577d;
            this.f432567d = 1;
            obj = ((hn1.s) b0Var).hj(this.f432569f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str != null) {
            return com.tencent.mm.sdk.platformtools.x.i0(str);
        }
        return null;
    }
}
