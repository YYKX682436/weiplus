package h53;

/* loaded from: classes7.dex */
public class n implements com.tencent.mm.plugin.appbrand.jsruntime.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h53.p f279062a;

    public n(h53.p pVar) {
        this.f279062a = pVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.s
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGameJsRuntimeImpl", "handleException, message : %s\n, stackTrace : %s", str, str2);
        java.lang.String format = java.lang.String.format("try {WxGameJsCoreBridge.invokeError(\"%s\");} catch(e) {console.log(e);}", u46.k.a("exception : " + str + " ; stack : " + str2));
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameJsRuntimeImpl", "handleException, js = %s", format);
        this.f279062a.evaluateJavascript(format, null);
    }
}
