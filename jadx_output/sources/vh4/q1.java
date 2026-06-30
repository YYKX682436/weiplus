package vh4;

@j95.b
/* loaded from: classes7.dex */
public final class q1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final android.net.Uri f437121d = android.provider.Settings.Secure.getUriFor("minors_mode_enabled");

    /* renamed from: e, reason: collision with root package name */
    public final android.database.ContentObserver f437122e = new vh4.p1();

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModePushService", "onCreate registerContentObserver");
        context.getContentResolver().registerContentObserver(this.f437121d, false, this.f437122e);
    }
}
