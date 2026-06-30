package ew;

/* loaded from: classes11.dex */
public final class o implements ls5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.flutter.FlutterBrsFinderLivePlayerPlugin f256994a;

    public o(com.tencent.mm.feature.brandecs.flutter.FlutterBrsFinderLivePlayerPlugin flutterBrsFinderLivePlayerPlugin) {
        this.f256994a = flutterBrsFinderLivePlayerPlugin;
    }

    @Override // ls5.l
    public boolean a() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f256994a.f65218f;
        return (mMActivity == null || mMActivity.isStopped()) ? false : true;
    }
}
