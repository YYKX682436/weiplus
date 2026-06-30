package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.g1 f176321d;

    public a1(com.tencent.mm.plugin.voip.model.g1 g1Var) {
        this.f176321d = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176321d;
        int i17 = g1Var.f176508a;
        if (i17 != 4 && i17 != 5 && i17 != 6) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "startConnectDirect status fail, status:" + g1Var.f176508a);
            return;
        }
        if (g1Var.f176512d) {
            vq4.d0.c("MicroMsg.Voip.VoipContext", "can not startConnectDirect again");
            return;
        }
        g1Var.f176512d = true;
        vq4.d0.c("MicroMsg.Voip.VoipContext", "v2protocal StartConnectChannel direct");
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
        byte[] bArr = v2protocalVar.f176897w1;
        if (bArr == null) {
            vq4.d0.b("MicroMsg.Voip.VoipContext", "direct conns buf null");
            return;
        }
        int AddNewDirectConns = v2protocalVar.AddNewDirectConns(bArr, bArr.length, 0);
        if (AddNewDirectConns >= 0) {
            g1Var.o();
            return;
        }
        vq4.d0.b("MicroMsg.Voip.VoipContext", "v2protocal connectToPeerDirect failed, ret:" + AddNewDirectConns);
    }
}
