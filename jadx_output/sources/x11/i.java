package x11;

/* loaded from: classes12.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x11.t f451375d;

    public i(x11.t tVar) {
        this.f451375d = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x11.t tVar = this.f451375d;
        java.lang.Thread thread = tVar.B;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Long l17 = tVar.A;
        boolean z17 = true;
        if (thread == null) {
            tVar.A = null;
        } else if (thread.getState() != java.lang.Thread.State.BLOCKED) {
            tVar.A = null;
        } else if (l17 == null) {
            tVar.A = java.lang.Long.valueOf(currentTimeMillis);
        } else if (java.lang.Math.abs(currentTimeMillis - l17.longValue()) >= 20000) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneInit.dkInit", "block detected. do report. do dump");
            jz5.g gVar = p01.b.f350360a;
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) p01.b.f350360a).getValue()).putBoolean("need_revert_v2", true);
            com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
            errorMsgInfoStruct.f56113e = 2880L;
            errorMsgInfoStruct.f56117i = tVar.a().b();
            errorMsgInfoStruct.f56118j = 1L;
            errorMsgInfoStruct.r(com.tencent.mm.sdk.platformtools.z.f193109e);
            errorMsgInfoStruct.k();
            com.tencent.matrix.trace.tracer.SignalAnrTracer.j();
            z17 = false;
        }
        if (com.tencent.mars.xlog.Log.isDebug()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "doBlockDetect firstBlockTime:" + tVar.A + " needDetect:" + z17 + " curTime:" + currentTimeMillis);
        }
        if (!z17 || tVar.f451408y) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).l(new x11.i(tVar), 5000L, "initBlockDetector");
    }
}
