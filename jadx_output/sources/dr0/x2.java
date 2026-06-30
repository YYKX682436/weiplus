package dr0;

/* loaded from: classes12.dex */
public final class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.a3 f242574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f242575e;

    public x2(dr0.a3 a3Var, boolean z17) {
        this.f242574d = a3Var;
        this.f242575e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (dr0.j2.f242444f.a()) {
            dr0.a3 a3Var = this.f242574d;
            if (a3Var.f242409b < 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "abort: periodical, loop=" + a3Var.f242409b);
                return;
            }
            dr0.t2 t2Var = a3Var.f242408a;
            int i17 = 0;
            if (t2Var != null && t2Var.f242553b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "abort: periodical, has task with higher priority");
                return;
            }
            if (this.f242575e) {
                a3Var.f242409b = 0;
            }
            int i18 = a3Var.f242409b + 1;
            a3Var.f242409b = i18;
            int i19 = 1;
            int i27 = 0;
            while (i17 < i18) {
                int i28 = i27 + i19;
                i17++;
                i27 = i19;
                i19 = i28;
            }
            long j17 = i19;
            long l17 = mm.k.l(mm.k.H, null, 1, null);
            if (l17 <= j17) {
                j17 = l17;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "recycle schedule: periodical, loop=" + a3Var.f242409b + ", delayMin=" + j17);
            long longValue = j17 * (dr0.a3.f242403d.a().g() ? java.lang.Long.valueOf(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) : java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL)).longValue();
            a3Var.d("post-40");
            dr0.q3.j(dr0.q3.f242507n, longValue, null, 2, null);
        }
    }
}
