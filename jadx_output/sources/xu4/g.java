package xu4;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final xu4.g f457287a = new xu4.g();

    public final java.lang.String a(java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
        java.lang.String c17 = com.tencent.mm.plugin.websearch.l2.g(10).c();
        c(params);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("file://");
        stringBuffer.append(c17);
        stringBuffer.append("?");
        stringBuffer.append(com.tencent.mm.plugin.websearch.l2.k(params));
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    public final int b(int i17) {
        int i18 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        if (i17 == 1) {
            return 71;
        }
        if (i17 == 2) {
            return 94;
        }
        if (i17 == 3) {
            return 107;
        }
        if (i17 == 4) {
            return 110;
        }
        if (i17 == 5) {
            return 127;
        }
        if (i17 == 6) {
            return 128;
        }
        if (i17 == 7) {
            return 155;
        }
        if (i17 >= 6500 && i17 <= 6600) {
            return i17;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.EmojiSearchUILogic", "Invalid search source scene: " + i17);
        return 0;
    }

    public final void c(java.util.Map map) {
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        kotlin.jvm.internal.o.f(f17, "getCurrentLanguage(...)");
        map.put("lang", f17);
        map.put("platform", com.eclipsesource.mmv8.Platform.ANDROID);
        map.put("version", java.lang.String.valueOf(com.tencent.mm.plugin.websearch.l2.a(10)));
        map.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, com.tencent.mm.plugin.websearch.l2.b());
        java.lang.String CLIENT_VERSION = com.tencent.mm.sdk.platformtools.z.f193111g;
        kotlin.jvm.internal.o.f(CLIENT_VERSION, "CLIENT_VERSION");
        map.put("wechatVersion", CLIENT_VERSION);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        float q17 = i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (q17 != 1.0f && q17 != 0.8f && q17 != 1.1f && q17 != 1.12f && q17 != 1.125f && q17 != 1.4f && q17 != 1.55f && q17 != 1.65f) {
            q17 = 1.0f;
        }
        map.put("fontRatio", java.lang.String.valueOf(q17));
    }
}
