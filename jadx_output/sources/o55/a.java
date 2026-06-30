package o55;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f343162a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f343163b;

    /* renamed from: c, reason: collision with root package name */
    public final long f343164c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f343165d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f343166e;

    /* renamed from: f, reason: collision with root package name */
    public final int f343167f;

    /* renamed from: g, reason: collision with root package name */
    public final long f343168g;

    /* renamed from: h, reason: collision with root package name */
    public final int f343169h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f343170i;

    public a(int i17, java.lang.String workTagId, long j17, java.lang.String videoMixPath, java.lang.String thumbPath, int i18, long j18, int i19, byte[] bArr, int i27, kotlin.jvm.internal.i iVar) {
        i18 = (i27 & 32) != 0 ? -1 : i18;
        j18 = (i27 & 64) != 0 ? 0L : j18;
        i19 = (i27 & 128) != 0 ? 0 : i19;
        bArr = (i27 & 256) != 0 ? null : bArr;
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        kotlin.jvm.internal.o.g(videoMixPath, "videoMixPath");
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        this.f343162a = i17;
        this.f343163b = workTagId;
        this.f343164c = j17;
        this.f343165d = videoMixPath;
        this.f343166e = thumbPath;
        this.f343167f = i18;
        this.f343168g = j18;
        this.f343169h = i19;
        this.f343170i = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o55.a)) {
            return false;
        }
        o55.a aVar = (o55.a) obj;
        return this.f343162a == aVar.f343162a && kotlin.jvm.internal.o.b(this.f343163b, aVar.f343163b) && this.f343164c == aVar.f343164c && kotlin.jvm.internal.o.b(this.f343165d, aVar.f343165d) && kotlin.jvm.internal.o.b(this.f343166e, aVar.f343166e) && this.f343167f == aVar.f343167f && this.f343168g == aVar.f343168g && this.f343169h == aVar.f343169h && kotlin.jvm.internal.o.b(this.f343170i, aVar.f343170i);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((java.lang.Integer.hashCode(this.f343162a) * 31) + this.f343163b.hashCode()) * 31) + java.lang.Long.hashCode(this.f343164c)) * 31) + this.f343165d.hashCode()) * 31) + this.f343166e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f343167f)) * 31) + java.lang.Long.hashCode(this.f343168g)) * 31) + java.lang.Integer.hashCode(this.f343169h)) * 31;
        byte[] bArr = this.f343170i;
        return hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr));
    }

    public java.lang.String toString() {
        return "BackgroundVideoBean(workType=" + this.f343162a + ", workTagId=" + this.f343163b + ", confirmRemuxTime=" + this.f343164c + ", videoMixPath=" + this.f343165d + ", thumbPath=" + this.f343166e + ", muxResult=" + this.f343167f + ", muxFinishTime=" + this.f343168g + ", exportVideoDurationMs=" + this.f343169h + ", extInfo=" + java.util.Arrays.toString(this.f343170i) + ')';
    }
}
