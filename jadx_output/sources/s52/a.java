package s52;

/* loaded from: classes13.dex */
public final class a {
    public final r45.i53 a() {
        byte[] a17 = c52.c.a("hell_fntbck_pter_mmkv_key");
        if (a17 == null || a17.length <= 0) {
            return null;
        }
        r45.i53 i53Var = new r45.i53();
        try {
            i53Var.parseFrom(a17);
            return i53Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FrontBackDao", e17, "_doReadFrontBack parse", new java.lang.Object[0]);
            return null;
        }
    }

    public final void b(r45.i53 i53Var) {
        try {
            c52.c.d("hell_fntbck_pter_mmkv_key", i53Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FrontBackDao", e17, "writeBackFrontBack", new java.lang.Object[0]);
        }
    }
}
