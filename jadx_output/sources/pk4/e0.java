package pk4;

/* loaded from: classes10.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.thumbplayer.api.ITPPlayer f356475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView f356476e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f356475d = iTPPlayer;
        this.f356476e = thumbPlayerSurfaceView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pk4.e0(this.f356475d, this.f356476e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pk4.e0 e0Var = (pk4.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f356475d;
        if (iTPPlayer != null) {
            iTPPlayer.setPlaySpeedRatio(this.f356476e.B);
        }
        return jz5.f0.f302826a;
    }
}
