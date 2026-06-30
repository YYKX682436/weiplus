package of1;

/* loaded from: classes8.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f344999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f345002g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f345003h;

    public s0(of1.v0 v0Var, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f344999d = v0Var;
        this.f345000e = str;
        this.f345001f = str2;
        this.f345002g = bundle;
        this.f345003h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f345000e;
        of1.v0 v0Var = this.f344999d;
        try {
            v0Var.g0().O(str, this.f345001f, nw4.a.a(this.f345002g), this.f345003h);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(v0Var.D1(), "stubCallback.onHandleEnd(), callbackId:" + str + ", exception:" + e17);
        }
    }
}
