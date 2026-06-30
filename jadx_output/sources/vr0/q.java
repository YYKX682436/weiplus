package vr0;

/* loaded from: classes14.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.SurfaceRequest f439499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439500f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nr0.x f439501g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nr0.y f439502h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.camera.core.SurfaceRequest surfaceRequest, vr0.z zVar, nr0.x xVar, nr0.y yVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439499e = surfaceRequest;
        this.f439500f = zVar;
        this.f439501g = xVar;
        this.f439502h = yVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vr0.q(this.f439499e, this.f439500f, this.f439501g, this.f439502h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vr0.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f439498d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            vr0.p pVar = new vr0.p(this.f439499e, this.f439500f, this.f439501g, this.f439502h, null);
            this.f439498d = 1;
            if (kotlinx.coroutines.l.g(g3Var, pVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
