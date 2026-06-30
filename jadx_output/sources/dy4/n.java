package dy4;

/* loaded from: classes8.dex */
public final class n extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f244688a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f244689b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.os.Handler handler, java.lang.ref.WeakReference weakEventHandler) {
        super(handler);
        kotlin.jvm.internal.o.g(weakEventHandler, "weakEventHandler");
        this.f244688a = weakEventHandler;
        this.f244689b = "MicroMsg.BrightnessObserver";
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        try {
            dy4.w wVar = (dy4.w) this.f244688a.get();
            if (wVar == null) {
                return;
            }
            org.json.JSONObject c17 = wVar.c();
            c17.put("selfChange", z17);
            wVar.a("onBrightnessChange", c17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e(this.f244689b, "onBrightnessChange fail  " + e17.getMessage());
        }
    }
}
