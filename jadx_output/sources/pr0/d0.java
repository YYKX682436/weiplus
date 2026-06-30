package pr0;

/* loaded from: classes14.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f357819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f357820e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(boolean z17, pr0.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357819d = z17;
        this.f357820e = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pr0.d0(this.f357819d, this.f357820e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        xr0.d dVar;
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchToCamera back:");
        boolean z18 = this.f357819d;
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKit", sb6.toString());
        pr0.g0 g0Var = this.f357820e;
        sr0.i iVar = g0Var.f357834e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (iVar != null && (dVar = ((sr0.f) iVar).f411437n) != null && ((!(z17 = dVar.f456161c) && z18) || (z17 && !z18))) {
            g0Var.m("switchCamera", new pr0.b0(g0Var, null));
        }
        return f0Var;
    }
}
