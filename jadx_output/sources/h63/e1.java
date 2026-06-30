package h63;

/* loaded from: classes7.dex */
public final class e1 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h63.z0 f279226a;

    public e1(h63.z0 z0Var) {
        this.f279226a = z0Var;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.util.List<r45.rz1> list = (java.util.List) obj;
        kotlin.jvm.internal.o.e(list, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.protocal.protobuf.FinderLiveMemberListInfo>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (r45.rz1 rz1Var : list) {
            com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoPayload gameLiveAppbrandEventService$LiveMemberInfoPayload = new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoPayload(null, 0);
            gameLiveAppbrandEventService$LiveMemberInfoPayload.f142025d = rz1Var.getString(0);
            gameLiveAppbrandEventService$LiveMemberInfoPayload.f142026e = rz1Var.getInteger(1);
            arrayList.add(gameLiveAppbrandEventService$LiveMemberInfoPayload);
        }
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoListPayload gameLiveAppbrandEventService$LiveMemberInfoListPayload = new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoListPayload(null);
        gameLiveAppbrandEventService$LiveMemberInfoListPayload.f142024d = arrayList;
        p60.p pVar = (p60.p) this.f279226a;
        pVar.getClass();
        com.tencent.mm.ipcinvoker.r rVar = pVar.f352191a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352168d, null, 0, gameLiveAppbrandEventService$LiveMemberInfoListPayload, 6, null));
        }
    }
}
