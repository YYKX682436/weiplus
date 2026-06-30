package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class q implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.s f149744a;

    public q(com.tencent.mm.plugin.multitalk.ilinkservice.s sVar) {
        this.f149744a = sVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        synchronized (this.f149744a.f149766h) {
            c(bArr, i17);
        }
    }

    public final void c(byte[] bArr, int i17) {
        int i18;
        com.tencent.mm.plugin.multitalk.ilinkservice.s sVar = this.f149744a;
        int i19 = sVar.f149767i + 1;
        sVar.f149767i = i19;
        if (i19 % 50 == 0) {
            sVar.f149767i = 0;
            int length = bArr.length;
        }
        if (sVar.f149763e == 2) {
            com.tencent.mm.plugin.multitalk.ilinkservice.t tVar = sVar.f149759a;
            if (tVar.f149791c != null) {
                if (sVar.f149764f <= 10) {
                    sVar.f149764f = 92;
                }
                zi3.f fVar = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J;
                int i27 = -1;
                if (fVar != null) {
                    com.tencent.mm.plugin.voip.model.e eVar = fVar.f473170k;
                    i18 = eVar != null ? eVar.a() : -1;
                } else {
                    i18 = 0;
                }
                sVar.f149764f = ((sVar.f149764f * 3) + (i18 + 24)) / 4;
                if (sVar.f149765g == 1) {
                    tVar.getClass();
                    zi3.f fVar2 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150160J;
                    if (fVar2 != null) {
                        com.tencent.mm.plugin.voip.model.e eVar2 = fVar2.f473170k;
                        if (eVar2 != null) {
                            i27 = (eVar2.I / eVar2.f176451n) * eVar2.f176450m;
                        }
                    } else {
                        i27 = 0;
                    }
                    int i28 = sVar.f149764f;
                    if (i27 >= i28) {
                        i27 -= i28;
                    }
                    sVar.f149764f = i27;
                    sVar.f149765g = 0;
                } else {
                    sVar.f149764f = 0;
                }
                if (1 == sVar.f149768j) {
                    sVar.f149768j = 0;
                    sVar.f149769k = java.lang.System.currentTimeMillis();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioMgr", "amyfwang,first record");
                } else {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long j17 = currentTimeMillis - sVar.f149769k;
                    if (j17 > 1000) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioMgr", "amyfwang,error,deltaTime:" + j17);
                    }
                    sVar.f149769k = currentTimeMillis;
                }
                com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
                int length2 = bArr.length;
                int i29 = sVar.f149764f;
                i4Var.getClass();
                com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.SendAudioData(bArr, length2, i29);
            }
        }
    }
}
