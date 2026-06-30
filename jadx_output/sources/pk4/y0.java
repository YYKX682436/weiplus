package pk4;

/* loaded from: classes10.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView f356539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.thumbplayer.api.ITPPlayer f356540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView, com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f356539d = thumbPlayerVideoView;
        this.f356540e = iTPPlayer;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pk4.y0(this.f356539d, this.f356540e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pk4.y0 y0Var = (pk4.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = this.f356539d;
        if (thumbPlayerVideoView.f174603r.f356465e != null && thumbPlayerVideoView.e() && (iTPPlayer = this.f356540e) != null) {
            iTPPlayer.setPlaySpeedRatio(thumbPlayerVideoView.F);
        }
        return jz5.f0.f302826a;
    }
}
