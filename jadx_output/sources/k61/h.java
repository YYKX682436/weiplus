package k61;

/* loaded from: classes9.dex */
public class h extends em5.f {

    /* renamed from: o, reason: collision with root package name */
    public final h61.x f304497o = new h61.x();

    /* renamed from: p, reason: collision with root package name */
    public final h61.k f304498p = new h61.k();

    @Override // em5.f
    public void b() {
        super.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAAInteractor", "LaunchAAInteractor, onCreate");
        h61.t tVar = this.f304497o.f279177a;
        tVar.getClass();
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1624, tVar);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1655, tVar);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(2831, tVar);
        h61.i iVar = this.f304498p.f279155a;
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AAOperationData", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1698, iVar);
    }

    @Override // em5.f
    public void c() {
        super.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAAInteractor", "LaunchAAInteractor, onDestroy");
        h61.t tVar = this.f304497o.f279177a;
        tVar.getClass();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1624, tVar);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1655, tVar);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(2831, tVar);
        h61.i iVar = this.f304498p.f279155a;
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AAOperationData", "uninit");
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1698, iVar);
    }
}
