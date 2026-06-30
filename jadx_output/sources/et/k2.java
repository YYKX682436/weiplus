package et;

@j95.b
/* loaded from: classes9.dex */
public final class k2 extends i95.w implements ft.n4 {
    public java.lang.String Ai(java.lang.String str, java.lang.String weAppSourceUserName) {
        kotlin.jvm.internal.o.g(weAppSourceUserName, "weAppSourceUserName");
        if (com.tencent.mm.sdk.platformtools.t8.K0(weAppSourceUserName)) {
            return str == null ? "" : str;
        }
        p15.e eVar = new p15.e();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            kotlin.jvm.internal.o.d(str);
            eVar.fromXml(str);
        }
        eVar.F(weAppSourceUserName);
        java.lang.String xml = eVar.toXml();
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaInfoMsgSourceService", "tryInsertMsgSource msgSource: " + xml);
        return xml;
    }

    public void Bi(com.tencent.mm.storage.f9 targetMsg, java.lang.String weAppSourceUserName) {
        kotlin.jvm.internal.o.g(targetMsg, "targetMsg");
        kotlin.jvm.internal.o.g(weAppSourceUserName, "weAppSourceUserName");
        if (com.tencent.mm.sdk.platformtools.t8.K0(weAppSourceUserName)) {
            return;
        }
        p15.e eVar = new p15.e();
        java.lang.String str = targetMsg.G;
        if (str != null) {
            kotlin.jvm.internal.o.f(str, "getMsgSource(...)");
            eVar.fromXml(str);
        }
        eVar.F(weAppSourceUserName);
        targetMsg.u3(eVar.toXml());
        if (targetMsg.getMsgId() != 0) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(targetMsg.getMsgId(), targetMsg, true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaInfoMsgSourceService", "tryInsertMsgSource " + targetMsg.G);
    }

    public java.lang.String wi(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        kotlin.jvm.internal.o.d(str);
        if (!r26.n0.B(str, "<weappsourceUsername>", false)) {
            return "";
        }
        p15.e eVar = new p15.e();
        eVar.fromXml(str);
        java.lang.String s17 = eVar.s();
        return s17 == null ? "" : s17;
    }
}
