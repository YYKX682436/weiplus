package x52;

/* loaded from: classes15.dex */
public final class j {
    public j(kotlin.jvm.internal.i iVar) {
    }

    public final r45.h16 a() {
        byte[] a17 = c52.c.a("mmkv_sionpairD_table_hell");
        if (a17 != null) {
            if (!(a17.length == 0)) {
                r45.h16 h16Var = new r45.h16();
                try {
                    h16Var.parseFrom(a17);
                    return h16Var;
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.SessionPairDao", e17, "SessionPair, _read: %s", e17.getMessage());
                }
            }
        }
        return null;
    }

    public final void b(r45.h16 h16Var) {
        if (h16Var == null) {
            return;
        }
        try {
            byte[] byteArray = h16Var.toByteArray();
            if (byteArray == null) {
                return;
            }
            c52.c.d("mmkv_sionpairD_table_hell", byteArray);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.SessionPairDao", e17, "SessionPair, _write: %s", e17.getMessage());
        }
    }
}
