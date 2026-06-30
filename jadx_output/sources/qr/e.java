package qr;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final qr.e f366008a = new qr.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f366009b = new java.util.HashMap();

    public final void a(long j17, boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureCallbackDispatcher", "dispatch: " + j17 + ", " + z17 + ", " + str);
        pm0.v.X(new qr.b(j17, z17, str));
        if (((km0.c) gm0.j1.p().a()).a()) {
            android.content.Intent intent = new android.content.Intent("com.tencent.mm.Emoji_Capture_Upload");
            intent.putExtra("upload_time_enter", j17);
            intent.putExtra("upload_success", z17);
            intent.putExtra("upload_md5", str);
            intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        }
    }

    public final void b(long j17, qr.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        pm0.v.X(new qr.d(j17, callback));
    }
}
