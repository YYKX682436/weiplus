package sc3;

/* loaded from: classes7.dex */
public final class y implements kq5.f {
    @Override // kq5.f
    public void e(java.lang.String str, java.lang.String str2, java.lang.Object... var3) {
        kotlin.jvm.internal.o.g(var3, "var3");
        com.tencent.mars.xlog.Log.e(str, str2, var3);
    }

    @Override // kq5.f
    public void i(java.lang.String str, java.lang.String str2, java.lang.Object... var3) {
        kotlin.jvm.internal.o.g(var3, "var3");
        com.tencent.mars.xlog.Log.i(str, str2, var3);
    }

    @Override // kq5.f
    public void printStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... var4) {
        kotlin.jvm.internal.o.g(var4, "var4");
        com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, str2, var4);
    }
}
