package we1;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView f445206d;

    public c(com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView) {
        this.f445206d = danmuView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f445206d.f83589u = false;
        this.f445206d.invalidate();
    }
}
