package iy4;

/* loaded from: classes12.dex */
public class t0 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f296006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f296007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m11.b0 f296008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ iy4.r0 f296009g;

    public t0(iy4.r0 r0Var, com.tencent.mm.storage.f9 f9Var, int i17, m11.b0 b0Var) {
        this.f296009g = r0Var;
        this.f296006d = f9Var;
        this.f296007e = i17;
        this.f296008f = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 f9Var = this.f296006d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "autoDownload image, msgId=%d, totalLen:%d", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Integer.valueOf(this.f296007e));
        com.tencent.mm.modelcdntran.s1.fj().f70997u.add("image_" + f9Var.getMsgId());
        ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).c(this.f296008f.f322633a, tg3.l1.a(f9Var), 0, java.lang.Long.valueOf(f9Var.I0()), com.tencent.mm.R.drawable.bgs, new iy4.s0(this));
    }
}
