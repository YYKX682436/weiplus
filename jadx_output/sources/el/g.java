package el;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f253697a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f253698b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f253699c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f253700d;

    /* renamed from: e, reason: collision with root package name */
    public final int f253701e;

    /* renamed from: f, reason: collision with root package name */
    public final int f253702f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f253703g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f253704h;

    /* renamed from: i, reason: collision with root package name */
    public final int f253705i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f253706j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f253707k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f253708l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f253709m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f253710n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f253711o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f253712p;

    /* renamed from: q, reason: collision with root package name */
    public final int f253713q;

    public g(java.lang.String appId, java.lang.String title, java.lang.String desc, java.lang.String identifier, int i17, int i18, java.lang.String url, java.lang.String nickName, int i19, java.lang.String page, java.lang.String query, java.lang.String thumbUrl, java.lang.String transferCtx, boolean z17, java.lang.String srcId, java.util.LinkedList excerptList, int i27) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(identifier, "identifier");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(thumbUrl, "thumbUrl");
        kotlin.jvm.internal.o.g(transferCtx, "transferCtx");
        kotlin.jvm.internal.o.g(srcId, "srcId");
        kotlin.jvm.internal.o.g(excerptList, "excerptList");
        this.f253697a = appId;
        this.f253698b = title;
        this.f253699c = desc;
        this.f253700d = identifier;
        this.f253701e = i17;
        this.f253702f = i18;
        this.f253703g = url;
        this.f253704h = nickName;
        this.f253705i = i19;
        this.f253706j = page;
        this.f253707k = query;
        this.f253708l = thumbUrl;
        this.f253709m = transferCtx;
        this.f253710n = z17;
        this.f253711o = srcId;
        this.f253712p = excerptList;
        this.f253713q = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el.g)) {
            return false;
        }
        el.g gVar = (el.g) obj;
        return kotlin.jvm.internal.o.b(this.f253697a, gVar.f253697a) && kotlin.jvm.internal.o.b(this.f253698b, gVar.f253698b) && kotlin.jvm.internal.o.b(this.f253699c, gVar.f253699c) && kotlin.jvm.internal.o.b(this.f253700d, gVar.f253700d) && this.f253701e == gVar.f253701e && this.f253702f == gVar.f253702f && kotlin.jvm.internal.o.b(this.f253703g, gVar.f253703g) && kotlin.jvm.internal.o.b(this.f253704h, gVar.f253704h) && this.f253705i == gVar.f253705i && kotlin.jvm.internal.o.b(this.f253706j, gVar.f253706j) && kotlin.jvm.internal.o.b(this.f253707k, gVar.f253707k) && kotlin.jvm.internal.o.b(this.f253708l, gVar.f253708l) && kotlin.jvm.internal.o.b(this.f253709m, gVar.f253709m) && this.f253710n == gVar.f253710n && kotlin.jvm.internal.o.b(this.f253711o, gVar.f253711o) && kotlin.jvm.internal.o.b(this.f253712p, gVar.f253712p) && this.f253713q == gVar.f253713q;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.f253697a.hashCode() * 31) + this.f253698b.hashCode()) * 31) + this.f253699c.hashCode()) * 31) + this.f253700d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f253701e)) * 31) + java.lang.Integer.hashCode(this.f253702f)) * 31) + this.f253703g.hashCode()) * 31) + this.f253704h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f253705i)) * 31) + this.f253706j.hashCode()) * 31) + this.f253707k.hashCode()) * 31) + this.f253708l.hashCode()) * 31) + this.f253709m.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f253710n)) * 31) + this.f253711o.hashCode()) * 31) + this.f253712p.hashCode()) * 31) + java.lang.Integer.hashCode(this.f253713q);
    }

    public java.lang.String toString() {
        return "LiteAppFavoriteAction(appId=" + this.f253697a + ", title=" + this.f253698b + ", desc=" + this.f253699c + ", identifier=" + this.f253700d + ", bizId=" + this.f253701e + ", mediaType=" + this.f253702f + ", url=" + this.f253703g + ", nickName=" + this.f253704h + ", jumpType=" + this.f253705i + ", page=" + this.f253706j + ", query=" + this.f253707k + ", thumbUrl=" + this.f253708l + ", transferCtx=" + this.f253709m + ", isTransparent=" + this.f253710n + ", srcId=" + this.f253711o + ", excerptList=" + this.f253712p + ", actionType=" + this.f253713q + ')';
    }
}
