package cp2;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory f220926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory) {
        super(0);
        this.f220926d = nearbyLiveItemConvertFactory;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.MMActivity mMActivity;
        cp2.c cVar;
        com.tencent.mm.plugin.finder.assist.n3 n3Var = com.tencent.mm.plugin.finder.assist.n3.f102399a;
        boolean a17 = n3Var.a();
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory = this.f220926d;
        if (a17) {
            if (!((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227164o)) {
                cVar = nearbyLiveItemConvertFactory.presenter;
                kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter");
                ((cp2.v0) cVar).onRefresh();
                return jz5.f0.f302826a;
            }
        }
        mMActivity = nearbyLiveItemConvertFactory.baseContext;
        n3Var.c(mMActivity, true);
        return jz5.f0.f302826a;
    }
}
