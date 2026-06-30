package vo4;

/* loaded from: classes10.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.b f438670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f438671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(vo4.b bVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438670d = bVar;
        this.f438671e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vo4.q(this.f438670d, this.f438671e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vo4.q qVar = (vo4.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPreloadMaterials, play: ");
        vo4.b bVar = this.f438670d;
        sb6.append(bVar.f438605d.f175710c);
        sb6.append(", texture:");
        sb6.append(bVar.f438602a);
        sb6.append(", pts:");
        sb6.append(this.f438671e);
        sb6.append(", startTime:");
        sb6.append(bVar.f438605d.f175708a);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogScriptReader", sb6.toString());
        if (!bVar.f438616o) {
            bVar.c();
        }
        bVar.d(0L);
        bVar.b(0L, false);
        return jz5.f0.f302826a;
    }
}
