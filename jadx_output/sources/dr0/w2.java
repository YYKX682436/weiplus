package dr0;

/* loaded from: classes12.dex */
public final class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.a3 f242569d;

    public w2(dr0.a3 a3Var) {
        this.f242569d = a3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long f17 = dr0.a3.f242403d.a().f();
        if (f17 < 0 || f17 > 1440) {
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "abort: deepBg, delayMin=" + f17);
            dr0.x0.f242571a.c("RECYCLE_DEEP_BG", "check-fail", "invalidPostMin");
            return;
        }
        if (dr0.j2.f242443e.a()) {
            dr0.a3 a3Var = this.f242569d;
            dr0.t2 t2Var = a3Var.f242408a;
            boolean z17 = false;
            if (t2Var != null && t2Var.f242553b) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "abort: deepBg, has task with higher priority");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "recycle schedule: deepBg, delayMin=" + f17);
            long j17 = f17 * ((long) com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
            a3Var.d("post-3");
            dr0.q3.j(dr0.q3.f242506m, j17, null, 2, null);
        }
    }
}
