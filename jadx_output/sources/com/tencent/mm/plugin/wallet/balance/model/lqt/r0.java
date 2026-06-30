package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class r0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f177711a;

    public r0(com.tencent.mm.plugin.wallet.balance.model.lqt.s0 s0Var, km5.b bVar) {
        this.f177711a = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtDetailInteractor", "lqtOnClickRedDotReq end, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(((r45.py4) fVar.f70618d).f383480f);
        }
        km5.b bVar = this.f177711a;
        if (bVar == null) {
            return null;
        }
        bVar.resume();
        return null;
    }
}
