package w11;

/* loaded from: classes9.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.modelmulti.BizScreenshotMsgInfo a(p15.h hVar) {
        if (hVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizScreenshotMsgInfo", "from, msgSrcWxaInfo is null");
            return null;
        }
        java.lang.String n17 = hVar.n();
        if (n17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizScreenshotMsgInfo", "from, imageID is null");
            return null;
        }
        java.lang.String j17 = hVar.j();
        if (j17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizScreenshotMsgInfo", "from, articleUrl is null");
            return null;
        }
        java.lang.Long o17 = hVar.o();
        int longValue = o17 != null ? (int) o17.longValue() : -1;
        java.lang.Long k17 = hVar.k();
        long longValue2 = k17 != null ? k17.longValue() : -1L;
        java.lang.Long p17 = hVar.p();
        long longValue3 = p17 != null ? p17.longValue() : -1L;
        java.lang.Long l17 = hVar.l();
        return new com.tencent.mm.modelmulti.BizScreenshotMsgInfo(n17, j17, longValue, longValue2, longValue3, l17 != null ? l17.longValue() : -1L);
    }

    public final com.tencent.mm.modelmulti.BizScreenshotMsgInfo b(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        com.tencent.mm.modelmulti.BizScreenshotMsgInfo c17 = c(msgInfo.j());
        if (c17 != null) {
            return c17;
        }
        return null;
    }

    public final com.tencent.mm.modelmulti.BizScreenshotMsgInfo c(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        p15.h hVar = new p15.h();
        hVar.fromXml(str);
        return a(hVar);
    }
}
