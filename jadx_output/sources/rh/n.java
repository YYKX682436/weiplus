package rh;

/* loaded from: classes12.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.w f395462d;

    public n(rh.w wVar) {
        this.f395462d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f395462d.f395528e.size() >= this.f395462d.f395294a.f363335d.f363289h) {
            synchronized ("Matrix.battery.AppStatMonitorFeature") {
                wh.j2.b(this.f395462d.f395528e);
            }
        }
        if (this.f395462d.f395529f.size() >= this.f395462d.f395294a.f363335d.f363289h) {
            synchronized ("Matrix.battery.AppStatMonitorFeature") {
                wh.j2.b(this.f395462d.f395529f);
            }
        }
    }
}
