package gr1;

/* loaded from: classes8.dex */
public final class k implements rk.f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f274738a = kz5.c0.i("room_placed_to_the_top", "room_accept_message", "force_notify", "room_search_chatting_content", "room_set_chatting_background", "room_del_chatting", "room_add_blacklist", "room_set_remark", "room_notify_new_msg", "room_set_to_conv_box", "close_chat", "seperate_line_between_force_notify_and_background", "seperate_line_between_background_and_clear_history", "seperate_line_between_close_chat_and_del_chat");

    public final java.lang.String a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            java.lang.String encode = java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
            kotlin.jvm.internal.o.d(encode);
            return encode;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizFans.SafetyDelegate", "safeUrlEncode failed: " + e17);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(r45.w3 r13, int r14) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gr1.k.b(r45.w3, int):boolean");
    }
}
