package iy4;

/* loaded from: classes11.dex */
public class s0 implements k70.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iy4.t0 f296001d;

    public s0(iy4.t0 t0Var) {
        this.f296001d = t0Var;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTerminalSyncMgr", "download image msgid:%d, [%d,%d]", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        if (i19 == 0 && i27 == 0) {
            this.f296001d.f296009g.c(j18);
        }
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
