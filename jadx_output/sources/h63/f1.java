package h63;

/* loaded from: classes14.dex */
public final class f1 implements s40.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h63.a1 f279229a;

    public f1(h63.a1 a1Var) {
        this.f279229a = a1Var;
    }

    public void a(boolean z17, java.lang.String str) {
        p60.o oVar = (p60.o) this.f279229a;
        oVar.getClass();
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveTopicPayload gameLiveAppbrandEventService$LiveTopicPayload = new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveTopicPayload("", z17, str);
        com.tencent.mm.ipcinvoker.r rVar = oVar.f352190a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352187z, null, 0, gameLiveAppbrandEventService$LiveTopicPayload, 6, null));
        }
    }
}
