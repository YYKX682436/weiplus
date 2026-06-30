package kr5;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f311536a = 5;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f311537b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f311538c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f311539d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f311540e = 2000;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f311541f = "DesHttp";

    /* renamed from: g, reason: collision with root package name */
    public int f311542g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f311543h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f311544i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f311545j = false;

    public kr5.g a() {
        if (android.text.TextUtils.isEmpty(this.f311538c)) {
            throw new java.lang.IllegalArgumentException("dnsId".concat(" can not be empty"));
        }
        if (this.f311541f != "Https" && android.text.TextUtils.isEmpty(this.f311539d)) {
            throw new java.lang.IllegalArgumentException("dnsKey".concat(" can not be empty"));
        }
        if (this.f311541f == "Https" && android.text.TextUtils.isEmpty("")) {
            throw new java.lang.IllegalArgumentException("token".concat(" can not be empty"));
        }
        return new kr5.g(this.f311536a, this.f311537b, "", false, this.f311538c, this.f311539d, "", this.f311540e, null, null, true, null, null, this.f311541f, false, false, this.f311542g, null, null, this.f311543h, null, this.f311544i, this.f311545j, "", java.lang.Boolean.FALSE, null);
    }

    public synchronized kr5.f b(or5.c cVar) {
        if (cVar == null) {
            throw new java.lang.IllegalArgumentException("logNode".concat(" can not be null"));
        }
        if (this.f311543h == null) {
            this.f311543h = new java.util.ArrayList();
        }
        this.f311543h.add(cVar);
        return this;
    }
}
