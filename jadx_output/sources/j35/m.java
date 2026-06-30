package j35;

/* loaded from: classes13.dex */
public class m implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f297514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j35.b0 f297515b;

    public m(android.app.Activity activity, j35.b0 b0Var) {
        this.f297514a = activity;
        this.f297515b = b0Var;
    }

    @Override // j35.b0
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.f297514a.onRequestPermissionsResult(i17, strArr, iArr);
        j35.b0 b0Var = this.f297515b;
        if (b0Var != null) {
            b0Var.onRequestPermissionsResult(i17, strArr, iArr);
        }
    }
}
