package dy4;

/* loaded from: classes15.dex */
public final class o0 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244693d;

    public o0(dy4.f1 f1Var) {
        this.f244693d = f1Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        dy4.f1 f1Var = this.f244693d;
        com.tencent.mars.xlog.Log.i(f1Var.x(), "onPause: loss focus");
        ye1.e eVar = f1Var.f244627n;
        if (eVar != null) {
            eVar.setMute(true);
        }
    }

    @Override // f25.f
    public void onResume() {
        dy4.f1 f1Var = this.f244693d;
        com.tencent.mars.xlog.Log.i(f1Var.x(), "onResume: gain focus");
        ye1.e eVar = f1Var.f244627n;
        if (eVar != null) {
            eVar.setMute(false);
        }
    }

    @Override // f25.f
    public void onStop() {
        dy4.f1 f1Var = this.f244693d;
        com.tencent.mars.xlog.Log.i(f1Var.x(), "onStop: loss focus");
        f1Var.z();
    }
}
