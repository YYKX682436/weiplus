package m34;

/* loaded from: classes4.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.ui.VideoPlayView f323380d;

    public y(com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView) {
        this.f323380d = videoPlayView;
    }

    @Override // java.lang.Runnable
    public void run() {
        m34.d dVar = this.f323380d.f162514n;
        if (dVar != null) {
            dVar.setIsPlay(false);
        }
    }
}
