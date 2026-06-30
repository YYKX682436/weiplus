package r35;

/* loaded from: classes15.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final r35.y f369326a = new r35.y();

    static {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizImageDownloadUtil", "updateEnableImageBlankReport %b", java.lang.Boolean.TRUE);
    }

    public final boolean a(int i17) {
        return qk.c.f() && (i17 == 1 || i17 == 3 || i17 == 2);
    }

    public final boolean b(int i17) {
        return i17 == 1;
    }

    public final int c(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        if (d(str)) {
            return 1;
        }
        return !(str == null || str.length() == 0) && kotlin.jvm.internal.o.b(str, "image/webp") ? 2 : 0;
    }

    public final boolean d(java.lang.String str) {
        return !(str == null || str.length() == 0) && kotlin.jvm.internal.o.b(str, "image/wxpic");
    }
}
