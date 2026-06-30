package z43;

/* loaded from: classes8.dex */
public class m0 implements vz.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z43.n0 f470125a;

    public m0(z43.n0 n0Var) {
        this.f470125a = n0Var;
    }

    @Override // vz.w1
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("LiteAppJsApiShowCloudGameUI", str);
        this.f470125a.f143443f.a(str);
    }

    @Override // vz.w1
    public void onDismiss() {
        this.f470125a.f143443f.a("onDismiss");
    }
}
