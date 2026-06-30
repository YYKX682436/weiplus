package d22;

/* loaded from: classes12.dex */
public final class h0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d22.k0 f225845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f225846b;

    public h0(d22.k0 k0Var, android.content.Context context) {
        this.f225845a = k0Var;
        this.f225846b = context;
    }

    @Override // q80.f0
    public void fail() {
        d22.k0 k0Var = this.f225845a;
        com.tencent.mars.xlog.Log.i(k0Var.f225853j, "OpenLiteApp expose fail");
        k0Var.a(this.f225846b);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i(this.f225845a.f225853j, "OpenLiteApp expose success");
    }
}
