package mc1;

/* loaded from: classes7.dex */
public class d extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1032;
    public static final java.lang.String NAME = "gameLiveInfoControl";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        mc1.f fVar;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        switch (jSONObject.optInt("action", 0)) {
            case 1:
                fVar = mc1.f.WAGameLiveInfoControlActionEnableInfo;
                break;
            case 2:
                fVar = mc1.f.WAGameLiveInfoControlActionDisableInfo;
                break;
            case 3:
                fVar = mc1.f.WAGameLiveInfoControlActionGetCurrentRoomMemberInfo;
                break;
            case 4:
                fVar = mc1.f.WAGameLiveInfoControlActionGetCurrentRoomInfo;
                break;
            case 5:
                fVar = mc1.f.WAGameLiveInfoControlActionEnableMic;
                break;
            case 6:
                fVar = mc1.f.WAGameLiveInfoControlActionDisableMic;
                break;
            case 7:
                fVar = mc1.f.WAGameLiveInfoControlActionGetCurrentMicState;
                break;
            case 8:
                fVar = mc1.f.WAGameLiveInfoControlActionEnableMicInfo;
                break;
            case 9:
                fVar = mc1.f.WAGameLiveInfoControlActionDisableMicInfo;
                break;
            case 10:
                fVar = mc1.f.WAGameLiveInfoControlActionSetTopic;
                break;
            default:
                fVar = mc1.f.WAGameLiveInfoControlActionUnknow;
                break;
        }
        switch (fVar) {
            case WAGameLiveInfoControlActionUnknow:
                c0Var.a(i17, o("fail:invalid data,unknown action"));
                return;
            case WAGameLiveInfoControlActionEnableInfo:
                ((p60.u) ((p60.x) i95.n0.c(p60.x.class))).getClass();
                p60.u.f352199g.putBoolean("disableLiveInfo", false);
                c0Var.a(i17, o("ok"));
                return;
            case WAGameLiveInfoControlActionDisableInfo:
                ((p60.u) ((p60.x) i95.n0.c(p60.x.class))).getClass();
                p60.u.f352199g.putBoolean("disableLiveInfo", true);
                c0Var.a(i17, o("ok"));
                return;
            case WAGameLiveInfoControlActionGetCurrentRoomMemberInfo:
                h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
                mc1.e eVar = new mc1.e(this, c0Var, i17);
                ((h63.v0) r1Var).getClass();
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352177p, null, 0, null, 14, null), p60.q.class, new h63.d0(eVar));
                return;
            case WAGameLiveInfoControlActionGetCurrentRoomInfo:
                h63.r1 r1Var2 = (h63.r1) i95.n0.c(h63.r1.class);
                mc1.d$$a d__a = new mc1.d$$a(this, c0Var, i17);
                ((h63.v0) r1Var2).getClass();
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352178q, null, 0, null, 14, null), p60.q.class, new h63.c0(d__a));
                return;
            case WAGameLiveInfoControlActionEnableMic:
                ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).Ni(java.lang.Boolean.TRUE);
                c0Var.a(i17, o("ok"));
                return;
            case WAGameLiveInfoControlActionDisableMic:
                ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).Ni(java.lang.Boolean.FALSE);
                c0Var.a(i17, o("ok"));
                return;
            case WAGameLiveInfoControlActionGetCurrentMicState:
                java.util.HashMap hashMap = new java.util.HashMap(1);
                hashMap.put("mute", java.lang.Boolean.valueOf(!java.lang.Boolean.valueOf(((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).f279288g).booleanValue()));
                c0Var.a(i17, p("ok", hashMap));
                return;
            case WAGameLiveInfoControlActionEnableMicInfo:
                ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).Ri(java.lang.Boolean.TRUE, jSONObject.optInt("duration", 0));
                c0Var.a(i17, o("ok"));
                return;
            case WAGameLiveInfoControlActionDisableMicInfo:
                ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).Ri(java.lang.Boolean.FALSE, 0);
                c0Var.a(i17, o("ok"));
                return;
            case WAGameLiveInfoControlActionSetTopic:
                java.lang.String topic = jSONObject.optString("topic");
                h63.r1 r1Var3 = (h63.r1) i95.n0.c(h63.r1.class);
                mc1.d$$b d__b = new mc1.d$$b(this, c0Var, i17);
                ((h63.v0) r1Var3).getClass();
                kotlin.jvm.internal.o.g(topic, "topic");
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352187z, null, 0, new com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveTopicPayload(topic, false, null), 6, null), p60.q.class, new h63.m0(d__b));
                return;
            default:
                return;
        }
    }
}
