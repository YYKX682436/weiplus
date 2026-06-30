package ev2;

/* loaded from: classes10.dex */
public final class t extends ev2.e {

    /* renamed from: c, reason: collision with root package name */
    public final iv2.b f256933c;

    /* renamed from: d, reason: collision with root package name */
    public final jv2.c f256934d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f256935e;

    /* renamed from: f, reason: collision with root package name */
    public final int f256936f;

    /* renamed from: g, reason: collision with root package name */
    public final long f256937g;

    /* renamed from: h, reason: collision with root package name */
    public final int f256938h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(iv2.b feedItem, jv2.c comment, boolean z17, int i17, ev2.j jVar) {
        super(jVar);
        kotlin.jvm.internal.o.g(feedItem, "feedItem");
        kotlin.jvm.internal.o.g(comment, "comment");
        this.f256933c = feedItem;
        this.f256934d = comment;
        this.f256935e = z17;
        this.f256936f = i17;
        this.f256937g = feedItem.a();
        this.f256938h = i17;
    }

    public java.lang.String toString() {
        return "action_" + this.f256933c.f295130f + '_' + this.f256934d.t0() + '_' + this.f256935e + '_' + this.f256936f;
    }
}
