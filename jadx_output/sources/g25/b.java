package g25;

/* loaded from: classes14.dex */
public final class b implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f25.l0 f267965d;

    public b(f25.l0 l0Var) {
        this.f267965d = l0Var;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i17) {
        boolean z17 = g25.d.f267976o;
        f25.l0 l0Var = this.f267965d;
        if (z17) {
            kotlin.jvm.internal.o.g(l0Var, "<this>");
            if (!((l0Var.f259105b & 2) == 2) && i17 == -3) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AFS.AudioFocusManagerImpl", "genAudioFocusRequest: intercept AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK call");
                return;
            }
        }
        if (g25.d.f267975n) {
            g25.d dVar = g25.d.f267968d;
            com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + l0Var + ", " + i17);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = g25.d.f267972h;
            g25.e eVar = (g25.e) concurrentHashMap.get(l0Var);
            if (eVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + l0Var + " not contains in sessionMap");
                return;
            }
            f25.f fVar = eVar.f267983f;
            if (i17 == -3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + eVar + " dispatch onPause can duck");
                if (fVar != null) {
                    fVar.c(true);
                }
                dVar.f(eVar, false, false);
                return;
            }
            if (i17 == -2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + eVar + " dispatch onPause");
                if (fVar != null) {
                    fVar.c(false);
                }
                dVar.f(eVar, false, false);
                return;
            }
            if (i17 == -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + eVar + " dispatch onStop");
                if (fVar != null) {
                    fVar.onStop();
                }
                concurrentHashMap.remove(l0Var);
                dVar.b(l0Var);
                dVar.f(eVar, false, false);
                return;
            }
            if (i17 != 1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: un expected focusChange value " + i17);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + eVar + " dispatch onResume");
            if (fVar != null) {
                fVar.onResume();
            }
            dVar.f(eVar, true, true);
            return;
        }
        g25.d dVar2 = g25.d.f267968d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + l0Var + ", " + i17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = g25.d.f267972h;
        g25.e eVar2 = (g25.e) concurrentHashMap2.get(l0Var);
        if (eVar2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + l0Var + " not contains in sessionMap");
            return;
        }
        f25.f fVar2 = eVar2.f267983f;
        if (i17 == -3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + eVar2 + " dispatch onPause can duck");
            dVar2.f(eVar2, false, false);
            if (fVar2 != null) {
                fVar2.c(true);
                return;
            }
            return;
        }
        if (i17 == -2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + eVar2 + " dispatch onPause");
            dVar2.f(eVar2, false, false);
            if (fVar2 != null) {
                fVar2.c(false);
                return;
            }
            return;
        }
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + eVar2 + " dispatch onStop");
            concurrentHashMap2.remove(l0Var);
            dVar2.b(l0Var);
            dVar2.f(eVar2, false, false);
            if (fVar2 != null) {
                fVar2.onStop();
                return;
            }
            return;
        }
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: un expected focusChange value " + i17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + eVar2 + " dispatch onResume");
        dVar2.f(eVar2, true, true);
        if (fVar2 != null) {
            fVar2.onResume();
        }
    }
}
