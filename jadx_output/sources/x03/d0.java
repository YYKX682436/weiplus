package x03;

/* loaded from: classes15.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f450999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f451000e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(x03.i0 i0Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f450999d = i0Var;
        this.f451000e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new x03.d0(this.f450999d, this.f451000e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        x03.d0 d0Var = (x03.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f450999d.f451045b;
        if (iTPPlayer != null) {
            iTPPlayer.setOutputMute(this.f451000e);
        }
        return jz5.f0.f302826a;
    }
}
