package h63;

/* loaded from: classes7.dex */
public final class d0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.n1 f279223d;

    public d0(h63.n1 n1Var) {
        this.f279223d = n1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Parcelable parcelable = ((com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData) obj).f67111g;
        kotlin.jvm.internal.o.e(parcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveMemberInfoListPayload");
        java.util.List<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoPayload> list = ((com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoListPayload) parcelable).f142024d;
        kotlin.jvm.internal.o.e(list, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveMemberInfoPayload>");
        for (com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoPayload gameLiveAppbrandEventService$LiveMemberInfoPayload : list) {
            arrayList.add(kz5.c1.k(new jz5.l("nickname", gameLiveAppbrandEventService$LiveMemberInfoPayload.f142025d), new jz5.l("rewardAmountInHeat", java.lang.Integer.valueOf(gameLiveAppbrandEventService$LiveMemberInfoPayload.f142026e))));
        }
        mc1.e eVar = (mc1.e) this.f279223d;
        eVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("memberList", arrayList);
        eVar.f325586a.a(eVar.f325587b, eVar.f325588c.p("ok", hashMap));
    }
}
