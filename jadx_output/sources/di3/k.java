package di3;

/* loaded from: classes10.dex */
public class k implements android.hardware.Camera.AutoFocusCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ di3.n f232725d;

    public k(di3.n nVar) {
        this.f232725d = nVar;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        di3.l lVar = this.f232725d.C;
        di3.n.R = true;
    }
}
