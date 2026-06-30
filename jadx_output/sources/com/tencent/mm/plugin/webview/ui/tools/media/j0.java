package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.media.j0 f185786a = new com.tencent.mm.plugin.webview.ui.tools.media.j0();

    public final void a(java.lang.String toUser, r45.ee msgInfo, java.lang.String str, com.tencent.mm.ipcinvoker.r callback) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.webview.ui.tools.media.MpVideoDataParcelable mpVideoDataParcelable = new com.tencent.mm.plugin.webview.ui.tools.media.MpVideoDataParcelable();
        mpVideoDataParcelable.f185729d = toUser;
        mpVideoDataParcelable.f185731f = str;
        mpVideoDataParcelable.f185733h = msgInfo;
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, mpVideoDataParcelable, com.tencent.mm.plugin.webview.ui.tools.media.h0.class, callback);
    }

    public final void b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        hashMap.put("img_url", str);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("desc", str2);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str3);
        java.lang.String str5 = com.tencent.mm.ui.w2.f211188a;
        if (str4 != null) {
            str5 = str4;
        }
        kotlin.jvm.internal.o.f(str5, "nullAs(...)");
        hashMap.put("url", str5);
        com.tencent.mars.xlog.Log.i("MicroMsg.MPVideoTransmit", "transmitMpVideoMsg, img_url=%s, desc=%s, title=%s, url=%s", hashMap.get("img_url"), hashMap.get("desc"), hashMap.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), str4);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("scene_from", i17);
        intent.putExtra("is_mp_video", true);
        intent.putExtra("Retr_Msg_Type", 1);
        intent.putExtra("mutil_select_is_ret", true);
        intent.putExtra("webview_params", hashMap);
        j45.l.v(context, ".ui.transmit.SelectConversationUI", intent, 203);
    }
}
