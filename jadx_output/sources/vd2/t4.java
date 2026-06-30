package vd2;

/* loaded from: classes3.dex */
public final class t4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f435923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(boolean z17, com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback) {
        super(0);
        this.f435923d = z17;
        this.f435924e = finderLiveViewCallback;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f435924e;
        boolean z17 = this.f435923d;
        if (z17) {
            int i17 = finderLiveViewCallback.f111495t.f436055f;
            if (i17 != 0) {
                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.a(finderLiveViewCallback, i17 - 1, z17);
            }
        } else {
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.a(finderLiveViewCallback, finderLiveViewCallback.f111495t.f436055f + 1, z17);
        }
        return jz5.f0.f302826a;
    }
}
