package tl;

/* loaded from: classes12.dex */
public final class o0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f420064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl.p0 f420065e;

    public o0(tl.p0 p0Var) {
        this.f420065e = p0Var;
        this.f420064d = new tl.n0(this, p0Var);
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "SceneVoiceRecorder_record";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.u3.l(this.f420065e.f420089v);
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "RecordStartRunnable begin run %s", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        oy.i iVar = (oy.i) i95.n0.c(oy.i.class);
        if (iVar != null && ((com.tencent.mm.feature.chatrecordstts.b1) iVar).f65353p != oy.k.f349823d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "TTS is playing, wait shortly before recording");
            try {
                java.lang.Thread.sleep(300L);
            } catch (java.lang.Exception unused) {
            }
        }
        synchronized (this.f420065e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "lock[%s] of runnable[%s]!", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), this.f420065e);
            tl.d dVar = this.f420065e.f420068a;
            if (dVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoice.Recorder", "Stop Record Failed recorder == null");
                return;
            }
            if (dVar != null) {
                java.lang.String vj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f22757j, this.f420065e.f420072e, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "Thread Started Record, fullPath: %s, useSpeex: %s", vj6, java.lang.Boolean.valueOf(this.f420065e.f420082o));
                if (!dVar.startRecord(vj6)) {
                    if (!this.f420065e.m() || this.f420065e.f420073f == null) {
                        w21.x0.b(this.f420065e.f420072e);
                    } else {
                        ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).aj(this.f420065e.f420073f);
                    }
                    tl.p0 p0Var = this.f420065e;
                    p0Var.f420072e = null;
                    p0Var.f420068a = null;
                    p0Var.f420073f = null;
                    p0Var.f420074g = null;
                    p0Var.l();
                    com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoice.Recorder", "Thread Start Record  Error fileName[" + this.f420065e.f420072e + "]");
                }
                tl.p0 p0Var2 = this.f420065e;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                p0Var2.f420079l = android.os.SystemClock.elapsedRealtime();
                com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "Thread Started Record fileName[" + this.f420065e.f420072e + "] time:" + (android.os.SystemClock.elapsedRealtime() - this.f420065e.f420078k));
            }
            this.f420064d.sendEmptyMessageDelayed(0, 1L);
        }
    }
}
