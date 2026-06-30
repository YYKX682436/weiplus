package k50;

/* loaded from: classes9.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f304280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f304281e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.f9 f9Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f304280d = f9Var;
        this.f304281e = f9Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new k50.z0(this.f304280d, this.f304281e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        k50.z0 z0Var = (k50.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.storage.f9 f9Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f279671d;
        java.lang.String Di = ((g90.u) wVar).Di(this.f304280d, 2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Di) && (f9Var = this.f304281e) != null) {
            ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Ui(f9Var, 2, Di, null);
        }
        return jz5.f0.f302826a;
    }
}
