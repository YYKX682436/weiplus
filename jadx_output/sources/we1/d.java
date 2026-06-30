package we1;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we1.h f445207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView f445208e;

    public d(com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView, we1.h hVar) {
        this.f445208e = danmuView;
        this.f445207d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f445208e.f83586r) {
            int i17 = 0;
            while (true) {
                if (i17 >= ((java.util.LinkedList) this.f445208e.f83586r).size()) {
                    break;
                }
                if (((we1.a) this.f445207d).f445202h <= ((we1.a) ((we1.h) ((java.util.LinkedList) this.f445208e.f83586r).get(i17))).f445202h) {
                    ((java.util.LinkedList) this.f445208e.f83586r).add(i17, this.f445207d);
                    break;
                }
                i17++;
            }
        }
    }
}
