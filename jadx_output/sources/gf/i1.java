package gf;

/* loaded from: classes7.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.k1 f271093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ze.n f271094e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(gf.k1 k1Var, ze.n nVar) {
        super(0);
        this.f271093d = k1Var;
        this.f271094e = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gf.k1 k1Var = this.f271093d;
        ze.n nVar = this.f271094e;
        k1Var.getClass();
        com.tencent.skyline.jni.SkylineRuntimeInfo skylineRuntimeInfo = new com.tencent.skyline.jni.SkylineRuntimeInfo();
        skylineRuntimeInfo.appId = nVar.f74803n;
        skylineRuntimeInfo.clientRevision = a03.h.a();
        skylineRuntimeInfo.sessionId = nVar.u0().f47276v;
        skylineRuntimeInfo.instanceId = nVar.u0().f47277w;
        skylineRuntimeInfo.appVersion = nVar.d2();
        skylineRuntimeInfo.appVersionType = nVar.f74805p.f77281g + 1;
        skylineRuntimeInfo.appServiceType = nVar.u0().f47284z + 1000;
        com.tencent.mars.xlog.Log.i("SkylineViewContainer", "getSkylineRuntimeInfo build info");
        com.tencent.mars.xlog.Log.i("SkylineViewContainer", "getSkylineRuntimeInfo finished");
        return skylineRuntimeInfo;
    }
}
