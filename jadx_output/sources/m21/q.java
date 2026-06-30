package m21;

/* loaded from: classes4.dex */
public class q implements m21.u {

    /* renamed from: a, reason: collision with root package name */
    public r45.ee f322998a = new r45.ee();

    public static boolean b(android.content.Context context, r45.ee eeVar, android.graphics.Rect rect) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMpVideoShareObject", "onClick %s/%s", eeVar.f373348p, eeVar.f373341f);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("show_search_chat_content_result", false);
        intent.putExtra("img_gallery_msg_id", 0);
        intent.putExtra("img_gallery_talker", eeVar.f373348p);
        intent.putExtra("img_gallery_chatroom_name", false);
        if (rect != null) {
            intent.putExtra("img_gallery_width", rect.right - rect.left).putExtra("img_gallery_height", rect.bottom - rect.top).putExtra("img_gallery_left", rect.left).putExtra("img_gallery_top", rect.top);
        }
        intent.putExtra("img_gallery_is_mp_video_without_msg", true);
        intent.putExtra("img_gallery_mp_video_click_from", 1);
        intent.putExtra("img_gallery_path", com.tencent.mm.sdk.platformtools.w2.a(eeVar.f373340e));
        intent.putExtra("show_enter_grid", false);
        intent.putExtra("KOpenArticleSceneFromScene", 2);
        try {
            intent.putExtra("img_gallery_mp_share_video_info", eeVar.toByteArray());
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsMpVideoShareObject", "onClick toByteArray ex %s", e17.getMessage());
        }
        j45.l.u(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", intent, null);
        ((android.app.Activity) context).overridePendingTransition(0, 0);
        return true;
    }

    public static r45.ee c(java.lang.String str, java.util.Map map) {
        r45.ee eeVar = new r45.ee();
        try {
            java.lang.String str2 = str + ".mmbrandmpvideo";
            if (!map.isEmpty()) {
                if (map.containsKey(str2 + ".videoUrl")) {
                    java.lang.String str3 = (java.lang.String) map.get(str2 + ".mpUrl");
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    java.lang.String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    eeVar.f373339d = str3;
                    java.lang.String str5 = (java.lang.String) map.get(str2 + ".videoUrl");
                    if (str5 == null) {
                        str5 = "";
                    }
                    eeVar.f373340e = str5;
                    java.lang.String str6 = (java.lang.String) map.get(str2 + ".url");
                    if (str6 == null) {
                        str6 = "";
                    }
                    eeVar.f373347o = str6;
                    java.lang.String str7 = (java.lang.String) map.get(str2 + ".title");
                    if (str7 == null) {
                        str7 = "";
                    }
                    eeVar.f373342g = str7;
                    java.lang.String str8 = (java.lang.String) map.get(str2 + ".videoVid");
                    if (str8 == null) {
                        str8 = "";
                    }
                    eeVar.f373341f = str8;
                    java.lang.String str9 = (java.lang.String) map.get(str2 + ".thumbUrl");
                    if (str9 == null) {
                        str9 = "";
                    }
                    eeVar.f373343h = str9;
                    java.lang.String str10 = (java.lang.String) map.get(str2 + ".bizUsrName");
                    if (str10 == null) {
                        str10 = "";
                    }
                    eeVar.f373348p = str10;
                    java.lang.String str11 = (java.lang.String) map.get(str2 + ".bizNickName");
                    if (str11 != null) {
                        str4 = str11;
                    }
                    eeVar.f373349q = str4;
                    eeVar.f373344i = (int) com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str2 + ".videoDuration"));
                    eeVar.f373345m = (int) com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str2 + ".thumbWidth"));
                    eeVar.f373346n = (int) com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) map.get(str2 + ".thumbHeight"));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsMpVideoShareObject", "parse error %s", e17.getMessage());
        }
        return eeVar;
    }

    @Override // m21.u
    public java.lang.String a() {
        r45.ee eeVar = this.f322998a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (eeVar != null) {
            try {
                sb6.append("<mmbrandmpvideo>");
                sb6.append("<mpUrl>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(eeVar.f373339d));
                sb6.append("</mpUrl>");
                sb6.append("<thumbUrl>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(eeVar.f373343h));
                sb6.append("</thumbUrl>");
                sb6.append("<videoVid>");
                sb6.append(eeVar.f373341f);
                sb6.append("</videoVid>");
                sb6.append("<bizUsrName>");
                sb6.append(eeVar.f373348p);
                sb6.append("</bizUsrName>");
                sb6.append("<bizNickName>");
                sb6.append(eeVar.f373349q);
                sb6.append("</bizNickName>");
                sb6.append("<videoUrl>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(eeVar.f373340e));
                sb6.append("</videoUrl>");
                sb6.append("<url>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(eeVar.f373347o));
                sb6.append("</url>");
                sb6.append("<title>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(eeVar.f373342g));
                sb6.append("</title>");
                sb6.append("<videoDuration>");
                sb6.append(eeVar.f373344i);
                sb6.append("</videoDuration>");
                sb6.append("<thumbWidth>");
                sb6.append(eeVar.f373345m);
                sb6.append("</thumbWidth>");
                sb6.append("<thumbHeight>");
                sb6.append(eeVar.f373346n);
                sb6.append("</thumbHeight>");
                sb6.append("</mmbrandmpvideo>");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsMpVideoShareObject", "make content error %s", e17.getMessage());
            }
        }
        return sb6.toString();
    }
}
