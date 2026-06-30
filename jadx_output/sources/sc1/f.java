package sc1;

/* loaded from: classes7.dex */
public class f extends com.tencent.rtmp.ui.TXCloudVideoView {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f405659d;

    /* renamed from: e, reason: collision with root package name */
    public sc1.k f405660e;

    /* renamed from: f, reason: collision with root package name */
    public sc1.c f405661f;

    /* renamed from: g, reason: collision with root package name */
    public sc1.e f405662g;

    /* renamed from: h, reason: collision with root package name */
    public int f405663h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f405664i;

    /* renamed from: m, reason: collision with root package name */
    public sc1.d f405665m;

    public f(com.tencent.mm.plugin.appbrand.jsapi.l lVar, android.content.Context context) {
        super(context);
        this.f405659d = lVar;
        this.f405660e = new sc1.o1(context);
    }

    public void a() {
        sc1.k1 e17 = ((sc1.o1) this.f405660e).e();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePlayerView", "onDestroy code:%d info:%s", java.lang.Integer.valueOf(e17.f405688a), e17.f405689b);
        sc1.d dVar = this.f405665m;
        if (dVar != null) {
            sc1.r rVar = (sc1.r) dVar;
            com.tencent.mm.plugin.appbrand.jsapi.v vVar = rVar.f405724b;
            com.tencent.mm.plugin.appbrand.jsapi.t tVar = rVar.f405723a;
            tVar.O(vVar);
            tVar.I(rVar.f405725c);
        }
    }

    public final void b(boolean z17) {
        sc1.e eVar;
        if (!this.f405664i || (eVar = this.f405662g) == null) {
            return;
        }
        int i17 = this.f405663h;
        sc1.s sVar = (sc1.s) eVar;
        sVar.getClass();
        sc1.w wVar = new sc1.w(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("fullScreen", z17);
            jSONObject.put(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION, i17);
            jSONObject.put("livePlayerId", sVar.f405729a);
        } catch (org.json.JSONException unused) {
        }
        wVar.f82374f = jSONObject.toString();
        sVar.f405730b.i(wVar, null);
    }

    public boolean c(java.lang.String str, org.json.JSONObject jSONObject) {
        sc1.k1 n17 = ((sc1.o1) this.f405660e).n(str, jSONObject);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePlayerView", "onOperate code:%d info:%s", java.lang.Integer.valueOf(n17.f405688a), n17.f405689b);
        return n17.f405688a == 0;
    }

    public void setAudioVolumeEventListener(com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        ((sc1.o1) this.f405660e).h(iTXAudioVolumeEvaluationListener);
    }

    public void setExitListener(sc1.d dVar) {
        this.f405665m = dVar;
    }

    public void setFullScreenDelegate(sc1.c cVar) {
        this.f405661f = cVar;
    }

    public void setNeedEvent(boolean z17) {
        this.f405664i = z17;
    }

    public void setOnFullScreenChangeListener(sc1.e eVar) {
        this.f405662g = eVar;
    }

    public void setPlayEventListener(com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener) {
        ((sc1.o1) this.f405660e).setPlayListener(iTXLivePlayListener);
    }

    public void setSnapshotListener(com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        ((sc1.o1) this.f405660e).g(iTXSnapshotListener);
    }
}
