package fo0;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final fo0.o f264833a = new fo0.o();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f264834b;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fo0.o.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void b() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveMiniNotificationHelper", "unBindForegroundServiceIfNeed, isBindForegroundService:" + f264834b);
        if (fp.h.c(26) && f264834b) {
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.live.core.mini.LiveForegroundService.class);
                com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(intent);
                z17 = true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiveMiniNotificationHelper", e17, "unBind foreground service error: %s", e17.getMessage());
                z17 = false;
            }
            if (z17) {
                f264834b = false;
            }
        }
    }
}
