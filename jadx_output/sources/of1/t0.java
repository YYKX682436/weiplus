package of1;

/* loaded from: classes7.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f345006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f345007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345008f;

    public t0(of1.v0 v0Var, int i17, java.lang.String str) {
        this.f345006d = v0Var;
        this.f345007e = i17;
        this.f345008f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f345007e;
        of1.v0 v0Var = this.f345006d;
        try {
            v0Var.z0(i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(v0Var.D1(), "stubCallback.setFontSizeCb(" + this.f345008f + '(' + i17 + ")), exception:" + e17);
        }
    }
}
