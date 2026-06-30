package dh2;

/* loaded from: classes10.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f232484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dh2.b0 f232485e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(dh2.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f232485e = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dh2.z(this.f232485e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dh2.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f232484d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        do {
            dh2.b0 b0Var = this.f232485e;
            if (!b0Var.b()) {
                return jz5.f0.f302826a;
            }
            long f17 = b0Var.f232431k.f();
            long currentTimeMillis = (java.lang.System.currentTimeMillis() - b0Var.f232427g) + b0Var.f232428h;
            long abs = java.lang.Math.abs(currentTimeMillis - f17);
            com.tencent.mars.xlog.Log.i(b0Var.f232424d, "onPlayProgress progressMs: " + f17 + " curScoreProgress: " + currentTimeMillis + " offsetTime: " + abs);
            if (abs > 200) {
                com.tencent.mars.xlog.Log.e(b0Var.f232424d, "checkBgmPlayStamp curScoreProgress: " + currentTimeMillis + " progressMs: " + f17 + " jankOffest: " + abs);
                b0Var.c(f17);
            }
            this.f232484d = 1;
        } while (kotlinx.coroutines.k1.b(300L, this) != aVar);
        return aVar;
    }
}
