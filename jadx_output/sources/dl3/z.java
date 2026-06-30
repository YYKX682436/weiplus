package dl3;

/* loaded from: classes13.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f235352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl3.a0 f235353e;

    public z(dl3.a0 a0Var, int i17) {
        this.f235353e = a0Var;
        this.f235352d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer;
        dl3.a0 a0Var = this.f235353e;
        java.lang.String str = a0Var.f235273e.f235280c;
        int i17 = this.f235352d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged state %d, %s", java.lang.Integer.valueOf(i17), str);
        if (i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged PREPARING!");
            a0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onPreparing");
            dl3.d0 d0Var = a0Var.f235273e;
            n01.b bVar = d0Var.f235281d;
            a0Var.f235272d = bVar;
            if (bVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Audio.QQAudioPlayer", "cbMusic is null");
            } else if (d0Var.f235286i || d0Var.f235285h) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "isPausedOnBackground or isForcePause is true, do stop player and not send event");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onPreparintEvent");
                com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent = new com.tencent.mm.autogen.events.AudioPlayerEvent();
                am.g0 g0Var = audioPlayerEvent.f53990g;
                g0Var.f6716a = 9;
                g0Var.f6719d = "waiting";
                g0Var.f6718c = d0Var.f235280c;
                g0Var.f6720e = d0Var.k();
                audioPlayerEvent.b(android.os.Looper.getMainLooper());
            }
            a0Var.f235273e.f235298u = java.lang.System.currentTimeMillis();
            return;
        }
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged PREPARED!");
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "preparing cost time :%d!", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - a0Var.f235273e.f235298u));
            a0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onPrepared");
            dl3.d0 d0Var2 = a0Var.f235273e;
            a0Var.f235272d = d0Var2.f235281d;
            if (d0Var2.f235286i || d0Var2.f235285h) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "isPausedOnBackground or isForcePause is true, do stop player and not send event");
                if (d0Var2.f235286i && (commonPlayer = d0Var2.f235282e) != null) {
                    commonPlayer.stop();
                }
                if (d0Var2.f235285h) {
                    d0Var2.m();
                    return;
                }
                return;
            }
            int i18 = d0Var2.f235292o;
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "seek to startTime:%d", java.lang.Integer.valueOf(i18));
                d0Var2.c(d0Var2.f235292o);
            }
            com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer2 = d0Var2.f235282e;
            if (commonPlayer2 != null && commonPlayer2.getCurrentAudioInformation() != null && d0Var2.f235282e.getCurrentAudioInformation().getAudioType() != null) {
                com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType = d0Var2.f235282e.getCurrentAudioInformation().getAudioType();
                d0Var2.f235295r = audioType;
                if (audioType != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "getAudioType:%d", java.lang.Integer.valueOf(audioType.getValue()));
                }
                com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType2 = d0Var2.f235295r;
                if (audioType2 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "idKeyReportAudioMimeType audioType:%d, isStatMineType:%b", java.lang.Integer.valueOf(audioType2.getValue()), java.lang.Boolean.valueOf(d0Var2.f235296s));
                    if (!d0Var2.f235296s) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "idKeyReportAudioMimeType OK");
                        d0Var2.f235296s = true;
                        if (d0Var2.f235300w != null) {
                            int value = d0Var2.f235295r.getValue();
                            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
                            iDKey.SetID(na1.e.CTRL_INDEX);
                            iDKey.SetKey(value == 2 ? 42 : value == 3 ? 43 : value == 4 ? 44 : value == 5 ? 45 : value == 6 ? 46 : value == 7 ? 47 : value == 8 ? 48 : value == 9 ? 49 : 50);
                            iDKey.SetValue(1L);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(iDKey);
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
                        }
                    }
                }
            }
            d0Var2.n();
            if (!d0Var2.f235293p) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "autoplay is false, don't start auto play!");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "start to play");
            try {
                com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer3 = d0Var2.f235282e;
                if (commonPlayer3 != null) {
                    float f17 = (float) d0Var2.f235281d.f333847l;
                    commonPlayer3.setVolume(f17, f17);
                    d0Var2.r();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e17, "_onPrepared", new java.lang.Object[0]);
                d0Var2.l(502);
                d0Var2.t(502);
            }
            d0Var2.f235284g = true;
            return;
        }
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged STARTED!");
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "start cost time :%d!", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - a0Var.f235273e.f235298u));
            a0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onStart");
            dl3.d0 d0Var3 = a0Var.f235273e;
            el3.i iVar = d0Var3.f235300w;
            if (iVar != null) {
                n01.b bVar2 = d0Var3.f235281d;
                java.lang.String str2 = bVar2.f333836a;
                java.lang.String str3 = bVar2.f333837b;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                n01.b bVar3 = d0Var3.f235281d;
                ((el3.h) iVar).E(str2, str3, currentTimeMillis - bVar3.f333850o, bVar3.f333851p, bVar3.f333852q, true, "", 0L, 0L, 0L);
            }
            a0Var.f235272d = d0Var3.f235281d;
            if (d0Var3.f235286i || d0Var3.f235285h) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "isPausedOnBackground or isForcePause is true, do stop player and not send event");
                com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer4 = d0Var3.f235282e;
                if (commonPlayer4 == null || !d0Var3.f235284g) {
                    return;
                }
                d0Var3.f235284g = false;
                commonPlayer4.stop();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onStartEvent %b", java.lang.Boolean.valueOf(d0Var3.i()));
            com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent2 = new com.tencent.mm.autogen.events.AudioPlayerEvent();
            am.g0 g0Var2 = audioPlayerEvent2.f53990g;
            g0Var2.f6716a = 0;
            g0Var2.f6719d = com.tencent.tav.core.AssetExtension.SCENE_PLAY;
            g0Var2.f6718c = d0Var3.f235280c;
            g0Var2.f6720e = d0Var3.k();
            audioPlayerEvent2.b(android.os.Looper.getMainLooper());
            dl3.f fVar = d0Var3.f235348b;
            if (fVar != null) {
                ((dl3.l) fVar).a(d0Var3.f235280c);
            }
            dl3.c0 c0Var = d0Var3.f235287j;
            if (c0Var != null) {
                c0Var.f235278d = true;
            }
            dl3.c0 c0Var2 = new dl3.c0(d0Var3, null);
            d0Var3.f235287j = c0Var2;
            c0Var2.f235278d = false;
            return;
        }
        if (i17 == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged PAUSED!");
            a0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onPause");
            a0Var.f235273e.m();
            return;
        }
        if (i17 == 6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged STOPPED!");
            a0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onStop");
            if (a0Var.f235272d == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Audio.QQAudioPlayer", "currentMusic is null");
                return;
            }
            dl3.d0 d0Var4 = a0Var.f235273e;
            d0Var4.f235284g = false;
            d0Var4.f235299v = java.lang.System.currentTimeMillis();
            if (d0Var4.f235280c.equalsIgnoreCase(a0Var.f235272d.f333836a)) {
                if (!d0Var4.f235286i) {
                    d0Var4.p();
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "stop play, but send pause state event");
                    d0Var4.m();
                    return;
                }
            }
            return;
        }
        if (i17 != 7) {
            if (i17 == 8) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged END!");
                a0Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onEnd");
                return;
            } else {
                if (i17 == 9) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged ERROR!");
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged PLAYBACKCOMPLETED!");
        a0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onCompletion");
        dl3.d0 d0Var5 = a0Var.f235273e;
        if (!d0Var5.f235281d.f333843h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onCompleteEvent");
            com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent3 = new com.tencent.mm.autogen.events.AudioPlayerEvent();
            am.g0 g0Var3 = audioPlayerEvent3.f53990g;
            g0Var3.f6716a = 5;
            g0Var3.f6719d = "ended";
            g0Var3.f6718c = d0Var5.f235280c;
            g0Var3.f6720e = d0Var5.k();
            audioPlayerEvent3.b(android.os.Looper.getMainLooper());
            dl3.f fVar2 = d0Var5.f235348b;
            if (fVar2 != null) {
                java.lang.String str4 = d0Var5.f235280c;
                dl3.i iVar2 = ((dl3.l) fVar2).f235336a;
                dl3.d0 o17 = iVar2.o(str4);
                if (o17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "onComplete player is null");
                } else {
                    iVar2.O(str4, o17);
                    iVar2.w(str4, o17);
                    dl3.i.c(iVar2);
                    iVar2.F(1800000);
                    iVar2.T(str4);
                    iVar2.A(str4);
                }
            }
        }
        dl3.c0 c0Var3 = d0Var5.f235287j;
        if (c0Var3 != null) {
            c0Var3.f235278d = true;
            d0Var5.f235287j = null;
        }
        d0Var5.f235299v = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "play end, isPausedOnBackground:%b, playParam.loop:%b, isStartPlaying:%b, ", java.lang.Boolean.valueOf(d0Var5.f235286i), java.lang.Boolean.valueOf(d0Var5.f235281d.f333843h), java.lang.Boolean.valueOf(d0Var5.f235284g));
        if (d0Var5.f235286i) {
            d0Var5.f235284g = false;
            d0Var5.f235292o = 0;
            d0Var5.f235293p = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "isPausedOnBackground is true, do stop player and don't play again");
            return;
        }
        if (d0Var5.f235285h) {
            d0Var5.f235284g = false;
            d0Var5.f235292o = 0;
            d0Var5.f235293p = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "isForcePause is true, do stop player and don't play again");
            return;
        }
        if (!d0Var5.f235281d.f333843h || !d0Var5.f235284g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "play end, but not loop play");
            d0Var5.f235284g = false;
            d0Var5.f235292o = 0;
            d0Var5.f235293p = true;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "play end normally and loop play again");
        d0Var5.f235284g = false;
        d0Var5.f235292o = 0;
        d0Var5.f235293p = true;
        d0Var5.u();
    }
}
