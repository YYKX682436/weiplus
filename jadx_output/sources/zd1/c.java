package zd1;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzd1/c;", "Lcom/tencent/mm/plugin/appbrand/jsapi/g0;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class c implements com.tencent.mm.plugin.appbrand.jsapi.g0 {

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f471527f = jz5.h.b(zd1.a.f471520d);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f471528d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f471529e;

    public c(boolean z17, java.lang.String[] types) {
        kotlin.jvm.internal.o.g(types, "types");
        this.f471528d = z17;
        this.f471529e = types;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd1.c)) {
            return false;
        }
        zd1.c cVar = (zd1.c) obj;
        return this.f471528d == cVar.f471528d && kotlin.jvm.internal.o.b(this.f471529e, cVar.f471529e);
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f471528d) * 31) + java.util.Arrays.hashCode(this.f471529e);
    }

    public java.lang.String toString() {
        return "AcquireWebviewDomConfig(enabled=" + this.f471528d + ", types=" + java.util.Arrays.toString(this.f471529e) + ')';
    }

    public c() {
        this(false, new java.lang.String[0]);
    }
}
