package qn4;

/* loaded from: classes12.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f365273d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f365274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qn4.a f365275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qn4.t f365276g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f365277h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365278i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qn4.a aVar, qn4.t tVar, java.lang.CharSequence charSequence, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f365275f = aVar;
        this.f365276g = tVar;
        this.f365277h = charSequence;
        this.f365278i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qn4.s sVar = new qn4.s(this.f365275f, this.f365276g, this.f365277h, this.f365278i, continuation);
        sVar.f365274e = obj;
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qn4.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        qn4.a aVar;
        pz5.a aVar2 = pz5.a.f359186d;
        int i17 = this.f365273d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        try {
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aVar = this.f365275f;
            qn4.t tVar = this.f365276g;
            java.lang.CharSequence charSequence = this.f365277h;
            java.lang.String str = this.f365278i;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            qn4.q qVar = new qn4.q(tVar, charSequence, str, aVar, null);
            this.f365274e = aVar;
            this.f365273d = 1;
            if (kotlinx.coroutines.l.g(p0Var, qVar, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return f0Var;
            }
            aVar = (qn4.a) this.f365274e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((qn4.w) aVar).getClass();
        com.tencent.mars.xlog.Log.i("TranslationSpeechMenuItem", "onSpeechStart");
        m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("TranslationSpeechController", "Start speech failed", m524exceptionOrNullimpl);
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            qn4.r rVar = new qn4.r(this.f365276g, this.f365275f, m524exceptionOrNullimpl, null);
            this.f365274e = m521constructorimpl;
            this.f365273d = 2;
            if (kotlinx.coroutines.l.g(g3Var, rVar, this) == aVar2) {
                return aVar2;
            }
        }
        return f0Var;
    }
}
