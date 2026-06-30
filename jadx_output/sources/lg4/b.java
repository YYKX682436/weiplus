package lg4;

/* loaded from: classes.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(lg4.b bVar, java.lang.String str) {
        bVar.getClass();
        if (com.tencent.mars.xlog.Log.getLogLevel() == 0 && z65.c.a()) {
            pm0.v.X(new lg4.a(str));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.SurfaceProcessorCommand", str);
    }
}
