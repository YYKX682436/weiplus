package j7;

/* loaded from: classes13.dex */
public final class g implements j7.d {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f298006d;

    /* renamed from: e, reason: collision with root package name */
    public final j7.c f298007e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f298008f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f298009g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.BroadcastReceiver f298010h = new j7.f(this);

    public g(android.content.Context context, j7.c cVar) {
        this.f298006d = context.getApplicationContext();
        this.f298007e = cVar;
    }

    public boolean i(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        q7.n.b(connectivityManager);
        try {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (java.lang.RuntimeException unused) {
            android.util.Log.isLoggable("ConnectivityMonitor", 5);
            return true;
        }
    }

    @Override // j7.k
    public void onDestroy() {
    }

    @Override // j7.k
    public void onStart() {
        if (this.f298009g) {
            return;
        }
        android.content.Context context = this.f298006d;
        this.f298008f = i(context);
        try {
            context.registerReceiver(this.f298010h, new android.content.IntentFilter(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION));
            this.f298009g = true;
        } catch (java.lang.SecurityException unused) {
            android.util.Log.isLoggable("ConnectivityMonitor", 5);
        }
    }

    @Override // j7.k
    public void onStop() {
        if (this.f298009g) {
            this.f298006d.unregisterReceiver(this.f298010h);
            this.f298009g = false;
        }
    }
}
