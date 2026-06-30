package dz4;

/* loaded from: classes8.dex */
public final class c1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dz4.d1 f245180a;

    public c1(dz4.d1 d1Var) {
        this.f245180a = d1Var;
    }

    @Override // q80.f0
    public void fail() {
        dz4.d1 d1Var = this.f245180a;
        com.tencent.mars.xlog.Log.i(d1Var.f245197b, "OpenLiteApp fail");
        d1Var.a();
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i(this.f245180a.f245197b, "OpenLiteApp success");
    }
}
