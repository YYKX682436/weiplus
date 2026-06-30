package r75;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f393252d;

    public b(android.content.Context context) {
        this.f393252d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final android.content.Context context = this.f393252d;
        context.registerReceiver(new android.content.BroadcastReceiver() { // from class: com.tencent.mm.sdk.systemservicecache.NetworkCache$initCache$1$1$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                kotlin.jvm.internal.o.g(context2, "context");
                kotlin.jvm.internal.o.g(intent, "intent");
                ((ku5.t0) ku5.t0.f312615d).h(new r75.a(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            }
        }, new android.content.IntentFilter(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION));
    }
}
