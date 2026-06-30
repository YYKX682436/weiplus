package x52;

/* loaded from: classes9.dex */
public abstract class g {
    public static r45.l16 a() {
        byte[] a17 = c52.c.a("mkv_k_hellsubascld");
        if (a17 == null || a17.length <= 0) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionUBACloudConfigDao", "HellSessionUBACloudConfigDao read(): NULL");
            return null;
        }
        r45.l16 l16Var = new r45.l16();
        try {
            l16Var.parseFrom(a17);
            return l16Var;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionUBACloudConfigDao", e17, "SessionUBACloudConfig read", new java.lang.Object[0]);
            return null;
        }
    }
}
