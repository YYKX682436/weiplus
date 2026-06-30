package m83;

/* loaded from: classes14.dex */
public class a extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m83.c f324716a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m83.c cVar, android.os.Looper looper) {
        super(looper);
        this.f324716a = cVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message == null || message.what != 59998) {
            return;
        }
        int i17 = message.arg1;
        m83.c cVar = this.f324716a;
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_STARTDEVFAILED");
            m83.b bVar = cVar.f324722f;
            if (bVar != null) {
                com.tencent.mm.plugin.ipcall.j jVar = (com.tencent.mm.plugin.ipcall.j) bVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onStartEngineFailed, currentState: %s", com.tencent.mm.plugin.ipcall.model.r.bj().a());
                if (jVar.j(6, 0)) {
                    jVar.i(6, null, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490773aq1), 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i17 == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_RESET");
            int i18 = message.arg2;
            if (i18 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_BROKEN");
                m83.b bVar2 = cVar.f324722f;
                if (bVar2 != null) {
                    ((com.tencent.mm.plugin.ipcall.j) bVar2).g(34);
                    return;
                }
                return;
            }
            if (i18 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_FAIL");
                m83.b bVar3 = cVar.f324722f;
                if (bVar3 != null) {
                    ((com.tencent.mm.plugin.ipcall.j) bVar3).g(20);
                    return;
                }
                return;
            }
            if (i18 == 5) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_NETWORK_ERROR");
                m83.b bVar4 = cVar.f324722f;
                if (bVar4 != null) {
                    ((com.tencent.mm.plugin.ipcall.j) bVar4).g(30);
                    return;
                }
                return;
            }
            return;
        }
        if (i17 != 6) {
            if (i17 == 9) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_FIRST_PKT");
                return;
            }
            if (i17 != 10) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_ANSWER_MARK");
            cVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallEngineManager", "handleChannelAccept");
            com.tencent.mm.plugin.ipcall.model.p cj6 = com.tencent.mm.plugin.ipcall.model.r.cj();
            cj6.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "handleChannelAccept");
            if (cj6.f142500w) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSvrLogic", "current status has accepted, ignore channel accept");
                return;
            }
            cj6.f142501x = true;
            k83.g gVar = cj6.f142498u;
            if (gVar != null) {
                gVar.f304910m = 2;
                c01.d9.e().g(new p83.o(gVar.f304898a, gVar.f304899b, gVar.b(), cj6.f142498u.f304900c, true));
            }
            cj6.k(2);
            return;
        }
        if (cVar.f324720d) {
            return;
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = cVar.f324717a;
        if (v2protocalVar.startEngine() == 0) {
            v2protocalVar.J0 = 0;
        } else {
            v2protocalVar.J0 = 1;
        }
        v2protocalVar.setInactive();
        cVar.f324720d = true;
        m83.b bVar5 = cVar.f324722f;
        if (bVar5 != null) {
            com.tencent.mm.plugin.ipcall.j jVar2 = (com.tencent.mm.plugin.ipcall.j) bVar5;
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "onChannelConnected, currentState: %s", com.tencent.mm.plugin.ipcall.model.r.bj().a());
            com.tencent.mm.plugin.ipcall.model.r.aj().e();
            com.tencent.mm.plugin.ipcall.j.f142443u.removeCallbacks(jVar2.f142453p);
            if (com.tencent.mm.plugin.ipcall.model.r.bj().b()) {
                l83.d Di = com.tencent.mm.plugin.ipcall.model.r.Di();
                Di.f317096b.r("ipcall", 4);
                Di.f317096b.getClass();
                Di.f317096b.getClass();
                j83.b bVar6 = Di.f317096b;
                l83.c cVar2 = bVar6.f298161l;
                if (cVar2 != null && !cVar2.f317092c) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallAudioPlayer", "startPlay");
                    if (cVar2.f317090a == null) {
                        com.tencent.mm.plugin.voip.model.e eVar = new com.tencent.mm.plugin.voip.model.e();
                        cVar2.f317090a = eVar;
                        eVar.c(com.tencent.mm.plugin.voip.model.v2protocal.Y1, 1, 20, 1);
                    }
                    cVar2.f317090a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, false);
                    com.tencent.mm.plugin.voip.model.e eVar2 = cVar2.f317090a;
                    eVar2.f176454q = new l83.a(cVar2);
                    if (eVar2.d() <= 0) {
                        m83.d Zi = com.tencent.mm.plugin.ipcall.model.r.Zi();
                        if (Zi.F == 0) {
                            Zi.F = 1;
                        }
                    }
                    cVar2.f317094e.a(cVar2.f317093d);
                    cVar2.f317092c = true;
                }
                j83.a aVar = bVar6.f298160k;
                if (aVar != null) {
                    ((com.tencent.mm.plugin.ipcall.ui.l6) aVar).e(bVar6.d() == 3);
                }
                j83.a aVar2 = bVar6.f298160k;
                if (aVar2 != null) {
                    ((com.tencent.mm.plugin.ipcall.ui.l6) aVar2).d(bVar6.d() == 4);
                }
            }
            m83.d Zi2 = com.tencent.mm.plugin.ipcall.model.r.Zi();
            Zi2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallReportHelper", "channelConnect");
            Zi2.f324730h = 1;
            com.tencent.mm.plugin.ipcall.model.r.Di().c();
            if (!com.tencent.mm.plugin.ipcall.model.r.bj().c() || jVar2.f142446f) {
                return;
            }
            m83.d Zi3 = com.tencent.mm.plugin.ipcall.model.r.Zi();
            if (Zi3.f324743u == 0) {
                Zi3.f324743u = java.lang.System.currentTimeMillis();
            }
            com.tencent.mm.plugin.ipcall.model.r.Ni().f324717a.setActive();
            jVar2.f142446f = true;
            jVar2.f142456s = com.tencent.mm.sdk.platformtools.t8.i1();
            jVar2.n();
            com.tencent.mm.plugin.ipcall.l lVar = jVar2.f142444d;
            if (lVar != null) {
                ((com.tencent.mm.plugin.ipcall.ui.l6) lVar).f();
            }
            s83.l lVar2 = jVar2.f142445e;
            if (lVar2 != null && lVar2.systemRowid != -1) {
                lVar2.field_status = 3;
                com.tencent.mm.plugin.ipcall.model.r.Vi().z0(lVar2);
            }
            m83.d Zi4 = com.tencent.mm.plugin.ipcall.model.r.Zi();
            if (Zi4.f324748z == 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                Zi4.f324748z = currentTimeMillis;
                Zi4.A = currentTimeMillis - Zi4.f324740r;
            }
            com.tencent.mm.plugin.voip.model.a2.a().c();
            com.tencent.mm.plugin.voip.model.a2 a17 = com.tencent.mm.plugin.voip.model.a2.a();
            a17.getClass();
            a17.f176328f = new java.lang.ref.WeakReference(jVar2);
        }
    }
}
