package h63;

/* loaded from: classes7.dex */
public final class m0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.o1 f279263d;

    public m0(h63.o1 o1Var) {
        this.f279263d = o1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Parcelable parcelable = ((com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData) obj).f67111g;
        kotlin.jvm.internal.o.e(parcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveTopicPayload");
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveTopicPayload gameLiveAppbrandEventService$LiveTopicPayload = (com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveTopicPayload) parcelable;
        h63.o1 o1Var = this.f279263d;
        if (o1Var != null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(gameLiveAppbrandEventService$LiveTopicPayload.f142069e);
            mc1.d$$b d__b = (mc1.d$$b) o1Var;
            mc1.d dVar = d__b.f325583a;
            dVar.getClass();
            java.util.HashMap hashMap = new java.util.HashMap(1);
            boolean booleanValue = valueOf.booleanValue();
            com.tencent.mm.plugin.appbrand.service.c0 c0Var = d__b.f325584b;
            int i17 = d__b.f325585c;
            if (booleanValue) {
                c0Var.a(i17, dVar.p("ok", hashMap));
            } else {
                hashMap.put("errMsg", gameLiveAppbrandEventService$LiveTopicPayload.f142070f);
                c0Var.a(i17, dVar.p("fail", hashMap));
            }
        }
    }
}
