package ws2;

/* loaded from: classes15.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy f449011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.wa f449012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f449013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f449014g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy, cw2.wa waVar, long j17, long j18) {
        super(0);
        this.f449011d = finderLiveThumbPlayerProxy;
        this.f449012e = waVar;
        this.f449013f = j17;
        this.f449014g = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cw2.fb lifecycle = this.f449011d.getLifecycle();
        if (lifecycle != null) {
            cw2.fb.w(lifecycle, this.f449012e.f224097d, ((int) this.f449013f) / 1000, ((int) this.f449014g) / 1000, null, 8, null);
        }
        return jz5.f0.f302826a;
    }
}
