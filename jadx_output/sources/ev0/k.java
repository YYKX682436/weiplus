package ev0;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f256855d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yz5.a aVar) {
        super(0);
        this.f256855d = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MovieComposingMusicPlayer", "firstAudioFrameRendered");
        yz5.a aVar = this.f256855d;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
