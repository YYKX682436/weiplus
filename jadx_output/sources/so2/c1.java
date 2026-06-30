package so2;

/* loaded from: classes2.dex */
public final class c1 implements in5.c, com.tencent.mm.plugin.finder.feed.model.internal.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.s21 f410288d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f410289e;

    /* renamed from: f, reason: collision with root package name */
    public r45.tl6 f410290f;

    /* renamed from: g, reason: collision with root package name */
    public r45.t11 f410291g;

    public c1(r45.s21 favInfo, java.lang.String feedID) {
        kotlin.jvm.internal.o.g(favInfo, "favInfo");
        kotlin.jvm.internal.o.g(feedID, "feedID");
        this.f410288d = favInfo;
        this.f410289e = feedID;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f410288d.f385428f != null ? r0.hashCode() : 0;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
