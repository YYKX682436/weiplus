package iy4;

/* loaded from: classes12.dex */
public class u0 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f296011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f296012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iy4.r0 f296013f;

    public u0(iy4.r0 r0Var, com.tencent.mm.storage.f9 f9Var, int i17) {
        this.f296013f = r0Var;
        this.f296011d = f9Var;
        this.f296012e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 f9Var = this.f296011d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload video, msgId=%d, totalLen:%d", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Integer.valueOf(this.f296012e));
        this.f296013f.f295990e.put(f9Var.z0(), f9Var);
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.d3.L(z07);
        com.tencent.mm.modelcdntran.s1.fj().f70997u.add("video_" + f9Var.getMsgId());
    }
}
