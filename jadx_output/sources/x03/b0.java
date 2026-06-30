package x03;

/* loaded from: classes15.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f450987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f450988e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(x03.i0 i0Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f450987d = i0Var;
        this.f450988e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new x03.b0(this.f450987d, this.f450988e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        x03.b0 b0Var = (x03.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        x03.i0 i0Var = this.f450987d;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = i0Var.f451045b;
        if (iTPPlayer != null) {
            iTPPlayer.resumeDownload();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = i0Var.f451045b;
        if (iTPPlayer2 != null) {
            iTPPlayer2.seekTo(this.f450988e, 3);
        }
        return jz5.f0.f302826a;
    }
}
