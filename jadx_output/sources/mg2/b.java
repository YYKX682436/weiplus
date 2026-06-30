package mg2;

/* loaded from: classes10.dex */
public final class b extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mg2.e f326212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ka4 f326213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f326214f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f326215g;

    public b(mg2.e eVar, r45.ka4 ka4Var, long j17, long j18) {
        this.f326212d = eVar;
        this.f326213e = ka4Var;
        this.f326214f = j17;
        this.f326215g = j18;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        super.onPlayEvent(i17, bundle);
        mg2.e eVar = this.f326212d;
        if (i17 == -2304) {
            com.tencent.mars.xlog.Log.i(eVar.f318557e, "preloadStartLivePlayer playEventErrors: " + i17);
            mg2.e.B(eVar, i17);
            return;
        }
        if (i17 == 2003) {
            com.tencent.mars.xlog.Log.i(eVar.f318557e, "preloadStartLivePlayer onPlayEvent EVT_PLAY_VIEW_CHANGED_FIRST_I_FRAME");
            return;
        }
        if (i17 == 2009) {
            com.tencent.mars.xlog.Log.i(eVar.f318557e, "preloadStartLivePlayer onPlayEvent PLAY_EVT_CHANGE_RESOLUTION");
            mg2.e.A(eVar, bundle);
            return;
        }
        if (i17 != 2103) {
            return;
        }
        com.tencent.mars.xlog.Log.i(eVar.f318557e, "preloadStartLivePlayer playEventErrors: " + i17);
        mn0.b0 b0Var = eVar.f326227z;
        if (b0Var != null) {
            qg2.e.f362799a.c("preloadStartLivePlayer", b0Var, this.f326213e, eVar.C(this.f326214f, this.f326215g));
        }
    }
}
