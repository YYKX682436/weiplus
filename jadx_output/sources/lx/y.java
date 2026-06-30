package lx;

/* loaded from: classes11.dex */
public final class y implements ls5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderLivePlayerPlugin f322010a;

    public y(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderLivePlayerPlugin flutterBizFinderLivePlayerPlugin) {
        this.f322010a = flutterBizFinderLivePlayerPlugin;
    }

    @Override // ls5.l
    public boolean a() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f322010a.f65235f;
        return (mMActivity == null || mMActivity.isStopped()) ? false : true;
    }
}
