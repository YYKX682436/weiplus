package com.tencent.mm.plugin.music.model.notification;

/* loaded from: classes11.dex */
public class b extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.model.notification.e f150635a;

    public b(com.tencent.mm.plugin.music.model.notification.e eVar) {
        this.f150635a = eVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || com.tencent.mm.sdk.platformtools.t8.K0(intent.getAction())) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("mm_music_notification_action_key");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicNotification", "action is null, err, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicNotification", "action:%s", stringExtra);
        com.tencent.mm.plugin.music.player.base.l a17 = kl3.t.g().a();
        qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicNotification", "musicPlayer is null, return");
            return;
        }
        ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
        if (z17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicNotification", "music is null, return");
            return;
        }
        boolean equals = stringExtra.equals("mm_music_notification_action_play");
        com.tencent.mm.plugin.music.model.notification.e eVar = this.f150635a;
        if (equals) {
            a17.resume();
            android.os.Bundle bundle = eVar.f150641b;
            if (bundle != null) {
                ll3.b1.f319141b.w0(bundle);
            }
            pl3.c.c(2, z17);
            return;
        }
        if (stringExtra.equals("mm_music_notification_action_pause")) {
            a17.b();
            xl3.b k17 = kl3.t.k();
            k17.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "abandonFocus");
            android.media.AudioManager audioManager = k17.f455117a;
            if (audioManager != null) {
                audioManager.abandonAudioFocus(k17.f455118b);
            }
            pl3.c.c(3, z17);
            return;
        }
        if (stringExtra.equals("mm_music_notification_action_pre")) {
            if (z17.field_musicType == 11) {
                android.os.Bundle bundle2 = eVar.f150641b;
                if (bundle2 != null) {
                    ll3.b1.f319141b.w0(bundle2);
                }
                kl3.t.g().m(true);
            } else if (z17.f364576k2 || ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).f308854c == 2) {
                com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
                am.jk jkVar = musicPlayerEvent.f54512g;
                jkVar.f7036b = 17;
                jkVar.f7040f = "";
                musicPlayerEvent.b(android.os.Looper.getMainLooper());
                if (z17.f364576k2) {
                    ((rk4.z8) g9Var).getClass();
                    com.tencent.unit_rc.BaseObjectDef baseObjectDef = zk4.l.f473540c;
                    if (baseObjectDef != null) {
                        urgen.ur_2BA9.UR_C8FE.UR_E80B(((b66.q) baseObjectDef).getCppPointer());
                    }
                } else {
                    ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).D();
                }
            } else {
                a17.c(0);
                a17.resume();
            }
            eVar.d(z17, 13, a17.e());
            pl3.c.c(1, z17);
            return;
        }
        if (!stringExtra.equals("mm_music_notification_action_next")) {
            if (stringExtra.equals("mm_music_notification_action_close")) {
                com.tencent.mm.sdk.platformtools.u3.h(eVar.f150645f);
                if (z17.f364576k2) {
                    ((rk4.z8) g9Var).zj();
                } else {
                    a17.stopPlay();
                }
                pl3.c.c(5, z17);
                return;
            }
            return;
        }
        if (z17.field_musicType == 11) {
            android.os.Bundle bundle3 = eVar.f150641b;
            if (bundle3 != null) {
                ll3.b1.f319141b.w0(bundle3);
            }
            kl3.t.g().m(true);
        } else if (z17.f364576k2 || ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).f308854c == 2) {
            com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent2 = new com.tencent.mm.autogen.events.MusicPlayerEvent();
            am.jk jkVar2 = musicPlayerEvent2.f54512g;
            jkVar2.f7036b = 16;
            jkVar2.f7040f = "";
            musicPlayerEvent2.b(android.os.Looper.getMainLooper());
            if (z17.f364576k2) {
                ((rk4.z8) g9Var).getClass();
                com.tencent.unit_rc.BaseObjectDef baseObjectDef2 = zk4.l.f473540c;
                if (baseObjectDef2 != null) {
                    urgen.ur_2BA9.UR_C8FE.UR_D25D(((b66.q) baseObjectDef2).getCppPointer());
                }
            } else {
                ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).C();
            }
        } else {
            a17.c(0);
            a17.resume();
        }
        eVar.d(z17, 14, a17.e());
        pl3.c.c(4, z17);
    }
}
