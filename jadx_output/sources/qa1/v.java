package qa1;

/* loaded from: classes14.dex */
public class v implements k63.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f361023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f361024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceHolder f361025c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa1.o f361026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa1.w f361027e;

    public v(qa1.w wVar, int i17, int i18, android.view.SurfaceHolder surfaceHolder, qa1.o oVar) {
        this.f361027e = wVar;
        this.f361023a = i17;
        this.f361024b = i18;
        this.f361025c = surfaceHolder;
        this.f361026d = oVar;
    }

    @Override // k63.p0
    public void a(android.view.Surface surface) {
        ((k63.s) ((k63.o0) i95.n0.c(k63.o0.class))).getClass();
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352176o, null, 0, new com.tencent.mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService$Payload(this.f361023a, this.f361024b), 6, null), p60.q.class, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordableSurfaceView.LiveImp", "got surface %s", surface);
        qa1.w wVar = this.f361027e;
        wVar.f361029e = surface;
        android.view.SurfaceHolder surfaceHolder = this.f361025c;
        qa1.p pVar = wVar.f361028d;
        pVar.e(surfaceHolder);
        pVar.b(this.f361026d);
    }
}
