package kd2;

/* loaded from: classes10.dex */
public final class o implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.q f306779d;

    public o(kd2.q qVar) {
        this.f306779d = qVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("BaseFinderMiniViewHelper", "onPause: loss focus");
        pm0.v.X(new kd2.l(this.f306779d));
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mars.xlog.Log.i("BaseFinderMiniViewHelper", "onResume: gain focus");
        pm0.v.X(new kd2.m(this.f306779d));
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.mars.xlog.Log.i("BaseFinderMiniViewHelper", "onStop: loss focus");
        pm0.v.X(new kd2.n(this.f306779d));
    }
}
