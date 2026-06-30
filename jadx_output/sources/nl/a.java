package nl;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl.b f338111d;

    public a(nl.b bVar) {
        this.f338111d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Process.setThreadPriority(-19);
        if (this.f338111d.e()) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixController", "stop and exit", null);
            return;
        }
        while (!this.f338111d.e()) {
            nl.b bVar = this.f338111d;
            synchronized (bVar.f338118g) {
                while (!bVar.e() && bVar.f338115d.get()) {
                    try {
                        int i18 = rl.b.f397143a;
                        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixController", "waitMix", null);
                        bVar.f338118g.wait();
                    } catch (java.lang.Exception e17) {
                        int i19 = rl.b.f397143a;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioMixController", e17, "waitMix", new java.lang.Object[0]);
                    } finally {
                    }
                }
            }
            if (this.f338111d.e()) {
                return;
            }
            java.lang.System.nanoTime();
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f338111d.h();
            if (arrayList.size() > 0) {
                long nanoTime = java.lang.System.nanoTime();
                hl.b a17 = ((nl.c) this.f338111d.f338112a).a(arrayList);
                long nanoTime2 = java.lang.System.nanoTime();
                nl.b bVar2 = this.f338111d;
                bVar2.f338133v++;
                bVar2.f338134w += nanoTime2 - nanoTime;
                if (a17 != null) {
                    a17.f282017d.addAll(bVar2.f338131t);
                    bVar2.f338131t.clear();
                    ol.h hVar = bVar2.f338113b;
                    if (hVar.f346095d.get()) {
                        int i27 = rl.b.f397143a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "exit, not to add MixBuff queue", null);
                    } else {
                        synchronized (hVar.f346097f) {
                            while (((java.util.ArrayDeque) hVar.f346096e).size() >= 2 && !hVar.f346095d.get()) {
                                try {
                                    hVar.f346097f.wait();
                                } catch (java.lang.InterruptedException e18) {
                                    int i28 = rl.b.f397143a;
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioMixPlayerImpl", e18, "enqueueMixBuffer", new java.lang.Object[0]);
                                }
                            }
                            ((java.util.ArrayDeque) hVar.f346096e).add(a17);
                            hVar.f346097f.notifyAll();
                        }
                    }
                }
                this.f338111d.i(arrayList);
                arrayList.clear();
            }
        }
        int i29 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixController", "mix thread stop and exit", null);
    }
}
