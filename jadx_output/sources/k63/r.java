package k63;

/* loaded from: classes14.dex */
public final class r implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k63.p0 f304570d;

    public r(k63.p0 p0Var) {
        this.f304570d = p0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData gameLiveCommonService$IPCLiveControlData = (com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData) obj;
        this.f304570d.a((android.view.Surface) (gameLiveCommonService$IPCLiveControlData != null ? gameLiveCommonService$IPCLiveControlData.f67111g : null));
    }
}
