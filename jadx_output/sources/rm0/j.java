package rm0;

/* loaded from: classes11.dex */
public final class j extends java.lang.Exception {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f397423d;

    /* renamed from: e, reason: collision with root package name */
    public final int f397424e;

    /* renamed from: f, reason: collision with root package name */
    public final int f397425f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f397426g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.protobuf.f f397427h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String uri, int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f resp) {
        super("CGI[" + r26.n0.p0(uri, "/", "") + "] returns error: errorType=" + i17 + ", errorCode=" + i18 + ", resMsg=" + str);
        kotlin.jvm.internal.o.g(uri, "uri");
        kotlin.jvm.internal.o.g(resp, "resp");
        this.f397423d = uri;
        this.f397424e = i17;
        this.f397425f = i18;
        this.f397426g = str;
        this.f397427h = resp;
    }

    public final int a() {
        return this.f397425f;
    }

    public final int b() {
        return this.f397424e;
    }

    public final java.lang.String c() {
        return this.f397426g;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "uri:" + this.f397423d + ", errorType: " + this.f397424e + " errorCode: " + this.f397425f + " msg: " + this.f397426g;
    }
}
