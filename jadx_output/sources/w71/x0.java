package w71;

/* loaded from: classes11.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f443465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.a0 f443466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443467f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(long j17, bw5.a0 a0Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f443465d = j17;
        this.f443466e = a0Var;
        this.f443467f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new w71.x0(this.f443465d, this.f443466e, this.f443467f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        w71.x0 x0Var = (w71.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("response ");
        sb6.append(this.f443465d);
        sb6.append(", resp ");
        bw5.a0 a0Var = this.f443466e;
        sb6.append((a0Var.f24957i[4] ? a0Var.f24955g : com.tencent.mm.protobuf.g.f192155b).f192156a.length);
        com.tencent.mars.xlog.Log.i("MicroMsg.NativeCgi", sb6.toString());
        this.f443467f.invoke(a0Var);
        return jz5.f0.f302826a;
    }
}
