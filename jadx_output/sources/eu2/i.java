package eu2;

/* loaded from: classes2.dex */
public final class i implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu2.j f256789d;

    public i(eu2.j jVar) {
        this.f256789d = jVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onPause]: loss focus");
        pm0.v.X(new eu2.g(this.f256789d));
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onResume]: gain focus");
        pm0.v.X(new eu2.f(this.f256789d));
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onStop]: loss focus");
        pm0.v.X(new eu2.h(this.f256789d));
    }
}
