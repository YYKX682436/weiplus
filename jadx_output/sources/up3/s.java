package up3;

/* loaded from: classes12.dex */
public class s extends up3.f0 {
    @Override // up3.f0
    public boolean a(java.lang.Object obj) {
        return tp3.b.a("í¨ª· \u0099¨¤¤ºç").equals(((up3.c0) obj).f429822b);
    }

    @Override // up3.f0
    public void b(java.lang.Object obj) {
        up3.c0 c0Var = (up3.c0) obj;
        try {
            com.tencent.mm.vfs.r6 g17 = up3.b.g();
            com.tencent.mm.vfs.r6 e17 = up3.d0.e();
            up3.b.b(g17, e17, null, "" + tp3.b.a("ðì®¢¦\u00ad§¾½¡·µ®¯¯øã") + com.tencent.mm.sdk.platformtools.z.f193111g + "\n" + tp3.b.a("ææµ¥·øã") + com.tencent.mm.sdk.platformtools.z.f193109e + "\n");
            up3.d0.a(c0Var.f429821a, e17.o(), true);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(up3.d0.f429823d, th6, "explained by code.", new java.lang.Object[0]);
        }
    }
}
