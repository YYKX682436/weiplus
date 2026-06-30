package qv;

@j95.b(dependencies = {r01.q3.class})
/* loaded from: classes7.dex */
public final class s extends i95.w implements qk.r6 {
    public boolean Ai() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_mp_screenshot_show_source, false);
    }

    public com.tencent.mm.modelmulti.BizScreenshotMsgInfo Bi(java.lang.String imgPath) {
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        com.tencent.mm.storage.r1 mj6 = r01.q3.mj();
        mj6.getClass();
        com.tencent.mm.storage.p1 y07 = mj6.y0(imgPath);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizScreenshotInfoStorage", "queryNonExpired, screenshotPath: " + imgPath + ", screenshotInfo is null");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizScreenshotInfoStorage", "queryNonExpired, screenshotInfo: " + y07);
        pm0.v.K(null, new com.tencent.mm.storage.q1(mj6));
        if (com.tencent.mm.sdk.platformtools.t8.i1() - y07.field_screenshotTime >= 2592000) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizScreenshotInfoStorage", "queryNonExpired, screenshotInfo is expired");
            return null;
        }
        java.lang.String field_screenshotMd5 = y07.field_screenshotMd5;
        kotlin.jvm.internal.o.f(field_screenshotMd5, "field_screenshotMd5");
        java.lang.String field_url = y07.field_url;
        kotlin.jvm.internal.o.f(field_url, "field_url");
        return new com.tencent.mm.modelmulti.BizScreenshotMsgInfo(field_screenshotMd5, field_url, y07.field_itemShowType, y07.field_biz, y07.field_mid, y07.field_idx);
    }

    public void Di(com.tencent.mm.modelmulti.BizScreenshotMsgInfo info, int i17, int i18) {
        kotlin.jvm.internal.o.g(info, "info");
        if (Ai()) {
            com.tencent.mm.autogen.mmdata.rpt.BizScreenshotOpReportStruct bizScreenshotOpReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BizScreenshotOpReportStruct();
            bizScreenshotOpReportStruct.f55423d = bizScreenshotOpReportStruct.b("url", info.f71252e, true);
            bizScreenshotOpReportStruct.f55424e = info.f71254g;
            bizScreenshotOpReportStruct.f55425f = info.f71255h;
            bizScreenshotOpReportStruct.f55426g = info.f71256i;
            bizScreenshotOpReportStruct.f55427h = i17;
            bizScreenshotOpReportStruct.f55428i = i18;
            bizScreenshotOpReportStruct.k();
        }
    }

    public boolean wi(java.lang.String str) {
        boolean z17;
        r01.q3.mj().getClass();
        if (str == null) {
            return false;
        }
        java.util.List list = com.tencent.mm.storage.r1.f195261e;
        if (!(list instanceof java.util.Collection) || !((java.util.ArrayList) list).isEmpty()) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                kotlin.jvm.internal.o.d(str2);
                if (r26.n0.B(str, str2, false)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return z17;
    }
}
