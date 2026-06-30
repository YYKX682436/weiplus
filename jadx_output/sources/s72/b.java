package s72;

/* loaded from: classes11.dex */
public final class b extends java.lang.Exception {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f403989d;

    /* renamed from: e, reason: collision with root package name */
    public final int f403990e;

    /* renamed from: f, reason: collision with root package name */
    public final int f403991f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f403992g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String uri, int i17, int i18, java.lang.String str) {
        super("NetSceneFavSync[" + r26.n0.p0(uri, "/", "") + "] returns error: errorType=" + i17 + ", errorCode=" + i18 + ", errorMsg=" + str);
        kotlin.jvm.internal.o.g(uri, "uri");
        this.f403989d = uri;
        this.f403990e = i17;
        this.f403991f = i18;
        this.f403992g = str;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "uri:" + this.f403989d + ", errorType: " + this.f403990e + " errorCode: " + this.f403991f + " msg: " + this.f403992g;
    }
}
