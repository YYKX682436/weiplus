package rh;

/* loaded from: classes12.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.d2 f395483d;

    public o1(rh.d2 d2Var) {
        this.f395483d = d2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f395483d.f395361c.size() >= this.f395483d.f395294a.f363335d.f363289h) {
            synchronized ("Matrix.battery.DeviceStatusMonitorFeature") {
                wh.j2.b(this.f395483d.f395361c);
            }
        }
    }
}
