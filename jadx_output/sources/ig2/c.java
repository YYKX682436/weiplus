package ig2;

/* loaded from: classes3.dex */
public final class c extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ig2.d f291368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f291369e;

    public c(ig2.d dVar, yz5.l lVar) {
        this.f291368d = dVar;
        this.f291369e = lVar;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        super.onPlayEvent(i17, bundle);
        ig2.d dVar = this.f291368d;
        if (i17 == 2009) {
            dVar.getClass();
            com.tencent.mars.xlog.Log.i("FinderFluentShopWindowDirector", "switchInLiveRoom onPlayEvent PLAY_EVT_CHANGE_RESOLUTION");
        } else {
            if (i17 != 2033) {
                return;
            }
            dVar.getClass();
            com.tencent.mars.xlog.Log.i("FinderFluentShopWindowDirector", "switchInLiveRoom switch view success. #1");
            this.f291369e.invoke(java.lang.Boolean.FALSE);
            yz5.a aVar = dVar.f291371e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }
}
