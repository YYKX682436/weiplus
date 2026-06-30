package lo3;

/* loaded from: classes8.dex */
public enum g {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final nb.c f320188d = new lo3.d(this);

    /* renamed from: e, reason: collision with root package name */
    public nb.f f320189e = null;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.ServiceConnection f320190f = new lo3.f(this);

    g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    public java.util.ArrayList h() {
        java.util.ArrayList arrayList;
        java.lang.String str = "MicroMsg.VAFM";
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(str, "check error: " + th6);
            arrayList = new java.util.ArrayList();
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_disable_vivo_antifraud_detect_service, 0) > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VAFM", "disable vafm");
            arrayList = new java.util.ArrayList();
        } else {
            nb.f fVar = this.f320189e;
            if (fVar == null) {
                arrayList = new java.util.ArrayList();
            } else {
                android.os.Bundle e17 = ((nb.d) fVar).e();
                if (e17 == null) {
                    arrayList = new java.util.ArrayList();
                } else {
                    e17.setClassLoader(com.iqoo.secure.antifraud.thirdpart.CheckRiskResult.class.getClassLoader());
                    int i17 = e17.getInt("retCode");
                    if (i17 != 1) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.VAFM", "check fail: " + i17);
                        arrayList = new java.util.ArrayList();
                    } else {
                        if (e17.getParcelableArrayList("riskResult") != null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList = new java.util.ArrayList();
                    }
                }
            }
        }
        str = arrayList.size();
        return str <= 50 ? arrayList : new java.util.ArrayList(arrayList.subList(0, 50));
    }
}
