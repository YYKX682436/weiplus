package dl3;

/* loaded from: classes13.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.i f235338d;

    public n(dl3.i iVar) {
        this.f235338d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dl3.i iVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "releaseAudioDelayRunnable, run");
        java.util.Iterator it = this.f235338d.f235313f.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (this.f235338d.p(str) == 0) {
                dl3.i iVar2 = this.f235338d;
                iVar2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroyAllAudioPlayersAndSaveState, appId:%s", str);
                synchronized (iVar2.f235323p) {
                    java.util.LinkedList linkedList = (java.util.LinkedList) iVar2.f235315h.get(str);
                    if (linkedList != null && linkedList.size() != 0) {
                        java.util.Iterator it6 = linkedList.iterator();
                        while (it6.hasNext()) {
                            java.lang.String str2 = (java.lang.String) it6.next();
                            if (iVar2.B.f(str2)) {
                                iVar2.B.r(str2);
                            }
                            dl3.d0 d0Var = (dl3.d0) iVar2.f235309b.remove(str2);
                            iVar2.f235310c.remove(str2);
                            if (d0Var != null) {
                                iVar2.O(str2, d0Var);
                                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroy player");
                                if (d0Var.f235286i) {
                                    iVar2.k(str2, d0Var);
                                } else {
                                    iVar2.k(str2, d0Var);
                                }
                            }
                        }
                        java.util.Iterator it7 = linkedList.iterator();
                        while (it7.hasNext()) {
                            java.lang.String str3 = (java.lang.String) it7.next();
                            if (iVar2.B.f(str3)) {
                                iVar2.B.r(str3);
                            }
                            dl3.d0 d0Var2 = (dl3.d0) iVar2.f235311d.remove(str3);
                            iVar2.f235312e.remove(str3);
                            if (d0Var2 != null) {
                                iVar2.O(str3, d0Var2);
                                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "destroy recycled player");
                                if (d0Var2.f235286i) {
                                    iVar2.k(str3, d0Var2);
                                } else {
                                    iVar2.k(str3, d0Var2);
                                }
                            }
                        }
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to stop");
                }
                z17 = true;
            }
        }
        if (z17) {
            return;
        }
        synchronized (this.f235338d.f235323p) {
            iVar = this.f235338d;
            iVar.f235324q = true;
        }
        iVar.f235326s = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.u3.i(this.f235338d.P, 1800000L);
    }
}
