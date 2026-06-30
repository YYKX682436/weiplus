package nl4;

/* loaded from: classes11.dex */
public final class b implements com.tencent.rtmp.ITXLivePlayListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl4.d f338194d;

    public b(nl4.d dVar) {
        this.f338194d = dVar;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        nl4.d dVar = this.f338194d;
        if (i17 != 2012) {
            com.tencent.mars.xlog.Log.i(dVar.f338203h, "onPlayEvent event=" + i17);
        }
        if (i17 == -2301) {
            mn0.b0.C(dVar.f338201f, false, false, false, 6, null);
            ll4.a aVar = dVar.f338196a;
            if (aVar != null) {
                ll4.a.a(aVar, 12, null, 2, null);
                return;
            }
            return;
        }
        if (i17 == 2004) {
            if (dVar.f338200e) {
                dVar.f338200e = false;
                ll4.a aVar2 = dVar.f338196a;
                if (aVar2 != null) {
                    ll4.a.a(aVar2, 8, null, 2, null);
                    return;
                }
                return;
            }
            yz5.l lVar = dVar.f338204i;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
            ll4.a aVar3 = dVar.f338196a;
            if (aVar3 != null) {
                ll4.a.a(aVar3, 3, null, 2, null);
                return;
            }
            return;
        }
        if (i17 == 2103) {
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            if (ko0.t.f309903a.f(i17, bundle)) {
                if (dVar.f338200e) {
                    ll4.a aVar4 = dVar.f338196a;
                    if (aVar4 != null) {
                        ll4.a.a(aVar4, 8, null, 2, null);
                    }
                    dVar.f338200e = false;
                }
                ll4.a aVar5 = dVar.f338196a;
                if (aVar5 != null) {
                    ll4.a.a(aVar5, 4, null, 2, null);
                }
                mn0.b0.C(dVar.f338201f, false, false, false, 6, null);
                return;
            }
            return;
        }
        if (i17 == 2006) {
            ll4.a aVar6 = dVar.f338196a;
            if (aVar6 != null) {
                ll4.a.a(aVar6, 4, null, 2, null);
                return;
            }
            return;
        }
        if (i17 == 2007 && !dVar.f338200e) {
            dVar.f338200e = true;
            ll4.a aVar7 = dVar.f338196a;
            if (aVar7 != null) {
                ll4.a.a(aVar7, 7, null, 2, null);
            }
        }
    }
}
