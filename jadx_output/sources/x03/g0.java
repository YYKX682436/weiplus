package x03;

/* loaded from: classes15.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f451030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(x03.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f451030d = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new x03.g0(this.f451030d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        x03.g0 g0Var = (x03.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        x03.i0 i0Var = this.f451030d;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = i0Var.f451045b;
        if (iTPPlayer != null) {
            iTPPlayer.resumeDownload();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = i0Var.f451045b;
        if (iTPPlayer2 != null) {
            iTPPlayer2.start();
        }
        return jz5.f0.f302826a;
    }
}
