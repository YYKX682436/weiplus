package ol;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol.h f346086d;

    public d(ol.h hVar) {
        this.f346086d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hl.b bVar;
        int i17;
        android.os.Process.setThreadPriority(-19);
        if (this.f346086d.f346095d.get()) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "stop and exit", null);
            return;
        }
        ol.h hVar = this.f346086d;
        if (hVar.f346092a == null) {
            ol.h.a(hVar);
        }
        int i19 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "playback start", null);
        while (true) {
            if (this.f346086d.f346095d.get()) {
                break;
            }
            ol.h hVar2 = this.f346086d;
            synchronized (hVar2.f346097f) {
                while (hVar2.f346094c.get() && !hVar2.f346095d.get()) {
                    int i27 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "waitPlay", null);
                    try {
                        hVar2.f346097f.wait();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e17, "waitPlay", new java.lang.Object[0]);
                    }
                }
            }
            if (this.f346086d.f346095d.get()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "playback break", null);
                break;
            }
            ol.h hVar3 = this.f346086d;
            synchronized (hVar3.f346097f) {
                while (true) {
                    if ((((java.util.ArrayDeque) hVar3.f346096e).size() == 0 || hVar3.f346094c.get()) && !hVar3.f346095d.get()) {
                        try {
                            int i28 = rl.b.f397143a;
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "wait play", null);
                            hVar3.o(0.0f, 0.0f);
                            android.media.AudioTrack audioTrack = hVar3.f346092a;
                            if (audioTrack != null && audioTrack.getPlayState() == 3) {
                                hVar3.f346092a.stop();
                            }
                            hVar3.f346097f.wait();
                            hVar3.f346115x = 0;
                        } catch (java.lang.InterruptedException e18) {
                            int i29 = rl.b.f397143a;
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e18, "waitPlay", new java.lang.Object[0]);
                        }
                    }
                }
                bVar = (hl.b) ((java.util.ArrayDeque) hVar3.f346096e).poll();
                hVar3.f346097f.notifyAll();
            }
            if (bVar != null) {
                byte[] bArr = bVar.f282016c;
                ol.h hVar4 = this.f346086d;
                if (hVar4.f346092a == null) {
                    ol.h.a(hVar4);
                }
                if (bArr != null && bArr.length > 0) {
                    android.media.AudioTrack audioTrack2 = this.f346086d.f346092a;
                    if (audioTrack2 != null && (audioTrack2.getPlayState() == 1 || this.f346086d.f346092a.getPlayState() == 2)) {
                        this.f346086d.f346092a.play();
                    }
                    ol.h.b(this.f346086d, bVar);
                    ol.h hVar5 = this.f346086d;
                    hVar5.f346115x++;
                    hVar5.k(bVar);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    ol.h hVar6 = this.f346086d;
                    if (hVar6.f346092a != null) {
                        if (hVar6.f346100i.f338116e.get()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "isMute", null);
                            this.f346086d.f346092a.setStereoVolume(0.0f, 0.0f);
                        } else {
                            this.f346086d.f346092a.setStereoVolume(1.0f, 1.0f);
                        }
                        i17 = this.f346086d.f346092a.write(bArr, 0, bArr.length);
                    } else {
                        i17 = 0;
                    }
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    if (currentTimeMillis2 > 100) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "write audio track after writeSize:%d, time:%d, writeCount:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis2), java.lang.Integer.valueOf(this.f346086d.f346115x));
                    }
                    if (i17 < 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "write audio track buffer failed, Size:%d", java.lang.Integer.valueOf(i17));
                    }
                    if (((java.util.ArrayDeque) this.f346086d.f346096e).size() == 0) {
                        byte[] bArr2 = this.f346086d.f346112u;
                        bArr2[0] = bArr[bArr.length - 2];
                        bArr2[1] = bArr[bArr.length - 1];
                    }
                }
                if (il.f.f291986b == null) {
                    synchronized (il.f.class) {
                        if (il.f.f291986b == null) {
                            il.f.f291986b = new il.f();
                        }
                    }
                }
                il.f fVar = il.f.f291986b;
                synchronized (fVar) {
                    if (bVar.f282016c != null) {
                        bVar.f282015b = 0;
                        bVar.f282014a = 0;
                        bVar.f282017d.clear();
                        byte[] bArr3 = bVar.f282016c;
                        java.util.Arrays.fill(bArr3, 0, bArr3.length, (byte) 0);
                        fVar.f291987a.add(0, bVar);
                    }
                }
            }
        }
        ol.h hVar7 = this.f346086d;
        synchronized (hVar7) {
            try {
                android.media.AudioTrack audioTrack3 = hVar7.f346092a;
                if (audioTrack3 != null) {
                    audioTrack3.flush();
                    hVar7.f346092a.stop();
                    hVar7.f346092a.release();
                    hVar7.f346092a = null;
                }
            } catch (java.lang.Exception e19) {
                int i37 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e19, "releaseAudioTrack", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "release AudioTrack and exit playback thread id:%d", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
    }
}
