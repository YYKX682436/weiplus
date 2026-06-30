package ts0;

/* loaded from: classes10.dex */
public final class e implements android.hardware.Camera.AutoFocusCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts0.l f421552d;

    public e(ts0.l lVar) {
        this.f421552d = lVar;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        java.lang.String str;
        ts0.l lVar = this.f421552d;
        java.lang.String str2 = lVar.f421558w;
        lVar.f421523e.f430457k = true;
        if (lVar.K) {
            return;
        }
        try {
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            kotlin.jvm.internal.o.f(parameters, "getParameters(...)");
            if (parameters.getFocusMode() == null || (str = lVar.f421523e.f430458l) == null) {
                return;
            }
            parameters.setFocusMode(str);
            camera.setParameters(parameters);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e(lVar.f421558w, "auto focus return while camera is release");
        }
    }
}
