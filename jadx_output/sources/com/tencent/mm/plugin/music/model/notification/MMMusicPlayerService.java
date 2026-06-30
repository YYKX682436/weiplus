package com.tencent.mm.plugin.music.model.notification;

/* loaded from: classes11.dex */
public class MMMusicPlayerService extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.music.model.notification.e f150632d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f150633e = new com.tencent.mm.plugin.music.model.notification.h(this);

    public void a(ql3.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicPlayerService", "pause");
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicPlayerService", "music is null, return");
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.l(this.f150633e);
        com.tencent.mm.plugin.music.model.notification.e eVar = this.f150632d;
        if (!eVar.f150640a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicNotification", "MMMusicNotification not init, pause err");
        } else {
            if (eVar.f150642c == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicNotification", "mmMusicPlayerService is null, return");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicNotification", "pause");
            com.tencent.mm.sdk.platformtools.u3.l(eVar.f150645f);
            eVar.f150643d.notify(291, eVar.a(eVar.f150642c, aVar, false));
        }
    }

    public void b(ql3.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicPlayerService", com.tencent.tav.core.AssetExtension.SCENE_PLAY);
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicPlayerService", "music is null, return");
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.l(this.f150633e);
        com.tencent.mm.plugin.music.model.notification.e eVar = this.f150632d;
        if (!eVar.f150640a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicNotification", "MMMusicNotification not init, play err");
            return;
        }
        if (eVar.f150642c == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicNotification", "mmMusicPlayerService is null, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicNotification", com.tencent.tav.core.AssetExtension.SCENE_PLAY);
        com.tencent.mm.sdk.platformtools.u3.l(eVar.f150645f);
        try {
            com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService mMMusicPlayerService = eVar.f150642c;
            mMMusicPlayerService.startForeground(291, eVar.a(mMMusicPlayerService, aVar, true));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMMusicNotification", e17, "", new java.lang.Object[0]);
        }
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicPlayerService", "initNotification");
        kl3.i iVar = (kl3.i) sl3.b.b(kl3.i.class);
        if (iVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicPlayerService", "initNotification logic music is null, return");
            return;
        }
        ql3.a z17 = ((kl3.z) iVar).z();
        if (z17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicPlayerService", "initNotification music is null, return");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(z17.field_protocol)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicPlayerService", "exoplayer play audio, ingore");
            return;
        }
        com.tencent.mm.plugin.music.player.base.l a17 = kl3.t.g().a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicPlayerService", "musicPlayer is null, return");
        } else if (a17.i()) {
            b(z17);
        } else if (a17.h()) {
            a(z17);
        }
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicPlayerService", "stop");
        com.tencent.mm.plugin.music.model.notification.e eVar = this.f150632d;
        if (!eVar.f150640a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicNotification", "MMMusicNotification not init, close err");
        } else if (eVar.f150642c == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicNotification", "mmMusicPlayerService is null, return");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicNotification", "close");
            java.lang.Runnable runnable = eVar.f150645f;
            com.tencent.mm.sdk.platformtools.u3.l(runnable);
            com.tencent.mm.sdk.platformtools.u3.i(runnable, 1000L);
        }
        java.lang.Runnable runnable2 = this.f150633e;
        com.tencent.mm.sdk.platformtools.u3.l(runnable2);
        com.tencent.mm.sdk.platformtools.u3.i(runnable2, 60000L);
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return new com.tencent.mm.plugin.music.model.notification.i(this);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicPlayerService", "onCreate");
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicPlayerService", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        com.tencent.mm.plugin.music.model.notification.e eVar = new com.tencent.mm.plugin.music.model.notification.e();
        this.f150632d = eVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicNotification", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        eVar.f150642c = this;
        eVar.f150643d = (android.app.NotificationManager) getSystemService("notification");
        eVar.f150646g = new com.tencent.mm.plugin.music.model.notification.b(eVar);
        com.tencent.mm.plugin.music.model.notification.c cVar = new com.tencent.mm.plugin.music.model.notification.c(eVar);
        eVar.f150644e = cVar;
        ll3.b1.f319141b.f319151o.add(cVar);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.tencent.mm.Intent.ACTION_MMMUSIC_NOTIFICATION_CLICK");
        if (fp.h.a(33)) {
            registerReceiver(eVar.f150646g, intentFilter);
        } else {
            registerReceiver(eVar.f150646g, intentFilter, 2);
        }
        eVar.f150640a = true;
        c();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicPlayerService", "onDestroy");
        com.tencent.mm.plugin.music.model.notification.e eVar = this.f150632d;
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicNotification", "uninit");
        eVar.f150642c.unregisterReceiver(eVar.f150646g);
        ll3.e1 e1Var = ll3.b1.f319141b;
        ll3.c1 c1Var = eVar.f150644e;
        if (c1Var != null) {
            e1Var.f319151o.remove(c1Var);
        } else {
            e1Var.getClass();
        }
        eVar.f150646g = null;
        eVar.f150642c = null;
        eVar.f150643d = null;
        eVar.f150640a = false;
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        return 2;
    }
}
