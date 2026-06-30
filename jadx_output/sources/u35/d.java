package u35;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f424435a = "";

    public static final void a(java.lang.String chatUsername, int i17, int i18) {
        kotlin.jvm.internal.o.g(chatUsername, "chatUsername");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_username", chatUsername);
        hashMap.put("voice_page_status", java.lang.Integer.valueOf(i17));
        hashMap.put("voice_stop_sence", java.lang.Integer.valueOf(i18));
        hashMap.put("voice_sessionid", f424435a);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voice_msg_stop_page_exp", hashMap, 35963);
    }

    public static final void b(java.lang.String chatUsername, int i17, int i18) {
        kotlin.jvm.internal.o.g(chatUsername, "chatUsername");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "voice_send_btn");
        hashMap.put("chat_username", chatUsername);
        hashMap.put("voice_page_status", java.lang.Integer.valueOf(i17));
        hashMap.put("voice_stop_sence", java.lang.Integer.valueOf(i18));
        hashMap.put("voice_sessionid", f424435a);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 35963);
    }
}
