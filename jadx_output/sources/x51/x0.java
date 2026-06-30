package x51;

/* loaded from: classes8.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x51.x0 f452109a = new x51.x0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f452110b;

    /* renamed from: c, reason: collision with root package name */
    public static final jt0.j f452111c;

    static {
        java.lang.String str = lp0.b.e() + "media_export.proto";
        f452110b = str;
        jt0.j jVar = new jt0.j(500);
        f452111c = jVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaExportLogic", "readFromCache");
        byte[] N = com.tencent.mm.vfs.w6.N(str, 0, -1);
        jVar.clear();
        if (N != null) {
            if (!(N.length == 0)) {
                try {
                    r45.dj4 dj4Var = new r45.dj4();
                    dj4Var.parseFrom(N);
                    java.util.LinkedList<r45.ej4> exportInfoList = dj4Var.f372530d;
                    kotlin.jvm.internal.o.f(exportInfoList, "exportInfoList");
                    for (r45.ej4 ej4Var : exportInfoList) {
                        jVar.put(ej4Var.f373571d, ej4Var);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaExportLogic", e17, "", new java.lang.Object[0]);
                    com.tencent.mm.vfs.w6.h(str);
                }
            }
        }
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        if (str != null && str2 != null) {
            r45.ej4 ej4Var = new r45.ej4();
            ej4Var.f373571d = str;
            ej4Var.f373572e = str2;
            f452111c.put(str, ej4Var);
            b();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaExportLogic", "saveExportUUID " + str + ", " + str2);
    }

    public final void b() {
        java.util.Map l17 = f452111c.l();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaExportLogic", "saveToCache " + l17.size());
        r45.dj4 dj4Var = new r45.dj4();
        java.util.Iterator it = l17.entrySet().iterator();
        while (it.hasNext()) {
            dj4Var.f372530d.add(((java.util.Map.Entry) it.next()).getValue());
        }
        try {
            com.tencent.mm.vfs.w6.R(f452110b, dj4Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaExportLogic", e17, "", new java.lang.Object[0]);
        }
    }
}
