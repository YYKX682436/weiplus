package x52;

/* loaded from: classes11.dex */
public abstract class b {
    public static synchronized r45.v06 a() {
        synchronized (x52.b.class) {
            byte[] a17 = c52.c.a("mkv_k_hellsscld");
            if (a17 != null && a17.length > 0) {
                r45.v06 v06Var = new r45.v06();
                try {
                    v06Var.parseFrom(a17);
                    return v06Var;
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionCloudConfigDao", e17, "SessionConfigCloud read", new java.lang.Object[0]);
                    return null;
                }
            }
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionCloudConfigDao", "HellSessionCloudConfigDao read(): NULL");
            return null;
        }
    }

    public static synchronized void b(r45.v06 v06Var) {
        synchronized (x52.b.class) {
            try {
                c52.c.d("mkv_k_hellsscld", v06Var.toByteArray());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionCloudConfigDao", e17, "HellSessionCloudConfigDao writeBack", new java.lang.Object[0]);
            }
        }
    }
}
