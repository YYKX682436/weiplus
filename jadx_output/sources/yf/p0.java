package yf;

/* loaded from: classes7.dex */
public class p0 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f461430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf.f f461431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461432f;

    public p0(yf.i0 i0Var, android.app.Activity activity, sf.f fVar) {
        this.f461432f = i0Var;
        this.f461430d = activity;
        this.f461431e = fVar;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        yf.i0 i0Var = this.f461432f;
        com.tencent.mars.xlog.Log.i(i0Var.x(), "onRequestPermissionsResult callback, requestCode:%d", java.lang.Integer.valueOf(i17));
        sf.f fVar = this.f461431e;
        if (i17 == 118) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                com.tencent.mars.xlog.Log.i(i0Var.x(), "onRequestPermissionsResult callback, microphone permission not grant");
                com.tencent.mars.xlog.Log.i(i0Var.x(), "doInvokeInsertAfterRequestPermission, invoke insertInternal");
                fVar.a(jc1.g.f298942n);
            } else {
                com.tencent.mm.sdk.platformtools.u3.i(new yf.o0(this), 50L);
            }
        }
        si1.e1.b(fVar.getAppId(), this);
    }
}
