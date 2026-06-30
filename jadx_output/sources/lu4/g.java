package lu4;

/* loaded from: classes7.dex */
public final class g extends lu4.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f321434d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String tagName) {
        super("console", new lu4.f());
        kotlin.jvm.internal.o.g(tagName, "tagName");
        this.f321434d = tagName;
    }

    @android.webkit.JavascriptInterface
    public final void error(java.lang.Object... objects) {
        kotlin.jvm.internal.o.g(objects, "objects");
        com.tencent.mars.xlog.Log.e(this.f321431c, "JsError[" + this.f321434d + "]:" + kz5.z.d0(objects, ",", null, null, 0, null, null, 62, null));
    }

    @android.webkit.JavascriptInterface
    public final void info(java.lang.Object... objects) {
        kotlin.jvm.internal.o.g(objects, "objects");
        com.tencent.mars.xlog.Log.i(this.f321431c, "JsInfo[" + this.f321434d + "]:" + kz5.z.d0(objects, ",", null, null, 0, null, null, 62, null));
    }

    @android.webkit.JavascriptInterface
    public final void log(java.lang.Object... objects) {
        kotlin.jvm.internal.o.g(objects, "objects");
        if (com.tencent.mars.xlog.Log.getLogLevel() < 1) {
            kz5.z.d0(objects, ",", null, null, 0, null, null, 62, null);
        }
    }

    @android.webkit.JavascriptInterface
    public final void warn(java.lang.Object... objects) {
        kotlin.jvm.internal.o.g(objects, "objects");
        com.tencent.mars.xlog.Log.w(this.f321431c, "JsInfo[" + this.f321434d + "]:" + kz5.z.d0(objects, ",", null, null, 0, null, null, 62, null));
    }
}
