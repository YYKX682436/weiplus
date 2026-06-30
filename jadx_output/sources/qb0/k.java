package qb0;

/* loaded from: classes12.dex */
public class k implements hm0.q {
    @Override // hm0.q
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // hm0.q
    public void onLowMemory() {
        ((ku5.t0) ku5.t0.f312615d).h(new qb0.i(this), "MicroMsg.PluginPerformance");
    }

    @Override // hm0.q
    public void onTerminate() {
    }

    @Override // hm0.q
    public void onTrimMemory(int i17) {
        if (i17 <= 15) {
            ((ku5.t0) ku5.t0.f312615d).h(new qb0.j(this, i17), "MicroMsg.PluginPerformance");
        }
    }
}
