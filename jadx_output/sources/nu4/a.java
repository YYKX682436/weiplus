package nu4;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final r45.l83 f340233a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.m83 f340234b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f340235c;

    /* renamed from: d, reason: collision with root package name */
    public int f340236d;

    /* renamed from: e, reason: collision with root package name */
    public int f340237e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f340238f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f340239g;

    public a(r45.l83 domain, r45.m83 manifest, java.lang.String str, int i17, int i18, boolean z17, java.lang.String str2, int i19, kotlin.jvm.internal.i iVar) {
        str = (i19 & 4) != 0 ? null : str;
        i17 = (i19 & 8) != 0 ? 0 : i17;
        i18 = (i19 & 16) != 0 ? 0 : i18;
        z17 = (i19 & 32) != 0 ? false : z17;
        str2 = (i19 & 64) != 0 ? null : str2;
        kotlin.jvm.internal.o.g(domain, "domain");
        kotlin.jvm.internal.o.g(manifest, "manifest");
        this.f340233a = domain;
        this.f340234b = manifest;
        this.f340235c = str;
        this.f340236d = i17;
        this.f340237e = i18;
        this.f340238f = z17;
        this.f340239g = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu4.a)) {
            return false;
        }
        nu4.a aVar = (nu4.a) obj;
        return kotlin.jvm.internal.o.b(this.f340233a, aVar.f340233a) && kotlin.jvm.internal.o.b(this.f340234b, aVar.f340234b) && kotlin.jvm.internal.o.b(this.f340235c, aVar.f340235c) && this.f340236d == aVar.f340236d && this.f340237e == aVar.f340237e && this.f340238f == aVar.f340238f && kotlin.jvm.internal.o.b(this.f340239g, aVar.f340239g);
    }

    public int hashCode() {
        int hashCode = ((this.f340233a.hashCode() * 31) + this.f340234b.hashCode()) * 31;
        java.lang.String str = this.f340235c;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f340236d)) * 31) + java.lang.Integer.hashCode(this.f340237e)) * 31) + java.lang.Boolean.hashCode(this.f340238f)) * 31;
        java.lang.String str2 = this.f340239g;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PrefetchManifest(domain=" + this.f340233a + ", manifest=" + this.f340234b + ", extInfo=" + this.f340235c + ", bizScene=" + this.f340236d + ", subBizScene=" + this.f340237e + ", debug=" + this.f340238f + ", manifestKey=" + this.f340239g + ')';
    }
}
