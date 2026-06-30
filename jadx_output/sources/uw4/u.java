package uw4;

/* loaded from: classes.dex */
public abstract class u {
    public static final void a(android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 bottomSheet, uw4.o forwardClick) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(forwardClick, "forwardClick");
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        new com.tencent.mm.pluginsdk.forward.m().Di(context, bottomSheet, 4, null, new uw4.q(forwardClick));
    }

    public static final boolean b(android.content.Context context, java.lang.String sourceUserName, java.lang.String clickUrl, org.json.JSONObject data, com.tencent.mm.plugin.webview.luggage.jsapi.q5 callback, uw4.p pVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(sourceUserName, "sourceUserName");
        kotlin.jvm.internal.o.g(clickUrl, "clickUrl");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (com.tencent.mm.sdk.platformtools.t8.K0(sourceUserName)) {
            callback.a("fail", null);
            return false;
        }
        java.lang.String optString = data.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String optString2 = data.optString("img_url");
        java.lang.String optString3 = data.optString("appid");
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f490589za);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(string);
        stringBuffer.append(optString);
        kotlin.jvm.internal.o.f(stringBuffer.toString(), "toString(...)");
        uw4.t tVar = new uw4.t(optString2, context, optString3, sourceUserName, data, pVar, callback);
        uw4.r rVar = new uw4.r(clickUrl, context);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String optString4 = data.optString("img_url");
        kotlin.jvm.internal.o.f(optString4, "optString(...)");
        hashMap.put("img_url", optString4);
        java.lang.String optString5 = data.optString("desc");
        kotlin.jvm.internal.o.f(optString5, "optString(...)");
        hashMap.put("desc", optString5);
        java.lang.String optString6 = data.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        kotlin.jvm.internal.o.f(optString6, "optString(...)");
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, optString6);
        java.lang.String optString7 = data.optString("shareUrl");
        kotlin.jvm.internal.o.f(optString7, "optString(...)");
        hashMap.put("url", optString7);
        java.lang.String optString8 = data.optString("src_username");
        kotlin.jvm.internal.o.f(optString8, "optString(...)");
        hashMap.put("srcUserName", optString8);
        java.lang.String optString9 = data.optString("src_displayname");
        kotlin.jvm.internal.o.f(optString9, "optString(...)");
        hashMap.put("srcDisplayname", optString9);
        java.lang.String optString10 = data.optString("appid");
        kotlin.jvm.internal.o.f(optString10, "optString(...)");
        hashMap.put("appId", optString10);
        se5.a aVar = new se5.a();
        aVar.l(n13.v.f334140a.e(hashMap));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(sourceUserName);
        n13.t tVar2 = new n13.t();
        tVar2.f334133a = tVar;
        tVar2.f334135c = rVar;
        tVar2.f334138f.f334139a = 3;
        ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).Ai(context, aVar, arrayList, tVar2);
        return true;
    }
}
