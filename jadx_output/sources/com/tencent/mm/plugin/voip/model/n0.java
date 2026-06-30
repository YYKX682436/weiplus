package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class n0 implements com.tencent.mm.plugin.voip.model.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.g1 f176764a;

    public n0(com.tencent.mm.plugin.voip.model.g1 g1Var) {
        this.f176764a = g1Var;
    }

    @Override // com.tencent.mm.plugin.voip.model.f1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipContext", "onStartConnectRelay ok");
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176764a;
        g1Var.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.voip.model.a1(g1Var));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.voip.model.b1(g1Var));
    }
}
