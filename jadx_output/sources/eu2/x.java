package eu2;

/* loaded from: classes2.dex */
public final class x implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu2.b0 f256813d;

    public x(eu2.b0 b0Var) {
        this.f256813d = b0Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onPause]: loss focus");
        pm0.v.X(new eu2.v(this.f256813d));
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onResume]: gain focus");
        pm0.v.X(new eu2.u(this.f256813d));
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onStop]: loss focus");
        pm0.v.X(new eu2.w(this.f256813d));
    }
}
