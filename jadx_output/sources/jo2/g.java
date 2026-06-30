package jo2;

/* loaded from: classes2.dex */
public final class g implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final int f300886d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f300887e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f300888f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f300889g;

    /* renamed from: h, reason: collision with root package name */
    public final long f300890h;

    public g(int i17, boolean z17, java.lang.String authorFinderUsername, java.util.LinkedList linkedList, long j17) {
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        this.f300886d = i17;
        this.f300887e = z17;
        this.f300888f = authorFinderUsername;
        this.f300889g = linkedList;
        this.f300890h = j17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return -17;
    }
}
