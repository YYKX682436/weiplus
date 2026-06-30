package yx0;

/* loaded from: classes5.dex */
public final class m5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f467457f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(yx0.b8 b8Var, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467456e = b8Var;
        this.f467457f = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.m5(this.f467456e, this.f467457f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.m5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467455d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pp0.p0 p0Var = this.f467456e.K;
            if (p0Var == null) {
                return null;
            }
            com.tencent.maas.camstudio.MJCamMusicVolumeDesc mJCamMusicVolumeDesc = new com.tencent.maas.camstudio.MJCamMusicVolumeDesc(this.f467457f * 2.0f);
            this.f467455d = 1;
            if (p0Var.t(mJCamMusicVolumeDesc, this) == aVar) {
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
