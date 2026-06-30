package yt3;

/* loaded from: classes10.dex */
public final class z3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.a4 f465746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f465747e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(yt3.a4 a4Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f465746d = a4Var;
        this.f465747e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yt3.z3(this.f465746d, this.f465747e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yt3.z3 z3Var = (yt3.z3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yt3.c cVar = this.f465747e ? yt3.c.f465373d : yt3.c.f465374e;
        yt3.a4 a4Var = this.f465746d;
        a4Var.f465347f = cVar;
        a4Var.f465345d.s(cVar == yt3.c.f465373d ? com.tencent.mm.R.raw.icons_filled_camera_flash_on : com.tencent.mm.R.raw.icons_filled_camera_flash_off, com.tencent.mm.R.color.BW_100_Alpha_0_9);
        return jz5.f0.f302826a;
    }
}
