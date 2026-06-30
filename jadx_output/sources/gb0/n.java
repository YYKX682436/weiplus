package gb0;

@j95.b
/* loaded from: classes8.dex */
public final class n extends i95.w implements fb0.k {

    /* renamed from: e, reason: collision with root package name */
    public fb0.j f269970e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f269969d = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f269971f = new java.util.concurrent.ConcurrentHashMap();

    public boolean Ai(com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (!isEnable() || com.tencent.mm.storage.z3.r4(msg.Q0())) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.service.k5 k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class);
        com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel b17 = db0.g.f227828a.b(msg);
        if (b17 == null) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection Ri = ((zh1.p) k5Var).Ri(b17);
        if (Ri == null) {
            int i17 = ai1.a.f5080a;
            ai1.p.f5102b.b(b17, null);
        } else {
            java.util.List list = Ri.f86252g;
            java.util.Objects.toString(list);
            if (list.size() > 0) {
                return true;
            }
        }
        com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
        long msgId = msg.getMsgId();
        am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
        b6Var.f6219a = msgId;
        b6Var.f6220b = msg.Q0();
        b6Var.f6222d = -1;
        exDeviceHaveBindNetworkDeviceEvent.e();
        return exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a;
    }

    public boolean isEnable() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.Boolean bool = db0.f.f227826a;
        if (bool != null) {
            return bool.booleanValue();
        }
        db0.f.f227826a = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_wxa_material_open_msg, 0) == 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgABTest", "enableOpenABTest:" + db0.f.f227826a);
        java.lang.Boolean bool2 = db0.f.f227826a;
        kotlin.jvm.internal.o.d(bool2);
        return bool2.booleanValue();
    }

    public void wi(android.content.Context context, yz5.a block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(block, "block");
        ib0.e.f290029a.a(context, block);
    }
}
