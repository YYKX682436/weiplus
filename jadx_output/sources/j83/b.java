package j83;

/* loaded from: classes14.dex */
public final class b extends xm1.i {

    /* renamed from: k, reason: collision with root package name */
    public j83.a f298160k;

    /* renamed from: l, reason: collision with root package name */
    public final l83.c f298161l;

    /* renamed from: m, reason: collision with root package name */
    public final l83.h f298162m;

    /* renamed from: n, reason: collision with root package name */
    public final fp.e f298163n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f298164o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f298165p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f298166q;

    public b() {
        fp.e eVar = new fp.e(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f298163n = eVar;
        i();
        eVar.b();
        this.f298161l = new l83.c(this);
        this.f298162m = new l83.h();
        ym1.f.f463134h.h(this, "ipcall");
    }

    @Override // xm1.h, cv.y0
    public void a(boolean z17) {
        l83.c cVar = this.f298161l;
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallAudioPlayer", "setSpeakerPhoneOn, old isSpeakerPhoneOn: %b, new isSpeakerPhoneOn: %b", java.lang.Boolean.valueOf(cVar.f317093d), java.lang.Boolean.valueOf(z17));
            cVar.f317094e.A(z17);
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = com.tencent.mm.plugin.ipcall.model.r.Ni().f324717a;
            int C = z17 ? v2protocalVar.C(401) : v2protocalVar.C(402);
            if (C < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallEngineManager", "setSpeakerPhoneOn, failed, ret: %d", java.lang.Integer.valueOf(C));
            }
            if (z17 != cVar.f317093d) {
                cVar.f317093d = z17;
                com.tencent.mm.plugin.voip.model.e eVar = cVar.f317090a;
                if (eVar != null && eVar.f176438a) {
                    eVar.j(z17);
                }
            }
        }
        this.f298164o = n();
    }

    @Override // xm1.h
    public void o(int i17) {
        j83.a aVar;
        j83.a aVar2;
        j83.a aVar3;
        j83.a aVar4;
        super.o(i17);
        switch (i17) {
            case 1:
            case 3:
            case 6:
            case 7:
                if (m(3) || (aVar = this.f298160k) == null) {
                    return;
                }
                ((com.tencent.mm.plugin.ipcall.ui.l6) aVar).d(false);
                return;
            case 2:
                if (!ym1.f.f463134h.i() || (aVar2 = this.f298160k) == null || aVar2 == null) {
                    return;
                }
                ((com.tencent.mm.plugin.ipcall.ui.l6) aVar2).d(true);
                return;
            case 4:
            case 5:
            default:
                return;
            case 8:
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallAudioManager", "onHeadsetPlug connected");
                if (m(4) || (aVar3 = this.f298160k) == null) {
                    return;
                }
                ((com.tencent.mm.plugin.ipcall.ui.l6) aVar3).e(true);
                return;
            case 9:
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallAudioManager", "onHeadsetPlug disconnect");
                if (m(4) || (aVar4 = this.f298160k) == null) {
                    return;
                }
                ((com.tencent.mm.plugin.ipcall.ui.l6) aVar4).e(false);
                return;
        }
    }
}
