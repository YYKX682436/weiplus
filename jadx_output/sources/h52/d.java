package h52;

/* loaded from: classes15.dex */
public final class d extends h52.a {
    public final r45.x1 a() {
        byte[] a17 = c52.c.a("hell_aty_action_mmkv_key");
        if (a17 == null || a17.length <= 0) {
            return null;
        }
        r45.x1 x1Var = new r45.x1();
        try {
            x1Var.parseFrom(a17);
            return x1Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.ActivityDao_MMKV", e17, "HellhoundDao _doRead parse", new java.lang.Object[0]);
            return null;
        }
    }

    public final void b(r45.x1 x1Var) {
        try {
            c52.c.d("hell_aty_action_mmkv_key", x1Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.ActivityDao_MMKV", e17, "HellhoundDao writeBack", new java.lang.Object[0]);
        }
    }
}
