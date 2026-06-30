package ta1;

/* loaded from: classes7.dex */
public class c0 implements com.hilive.mediasdk.LogDelegate.ILog {
    public c0(ta1.q0 q0Var) {
    }

    @Override // com.hilive.mediasdk.LogDelegate.ILog
    public void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
    }

    @Override // com.hilive.mediasdk.LogDelegate.ILog
    public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.e(str, str2, objArr);
    }

    @Override // com.hilive.mediasdk.LogDelegate.ILog
    public void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i(str, str2, objArr);
    }

    @Override // com.hilive.mediasdk.LogDelegate.ILog
    public void printStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, str2, objArr);
    }

    @Override // com.hilive.mediasdk.LogDelegate.ILog
    public void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
    }

    @Override // com.hilive.mediasdk.LogDelegate.ILog
    public void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.w(str, str2, objArr);
    }
}
