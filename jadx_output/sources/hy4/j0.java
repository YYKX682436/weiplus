package hy4;

/* loaded from: classes7.dex */
public final class j0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hy4.k0 f286119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f286120b;

    public j0(hy4.k0 k0Var, yz5.a aVar) {
        this.f286119a = k0Var;
        this.f286120b = aVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        this.f286119a.d();
        hy4.k0 k0Var = this.f286119a;
        hy4.i0 i0Var = new hy4.i0(k0Var, (java.lang.String) obj, this.f286120b);
        k0Var.f286143y = i0Var;
        android.os.Looper.myQueue().addIdleHandler(i0Var);
    }
}
