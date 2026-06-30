package ep2;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f255711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f255712e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, int i17) {
        super(2);
        this.f255711d = context;
        this.f255712e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
        java.lang.String username = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(username, "username");
        cq2.s.f221445a.a(this.f255711d, feed.getFeedObject(), username, this.f255712e);
        return jz5.f0.f302826a;
    }
}
