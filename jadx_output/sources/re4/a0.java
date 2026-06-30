package re4;

/* loaded from: classes4.dex */
public class a0 implements zt5.d {
    @Override // zt5.d
    public void a(java.lang.String str, java.lang.Throwable th6, java.lang.String str2) {
        com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, str2, new java.lang.Object[0]);
    }

    @Override // zt5.d
    public void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
    }

    @Override // zt5.d
    public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.e(str, str2, objArr);
    }

    @Override // zt5.d
    public void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i(str, str2, objArr);
    }

    @Override // zt5.d
    public void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
    }

    @Override // zt5.d
    public void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.w(str, str2, objArr);
    }
}
