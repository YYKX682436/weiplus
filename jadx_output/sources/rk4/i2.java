package rk4;

/* loaded from: classes.dex */
public final class i2 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f396711a;

    public i2(rk4.l3 l3Var) {
        this.f396711a = l3Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "OpenLiteApp fail");
        db5.t7.makeText(this.f396711a.f396817e, com.tencent.mm.R.string.ggb, 0).show();
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "OpenLiteApp success");
    }
}
