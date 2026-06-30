package dm3;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm3.o f241711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f241712e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(dm3.o oVar, long j17) {
        super(0);
        this.f241711d = oVar;
        this.f241712e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView tingMusicLyricsView = this.f241711d.f241719i;
        if (tingMusicLyricsView != null) {
            tingMusicLyricsView.setupCurrentTime((int) this.f241712e);
        }
        return jz5.f0.f302826a;
    }
}
