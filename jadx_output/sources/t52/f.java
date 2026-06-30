package t52;

/* loaded from: classes11.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    public final r45.r53 a() {
        byte[] a17 = c52.c.a("mmkv_fuzzy_matched_bckup");
        if (a17 != null) {
            if (!(a17.length == 0)) {
                r45.r53 r53Var = new r45.r53();
                try {
                    r53Var.parseFrom(a17);
                    return r53Var;
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FuzzyMatchedBackup", e17, "FuzzyMatchedBackup, _read: %s", e17.getMessage());
                }
            }
        }
        return null;
    }

    public final void b(r45.r53 r53Var) {
        if (r53Var == null || r53Var.f384551d.isEmpty()) {
            return;
        }
        try {
            byte[] byteArray = r53Var.toByteArray();
            if (byteArray == null) {
                return;
            }
            c52.c.d("mmkv_fuzzy_matched_bckup", byteArray);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FuzzyMatchedBackup", e17, "FuzzyMatchedBackup, _write: %s", e17.getMessage());
        }
    }
}
