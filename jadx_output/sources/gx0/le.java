package gx0;

/* loaded from: classes5.dex */
public final class le extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.SynthSpecWrapper f276684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(com.tencent.maas.moviecomposing.SynthSpecWrapper synthSpecWrapper, gx0.bf bfVar) {
        super(1);
        this.f276684d = synthSpecWrapper;
        this.f276685e = bfVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.SynthSpecWrapper synthSpecWrapper = this.f276684d;
        if (synthSpecWrapper != null) {
            synthSpecWrapper.a();
        }
        com.tencent.maas.moviecomposing.PlaybackSession playbackSession = this.f276685e.B;
        if (playbackSession != null) {
            playbackSession.release();
        }
        return jz5.f0.f302826a;
    }
}
