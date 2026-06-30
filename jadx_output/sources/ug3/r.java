package ug3;

/* loaded from: classes5.dex */
public final class r implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (!kotlin.jvm.internal.o.b("PushLoginUrlAutoLoginSwitchUpdate", str) || map == null) {
            return;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.PushLoginUrlAutoLoginSwitchUpdate.deviceid");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.PushLoginUrlAutoLoginSwitchUpdate.setting"), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.PushLoginUrlAutoLoginSwitchUpdateNewXmlReceived", "receive xml, deviceid:" + str2 + ", setting:" + D1);
        boolean z18 = D1 == 1;
        try {
            java.util.Iterator it = ug3.i.K().iterator();
            while (it.hasNext()) {
                ug3.k kVar = (ug3.k) it.next();
                if (com.tencent.mm.sdk.platformtools.t8.D0(android.util.Base64.encodeToString(kVar.f392465e.f192156a, 2), str2)) {
                    kVar.L = z18;
                    new com.tencent.mm.autogen.events.UpdateExtDeviceEvent().e();
                    return;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetOnlineInfo", "updateAutoLoginStatus %s, %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }
}
