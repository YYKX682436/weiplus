package hq0;

/* loaded from: classes7.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f282965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f282967f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(long j17, hq0.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f282966e = j17;
        this.f282967f = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hq0.a0(this.f282966e, this.f282967f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hq0.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f282965d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long e17 = s26.a.e(this.f282966e);
            this.f282965d = 1;
            if (kotlinx.coroutines.k1.b(e17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!this.f282967f.Q) {
            this.f282967f.destroy();
        }
        java.lang.String str = this.f282967f.f282971y;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initBiz timeout (");
        sb6.append((java.lang.Object) s26.a.h(this.f282966e));
        sb6.append("), isDestroyBiz:");
        sb6.append(!this.f282967f.Q);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        return jz5.f0.f302826a;
    }
}
