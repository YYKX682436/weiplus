package j35;

/* loaded from: classes13.dex */
public class l implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f297512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j35.b0 f297513b;

    public l(android.app.Activity activity, j35.b0 b0Var) {
        this.f297512a = activity;
        this.f297513b = b0Var;
    }

    @Override // j35.b0
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.f297512a.onRequestPermissionsResult(i17, strArr, iArr);
        j35.b0 b0Var = this.f297513b;
        if (b0Var != null) {
            b0Var.onRequestPermissionsResult(i17, strArr, iArr);
        }
    }
}
