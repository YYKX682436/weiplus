package h63;

/* loaded from: classes7.dex */
public final class c0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.m1 f279217d;

    public c0(h63.m1 m1Var) {
        this.f279217d = m1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Parcelable parcelable = ((com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData) obj).f67111g;
        kotlin.jvm.internal.o.e(parcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveCurrentRoomInfoPayload");
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload gameLiveAppbrandEventService$LiveCurrentRoomInfoPayload = (com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCurrentRoomInfoPayload) parcelable;
        h63.m1 m1Var = this.f279217d;
        if (m1Var != null) {
            mc1.d$$a d__a = (mc1.d$$a) m1Var;
            mc1.d dVar = d__a.f325580a;
            dVar.getClass();
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("startTime", java.lang.Long.valueOf(((java.lang.System.currentTimeMillis() - c01.id.b()) / 1000) + gameLiveAppbrandEventService$LiveCurrentRoomInfoPayload.f142021d));
            hashMap.put("topic", gameLiveAppbrandEventService$LiveCurrentRoomInfoPayload.f142022e);
            d__a.f325581b.a(d__a.f325582c, dVar.p("ok", hashMap));
        }
    }
}
