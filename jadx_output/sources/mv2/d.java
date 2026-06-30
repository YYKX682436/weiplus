package mv2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f331550a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f331551b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.q f331552c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f331553d;

    /* renamed from: e, reason: collision with root package name */
    public long f331554e;

    /* renamed from: f, reason: collision with root package name */
    public final int f331555f;

    /* renamed from: g, reason: collision with root package name */
    public final mv2.c f331556g;

    public d(long j17, java.lang.String imagePath, yz5.l progressCallback, yz5.q completeCallback) {
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
        kotlin.jvm.internal.o.g(progressCallback, "progressCallback");
        kotlin.jvm.internal.o.g(completeCallback, "completeCallback");
        this.f331550a = imagePath;
        this.f331551b = progressCallback;
        this.f331552c = completeCallback;
        this.f331553d = "Finder.CommentImageUploadTask";
        this.f331554e = -1L;
        this.f331555f = 2;
        this.f331556g = new mv2.c(this);
    }
}
