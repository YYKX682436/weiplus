package fy4;

/* loaded from: classes.dex */
public final class b implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final fy4.b f267254a = new fy4.b();

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewInputConnectionHelper", "insertLineBreak result: " + str);
        if (str == null || kotlin.jvm.internal.o.b(str, "null")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebviewInputConnectionHelper", "insertLineBreak returned null, function may not exist or page not ready");
        }
    }
}
