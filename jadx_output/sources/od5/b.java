package od5;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f344655a;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean z17 = true;
        if (!o45.wf.f343033k) {
            int i17 = j62.e.g().i("clicfg_mvvm_chat_frame_rpt", 0, true, true);
            if (!(i17 > 0 && (i17 >= 100 || java.lang.Math.abs(com.tencent.mm.sdk.platformtools.z.f193112h ^ new java.security.SecureRandom().nextInt()) % 100 < i17))) {
                z17 = false;
            }
        }
        f344655a = z17;
    }

    public static final boolean a() {
        return bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.chatting.asyncbind.RepairerConfigChatListAsyncBind_ReportUICostNLine()) == 1;
    }
}
