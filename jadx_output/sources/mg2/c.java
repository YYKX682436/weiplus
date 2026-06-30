package mg2;

/* loaded from: classes10.dex */
public final class c extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mg2.e f326216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f326217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f326218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f326219g;

    public c(mg2.e eVar, boolean z17, yz5.l lVar, yz5.a aVar) {
        this.f326216d = eVar;
        this.f326217e = z17;
        this.f326218f = lVar;
        this.f326219g = aVar;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        super.onPlayEvent(i17, bundle);
        yz5.a aVar = this.f326219g;
        yz5.l lVar = this.f326218f;
        mg2.e eVar = this.f326216d;
        if (i17 == -2304) {
            com.tencent.mars.xlog.Log.i(eVar.f318557e, "switchInLiveRoom playEventErrors: " + i17);
            mg2.e.B(eVar, i17);
            eVar.D("playEventErrors", lVar, aVar);
            return;
        }
        if (i17 == 2009) {
            com.tencent.mars.xlog.Log.i(eVar.f318557e, "switchInLiveRoom onPlayEvent PLAY_EVT_CHANGE_RESOLUTION");
            mg2.e.A(eVar, bundle);
            eVar.D("onPlayEvent PLAY_EVT_CHANGE_RESOLUTION", lVar, aVar);
            return;
        }
        if (i17 != 2033) {
            if (i17 != 2103) {
                return;
            }
            com.tencent.mars.xlog.Log.i(eVar.f318557e, "switchInLiveRoom playEventErrors: " + i17);
            mn0.b0 b0Var = eVar.f326227z;
            if (b0Var != null) {
                qg2.e.f362799a.c("switchInLiveRoom", b0Var, eVar.b().f291378m, eVar.C(eVar.b().f291403b, eVar.b().f291404c));
                return;
            }
            return;
        }
        boolean z17 = bundle != null ? bundle.getBoolean("fromCustomRender") : false;
        java.lang.String str = eVar.f318557e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchInLiveRoom onPlayEvent EVT_PLAY_VIEW_CHANGED_FIRST_I_FRAME  isCustomRender: ");
        boolean z18 = this.f326217e;
        sb6.append(z18);
        sb6.append(" fromCustomRender: ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (!z18 || z17) {
            eVar.f326223v = true;
            eVar.D("onPlayEvent", lVar, aVar);
        }
    }
}
