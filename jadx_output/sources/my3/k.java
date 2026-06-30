package my3;

/* loaded from: classes13.dex */
public final class k implements fy3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ my3.q f332811a;

    public k(my3.q qVar) {
        this.f332811a = qVar;
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "serviceConnectionCallback onServiceConnected");
        my3.q qVar = this.f332811a;
        qVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "startRtosService init");
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193057e, new com.tencent.mm.ipcinvoker.type.IPCInteger(0), iy3.g.class, new my3.n(qVar));
    }
}
