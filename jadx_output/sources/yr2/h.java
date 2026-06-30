package yr2;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ek4.b f464672a;

    /* renamed from: b, reason: collision with root package name */
    public final int f464673b;

    /* renamed from: c, reason: collision with root package name */
    public final long f464674c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f464675d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f464676e;

    /* renamed from: f, reason: collision with root package name */
    public final mn2.g4 f464677f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f464678g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f464679h;

    /* renamed from: i, reason: collision with root package name */
    public final cs2.n f464680i;

    static {
        new yr2.h(new ek4.b(), 0, 0L, "", "", new mn2.g4(new r45.mb4(), com.tencent.mm.plugin.finder.storage.y90.R, "xV99", 0, 0, null, false, null, 248, null), false, false, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
    }

    public h(ek4.b taskContext, int i17, long j17, java.lang.String fileFormat, java.lang.String codingFormat, mn2.g4 media, boolean z17, boolean z18, cs2.n preloadStage, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 64) != 0 ? false : z17;
        z18 = (i18 & 128) != 0 ? false : z18;
        preloadStage = (i18 & 256) != 0 ? cs2.n.f222079d : preloadStage;
        kotlin.jvm.internal.o.g(taskContext, "taskContext");
        kotlin.jvm.internal.o.g(fileFormat, "fileFormat");
        kotlin.jvm.internal.o.g(codingFormat, "codingFormat");
        kotlin.jvm.internal.o.g(media, "media");
        kotlin.jvm.internal.o.g(preloadStage, "preloadStage");
        this.f464672a = taskContext;
        this.f464673b = i17;
        this.f464674c = j17;
        this.f464675d = fileFormat;
        this.f464676e = codingFormat;
        this.f464677f = media;
        this.f464678g = z17;
        this.f464679h = z18;
        this.f464680i = preloadStage;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr2.h)) {
            return false;
        }
        yr2.h hVar = (yr2.h) obj;
        return kotlin.jvm.internal.o.b(this.f464672a, hVar.f464672a) && this.f464673b == hVar.f464673b && this.f464674c == hVar.f464674c && kotlin.jvm.internal.o.b(this.f464675d, hVar.f464675d) && kotlin.jvm.internal.o.b(this.f464676e, hVar.f464676e) && kotlin.jvm.internal.o.b(this.f464677f, hVar.f464677f) && this.f464678g == hVar.f464678g && this.f464679h == hVar.f464679h && this.f464680i == hVar.f464680i;
    }

    public int hashCode() {
        return (((((((((((((((this.f464672a.hashCode() * 31) + java.lang.Integer.hashCode(this.f464673b)) * 31) + java.lang.Long.hashCode(this.f464674c)) * 31) + this.f464675d.hashCode()) * 31) + this.f464676e.hashCode()) * 31) + this.f464677f.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f464678g)) * 31) + java.lang.Boolean.hashCode(this.f464679h)) * 31) + this.f464680i.hashCode();
    }

    public java.lang.String toString() {
        return this.f464673b + "%:" + this.f464674c + ':' + this.f464675d + ':' + this.f464679h;
    }
}
