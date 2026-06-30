package gx0;

/* loaded from: classes5.dex */
public final class r7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276919e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276919e = w8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.r7(this.f276919e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.r7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276918d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        gx0.w8 w8Var = this.f276919e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "releasePlaybackSessionUnderPlaybackState >> release");
            gx0.bf V6 = w8Var.V6();
            this.f276918d = 1;
            V6.getClass();
            java.lang.Object g17 = kotlinx.coroutines.l.g(V6.f276253t, new gx0.pe(V6, null), this);
            if (g17 != aVar) {
                g17 = f0Var;
            }
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        w8Var.J7(gx0.y4.f277202f);
        return f0Var;
    }
}
