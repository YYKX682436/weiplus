package d83;

/* loaded from: classes12.dex */
public final class p implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 addMsgInfo) {
        com.tencent.ilink.CloudSession cloudSession;
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        java.lang.String g17 = x51.j1.g(addMsgInfo.f70726a.f377561h);
        kotlin.jvm.internal.o.f(g17, "skstringToString(...)");
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        kotlin.jvm.internal.o.f(d17, "parseXml(...)");
        java.lang.Object obj = d17.get(".sysmsg.mmilinkcloudnewxml.base64msg");
        kotlin.jvm.internal.o.d(obj);
        java.lang.String str = (java.lang.String) obj;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ILinkCloudSysMsgListener", "mmilinkcloudnewxml.base64msg is null");
            return;
        }
        d83.e0 e0Var = d83.e0.f226958a;
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        synchronized (d83.e0.f226960c) {
            if (d83.e0.f226959b && (cloudSession = d83.e0.f226963f) != null) {
                cloudSession.receiveCloudNotify(bytes);
            }
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
