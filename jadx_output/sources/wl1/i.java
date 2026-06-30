package wl1;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final wl1.a f447044a;

    public i(wl1.a invoker) {
        kotlin.jvm.internal.o.g(invoker, "invoker");
        this.f447044a = invoker;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String invokeHandler(java.lang.String str, java.lang.String str2, int i17) {
        if (!kotlin.jvm.internal.o.b(str, "log")) {
            return this.f447044a.a(str, str2, i17);
        }
        com.tencent.mars.xlog.Log.i("RichTextWebViewBridge", "log data:" + str2);
        return "";
    }
}
