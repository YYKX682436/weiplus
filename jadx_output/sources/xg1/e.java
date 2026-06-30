package xg1;

/* loaded from: classes7.dex */
public final class e implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final int f454366d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f454367e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f454368f;

    public e(int i17, java.lang.String TAG, yz5.a onProgressLoadSuccess) {
        kotlin.jvm.internal.o.g(TAG, "TAG");
        kotlin.jvm.internal.o.g(onProgressLoadSuccess, "onProgressLoadSuccess");
        this.f454366d = i17;
        this.f454367e = onProgressLoadSuccess;
        this.f454368f = "AppBrandPreLoadingServiceConnection[" + TAG + ']';
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        bj1.c aVar;
        java.lang.String str = this.f454368f;
        com.tencent.mars.xlog.Log.i(str, "onServiceConnected: name = " + componentName);
        int i17 = bj1.b.f21139d;
        if (iBinder == null) {
            aVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCall");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof bj1.c)) ? new bj1.a(iBinder) : (bj1.c) queryLocalInterface;
        }
        try {
            if (aVar.c4(0) == 1) {
                this.f454367e.invoke();
                com.tencent.mars.xlog.Log.i(str, "onServiceConnected: IPC_TRIGGER_PROGRESS_SUCCESS");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "onServiceConnected: ", e17);
            xg1.h.f454370a.a(this.f454366d);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.mars.xlog.Log.i(this.f454368f, "disconnected");
    }
}
