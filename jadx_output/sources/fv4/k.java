package fv4;

/* loaded from: classes8.dex */
public final class k extends fv4.g {
    @Override // fv4.g
    public void a() {
        this.f267005a = null;
    }

    @Override // fv4.g
    public android.view.View b() {
        fv4.i iVar = this.f267005a;
        if (iVar != null) {
            return iVar.f267010d;
        }
        return null;
    }

    @Override // fv4.g
    public void c(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.String content = "Unknown Logic handling method call: " + call.method;
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.e("MicroMsg.UnknownLogic", content);
    }
}
