package vh0;

/* loaded from: classes.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh0.f3 f436963d;

    public s2(vh0.f3 f3Var) {
        this.f436963d = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "start updateChatBotFromServer!");
        this.f436963d.getClass();
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_update_chatbot_username_list_android, "", true);
        kotlin.jvm.internal.o.d(Zi);
        if (Zi.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "skip due to usernameListJsonStr is empty");
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(Zi);
            if (jSONArray.length() <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "skip due to updateUsernameList is empty");
                return;
            }
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e());
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = M.getLong("SP_CHAT_BOT_AUTO_GET_CONTACT", 0L);
            if (currentTimeMillis - j17 < com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "skip due to time limit, pre:" + j17 + ", now:" + currentTimeMillis);
                return;
            }
            int length = jSONArray.length();
            while (i17 < length) {
                java.lang.String string = jSONArray.getString(i17);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(string, true);
                if (!n17.r2()) {
                    i17 = (n17.getType() & 2) != 0 ? 0 : i17 + 1;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "try to get contact for:" + string);
                ((c01.k7) ((j11.q) ((ct.z2) i95.n0.c(ct.z2.class))).wi()).b(string, 12, vh0.e3.f436853a);
            }
            M.putLong("SP_CHAT_BOT_AUTO_GET_CONTACT", currentTimeMillis);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatBotRoutineService", th6, "", new java.lang.Object[0]);
        }
    }
}
