package yu3;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f465851a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f465852b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f465853c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f465854d;

    /* renamed from: e, reason: collision with root package name */
    public final long f465855e;

    /* renamed from: f, reason: collision with root package name */
    public final long f465856f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f465857g;

    /* renamed from: h, reason: collision with root package name */
    public final int f465858h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f465859i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f465860j;

    public a(int i17, boolean z17, java.lang.String videoPath, java.util.ArrayList imageList, long j17, long j18, boolean z18, int i18, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(imageList, "imageList");
        this.f465851a = i17;
        this.f465852b = z17;
        this.f465853c = videoPath;
        this.f465854d = imageList;
        this.f465855e = j17;
        this.f465856f = j18;
        this.f465857g = z18;
        this.f465858h = i18;
        this.f465859i = gVar;
        this.f465860j = gVar2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu3.a)) {
            return false;
        }
        yu3.a aVar = (yu3.a) obj;
        return this.f465851a == aVar.f465851a && this.f465852b == aVar.f465852b && kotlin.jvm.internal.o.b(this.f465853c, aVar.f465853c) && kotlin.jvm.internal.o.b(this.f465854d, aVar.f465854d) && this.f465855e == aVar.f465855e && this.f465856f == aVar.f465856f && this.f465857g == aVar.f465857g && this.f465858h == aVar.f465858h && kotlin.jvm.internal.o.b(this.f465859i, aVar.f465859i) && kotlin.jvm.internal.o.b(this.f465860j, aVar.f465860j);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((java.lang.Integer.hashCode(this.f465851a) * 31) + java.lang.Boolean.hashCode(this.f465852b)) * 31) + this.f465853c.hashCode()) * 31) + this.f465854d.hashCode()) * 31) + java.lang.Long.hashCode(this.f465855e)) * 31) + java.lang.Long.hashCode(this.f465856f)) * 31) + java.lang.Boolean.hashCode(this.f465857g)) * 31) + java.lang.Integer.hashCode(this.f465858h)) * 31;
        com.tencent.mm.protobuf.g gVar = this.f465859i;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        com.tencent.mm.protobuf.g gVar2 = this.f465860j;
        return hashCode2 + (gVar2 != null ? gVar2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CreateInfoOfGetRecommendTask(sceneValue=" + this.f465851a + ", isSimpleRequest=" + this.f465852b + ", videoPath=" + this.f465853c + ", imageList=" + this.f465854d + ", startTime=" + this.f465855e + ", endTime=" + this.f465856f + ", autoPlayAudio=" + this.f465857g + ", bgmListScene=" + this.f465858h + ", classifyResultData=" + this.f465859i + ", promptRawText=" + this.f465860j + ')';
    }

    public /* synthetic */ a(int i17, boolean z17, java.lang.String str, java.util.ArrayList arrayList, long j17, long j18, boolean z18, int i18, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, int i19, kotlin.jvm.internal.i iVar) {
        this(i17, (i19 & 2) != 0 ? false : z17, (i19 & 4) != 0 ? "" : str, (i19 & 8) != 0 ? new java.util.ArrayList() : arrayList, (i19 & 16) != 0 ? 0L : j17, (i19 & 32) == 0 ? j18 : 0L, (i19 & 64) != 0 ? false : z18, (i19 & 128) == 0 ? i18 : 0, (i19 & 256) != 0 ? null : gVar, (i19 & 512) == 0 ? gVar2 : null);
    }
}
