package com.tencent.mm.plugin.talkroom.model;

/* loaded from: classes11.dex */
public class TalkRoomReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f172448a = 0;

    public static void a(android.content.Context context) {
        long a17 = com.tencent.mm.sdk.platformtools.u2.a();
        if (a17 > 600000) {
            return;
        }
        if (a17 < 30000) {
            a17 = 30000;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.w("MicroMsg.TalkRoomReceiver", "reset bumper, interval:%d, now:%d", java.lang.Long.valueOf(a17), java.lang.Long.valueOf(elapsedRealtime));
        jk.b.d(context, 107, 2, elapsedRealtime + a17, new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.talkroom.model.TalkRoomReceiver.class).putExtra("MMBoot_Bump", true), fp.g0.a(268435456), true);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomReceiver", "[ALARM NOTIFICATION] bump:" + intent.getBooleanExtra("MMBoot_Bump", false));
        a(context);
    }
}
