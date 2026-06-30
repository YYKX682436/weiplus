package im;

/* loaded from: classes12.dex */
public final class b extends im.g {
    @Override // im.g
    public void a(com.tencent.mm.storage.f9 msg, com.tencent.mm.autogen.mmdata.rpt.AndroidSendMsgFailStruct struct) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(struct, "struct");
        struct.f55077d = struct.b("LocalId", java.lang.String.valueOf(msg.getMsgId()), true);
        struct.f55078e = msg.getType();
        struct.f55080g = msg.getCreateTime();
        struct.f55081h = struct.b("Username", com.tencent.mm.sdk.platformtools.t8.G1(msg.Q0()), true);
        struct.f55084k = struct.b("Rev", com.tencent.mm.sdk.platformtools.z.f193109e, true);
        t65.f Zi = ((k04.h) ((t65.e) i95.n0.c(t65.e.class))).Zi();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("networkTickRate", java.lang.Float.valueOf(Zi.t()));
        jSONObject.put("fromLastNetworkMin", Zi.n());
        jSONObject.put("status", Zi.u());
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        struct.f55085l = struct.b("ProcessStatus", r26.i0.t(jSONObject2, ",", ";", false), true);
    }

    @Override // im.g
    public boolean b(com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return true;
    }
}
