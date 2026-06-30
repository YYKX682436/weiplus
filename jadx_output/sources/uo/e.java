package uo;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f429509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f429510e;

    public e(android.content.Context context, yz5.a aVar) {
        this.f429509d = context;
        this.f429510e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f429509d;
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return;
        }
        yz5.a aVar = this.f429510e;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.CameraCompat", "showFailView");
        ap.a.a(1, "openCameraErrAlert", new java.lang.Throwable(), null, new java.lang.String[0]);
    }
}
