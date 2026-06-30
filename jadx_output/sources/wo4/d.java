package wo4;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f448250a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.p1 f448251b;

    /* renamed from: c, reason: collision with root package name */
    public final fs0.f f448252c;

    /* renamed from: d, reason: collision with root package name */
    public final hs0.a f448253d;

    /* renamed from: e, reason: collision with root package name */
    public final long f448254e;

    /* renamed from: f, reason: collision with root package name */
    public final long f448255f;

    public d(int i17, com.tencent.mm.plugin.vlog.model.p1 material, fs0.f decoder, hs0.a mediaExtractor, long j17, long j18) {
        kotlin.jvm.internal.o.g(material, "material");
        kotlin.jvm.internal.o.g(decoder, "decoder");
        kotlin.jvm.internal.o.g(mediaExtractor, "mediaExtractor");
        this.f448250a = i17;
        this.f448251b = material;
        this.f448252c = decoder;
        this.f448253d = mediaExtractor;
        this.f448254e = j17;
        this.f448255f = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo4.d)) {
            return false;
        }
        wo4.d dVar = (wo4.d) obj;
        return this.f448250a == dVar.f448250a && kotlin.jvm.internal.o.b(this.f448251b, dVar.f448251b) && kotlin.jvm.internal.o.b(this.f448252c, dVar.f448252c) && kotlin.jvm.internal.o.b(this.f448253d, dVar.f448253d) && this.f448254e == dVar.f448254e && this.f448255f == dVar.f448255f;
    }

    public int hashCode() {
        return (((((((((java.lang.Integer.hashCode(this.f448250a) * 31) + this.f448251b.hashCode()) * 31) + this.f448252c.hashCode()) * 31) + this.f448253d.hashCode()) * 31) + java.lang.Long.hashCode(this.f448254e)) * 31) + java.lang.Long.hashCode(this.f448255f);
    }

    public java.lang.String toString() {
        return "VideoDecoder(index=" + this.f448250a + ", material=" + this.f448251b + ", decoder=" + this.f448252c + ", mediaExtractor=" + this.f448253d + ", startTime=" + this.f448254e + ", endTime=" + this.f448255f + ')';
    }
}
