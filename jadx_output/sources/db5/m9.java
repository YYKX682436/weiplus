package db5;

/* loaded from: classes8.dex */
public abstract class m9 {

    /* renamed from: a, reason: collision with root package name */
    public static int f228442a = -1;

    public static void a(boolean z17, android.content.Intent intent) {
        boolean z18 = f228442a != z17;
        f228442a = z17 ? 1 : 0;
        if (!z18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.UIStatusUtil", "isRealSend = false,just return!");
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setAction(z17 ? "com.tencent.mm.ui.ACTION_ACTIVE" : "com.tencent.mm.ui.ACTION_DEACTIVE");
        intent.putExtra("_application_context_process_", bm5.f1.a());
        intent.putExtra("process_id", android.os.Process.myPid());
        intent.putExtra("process_is_mm", com.tencent.mm.sdk.platformtools.x2.n());
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent, com.tencent.mm.sdk.platformtools.v9.a());
    }
}
