package yf;

/* loaded from: classes7.dex */
public class n0 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f461423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf.f f461424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461425f;

    public n0(yf.i0 i0Var, android.app.Activity activity, sf.f fVar) {
        this.f461425f = i0Var;
        this.f461423d = activity;
        this.f461424e = fVar;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        yf.i0 i0Var = this.f461425f;
        com.tencent.mars.xlog.Log.i(i0Var.x(), "onRequestPermissionsResult callback, requestCode:%d", java.lang.Integer.valueOf(i17));
        sf.f fVar = this.f461424e;
        if (i17 == 117) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                com.tencent.mars.xlog.Log.i(i0Var.x(), "onRequestPermissionsResult callback, camera permission not grant");
                com.tencent.mars.xlog.Log.i(i0Var.x(), "doInvokeInsertAfterRequestPermission, invoke insertInternal");
                fVar.a(jc1.g.f298942n);
            } else {
                com.tencent.mm.sdk.platformtools.u3.i(new yf.m0(this), 50L);
            }
        }
        si1.e1.b(fVar.getAppId(), this);
    }
}
