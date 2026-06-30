package we1;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f445209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView f445210e;

    public e(com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView, java.util.List list) {
        this.f445210e = danmuView;
        this.f445209d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f445210e.f83585q) {
            ((java.util.LinkedList) this.f445210e.f83585q).addAll(this.f445209d);
        }
        synchronized (this.f445210e.f83586r) {
            ((java.util.LinkedList) this.f445210e.f83586r).addAll(this.f445209d);
        }
        this.f445210e.postInvalidate();
    }
}
