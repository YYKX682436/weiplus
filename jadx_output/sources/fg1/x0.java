package fg1;

/* loaded from: classes7.dex */
public final class x0 extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.AudioManager f261917a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(android.content.Context context, android.os.Handler handler) {
        super(handler);
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f261917a = (android.media.AudioManager) systemService;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        com.tencent.mars.xlog.Log.i("SettingsContentObserver", "Volume now " + this.f261917a.getStreamVolume(3));
    }
}
