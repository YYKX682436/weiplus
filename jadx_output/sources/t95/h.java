package t95;

/* loaded from: classes11.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f416593a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f416594b;

    static {
        java.lang.String str = java.io.File.separator;
        f416593a = str;
        f416594b = "testfile" + ((java.lang.Object) str) + "temp" + ((java.lang.Object) str);
    }

    public static final java.io.File a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f416594b;
        java.lang.String separator = f416593a;
        kotlin.jvm.internal.o.f(separator, "separator");
        sb6.append(r26.i0.o(str, separator, false, 2, null) ? f416594b : kotlin.jvm.internal.o.m(f416594b, separator));
        sb6.append("mm_compressor_");
        sb6.append(java.lang.System.nanoTime());
        sb6.append(".file");
        java.io.File file = new java.io.File(sb6.toString());
        if (file.exists()) {
            file.delete();
        }
        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            java.lang.String msg = kotlin.jvm.internal.o.m("createTmpFile but cant not mkdir :", file.getParentFile().getAbsolutePath());
            kotlin.jvm.internal.o.g(msg, "msg");
            t95.d.f416589a.e("MicroMsg.TempFile", msg);
        }
        java.lang.String msg2 = kotlin.jvm.internal.o.m("createTmpFile:", file.getAbsolutePath());
        kotlin.jvm.internal.o.g(msg2, "msg");
        t95.d.f416589a.i("MicroMsg.TempFile", msg2);
        file.createNewFile();
        return file;
    }
}
