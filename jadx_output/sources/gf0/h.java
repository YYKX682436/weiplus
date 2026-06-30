package gf0;

/* loaded from: classes15.dex */
public final class h implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf0.i f271203d;

    public h(gf0.i iVar) {
        this.f271203d = iVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        qk.c8 c8Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId: ");
        gf0.i iVar = this.f271203d;
        sb6.append(iVar.f271209f);
        sb6.append(", onPause, loss audio focus");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioRecorder", sb6.toString());
        gf0.e eVar = iVar.f271208e;
        if (eVar != null && (c8Var = ((gf0.l) eVar).f271221a.f271238n) != null) {
            c8Var.a();
        }
        iVar.a();
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioRecorder", "appId: " + this.f271203d.f271209f + ", onResume, gain audio focus");
    }

    @Override // f25.f
    public void onStop() {
        qk.c8 c8Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId: ");
        gf0.i iVar = this.f271203d;
        sb6.append(iVar.f271209f);
        sb6.append(", onStop, loss audio focus");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioRecorder", sb6.toString());
        gf0.e eVar = iVar.f271208e;
        if (eVar != null && (c8Var = ((gf0.l) eVar).f271221a.f271238n) != null) {
            c8Var.a();
        }
        iVar.a();
    }
}
