package sf2;

/* loaded from: classes5.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f407270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407271e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f407270d = hVar;
        this.f407271e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.s0(this.f407270d, continuation, this.f407271e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sf2.s0 s0Var = (sf2.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.vt1 vt1Var = (r45.vt1) ((xg2.i) this.f407270d).f454393b;
        com.tencent.mars.xlog.Log.i("FinderLiveNormalRoomSingController", "getSongPlayInfo success, play_info: " + vt1Var.f388514d);
        this.f407271e.f310123d = vt1Var.f388514d;
        return jz5.f0.f302826a;
    }
}
