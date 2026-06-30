package km4;

/* loaded from: classes9.dex */
public abstract class v {
    public static final boolean a(android.content.Context context, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        il4.d dVar = il4.d.f292102a;
        boolean UR_02E5 = urgen.ur_0025.UR_DB8A.UR_02E5(i17);
        if (!UR_02E5) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingSupportUtils", "checkSupportCategoryItem not support categoryType: " + i17);
            if (z17) {
                c(context, "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/notsupport");
            }
        }
        return UR_02E5;
    }

    public static final boolean b(android.content.Context context, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        boolean m17 = il4.l.m(i17);
        if (!m17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingSupportUtils", "checkSupportListenItem not support listenType: " + i17);
            if (z17) {
                c(context, "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/notsupport");
            }
        }
        return m17;
    }

    public static final void c(android.content.Context context, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingSupportUtils", "gotoUpgradeWeb url: %s", str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
