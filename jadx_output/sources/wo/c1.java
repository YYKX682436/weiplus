package wo;

/* loaded from: classes14.dex */
public class c1 implements android.hardware.Camera.AutoFocusCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.hardware.Camera.AutoFocusCallback f447641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo.d1 f447642e;

    public c1(wo.d1 d1Var, android.hardware.Camera.AutoFocusCallback autoFocusCallback) {
        this.f447642e = d1Var;
        this.f447641d = autoFocusCallback;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        if (this.f447642e.f447654c) {
            return;
        }
        this.f447641d.onAutoFocus(z17, camera);
    }
}
