package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public final class j0 extends qt5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t0 f159944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f159945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f159946c;

    public j0(com.tencent.mm.plugin.scanner.view.t0 t0Var, int i17, yz5.l lVar) {
        this.f159944a = t0Var;
        this.f159945b = i17;
        this.f159946c = lVar;
    }

    @Override // qt5.f
    public void a() {
        com.tencent.mars.xlog.Log.i(this.f159944a.f159985p, "retryOpenCameraDelay " + this.f159945b + "s: " + ((qt5.c) this.f159944a.f215302e).f366657b + ", cameraFacing:" + ((qt5.c) this.f159944a.f215302e).f366673r);
        this.f159946c.invoke(java.lang.Boolean.valueOf(((qt5.c) this.f159944a.f215302e).f366657b));
    }
}
