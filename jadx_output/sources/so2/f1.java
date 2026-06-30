package so2;

/* loaded from: classes2.dex */
public final class f1 implements in5.c, com.tencent.mm.plugin.finder.feed.model.internal.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.md1 f410336d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f410337e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f410338f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f410339g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f410340h;

    /* renamed from: i, reason: collision with root package name */
    public r45.tl6 f410341i;

    /* renamed from: m, reason: collision with root package name */
    public r45.t11 f410342m;

    public f1(r45.md1 likeObj, java.lang.String feedID) {
        kotlin.jvm.internal.o.g(likeObj, "likeObj");
        kotlin.jvm.internal.o.g(feedID, "feedID");
        this.f410336d = likeObj;
        this.f410337e = feedID;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return java.lang.Long.hashCode(this.f410336d.getLong(2));
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
