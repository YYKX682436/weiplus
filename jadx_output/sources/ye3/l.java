package ye3;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ye3.l f461225d = new ye3.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.magicbrush.g7 g7Var;
        try {
            g7Var = (com.tencent.mm.plugin.magicbrush.g7) i95.n0.c(com.tencent.mm.plugin.magicbrush.g7.class);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MB_External_surface_DB", "[mediaCacheStorage] init failed", e17);
        }
        if (g7Var == null) {
            com.tencent.mars.xlog.Log.e("MB_External_surface_DB", "[mediaCacheStorage] service is null");
            return null;
        }
        ye3.o Bi = g7Var.Bi();
        if (Bi != null) {
            return Bi;
        }
        com.tencent.mars.xlog.Log.e("MB_External_surface_DB", "[mediaCacheStorage] storage is null");
        return Bi;
    }
}
