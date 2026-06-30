package we1;

/* loaded from: classes13.dex */
public class f implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f445211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView f445212e;

    public f(com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView, int i17) {
        this.f445212e = danmuView;
        this.f445211d = i17;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "DanmuView-seekToPlayTime";
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f445212e.f83585q) {
            for (int size = ((java.util.LinkedList) this.f445212e.f83586r).size() - 1; size >= 0; size--) {
                we1.h hVar = (we1.h) ((java.util.LinkedList) this.f445212e.f83586r).get(size);
                if (((we1.a) hVar).f445202h < this.f445211d) {
                    break;
                }
                ((java.util.LinkedList) this.f445212e.f83585q).addFirst(hVar);
            }
        }
        this.f445212e.g();
    }
}
