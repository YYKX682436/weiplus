package hr3;

/* loaded from: classes5.dex */
public final class ne extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f283835d;

    /* renamed from: e, reason: collision with root package name */
    public int f283836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283837f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.dz3 f283838g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne(hr3.pf pfVar, r45.dz3 dz3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f283837f = pfVar;
        this.f283838g = dz3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.ne(this.f283837f, this.f283838g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.ne) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f283836e;
        hr3.pf pfVar = this.f283837f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            hr3.me meVar = new hr3.me(h0Var2, pfVar, this.f283838g, null);
            this.f283835d = h0Var2;
            this.f283836e = 1;
            if (kotlinx.coroutines.l.g(p0Var, meVar, this) == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (kotlin.jvm.internal.h0) this.f283835d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "[initCommonSayHiDirectly] commonSayHiPicPath:" + ((java.lang.String) h0Var.f310123d));
        if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) h0Var.f310123d)) {
            pfVar.Z6((java.lang.String) h0Var.f310123d);
        }
        return jz5.f0.f302826a;
    }
}
