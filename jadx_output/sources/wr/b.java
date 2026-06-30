package wr;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f448728a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f448729b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f448730c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f448731d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f448732e;

    public b(java.lang.String md52, java.lang.String url, java.lang.String aesKey, java.lang.String savingPath, yz5.p pVar) {
        kotlin.jvm.internal.o.g(md52, "md5");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        kotlin.jvm.internal.o.g(savingPath, "savingPath");
        this.f448728a = md52;
        this.f448729b = url;
        this.f448730c = aesKey;
        this.f448731d = savingPath;
        this.f448732e = pVar;
    }

    public final void a() {
        yz5.p pVar = this.f448732e;
        if (pVar != null) {
            pVar.invoke(b(), java.lang.Boolean.FALSE);
        }
    }

    public final java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f448728a);
        sb6.append('_');
        byte[] bytes = this.f448729b.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(uk.k.d(bytes));
        return sb6.toString();
    }
}
