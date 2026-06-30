package mk1;

/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f327122a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f327123b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f327124c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f327125d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f327126e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Long f327127f;

    public w(java.lang.String srcUrl, java.lang.String finalSrcUrl, boolean z17, java.lang.String str, java.lang.String str2, java.lang.Long l17) {
        kotlin.jvm.internal.o.g(srcUrl, "srcUrl");
        kotlin.jvm.internal.o.g(finalSrcUrl, "finalSrcUrl");
        this.f327122a = srcUrl;
        this.f327123b = finalSrcUrl;
        this.f327124c = z17;
        this.f327125d = str;
        this.f327126e = str2;
        this.f327127f = l17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk1.w)) {
            return false;
        }
        mk1.w wVar = (mk1.w) obj;
        return kotlin.jvm.internal.o.b(this.f327122a, wVar.f327122a) && kotlin.jvm.internal.o.b(this.f327123b, wVar.f327123b) && this.f327124c == wVar.f327124c && kotlin.jvm.internal.o.b(this.f327125d, wVar.f327125d) && kotlin.jvm.internal.o.b(this.f327126e, wVar.f327126e) && kotlin.jvm.internal.o.b(this.f327127f, wVar.f327127f);
    }

    public int hashCode() {
        int hashCode = ((((this.f327122a.hashCode() * 31) + this.f327123b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f327124c)) * 31;
        java.lang.String str = this.f327125d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f327126e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l17 = this.f327127f;
        return hashCode3 + (l17 != null ? l17.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "VideoDataSourceBasicPack(srcUrl=" + this.f327122a + ", finalSrcUrl=" + this.f327123b + ", isHls=" + this.f327124c + ", contentType=" + this.f327125d + ", transferEncoding=" + this.f327126e + ", totalContentLength=" + this.f327127f + ')';
    }
}
