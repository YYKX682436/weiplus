package pk4;

/* loaded from: classes10.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView f356485d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f356485d = thumbPlayerVideoView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pk4.g1(this.f356485d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pk4.g1 g1Var = (pk4.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kk4.c cVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = this.f356485d;
        if (thumbPlayerVideoView.f174603r.f356465e != null && thumbPlayerVideoView.e() && (cVar = thumbPlayerVideoView.f174597i) != null) {
            cVar.setPlaySpeedRatio(thumbPlayerVideoView.F);
        }
        return jz5.f0.f302826a;
    }
}
