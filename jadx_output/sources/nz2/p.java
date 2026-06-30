package nz2;

/* loaded from: classes9.dex */
public class p implements re4.z {
    public p(nz2.x xVar) {
    }

    @Override // re4.z
    public void h(int i17, java.lang.String str) {
        if (i17 == 0 && cu5.b.c()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "init success: %s", java.lang.Integer.valueOf(i17));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "init failed: %s, %s", java.lang.Integer.valueOf(i17), str);
        }
    }
}
