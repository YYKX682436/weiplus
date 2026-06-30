package so2;

/* loaded from: classes2.dex */
public final class r extends in5.w implements com.tencent.mm.plugin.finder.feed.model.internal.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final long f410563d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f410564e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f410565f;

    /* renamed from: g, reason: collision with root package name */
    public int f410566g;

    public r(long j17, java.lang.String str, java.lang.String objectNonceId, int i17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 8) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        this.f410563d = j17;
        this.f410564e = str;
        this.f410565f = objectNonceId;
        this.f410566g = i17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return -4;
    }
}
