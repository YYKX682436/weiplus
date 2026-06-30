package qn4;

/* loaded from: classes12.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.t f365266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f365267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365268f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qn4.a f365269g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(qn4.t tVar, java.lang.CharSequence charSequence, java.lang.String str, qn4.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f365266d = tVar;
        this.f365267e = charSequence;
        this.f365268f = str;
        this.f365269g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qn4.q(this.f365266d, this.f365267e, this.f365268f, this.f365269g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qn4.q qVar = (qn4.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        java.lang.Object m521constructorimpl2;
        com.tencent.mm.storage.n3 p17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = this.f365268f;
        qn4.t tVar = this.f365266d;
        tVar.getClass();
        com.tencent.mars.xlog.Log.i("TranslationSpeechController", "playWithIndependentPlayer: using independent StreamSilkPlayer");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(gm0.j1.b().f273245h.f273145e);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = (com.tencent.mm.sdk.coroutines.LifecycleScope) m521constructorimpl;
        if (lifecycleScope == null) {
            com.tencent.mars.xlog.Log.e("TranslationSpeechController", "playWithIndependentPlayer: accountScope is null");
            throw new java.lang.IllegalStateException("Account scope not available");
        }
        pn4.q0 q0Var = new pn4.q0(tVar.f365280b, this.f365267e.toString(), str, lifecycleScope);
        q0Var.l(r45.jy3.Translate, r45.iy3.CHINESE);
        tVar.f365292n = q0Var;
        y21.h hVar = tVar.f365291m;
        hVar.b(q0Var);
        try {
            c01.f b17 = c01.d9.b();
            boolean z17 = false;
            if (b17 != null && (p17 = b17.p()) != null) {
                z17 = p17.n(26, false);
            }
            m521constructorimpl2 = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Throwable th7) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl2);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("TranslationSpeechController", "isForceSpeakOff error: " + m524exceptionOrNullimpl.getMessage());
            m521constructorimpl2 = java.lang.Boolean.FALSE;
        }
        hVar.f(!((java.lang.Boolean) m521constructorimpl2).booleanValue());
        hVar.c(new qn4.n(tVar, this.f365269g));
        hVar.d();
        return jz5.f0.f302826a;
    }
}
