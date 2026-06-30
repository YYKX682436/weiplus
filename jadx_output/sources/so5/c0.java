package so5;

/* loaded from: classes14.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so5.k0 f410800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f410801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(so5.k0 k0Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410800d = k0Var;
        this.f410801e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new so5.c0(this.f410800d, this.f410801e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((so5.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        so5.k0 k0Var = this.f410800d;
        boolean z17 = k0Var.f410871u;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ILinkVoIPCameraHelper", "is fliping");
            return f0Var;
        }
        k0Var.f410871u = true;
        k0Var.f410865o = true;
        zq4.b bVar = this.f410800d.f410859f;
        if (bVar != null) {
            bVar.a();
        }
        this.f410800d.f410865o = false;
        this.f410800d.d();
        this.f410801e.invoke();
        this.f410800d.f410871u = false;
        return f0Var;
    }
}
