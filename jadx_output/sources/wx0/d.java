package wx0;

/* loaded from: classes5.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public static void a(wx0.d dVar, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        java.lang.String str;
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        dVar.getClass();
        if (z17) {
            return;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (aVar == null || (str = (java.lang.String) aVar.invoke()) == null) {
            str = "Assertion failed";
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BackgroundPlugin", str);
    }
}
