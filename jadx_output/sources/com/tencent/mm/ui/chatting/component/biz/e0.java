package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes9.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r01.u f198775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f198776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.f0 f198777f;

    public e0(com.tencent.mm.ui.chatting.component.biz.f0 f0Var, r01.u uVar, com.tencent.mm.storage.z3 z3Var) {
        this.f198777f = f0Var;
        this.f198775d = uVar;
        this.f198776e = z3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.biz.f0 f0Var = this.f198777f;
        f0Var.f198778d.f198580d.b0();
        com.tencent.mm.ui.chatting.component.biz.a aVar = f0Var.f198778d;
        if (aVar.K) {
            r01.u uVar = this.f198775d;
            if (uVar.f368253b.equals(aVar.f198580d.x())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "try to refresh footer.");
                f0Var.f198778d.f198746h = r01.z.b(uVar.f368253b);
                com.tencent.mm.ui.chatting.component.biz.a aVar2 = f0Var.f198778d;
                yb5.d dVar = aVar2.f198580d;
                if (dVar == null || !aVar2.L) {
                    return;
                }
                ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar.f460708c.a(sb5.s0.class))).n0(this.f198776e);
            }
        }
    }
}
