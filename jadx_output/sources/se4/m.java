package se4;

/* loaded from: classes9.dex */
public class m extends ju5.n0 {
    @Override // ju5.n0
    public void h(java.lang.String str, int[] iArr) {
        for (int i17 : iArr) {
            java.lang.String d17 = re4.g0.d(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterTaskInitForWX", "scene: %d, authKeyName: %s", java.lang.Integer.valueOf(i17), d17);
            fu5.d.b().a().put(i17, d17);
        }
    }
}
