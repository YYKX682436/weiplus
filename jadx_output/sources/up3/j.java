package up3;

/* loaded from: classes12.dex */
public class j implements up3.p {
    @Override // up3.a
    public java.lang.Object a(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) ((java.util.Map) obj).get(up3.o.f429842h);
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e(up3.o.f429838d, "[-] Explained by src 5.");
        } else {
            try {
                com.tencent.mm.vfs.r6 c17 = up3.b.c(tp3.b.a("§§´¥ì±¬"), ".zip");
                up3.b.b(up3.b.f(), c17, new up3.i(this, java.util.regex.Pattern.compile(str)), null);
                up3.o.a(c17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(up3.o.f429838d, th6, "[-] Explained by src 6: %s", str);
            }
        }
        return null;
    }
}
