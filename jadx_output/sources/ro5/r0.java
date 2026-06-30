package ro5;

/* loaded from: classes14.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f398288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f398290f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ro5.m1 m1Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398289e = m1Var;
        this.f398290f = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ro5.r0(this.f398289e, this.f398290f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ro5.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f398288d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cp5.j jVar = this.f398289e.f398242d.f455800n;
            this.f398288d = 1;
            jVar.getClass();
            obj = kotlinx.coroutines.l.g(jVar.f221159d, new cp5.g(false, jVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        dp5.f fVar = (dp5.f) obj;
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(((dp5.a) fVar).f242272d);
        surfaceTexture.setOnFrameAvailableListener(new ro5.q0(this.f398290f, fVar));
        return new ro5.f0(surfaceTexture, fVar);
    }
}
