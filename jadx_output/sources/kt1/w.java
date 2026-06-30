package kt1;

/* loaded from: classes4.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kt1.z f311961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kt1.h0 f311962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f311963g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kt1.z zVar, kt1.h0 h0Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f311961e = zVar;
        this.f311962f = h0Var;
        this.f311963g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kt1.w(this.f311961e, this.f311962f, this.f311963g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kt1.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f311960d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                u26.w wVar = (u26.w) ((jz5.n) this.f311961e.f311967d).getValue();
                kt1.h0 h0Var = this.f311962f;
                this.f311960d = 1;
                if (wVar.t(h0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ReliableSync.Service", "addSyncTask launch add end session:" + this.f311963g);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ReliableSync.Service", th6, "addSyncTask send err", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
