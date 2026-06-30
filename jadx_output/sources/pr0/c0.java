package pr0;

/* loaded from: classes14.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f357816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f357817e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(pr0.g0 g0Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357816d = g0Var;
        this.f357817e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pr0.c0(this.f357816d, this.f357817e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        pr0.g0 g0Var = this.f357816d;
        sr0.i iVar = g0Var.f357834e;
        boolean z17 = false;
        if (iVar != null && ((sr0.f) iVar).f411437n.f456164f) {
            z17 = true;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Camera.CameraKit", "camera is not previewing,ignore switchFlash");
            return f0Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchFlash >> ");
        boolean z18 = this.f357817e;
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKit", sb6.toString());
        sr0.i iVar2 = g0Var.f357834e;
        if (iVar2 != null) {
            iVar2.e(z18);
        }
        return f0Var;
    }
}
