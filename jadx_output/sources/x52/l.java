package x52;

/* loaded from: classes15.dex */
public final class l {
    public l(kotlin.jvm.internal.i iVar) {
    }

    public final r45.k16 a() {
        byte[] a17 = c52.c.a("mmkv_sionId_table_hell");
        if (a17 != null) {
            if (!(a17.length == 0)) {
                r45.k16 k16Var = new r45.k16();
                try {
                    k16Var.parseFrom(a17);
                    return k16Var;
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FuzzyMatchedBackup", e17, "SessionTable, _read: %s", e17.getMessage());
                }
            }
        }
        return null;
    }
}
