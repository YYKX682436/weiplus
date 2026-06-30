package la3;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f317517a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f317518b;

    /* renamed from: c, reason: collision with root package name */
    public final int f317519c;

    /* renamed from: d, reason: collision with root package name */
    public final int f317520d;

    /* renamed from: e, reason: collision with root package name */
    public final int f317521e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f317522f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f317523g;

    /* renamed from: h, reason: collision with root package name */
    public final la3.a f317524h;

    public d(int i17, java.lang.String url, int i18, int i19, int i27, boolean z17, java.lang.String appId, la3.a aVar) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f317517a = i17;
        this.f317518b = url;
        this.f317519c = i18;
        this.f317520d = i19;
        this.f317521e = i27;
        this.f317522f = z17;
        this.f317523g = appId;
        this.f317524h = aVar;
    }

    public final void a(java.lang.String eventName, java.util.Map params) {
        kotlin.jvm.internal.o.g(eventName, "eventName");
        kotlin.jvm.internal.o.g(params, "params");
        la3.a aVar = this.f317524h;
        if (aVar != null) {
            la3.j jVar = (la3.j) aVar;
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppWebviewView", "the " + eventName + " is called, params is " + params);
                io.flutter.plugin.common.MethodChannel methodChannel = jVar.f317539d;
                if (methodChannel != null) {
                    methodChannel.invokeMethod(eventName, params);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppWebviewView", "the " + eventName + " exception: " + th6.getMessage());
            }
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la3.d)) {
            return false;
        }
        la3.d dVar = (la3.d) obj;
        return this.f317517a == dVar.f317517a && kotlin.jvm.internal.o.b(this.f317518b, dVar.f317518b) && this.f317519c == dVar.f317519c && this.f317520d == dVar.f317520d && this.f317521e == dVar.f317521e && this.f317522f == dVar.f317522f && kotlin.jvm.internal.o.b(this.f317523g, dVar.f317523g) && kotlin.jvm.internal.o.b(this.f317524h, dVar.f317524h);
    }

    public int hashCode() {
        int hashCode = ((((((((((((java.lang.Integer.hashCode(this.f317517a) * 31) + this.f317518b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f317519c)) * 31) + java.lang.Integer.hashCode(this.f317520d)) * 31) + java.lang.Integer.hashCode(this.f317521e)) * 31) + java.lang.Boolean.hashCode(this.f317522f)) * 31) + this.f317523g.hashCode()) * 31;
        la3.a aVar = this.f317524h;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public java.lang.String toString() {
        return "LiteAppWebViewData(id=" + this.f317517a + ", url=" + this.f317518b + ", appUuid=" + this.f317519c + ", pageId=" + this.f317520d + ", nodeId=" + this.f317521e + ", isTransparent=" + this.f317522f + ", appId=" + this.f317523g + ", onEvent=" + this.f317524h + ')';
    }
}
