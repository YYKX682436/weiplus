package et5;

/* loaded from: classes13.dex */
public abstract class g {
    public static final java.lang.String a(com.tencent.wechat.aff.iam_scan.i0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        try {
            byte[] c17 = c(item);
            boolean z17 = true;
            if (c17.length == 0) {
                return "";
            }
            if (kotlin.jvm.internal.o.b(item.f217057g, "ANY")) {
                java.lang.String str = new java.lang.String(c17, r26.c.f368865a);
                if (str.length() != 0) {
                    z17 = false;
                }
                return z17 ? new java.lang.String(c17, r26.c.f368866b) : str;
            }
            java.lang.String charset = item.f217057g;
            kotlin.jvm.internal.o.f(charset, "charset");
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName(charset);
            kotlin.jvm.internal.o.f(forName, "forName(...)");
            return new java.lang.String(c17, forName);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WXQBarResultUtils", th6, "getRawData exception", new java.lang.Object[0]);
            return "";
        }
    }

    public static final int b(int i17, java.util.List list) {
        com.tencent.qbar.WxQbarNative$QBarReportMsg wxQbarNative$QBarReportMsg;
        if (list != null && (!list.isEmpty()) && i17 >= 0 && i17 < list.size() && (wxQbarNative$QBarReportMsg = (com.tencent.qbar.WxQbarNative$QBarReportMsg) kz5.n0.a0(list, i17)) != null) {
            return wxQbarNative$QBarReportMsg.qrcodeVersion;
        }
        return 0;
    }

    public static final byte[] c(com.tencent.wechat.aff.iam_scan.i0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.protobuf.g gVar = item.f217063p;
        byte[] bArr = gVar != null ? gVar.f192156a : null;
        return bArr == null ? new byte[0] : bArr;
    }
}
