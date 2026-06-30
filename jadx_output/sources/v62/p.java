package v62;

/* loaded from: classes12.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    public static v62.p f433527b;

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f433528a = null;

    public static void a(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14869, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public static v62.p b() {
        v62.p pVar;
        v62.p pVar2 = f433527b;
        if (pVar2 != null) {
            return pVar2;
        }
        synchronized (v62.p.class) {
            if (f433527b == null) {
                f433527b = new v62.p();
            }
            pVar = f433527b;
        }
        return pVar;
    }

    public static void c(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14868, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public final v62.o d(v62.i iVar) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        v62.o oVar = (v62.o) new v62.l(this, 5000L, new v62.o(true), true, iVar).a(new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()));
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = oVar != null ? oVar.toString() : "null";
        objArr[1] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtQrCodeHandler", "hy: resolved qrcode: %s, using: %d ms", objArr);
        return oVar;
    }
}
