package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f176921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f176922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f176923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.z0 f176924g;

    public y0(com.tencent.mm.plugin.voip.model.z0 z0Var, int i17, int i18, int i19) {
        this.f176924g = z0Var;
        this.f176921d = i17;
        this.f176922e = i18;
        this.f176923f = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        vq4.d0.c("MicroMsg.Voip.VoipContext", "v2protocal StartConnectChannel relay");
        com.tencent.mm.plugin.voip.model.z0 z0Var = this.f176924g;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = z0Var.f176929b.f176532x;
        int i17 = v2protocalVar.W0;
        int i18 = (((i17 >> 2) & 3) >> 1) & 1 & ((i17 & 3) >> 1) & 1;
        int i19 = v2protocalVar.f176874p;
        long j17 = v2protocalVar.f176877q;
        int i27 = v2protocalVar.f176880r;
        long j18 = v2protocalVar.f176883s;
        byte[] bArr = v2protocalVar.f176889u;
        int i28 = v2protocalVar.f176904z;
        int i29 = v2protocalVar.A;
        int i37 = v2protocalVar.B;
        int i38 = v2protocalVar.f176898x;
        byte[] bArr2 = v2protocalVar.f176901y;
        int length = bArr2 == null ? 0 : bArr2.length;
        int i39 = v2protocalVar.C;
        int i47 = v2protocalVar.f176856j;
        int i48 = v2protocalVar.f176846f1;
        byte[] bArr3 = v2protocalVar.f176849g1;
        int i49 = v2protocalVar.f176852h1;
        int i57 = v2protocalVar.D;
        long j19 = v2protocalVar.E;
        byte[] bArr4 = v2protocalVar.G;
        int length2 = bArr4 == null ? 0 : bArr4.length;
        byte[] bArr5 = v2protocalVar.F;
        int configInfo = v2protocalVar.setConfigInfo(i19, j17, i27, 0, j18, bArr, i28, i29, i37, i38, length, bArr2, i39, i18, i47, i48, bArr3, i49, i57, j19, length2, bArr4, bArr5 == null ? 0 : bArr5.length, bArr5, v2protocalVar.f176855i1, this.f176921d, this.f176922e, this.f176923f, "", "", com.tencent.mm.plugin.voip.model.v2protocal.w());
        if (configInfo < 0) {
            vq4.d0.b("MicroMsg.Voip.VoipContext", "v2protocal setConfigInfo or connectToPeerRelay failed, ret:" + configInfo);
            com.tencent.mm.plugin.voip.model.g1 g1Var = z0Var.f176929b;
            g1Var.f176532x.M1.f176713a = 14;
            g1Var.v(1, -9002, "", -1);
            z0Var.f176928a.a();
            return;
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = z0Var.f176929b.f176532x;
        byte[] bArr6 = v2protocalVar2.f176894v1;
        if (bArr6 == null) {
            vq4.d0.b("MicroMsg.Voip.VoipContext", "relay conns buf null");
            z0Var.f176929b.v(1, -9002, "", -1);
            z0Var.f176928a.a();
            return;
        }
        int AddNewRelayConns = v2protocalVar2.AddNewRelayConns(bArr6, bArr6.length, 0, false);
        if (AddNewRelayConns < 0) {
            vq4.d0.b("MicroMsg.Voip.VoipContext", "add relayconns err:" + AddNewRelayConns);
            z0Var.f176929b.v(1, -9002, "", -1);
            z0Var.f176928a.a();
            return;
        }
        com.tencent.mm.plugin.voip.model.g1 g1Var2 = z0Var.f176929b;
        g1Var2.f176511c = true;
        com.tencent.mm.plugin.voip.model.l1 l1Var = g1Var2.f176532x.M1;
        l1Var.f176721h = (byte) 1;
        l1Var.f176729p = 1;
        z0Var.f176928a.a();
    }
}
