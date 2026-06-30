package t03;

/* loaded from: classes11.dex */
public final class c implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.e f414432d;

    public c(t03.e eVar) {
        this.f414432d = eVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lossAudioFocus ");
        t03.e eVar = this.f414432d;
        sb6.append(eVar.hashCode());
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterPlayerAudioFocusController", sb6.toString());
        t03.a aVar = (t03.a) eVar.f414440a.get();
        if (aVar != null) {
            ((t03.k0) aVar).f(true, true);
        }
    }

    @Override // f25.f
    public void onResume() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gainAudioFocus ");
        t03.e eVar = this.f414432d;
        sb6.append(eVar.hashCode());
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterPlayerAudioFocusController", sb6.toString());
        t03.a aVar = (t03.a) eVar.f414440a.get();
        if (aVar != null) {
            ((t03.k0) aVar).f(false, true);
        }
    }

    @Override // f25.f
    public void onStop() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStop ");
        t03.e eVar = this.f414432d;
        sb6.append(eVar.hashCode());
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterPlayerAudioFocusController", sb6.toString());
        t03.a aVar = (t03.a) eVar.f414440a.get();
        if (aVar != null) {
            t03.k0 k0Var = (t03.k0) aVar;
            com.tencent.mars.xlog.Log.i(k0Var.f414465g, "pause");
            k0Var.f414472q = false;
            t03.r0 r0Var = k0Var.f414468m;
            if (r0Var != null) {
                kk4.b.i(r0Var, false, false, 1, null);
            }
        }
    }
}
