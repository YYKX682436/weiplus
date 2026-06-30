package qx4;

/* loaded from: classes8.dex */
public final class e extends av4.q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qx4.b uiComponent) {
        super(uiComponent);
        kotlin.jvm.internal.o.g(uiComponent, "uiComponent");
    }

    @Override // av4.q
    public boolean d() {
        return com.tencent.mm.app.w.INSTANCE.f53889n;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String handleJSCall(java.lang.String str) {
        java.lang.String c17;
        av4.q qVar = this.f14327b;
        if (qVar != null && (c17 = qVar.c(str)) != null) {
            return c17;
        }
        java.lang.String jSONObject = f().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }
}
