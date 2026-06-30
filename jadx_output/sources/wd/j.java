package wd;

/* loaded from: classes7.dex */
public class j implements ah.g {
    public j(wd.k kVar) {
    }

    @Override // ah.g
    public void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
    }

    @Override // ah.g
    public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.e(str, str2, objArr);
    }

    @Override // ah.g
    public void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i(str, str2, objArr);
    }

    @Override // ah.g
    public void printStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, str2, objArr);
    }

    @Override // ah.g
    public void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.w(str, str2, objArr);
    }
}
