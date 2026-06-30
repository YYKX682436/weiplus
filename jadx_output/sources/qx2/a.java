package qx2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f367322a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f367323b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f367324c;

    public a(java.lang.String content, java.lang.String highLightInContent, java.lang.String url) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(highLightInContent, "highLightInContent");
        kotlin.jvm.internal.o.g(url, "url");
        this.f367322a = content;
        this.f367323b = highLightInContent;
        this.f367324c = url;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx2.a)) {
            return false;
        }
        qx2.a aVar = (qx2.a) obj;
        return kotlin.jvm.internal.o.b(this.f367322a, aVar.f367322a) && kotlin.jvm.internal.o.b(this.f367323b, aVar.f367323b) && kotlin.jvm.internal.o.b(this.f367324c, aVar.f367324c);
    }

    public int hashCode() {
        return (((this.f367322a.hashCode() * 31) + this.f367323b.hashCode()) * 31) + this.f367324c.hashCode();
    }

    public java.lang.String toString() {
        return "LawData(content=" + this.f367322a + ", highLightInContent=" + this.f367323b + ", url=" + this.f367324c + ')';
    }

    public /* synthetic */ a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? "" : str3);
    }
}
