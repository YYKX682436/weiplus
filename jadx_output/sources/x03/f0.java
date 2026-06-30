package x03;

/* loaded from: classes15.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f451022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f451023e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(x03.i0 i0Var, double d17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f451022d = i0Var;
        this.f451023e = d17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new x03.f0(this.f451022d, this.f451023e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        x03.f0 f0Var = (x03.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        f0Var.invokeSuspend(f0Var2);
        return f0Var2;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f451022d.f451045b;
        if (iTPPlayer != null) {
            iTPPlayer.setAudioGainRatio((float) this.f451023e);
        }
        return jz5.f0.f302826a;
    }
}
