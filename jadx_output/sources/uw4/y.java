package uw4;

/* loaded from: classes9.dex */
public abstract class y {
    public static final void a(android.content.Context context, java.lang.String appId, java.lang.String toUser, org.json.JSONObject data, java.lang.String appendText) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(toUser, "toUser");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(appendText, "appendText");
        android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(data.optString("img_url"));
        com.tencent.mm.opensdk.modelmsg.WXWebpageObject wXWebpageObject = new com.tencent.mm.opensdk.modelmsg.WXWebpageObject();
        wXWebpageObject.webpageUrl = data.optString("link");
        wXWebpageObject.extInfo = data.optString("review_data");
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
        wXMediaMessage.mediaObject = wXWebpageObject;
        wXMediaMessage.title = data.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        wXMediaMessage.description = data.optString("desc");
        if (Bi != null && !Bi.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SendAppMsgUtil", "thumb image is not null");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            Bi.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(appId);
        com.tencent.mm.autogen.events.SendAppMsgEvent sendAppMsgEvent = new com.tencent.mm.autogen.events.SendAppMsgEvent();
        am.jt jtVar = sendAppMsgEvent.f54749g;
        jtVar.f7080a = wXMediaMessage;
        jtVar.f7081b = appId;
        jtVar.f7082c = h17 == null ? "" : h17.field_appName;
        jtVar.f7083d = toUser;
        jtVar.f7084e = 2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(data.optString("src_username"))) {
            jtVar.f7087h = null;
        } else {
            jtVar.f7085f = data.optString("src_username");
            jtVar.f7086g = data.optString("src_displayname");
        }
        jtVar.f7088i = data.optString("shareUrl");
        jtVar.f7089j = data.optString("currentUrl");
        jtVar.f7090k = data.optString("preVerifyAppId");
        sendAppMsgEvent.e();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(appendText)) {
            ((qg5.a) ((ct.p2) i95.n0.c(ct.p2.class))).getClass();
            java.util.HashMap a17 = com.tencent.mm.ui.i1.a(appendText);
            if (!com.tencent.mm.storage.z3.R4(toUser) || a17 == null) {
                com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                am.mt mtVar = sendMsgEvent.f54752g;
                mtVar.f7362a = toUser;
                mtVar.f7363b = appendText;
                mtVar.f7364c = c01.e2.C(toUser);
                mtVar.f7365d = 0;
                sendMsgEvent.e();
            } else if (w11.t1.a(toUser)) {
                w11.r1 b17 = w11.s1.b(toUser, null, 2, null);
                b17.e(appendText);
                b17.h(c01.e2.C(toUser));
                b17.f442131f = 1;
                b17.f442133h = a17;
                w11.r1.d(b17, null, 1, null);
            } else {
                w11.r1 b18 = w11.s1.b(toUser, null, 2, null);
                b18.g(toUser);
                b18.e(appendText);
                b18.h(c01.e2.C(toUser));
                b18.f442131f = 1;
                b18.f442133h = a17;
                b18.f442134i = 5;
                b18.a().a();
            }
        }
        if (data.optBoolean("showHasSendTips")) {
            db5.e1.T(context, context.getResources().getString(com.tencent.mm.R.string.fw6));
        } else {
            db5.e1.T(context, context.getResources().getString(com.tencent.mm.R.string.f490560yi));
        }
    }
}
