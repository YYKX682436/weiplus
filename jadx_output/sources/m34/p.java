package m34;

/* loaded from: classes15.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f323368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar f323369e;

    public p(com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar, int i17) {
        this.f323369e = snsAdNativeLandingPagesVideoPlayerLoadingBar;
        this.f323368d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f323369e.setVideoTotalTime(this.f323368d);
    }
}
