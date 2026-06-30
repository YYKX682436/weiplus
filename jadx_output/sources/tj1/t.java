package tj1;

/* loaded from: classes7.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f419715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tj1.u f419716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f419717f;

    public t(com.tencent.mm.plugin.appbrand.e9 e9Var, tj1.u uVar, int i17) {
        this.f419715d = e9Var;
        this.f419716e = uVar;
        this.f419717f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f419715d;
        e9Var.t3().m(new tj1.s(e9Var, this.f419716e, this.f419717f));
    }
}
