package kt;

@j95.b
/* loaded from: classes5.dex */
public class g extends i95.w implements lt.n0 {
    public void Ai(java.lang.String key, java.lang.String imagePath) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.pluginsdk.ui.tools.p0.f191821a;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
        try {
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = com.tencent.mm.pluginsdk.ui.tools.p0.f191821a;
            if (o4Var2 != null) {
                o4Var2.putString(key, imagePath);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizHalfScreenChattingUtil", "saveBizArticleQuoteThumbPath  k:" + key + "  v:" + imagePath);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizHalfScreenChattingUtil", e17, "saveBizArticleQuoteThumbPath", new java.lang.Object[0]);
        }
    }

    public boolean wi(java.lang.String key) {
        boolean z17;
        com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.pluginsdk.ui.tools.p0.f191821a;
        kotlin.jvm.internal.o.g(key, "key");
        try {
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = com.tencent.mm.pluginsdk.ui.tools.p0.f191821a;
            long j17 = o4Var2 != null ? o4Var2.getLong(key, 0L) : 0L;
            if (j17 > 0 && c01.id.c() - j17 <= 86400000) {
                z17 = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.BizHalfScreenChattingUtil", "isAutoGenerateQuote : " + z17);
                return z17;
            }
            z17 = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.BizHalfScreenChattingUtil", "isAutoGenerateQuote : " + z17);
            return z17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizHalfScreenChattingUtil", e17, "isAutoGenerateQuote", new java.lang.Object[0]);
            return false;
        }
    }
}
