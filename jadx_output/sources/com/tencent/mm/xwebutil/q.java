package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.xwebutil.r f214868a;

    public static void a(java.lang.String str, java.lang.String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || !b(str) || !str2.equals(f214868a.f214873d)) {
            return;
        }
        try {
            com.tencent.mm.xwebutil.r rVar = f214868a;
            fp.e eVar = rVar.f214879j;
            fp.c cVar = rVar.f214880k;
            if (eVar != null && cVar != null) {
                com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "finishPlay removeFocusListener");
                fp.d dVar = eVar.f265176a;
                if (dVar != null) {
                    fp.g gVar = (fp.g) dVar;
                    if (gVar.f265198c == cVar) {
                        gVar.f265198c = null;
                    }
                }
                eVar.a();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "finishPlay removeFocusListener error: " + th6.getMessage());
            d("finishPlay error ", th6);
        }
        try {
            com.tencent.mm.ui.MMActivity a17 = f214868a.a();
            java.lang.ref.WeakReference weakReference = f214868a.f214881l;
            android.content.BroadcastReceiver broadcastReceiver = weakReference == null ? null : (android.content.BroadcastReceiver) weakReference.get();
            if (a17 != null && broadcastReceiver != null) {
                com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "finishPlay unregisterReceiver");
                a17.unregisterReceiver(broadcastReceiver);
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "finishPlay unregisterReceiver error: " + th7.getMessage());
            d("finishPlay error ", th7);
        }
        try {
            com.tencent.mm.xwebutil.XWebAudioPlayerProgress b17 = f214868a.b();
            if (b17 != null) {
                com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "finishPlay releaseProgressBar");
                if (b17.f214815n != null) {
                    com.tencent.mars.xlog.Log.i("XFilesAudioPlayerProgress", "stopTimer");
                    b17.f214815n.cancel(false);
                    b17.f214815n = null;
                }
                b17.f214814m = null;
                com.tencent.mm.xwebutil.XWebAudioPlayerProgressBall xWebAudioPlayerProgressBall = b17.f214813i;
                if (xWebAudioPlayerProgressBall != null) {
                    xWebAudioPlayerProgressBall.setOperationCallback(null);
                }
            }
        } catch (java.lang.Throwable th8) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "finishPlay releaseProgressBar error: " + th8.getMessage());
            d("finishPlay error ", th8);
        }
        try {
            com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = f214868a.f214877h;
            if (iTPPlayer != null && iTPPlayer.getCurrentState() != 11) {
                com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "finishPlay releasePlayer");
                iTPPlayer.release();
            }
        } catch (java.lang.Throwable th9) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "finishPlay releasePlayer error: " + th9.getMessage());
            d("finishPlay error ", th9);
        }
        f214868a = null;
        com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "finishPlay complete, token = ".concat(str));
    }

    public static boolean b(java.lang.String str) {
        com.tencent.mm.xwebutil.r rVar;
        if (str == null || str.isEmpty() || (rVar = f214868a) == null) {
            return false;
        }
        if (str.equals(rVar.f214875f)) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "isCurrentParamsValid, token invalid, token in param = " + f214868a.f214875f + ", token = " + str);
        return false;
    }

    public static void c(java.lang.String str, android.webkit.ValueCallback valueCallback, int i17, android.content.Context context, com.tencent.xweb.j jVar) {
        com.tencent.mm.xwebutil.r rVar = f214868a;
        if (rVar != null) {
            if (rVar.f214883n) {
                com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "onReceiveValueProcess already reported ret, ignore");
                return;
            }
            rVar.f214883n = true;
        }
        com.tencent.xweb.n.r(str, -1, i17, context, jVar);
        if (valueCallback != null) {
            if (i17 != 0) {
                valueCallback.onReceiveValue(-102);
            } else {
                valueCallback.onReceiveValue(java.lang.Integer.valueOf(i17));
            }
        }
    }

    public static void d(java.lang.String str, java.lang.Throwable th6) {
        com.tencent.mm.xwebutil.r rVar = f214868a;
        if (rVar != null) {
            java.lang.String str2 = rVar.f214874e;
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.xweb.n.l("XFilesAudioPlayer_".concat(str2), -1, str, th6);
        }
    }

    public static boolean e(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, java.lang.String str, java.lang.String str2, com.tencent.mm.xwebutil.p pVar, com.tencent.xweb.i iVar, int i17) {
        try {
            if (pVar == null) {
                com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "tryPlayInner, playerListener invalid");
                return false;
            }
            pVar.f214866g = -1;
            if (iTPPlayer == null) {
                com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "tryPlayInner, tpPlayer is null");
                return false;
            }
            if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
                int currentState = iTPPlayer.getCurrentState();
                if (currentState != 1 && currentState != 2 && currentState != 9) {
                    if (i17 >= 0) {
                        com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "tryPlayInner, need seek to " + i17);
                        iTPPlayer.seekTo(i17);
                    } else if (currentState == 7) {
                        com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "tryPlayInner, now is complete, need seek to 0");
                        iTPPlayer.seekTo(0);
                    }
                    if (currentState != 5) {
                        com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "tryPlayInner, try start");
                        iTPPlayer.start();
                    }
                    return true;
                }
                com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "tryPlayInner need prepare, currentState = " + currentState + ", needSeekToMs = " + i17);
                int ordinal = iVar.ordinal();
                if (ordinal == 1) {
                    com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "tryPlayInner set tponly");
                    iTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(202, 1L));
                } else if (ordinal == 2) {
                    com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "tryPlayInner set tpfirst");
                    iTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(202, 2L));
                } else if (ordinal == 3) {
                    com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "tryPlayInner set sysonly");
                    iTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(202, 3L));
                } else if (ordinal == 4) {
                    com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "tryPlayInner set sysfirst");
                    iTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(202, 4L));
                }
                if ("aac".equalsIgnoreCase(str2)) {
                    com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "tryPlayInner is aac, enable accurate duration");
                    iTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildBoolean(144, true));
                }
                iTPPlayer.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, 3L));
                iTPPlayer.setDataSource(str);
                iTPPlayer.setLoopback(false);
                iTPPlayer.setOnPreparedListener(pVar);
                iTPPlayer.setOnInfoListener(pVar);
                iTPPlayer.setOnPlayerStateChangeListener(pVar);
                iTPPlayer.setOnCompletionListener(pVar);
                iTPPlayer.setOnErrorListener(pVar);
                pVar.f214866g = i17;
                iTPPlayer.prepareAsync();
                return true;
            }
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "tryPlayInner, filePath is empty");
            return false;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "tryPlayInner error: " + th6.getMessage());
            d("tryPlayInner error ", th6);
            return false;
        }
    }
}
