package x52;

/* loaded from: classes15.dex */
public abstract class e {
    public static r45.d16 a() {
        byte[] a17 = c52.c.a("mkv_k_hellsionpgcldc");
        if (a17 == null || a17.length <= 0) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionPageCloudConfigDao", "HellSessionPageCloudConfigDao read(): NULL");
            return null;
        }
        r45.d16 d16Var = new r45.d16();
        try {
            d16Var.parseFrom(a17);
            return d16Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionPageCloudConfigDao", e17, "HellSessionPageCloudConfigDao read", new java.lang.Object[0]);
            return null;
        }
    }
}
