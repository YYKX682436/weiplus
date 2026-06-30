package lm;

/* loaded from: classes12.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f319317d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f319318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w65.m f319319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f319320g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f319321h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(w65.m mVar, kotlinx.coroutines.q qVar, java.lang.ref.WeakReference weakReference, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f319319f = mVar;
        this.f319320g = qVar;
        this.f319321h = weakReference;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        lm.m mVar = new lm.m(this.f319319f, this.f319320g, this.f319321h, continuation);
        mVar.f319318e = obj;
        return mVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lm.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.i2 i2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f319317d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f319318e;
            w65.m mVar = this.f319319f;
            w65.q qVar = mVar != null ? ((w65.g) mVar).f443356e : null;
            w65.q qVar2 = w65.q.f443370h;
            kotlinx.coroutines.q qVar3 = this.f319320g;
            if (qVar == qVar2) {
                kotlinx.coroutines.z0.e(y0Var, null, 1, null);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                qVar3.resumeWith(kotlin.Result.m521constructorimpl(mVar.f0()));
            } else if (mVar != null && (i2Var = ((w65.g) mVar).f443357f) != null) {
                lm.l lVar = new lm.l(this.f319321h, y0Var, qVar3);
                this.f319317d = 1;
                if (i2Var.a(lVar, this) == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        throw new jz5.d();
    }
}
