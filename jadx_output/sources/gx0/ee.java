package gx0;

/* loaded from: classes5.dex */
public final class ee implements com.tencent.maas.moviecomposing.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276379a;

    public ee(gx0.bf bfVar) {
        this.f276379a = bfVar;
    }

    @Override // com.tencent.maas.moviecomposing.b0
    public final void onFinished() {
        gx0.fd fdVar = gx0.fd.f276431g;
        gx0.bf bfVar = this.f276379a;
        bfVar.f276256w = fdVar;
        bfVar.f276254u.postValue(fdVar);
        com.tencent.mars.xlog.Log.i("MovieComp.PlaybackControlUIC", "playbackSession did finish");
    }
}
