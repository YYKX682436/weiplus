package xc;

/* loaded from: classes9.dex */
public class k implements hm0.q {
    @Override // hm0.q
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // hm0.q
    public void onLowMemory() {
        ((ku5.t0) ku5.t0.f312615d).g(new xc.i(this));
    }

    @Override // hm0.q
    public void onTerminate() {
        ((ku5.t0) ku5.t0.f312615d).g(new xc.j(this));
    }

    @Override // hm0.q
    public void onTrimMemory(int i17) {
    }
}
