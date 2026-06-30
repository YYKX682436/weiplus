package lm;

/* loaded from: classes3.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f319322d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f319323e;

    /* renamed from: f, reason: collision with root package name */
    public int f319324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w65.m f319325g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f319326h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w65.m mVar, java.lang.ref.WeakReference weakReference, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f319325g = mVar;
        this.f319326h = weakReference;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lm.n(this.f319325g, this.f319326h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lm.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f319324f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            w65.m mVar = this.f319325g;
            this.f319322d = mVar;
            java.lang.ref.WeakReference weakReference = this.f319326h;
            this.f319323e = weakReference;
            this.f319324f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
            rVar.m(new lm.j(lifecycleScope != null ? v65.i.b(lifecycleScope, null, new lm.m(mVar, rVar, weakReference, null), 1, null) : null));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
