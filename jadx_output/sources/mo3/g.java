package mo3;

@j95.b
/* loaded from: classes11.dex */
public class g extends i95.w implements oo3.j {

    /* renamed from: d, reason: collision with root package name */
    public c01.m8 f330407d;

    /* renamed from: e, reason: collision with root package name */
    public c01.v8 f330408e;

    public static boolean Ai(java.lang.String str) {
        java.lang.String str2 = lp0.b.e() + "newmsgringtone";
        if (!com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mm.vfs.w6.u(str2);
        }
        if (com.tencent.mm.vfs.w6.j(ip.b.n(1))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginNotification", "file exits");
            return true;
        }
        int Q = com.tencent.mm.vfs.w6.Q(str, str2);
        if (Q < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginNotification", "unzip fail, ret = " + Q + ", zipFilePath = " + str + ", unzipPath = " + str2);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginNotification", "unzip success!!");
            new com.tencent.mm.autogen.events.RingtoneResUpdateEvent().e();
        }
        return true;
    }

    public static void wi(android.app.NotificationManager notificationManager, android.app.NotificationChannel notificationChannel) {
        try {
            notificationManager.createNotificationChannel(notificationChannel);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PluginNotification", e17, "createNotificationChannel err", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x02c7 A[Catch: Exception -> 0x033c, TryCatch #0 {Exception -> 0x033c, blocks: (B:33:0x0244, B:35:0x024a, B:37:0x025c, B:38:0x0262, B:40:0x0289, B:41:0x0290, B:43:0x029c, B:47:0x02a2, B:49:0x02b7, B:53:0x02c1, B:55:0x02c7, B:56:0x02cb), top: B:32:0x0244 }] */
    @Override // i95.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.content.Context r22) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mo3.g.onCreate(android.content.Context):void");
    }
}
