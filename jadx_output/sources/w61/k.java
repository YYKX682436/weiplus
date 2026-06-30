package w61;

/* loaded from: classes5.dex */
public final class k implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtensionsForUnavailableAccountTip", "consumeNewXml " + str);
        if (map == null || (str2 = (java.lang.String) map.get(".sysmsg.to_username")) == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtensionsForUnavailableAccountTip", "consumeNewXml toUser:".concat(str2));
        v61.w0 w0Var = (v61.w0) ((com.tencent.mm.contact.m) i95.n0.c(com.tencent.mm.contact.m.class));
        w0Var.getClass();
        pm0.v.O("UnAvailableAccountTips", new v61.v0(str2, w0Var));
        return null;
    }
}
