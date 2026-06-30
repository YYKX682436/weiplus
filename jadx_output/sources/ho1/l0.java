package ho1;

/* loaded from: classes5.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f282745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282746e;

    public l0(ho1.a1 a1Var, long j17) {
        this.f282745d = a1Var;
        this.f282746e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c01.d9.e().g(new ug3.i(gm0.j1.b().f273249l, 1, new fo1.b(new ho1.k0(com.tencent.mm.plugin.backup.roambackup.r0.f92684a.i(true), this.f282745d, this.f282746e))));
        com.tencent.mars.xlog.Log.i("AutoBindHelper", "post NetSceneGetOnlineInfo into NetSceneQueue");
    }
}
