package dr0;

/* loaded from: classes12.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.a3 f242566d;

    public v2(dr0.a3 a3Var) {
        this.f242566d = a3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr0.a3 a17 = dr0.a3.f242403d.a();
        int i17 = (a17.k() && mm.k.j(mm.k.E, null, 1, null) && a17.i() > 0) ? 1 : -1;
        if (i17 <= 0 || i17 > 1440) {
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "abort: continuous, delayMin=" + i17);
            return;
        }
        if (dr0.j2.f242441c.a()) {
            dr0.a3 a3Var = this.f242566d;
            dr0.t2 t2Var = a3Var.f242408a;
            if (t2Var != null && t2Var.f242553b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "abort: continuous, has task with higher priority");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "recycle schedule: continuous, delayMin=" + i17);
            long j17 = (long) (i17 * com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
            if (a3Var.g()) {
                j17 = 30000;
            }
            a3Var.d("post-1");
            dr0.q3.j(dr0.q3.f242504h, j17, null, 2, null);
        }
    }
}
