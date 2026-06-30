package sd;

/* loaded from: classes8.dex */
public class g extends sd.l0 {

    /* renamed from: f, reason: collision with root package name */
    public final sd.h f406601f;

    /* renamed from: g, reason: collision with root package name */
    public od.l f406602g;

    public g(android.content.Context context, java.lang.Class cls) {
        sd.h hVar = (sd.h) new d56.b(cls, cls).d(context).f226632b;
        this.f406601f = hVar;
        h("var self = this;", null);
        h("let require = process.mainModule.require;", null);
        this.f406602g = new od.l(hVar);
        h(ik1.f.e("LuggageBridge.js"), null);
        hVar.injectInitScript();
    }

    @Override // sd.l0
    public void a() {
        this.f406601f.destroy();
    }

    @Override // sd.l0
    public od.l d() {
        return this.f406602g;
    }

    @Override // sd.l0
    public java.lang.String e() {
        return this.f406601f.getUserAgent();
    }

    public void h(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f406601f.evaluateJavascript(str, valueCallback);
    }
}
