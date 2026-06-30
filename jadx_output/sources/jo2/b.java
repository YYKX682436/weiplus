package jo2;

/* loaded from: classes2.dex */
public final class b implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.dr0 f300880d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f300881e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f300882f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f300883g;

    public b(r45.dr0 feed, boolean z17, boolean z18, java.lang.String username) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(username, "username");
        this.f300880d = feed;
        this.f300881e = z17;
        this.f300882f = z18;
        this.f300883g = username;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return -15;
    }
}
