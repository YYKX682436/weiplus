package hd1;

/* loaded from: classes7.dex */
public abstract class b implements hd1.d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.m2 f280385a;

    /* renamed from: b, reason: collision with root package name */
    public volatile yz5.q f280386b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f280387c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f280388d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f280389e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.nfc.rw.logic.AbsNFCDiscoverable$sysNfcSwitchToggleListener$1 f280390f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.tencent.mm.plugin.appbrand.jsapi.nfc.rw.logic.AbsNFCDiscoverable$sysNfcSwitchToggleListener$1, android.content.BroadcastReceiver] */
    public b(java.lang.String appId, com.tencent.mm.plugin.appbrand.utils.m2 activityProvider) {
        android.content.Context applicationContext;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(activityProvider, "activityProvider");
        this.f280385a = activityProvider;
        this.f280387c = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
        this.f280388d = new java.util.concurrent.atomic.AtomicBoolean(false);
        ?? r07 = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.appbrand.jsapi.nfc.rw.logic.AbsNFCDiscoverable$sysNfcSwitchToggleListener$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                if (intent == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsNFCDiscoverable", "onReceive#sysNfcSwitchToggleListener, state is null");
                    return;
                }
                int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", -1);
                if (-1 == intExtra) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AbsNFCDiscoverable", "onReceive#sysNfcSwitchToggleListener, state is invalid");
                    return;
                }
                boolean z17 = 3 == intExtra;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AbsNFCDiscoverable", "onReceive#sysNfcSwitchToggleListener, isNFCEnabled: " + z17);
                if (z17) {
                    return;
                }
                hd1.b bVar = hd1.b.this;
                bVar.f280388d.set(false);
                bVar.f280389e = false;
            }
        };
        this.f280390f = r07;
        android.app.Activity a17 = ((com.tencent.mm.plugin.appbrand.utils.k3) activityProvider).a();
        if (a17 != null && (applicationContext = a17.getApplicationContext()) != 0) {
            applicationContext.registerReceiver(r07, new android.content.IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"));
        }
        com.tencent.mm.plugin.appbrand.x0.a(appId, new hd1.a(this));
    }
}
