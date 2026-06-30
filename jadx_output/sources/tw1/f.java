package tw1;

@j95.b
/* loaded from: classes15.dex */
public class f extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public boolean f422451d = false;

    public static tw1.f Di() {
        return (tw1.f) i95.n0.c(tw1.f.class);
    }

    public void Ai() {
        Bi("cash.caf");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_F2F_RING_TONE_STRING, "cash.caf");
    }

    public final void Bi(java.lang.String str) {
        gm0.j1.i();
        gm0.j1.n().f273288b.a(304, new tw1.e(this));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        ww1.v1 v1Var = new ww1.v1(3, str);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(v1Var);
    }

    public ww1.v Ni() {
        gm0.j1.b().c();
        return ww1.v.INSTANCE;
    }

    public boolean Ri() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_F2F_RING_TONE_STRING, "");
        long j17 = c01.z1.j();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.equals("in.caf")) {
            return (j17 & 32768) != 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCollect", "old version switch is open, sync to new version");
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(j17 | 32768));
        r45.no4 no4Var = new r45.no4();
        no4Var.f381559d = 1;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(209, no4Var));
        return true;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mm.protobuf.g gVar = ww1.l1.f450231q;
        com.tencent.mm.plugin.collect.model.voice.m d17 = com.tencent.mm.plugin.collect.model.voice.m.d();
        if (d17.f96189h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "onNotifyChange()：is already init()");
            return;
        }
        Di().Ri();
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "onNotifyChange()");
        d17.k(true);
        d17.f96189h = true;
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        ww1.l1.i();
        com.tencent.mm.plugin.collect.model.voice.m d17 = com.tencent.mm.plugin.collect.model.voice.m.d();
        d17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "destroy()");
        try {
            com.tencent.mm.plugin.collect.model.voice.t tVar = d17.f96183b;
            if (tVar != null) {
                tVar.a();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "destroy() synthesizer.destroy() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        com.tencent.mm.sdk.event.IListener iListener = d17.f96187f;
        if (iListener != null) {
            iListener.dead();
        }
        com.tencent.mm.sdk.event.IListener iListener2 = d17.f96188g;
        if (iListener2 != null) {
            iListener2.dead();
        }
        com.tencent.mm.plugin.collect.model.voice.m.f96177i = false;
    }

    public void wi() {
        Bi("in.caf");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_F2F_RING_TONE_STRING, "in.caf");
    }
}
