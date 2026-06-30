package cp2;

/* loaded from: classes2.dex */
public final class g0 implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f220806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f220807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1 f220808c;

    public g0(kotlin.jvm.internal.c0 c0Var, cp2.v0 v0Var, com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1 nearbyLivePresenter$createFeedLoader$1) {
        this.f220806a = c0Var;
        this.f220807b = v0Var;
        this.f220808c = nearbyLivePresenter$createFeedLoader$1;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        pm0.v.X(new cp2.f0(this.f220806a, this.f220807b, i17, this.f220808c));
    }
}
