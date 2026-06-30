package yo;

/* loaded from: classes12.dex */
public class f {
    public static yo.d a(android.app.Application application, java.lang.String str) {
        try {
            yo.d dVar = (yo.d) com.tencent.mm.sdk.platformtools.x2.f193071a.getClassLoader().loadClass("com.tencent.mm" + str).newInstance();
            dVar.f464046a = application;
            return dVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ProfileFactoryImpl", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
