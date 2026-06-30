package fo5;

/* loaded from: classes14.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f265030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(fo5.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265030d = r0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.n0(this.f265030d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fo5.n0 n0Var = (fo5.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        lo5.h hVar = this.f265030d.f265095n;
        if (hVar.f320216c.f301233b) {
            lo5.h.b(hVar, false, 1, null);
        }
        com.tencent.mm.plugin.voipmp.platform.v0.f177287b.f(false, fo5.m0.f265024a);
        return jz5.f0.f302826a;
    }
}
