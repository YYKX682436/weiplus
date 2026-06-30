package fm3;

/* loaded from: classes10.dex */
public final class p implements fm3.o {

    /* renamed from: j, reason: collision with root package name */
    public static long f264094j;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f264095a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f264096b;

    /* renamed from: c, reason: collision with root package name */
    public long f264097c;

    /* renamed from: d, reason: collision with root package name */
    public int f264098d;

    /* renamed from: e, reason: collision with root package name */
    public int f264099e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f264100f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f264101g;

    /* renamed from: h, reason: collision with root package name */
    public long f264102h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f264103i;

    public p(java.lang.String mediaId, java.lang.String videoPath, long j17, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        this.f264095a = mediaId;
        this.f264096b = videoPath;
        this.f264097c = j17;
        this.f264098d = i17;
        this.f264099e = i18;
        this.f264101g = true;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        this.f264103i = finderObject;
        long a17 = c01.id.a();
        long j18 = f264094j;
        if (j18 == a17) {
            f264094j = j18 + 1;
        } else {
            f264094j = a17;
        }
        java.lang.String str = "local_" + f264094j;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = new com.tencent.mm.protocal.protobuf.FinderMedia();
        finderMedia.setUrl(videoPath);
        finderObject.setObjectNonceId(str);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = new com.tencent.mm.protocal.protobuf.FinderObjectDesc();
        finderObjectDesc.getMedia().add(finderMedia);
        finderObject.setObjectDesc(finderObjectDesc);
    }

    @Override // fm3.o
    public void a(long j17) {
        this.f264102h = j17;
    }

    @Override // fm3.o
    public boolean b() {
        return this.f264101g;
    }

    @Override // fm3.o
    public void c(long j17) {
        this.f264097c = j17;
    }

    @Override // fm3.o
    public long d() {
        return this.f264102h;
    }

    @Override // fm3.o
    public dk4.a e() {
        dk4.a aVar = new dk4.a(this.f264095a, this.f264096b, "", this.f264098d, this.f264099e);
        aVar.f234464a = 2;
        aVar.f234465b = "xV2";
        aVar.f234468e = true;
        qc0.d1 Ai = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).Ai(this.f264096b, true);
        aVar.f234470g = Ai != null ? Ai.f361366d : 0L;
        aVar.f234474k = Ai != null ? Ai.f361368f : 0;
        return aVar;
    }

    @Override // fm3.o
    public com.tencent.mm.protocal.protobuf.FinderObject f() {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media3;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = null;
        if (this.f264100f) {
            return null;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f264103i;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia2 = (objectDesc == null || (media3 = objectDesc.getMedia()) == null) ? null : media3.get(0);
        if (finderMedia2 != null) {
            finderMedia2.setWidth(this.f264098d);
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderObject.getObjectDesc();
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia3 = (objectDesc2 == null || (media2 = objectDesc2.getMedia()) == null) ? null : media2.get(0);
        if (finderMedia3 != null) {
            finderMedia3.setHeight(this.f264099e);
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = finderObject.getObjectDesc();
        if (objectDesc3 != null && (media = objectDesc3.getMedia()) != null) {
            finderMedia = media.get(0);
        }
        if (finderMedia != null) {
            finderMedia.setVideoDuration(a06.d.b(((float) this.f264097c) / 1000.0f));
        }
        return finderObject;
    }

    @Override // fm3.o
    public long getDurationMs() {
        return this.f264097c;
    }

    public /* synthetic */ p(java.lang.String str, java.lang.String str2, long j17, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(str, str2, j17, (i19 & 8) != 0 ? 0 : i17, (i19 & 16) != 0 ? 0 : i18);
    }
}
