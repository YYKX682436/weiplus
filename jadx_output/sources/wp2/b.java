package wp2;

/* loaded from: classes2.dex */
public abstract class b extends so2.h1 implements wp2.a {

    /* renamed from: o, reason: collision with root package name */
    public final r45.ea2 f448383o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.fa2 f448384p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f448385q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f448386r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f448387s;

    /* renamed from: t, reason: collision with root package name */
    public r45.d94 f448388t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.storage.FinderItem feedObject, r45.ea2 streamCard, r45.fa2 container, java.lang.String str, java.lang.String str2, boolean z17) {
        super(feedObject);
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        kotlin.jvm.internal.o.g(streamCard, "streamCard");
        kotlin.jvm.internal.o.g(container, "container");
        this.f448383o = streamCard;
        this.f448384p = container;
        this.f448385q = str;
        this.f448386r = str2;
        this.f448387s = z17;
        r45.d94 d94Var = new r45.d94();
        d94Var.set(0, java.lang.Long.valueOf(feedObject.getFeedObject().getId()));
        this.f448388t = d94Var;
    }

    @Override // wp2.a
    public com.tencent.mm.protobuf.g a() {
        return this.f448384p.f374132n;
    }

    @Override // wp2.a
    public void b(int i17) {
        this.f448384p.f374130i = i17;
    }

    @Override // wp2.a
    public int c() {
        return 1;
    }

    @Override // wp2.a
    public void f(com.tencent.mm.protobuf.g gVar) {
        this.f448384p.f374132n = gVar;
    }

    @Override // wp2.a
    public java.util.List g() {
        return kz5.c0.k(java.lang.Long.valueOf(getFeedObject().getFeedObject().getId()));
    }

    public abstract int g2();

    @Override // com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.c
    public int h() {
        return g2();
    }

    @Override // wp2.a
    public int i() {
        return this.f448384p.f374125d;
    }
}
