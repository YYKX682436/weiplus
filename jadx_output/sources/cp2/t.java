package cp2;

/* loaded from: classes2.dex */
public final class t implements sp2.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory f220914a;

    public t(com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory) {
        this.f220914a = nearbyLiveItemConvertFactory;
    }

    @Override // sp2.k
    public int e() {
        return this.f220914a.getBottomExtraInfo();
    }

    @Override // sp2.k
    public com.tencent.mm.protobuf.g f() {
        com.tencent.mars.xlog.Log.i("NearbyLiveItemConvertFactory", "createBigCardLiveConvert getOutsideLastBuffer not suppport");
        return null;
    }

    @Override // sp2.k
    public void h(int i17, com.tencent.mm.protobuf.g gVar, int i18, yz5.l gciListener) {
        kotlin.jvm.internal.o.g(gciListener, "gciListener");
        com.tencent.mars.xlog.Log.i("NearbyLiveItemConvertFactory", "createBigCardLiveConvert loadData not suppport");
    }

    @Override // sp2.k
    public r45.h81 m() {
        com.tencent.mars.xlog.Log.i("NearbyLiveItemConvertFactory", "createBigCardLiveConvert getOutsideFinderGetLiveTabsResponse not suppport");
        return null;
    }
}
