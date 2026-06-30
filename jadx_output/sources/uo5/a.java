package uo5;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f429711a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f429712b;

    /* renamed from: c, reason: collision with root package name */
    public final android.media.MediaFormat f429713c;

    public a(boolean z17, java.lang.String mime, android.media.MediaFormat mediaFormat) {
        kotlin.jvm.internal.o.g(mime, "mime");
        kotlin.jvm.internal.o.g(mediaFormat, "mediaFormat");
        this.f429711a = z17;
        this.f429712b = mime;
        this.f429713c = mediaFormat;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo5.a)) {
            return false;
        }
        uo5.a aVar = (uo5.a) obj;
        return this.f429711a == aVar.f429711a && kotlin.jvm.internal.o.b(this.f429712b, aVar.f429712b) && kotlin.jvm.internal.o.b(this.f429713c, aVar.f429713c);
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f429711a) * 31) + this.f429712b.hashCode()) * 31) + this.f429713c.hashCode();
    }

    public java.lang.String toString() {
        return "CodecConfig(encode=" + this.f429711a + ", mime=" + this.f429712b + ", mediaFormat=" + this.f429713c + ')';
    }
}
