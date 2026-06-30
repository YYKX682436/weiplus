package h03;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h03.q f277875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedContactChangeEvent f277876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h03.q qVar, com.tencent.mm.autogen.events.FeedContactChangeEvent feedContactChangeEvent) {
        super(0);
        this.f277875d = qVar;
        this.f277876e = feedContactChangeEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.pigeon.mega_video.MegaVideoFinderCallback megaVideoFinderCallback = this.f277875d.f277913g;
        if (megaVideoFinderCallback != null) {
            com.tencent.mm.autogen.events.FeedContactChangeEvent feedContactChangeEvent = this.f277876e;
            java.lang.String username = feedContactChangeEvent.f54246g.f6341a;
            kotlin.jvm.internal.o.f(username, "username");
            megaVideoFinderCallback.onFollowStatusChanged(username, feedContactChangeEvent.f54246g.f6342b.field_follow_Flag == ya2.b2.Q2, h03.c.f277874d);
        }
        return jz5.f0.f302826a;
    }
}
