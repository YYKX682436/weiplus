package dk2;

/* loaded from: classes5.dex */
public final class pg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f233931d;

    public pg(android.content.Intent intent) {
        this.f233931d = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent = this.f233931d;
        if (intent != null) {
            com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("live_exception_monitor");
            if (kotlin.jvm.internal.o.b("android.intent.action.SCREEN_ON", intent.getAction())) {
                R.putBoolean("PARAM_IS_SCREEN_OFF", false);
            } else if (kotlin.jvm.internal.o.b("android.intent.action.SCREEN_OFF", intent.getAction())) {
                R.putBoolean("PARAM_IS_SCREEN_OFF", true);
            }
        }
    }
}
