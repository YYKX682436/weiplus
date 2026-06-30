package za3;

/* loaded from: classes15.dex */
public class m0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.u0 f470993d;

    public m0(za3.u0 u0Var) {
        this.f470993d = u0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkMgr", "seizeMicTimer reach");
        za3.u0 u0Var = this.f470993d;
        if (u0Var.f471033p != 5) {
            return false;
        }
        u0Var.f471033p = 3;
        ((dh4.f0) u0Var.f471039v).s();
        u0Var.f471041x.c(100L, 100L);
        return false;
    }
}
