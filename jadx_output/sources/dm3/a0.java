package dm3;

/* loaded from: classes10.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm3.e0 f241668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f241669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(dm3.e0 e0Var, long j17) {
        super(0);
        this.f241668d = e0Var;
        this.f241669e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView tingMusicLyricsView = this.f241668d.f241683o;
        if (tingMusicLyricsView != null) {
            tingMusicLyricsView.setupCurrentTime((int) this.f241669e);
        }
        return jz5.f0.f302826a;
    }
}
