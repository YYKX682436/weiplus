package lu4;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f321429a;

    /* renamed from: b, reason: collision with root package name */
    public final lu4.b f321430b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f321431c;

    public a(java.lang.String name, lu4.b context) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(context, "context");
        this.f321429a = name;
        this.f321430b = context;
        this.f321431c = "MicroMsg.JSAPI." + getClass().getSimpleName() + ':' + context.getClass().getSimpleName();
    }

    public final void a(com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime) {
        kotlin.jvm.internal.o.g(jsRuntime, "jsRuntime");
        jsRuntime.addJavascriptInterface(this, this.f321429a);
    }
}
