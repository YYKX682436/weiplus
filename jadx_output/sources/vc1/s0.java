package vc1;

/* loaded from: classes13.dex */
public class s0 implements lk1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f435167d;

    public s0(vc1.p1 p1Var) {
        this.f435167d = p1Var;
    }

    @Override // lk1.b
    public void j(int i17, java.lang.String str, lk1.a aVar) {
        vc1.p1 p1Var = this.f435167d;
        p1Var.B = false;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "errCode:%d, errStr:%s", java.lang.Integer.valueOf(i17), str);
            return;
        }
        double d17 = aVar.f318996a;
        if (!nf.t.b(com.tencent.mm.sdk.platformtools.x2.f193071a, null, "android.permission.ACCESS_FINE_LOCATION")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Map.DefaultTencentMapView", "refresh location fail, no perrmission");
        } else if ((p1Var.f435063b0 || p1Var.A) && !p1Var.f435070f) {
            ik1.h0.b(new vc1.r0(this, aVar));
        }
    }
}
