package og5;

/* loaded from: classes10.dex */
public abstract class g {
    public static android.graphics.drawable.Drawable a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.gif.b bVar;
        if (((og5.f) i95.n0.c(og5.f.class)) != null) {
            try {
                bVar = com.tencent.mm.plugin.gif.d.c().a(str, str2);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAnimateService", th6, "", new java.lang.Object[0]);
                bVar = null;
            }
            if (bVar instanceof android.graphics.drawable.Drawable) {
                return bVar;
            }
        }
        return null;
    }
}
