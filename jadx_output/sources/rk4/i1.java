package rk4;

/* loaded from: classes8.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f396709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f396710e;

    public i1(java.lang.Boolean bool, long j17) {
        this.f396709d = bool;
        this.f396710e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroyAndReopenTingMiniProgram paused: ");
        java.lang.Boolean bool = this.f396709d;
        sb6.append(bool);
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", sb6.toString());
        if (bool == null || bool.booleanValue()) {
            return;
        }
        np1.a Ai = ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).Ai();
        ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).L(true);
        pv.z zVar = (pv.z) i95.n0.c(pv.z.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_enter_scene", (int) this.f396710e);
        ((ov.b) zVar).N9(1, Ai, 0, bundle, null);
    }
}
