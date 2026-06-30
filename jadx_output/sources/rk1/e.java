package rk1;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f396404a;

    /* renamed from: b, reason: collision with root package name */
    public final int f396405b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f396406c;

    /* renamed from: d, reason: collision with root package name */
    public final java.nio.ByteBuffer f396407d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f396408e;

    /* renamed from: f, reason: collision with root package name */
    public final ft.d4 f396409f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f396410g;

    public e(java.lang.String appId, int i17, java.lang.String packageMD5, java.nio.ByteBuffer wasmBuffer, java.lang.String wasmPath, ft.d4 listener, java.util.List list) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(packageMD5, "packageMD5");
        kotlin.jvm.internal.o.g(wasmBuffer, "wasmBuffer");
        kotlin.jvm.internal.o.g(wasmPath, "wasmPath");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f396404a = appId;
        this.f396405b = i17;
        this.f396406c = packageMD5;
        this.f396407d = wasmBuffer;
        this.f396408e = wasmPath;
        this.f396409f = listener;
        this.f396410g = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk1.e)) {
            return false;
        }
        rk1.e eVar = (rk1.e) obj;
        return kotlin.jvm.internal.o.b(this.f396404a, eVar.f396404a) && this.f396405b == eVar.f396405b && kotlin.jvm.internal.o.b(this.f396406c, eVar.f396406c) && kotlin.jvm.internal.o.b(this.f396407d, eVar.f396407d) && kotlin.jvm.internal.o.b(this.f396408e, eVar.f396408e) && kotlin.jvm.internal.o.b(this.f396409f, eVar.f396409f) && kotlin.jvm.internal.o.b(this.f396410g, eVar.f396410g);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f396404a.hashCode() * 31) + java.lang.Integer.hashCode(this.f396405b)) * 31) + this.f396406c.hashCode()) * 31) + this.f396407d.hashCode()) * 31) + this.f396408e.hashCode()) * 31) + this.f396409f.hashCode()) * 31;
        java.util.List list = this.f396410g;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public java.lang.String toString() {
        return "TaskQueueData(appId=" + this.f396404a + ", appVersion=" + this.f396405b + ", packageMD5=" + this.f396406c + ", wasmBuffer=" + this.f396407d + ", wasmPath=" + this.f396408e + ", listener=" + this.f396409f + ", funcList=" + this.f396410g + ')';
    }
}
