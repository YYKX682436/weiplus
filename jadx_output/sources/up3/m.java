package up3;

/* loaded from: classes12.dex */
public class m implements up3.p {
    @Override // up3.a
    public java.lang.Object a(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) ((java.util.Map) obj).get(up3.o.f429844m);
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e(up3.o.f429838d, "filePath NULL");
        } else {
            try {
                com.tencent.mm.vfs.r6 c17 = up3.b.c(tp3.b.a("µ¾³ì±¬"), ".zip");
                up3.b.b(new com.tencent.mm.vfs.r6(str), c17, null, null);
                up3.o.a(c17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(up3.o.f429838d, th6, "[-] faild op %s", str);
            }
        }
        return null;
    }
}
