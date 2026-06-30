package ll;

/* loaded from: classes13.dex */
public class c extends ll.n {

    /* renamed from: g, reason: collision with root package name */
    public final ll.o f319077g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319078h;

    /* renamed from: i, reason: collision with root package name */
    public ll.p f319079i;

    public c(ll.o oVar, java.lang.String str, int i17) {
        super(str, i17);
        this.f319078h = false;
        this.f319077g = oVar;
    }

    @Override // ll.n
    public void h() {
        this.f319078h = false;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        java.lang.Object[] objArr = {this.f319117d};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeTask", "run task %s", objArr);
        if (this.f319078h) {
            return;
        }
        android.os.Process.setThreadPriority(-16);
        ll.o oVar = this.f319077g;
        ll.p pVar = this.f319079i;
        ll.a aVar = (ll.a) oVar;
        aVar.getClass();
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecodeMgr", "process decoder is null", null);
        } else {
            ll.d dVar = (ll.d) pVar;
            n01.b g17 = dVar.g();
            if (dVar.f319080a.f346103l != null) {
                ol.k kVar = dVar.f319080a.f346103l;
                int i18 = dVar.g().f333844i;
                if (((dl3.q) kVar).f235342a.f235328u != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
                    iDKey.SetID(na1.e.CTRL_INDEX);
                    iDKey.SetKey(90);
                    iDKey.SetValue(1L);
                    arrayList.add(iDKey);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
                }
            }
            dVar.f319085f = dVar.g().f333838c;
            if (android.text.TextUtils.isEmpty(dVar.f319085f)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecoderBase", "source path is null", null);
                dVar.m(712);
            } else {
                n01.b g18 = dVar.g();
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "decode sourcePath :%s, loop:%b", dVar.f319085f, java.lang.Boolean.valueOf(g18.f333843h));
                if (dVar.f319087h.get()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "do preload audio", null);
                    if (g18.A) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "preload begin", null);
                        if (il.j.a().d(dVar.f319085f)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "audio is loaded complete!", null);
                        } else {
                            dVar.l();
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "preload end", null);
                        dVar.p(15);
                    } else {
                        if (!(dVar.f319088i.get() == 4)) {
                            dVar.p(3);
                        }
                        if (il.j.a().d(dVar.f319085f)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "audio is loaded complete!", null);
                        } else {
                            dVar.l();
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "preload audio end", null);
                        dVar.f319087h.set(false);
                        hl.d f17 = dVar.f();
                        if (dVar.i()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "stopped, not to play", null);
                            if (f17.f282019b) {
                                dVar.p(2);
                            }
                        } else {
                            if (dVar.f319088i.get() == 9) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "occurs error, not to play", null);
                            } else {
                                if ((dVar.f319088i.get() == 4) || g18.f333842g) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "to play", null);
                                    dVar.p(2);
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "not to play", null);
                                    dVar.p(2);
                                }
                            }
                        }
                    }
                }
                dVar.p(4);
                do {
                    if (il.j.a().d(dVar.f319085f)) {
                        dVar.u();
                    } else {
                        dVar.l();
                    }
                    z17 = g18.f333843h && !dVar.i();
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "loop again for audioId:%s", dVar.e());
                        try {
                            java.lang.Thread.sleep(20L);
                        } catch (java.lang.Exception unused) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioDecoderBase", "sleep exception", null);
                        }
                        dVar.f319096q = 0;
                    }
                } while (z17);
                if (!dVar.i()) {
                    if (!(dVar.f319088i.get() == 9)) {
                        if (dVar.f319080a.f346100i.c(dVar.e())) {
                            dVar.p(7);
                            dVar.f319080a.f346100i.j(dVar.e());
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "not mix end, not set to play complete!", null);
                            nl.b bVar = dVar.f319080a.f346100i;
                            java.lang.String e17 = dVar.e();
                            synchronized (bVar.f338125n) {
                                bVar.f338127p.put(e17, java.lang.Boolean.TRUE);
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "task end", null);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "is stop or error, not set to play complete!", null);
                if (dVar.f319081b.equals(dVar.g().f333838c)) {
                    dVar.f319080a.f346100i.j(dVar.e());
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "removeAudio", null);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "change src only, don't removeAudio", null);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "task end", null);
            }
            dVar.f();
            int i19 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "release", null);
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "duration:%d", java.lang.Long.valueOf(dVar.f().f282021d));
            dVar.o();
            dVar.b();
            if (dVar.f319081b != null) {
                dVar.f319081b.b().f333839d = 0;
                dVar.f319081b.disconnect();
            }
            dVar.f319087h.set(false);
            dVar.f319090k.set(true);
            dVar.f319089j.set(false);
            dVar.f319091l.set(false);
            dVar.f319080a = null;
            synchronized (aVar.f319070a.f319076f) {
                if (g17 != null) {
                    if (((java.util.ArrayList) aVar.f319070a.f319074d).contains(g17.f333838c)) {
                        ((java.util.ArrayList) aVar.f319070a.f319074d).remove(g17.f333838c);
                    }
                }
            }
        }
        ((ll.a) this.f319077g).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeMgr", "decode process end", null);
        ll.m.c(this);
        this.f319078h = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecodeTask", "run task %s end", this.f319117d);
    }
}
