package on;

/* loaded from: classes8.dex */
public class h implements vg3.p4 {
    @Override // vg3.p4
    public void C0(com.tencent.mm.storage.f9 f9Var, xg3.l0 l0Var, boolean[] zArr) {
    }

    @Override // vg3.p4
    public void S0(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.l4 l4Var, boolean z17, xg3.l0 l0Var) {
    }

    @Override // vg3.p4
    public void W(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.l4 l4Var, boolean z17, xg3.l0 l0Var) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("ConversationUpdateCallback", "new conversation %s", l4Var.h1());
            c01.v1.c(l4Var.h1());
        }
    }
}
