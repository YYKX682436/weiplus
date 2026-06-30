package df2;

/* loaded from: classes10.dex */
public final class e2 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.k2 f230030a;

    public e2(df2.k2 k2Var) {
        this.f230030a = k2Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int hashCode = action.hashCode();
            df2.k2 k2Var = this.f230030a;
            if (hashCode == -2128145023) {
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "ScreenStateReceiver - Screen OFF (locked)");
                    if (k2Var.f230549r.compareAndSet(false, true)) {
                        k2Var.f230550s.a(true, k2Var.b7());
                        return;
                    }
                    return;
                }
                return;
            }
            if (hashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) {
                com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "ScreenStateReceiver - User present (unlocked)");
                if (k2Var.f230549r.compareAndSet(true, false)) {
                    k2Var.f230550s.a(false, k2Var.b7());
                }
            }
        }
    }
}
