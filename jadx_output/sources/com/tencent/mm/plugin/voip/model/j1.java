package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class j1 implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.i1 f176686a;

    public j1(com.tencent.mm.plugin.voip.model.i1 i1Var) {
        this.f176686a = i1Var;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.tencent.mm.plugin.voip.model.i1 i1Var = this.f176686a;
        if (i18 == 4 || i18 == 3 || i18 == 2) {
            i1Var.f176649d.f176534z.R();
        } else if (i18 == 15) {
            if (fp.h.c(31)) {
                i1Var.f176649d.f176534z.Z();
            } else {
                i1Var.f176649d.f176534z.R();
            }
        }
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        synchronized (this.f176686a.f176653h) {
            c(bArr, i17);
        }
    }

    public final void c(byte[] bArr, int i17) {
        com.tencent.mm.plugin.voip.model.e eVar = this.f176686a.f176646a;
        com.tencent.mm.plugin.voip.model.i1 i1Var = this.f176686a;
        if (i1Var.f176648c != 2 || eVar == null) {
            return;
        }
        if (i1Var.f176652g == 1) {
            i1Var.f176650e = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.voip.model.i1 i1Var2 = this.f176686a;
            i1Var2.f176651f = i1Var2.f176650e;
            i1Var2.f176652g = 0;
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.voip.model.i1 i1Var3 = this.f176686a;
            long j17 = i1Var3.f176651f;
            i1Var3.f176650e = currentTimeMillis;
        }
        com.tencent.mm.plugin.voip.model.i1 i1Var4 = this.f176686a;
        if (1 == i1Var4.f176662q) {
            i1Var4.f176662q = 0;
            i1Var4.f176664s = java.lang.System.currentTimeMillis();
            vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "amyfwang,first record");
        } else {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            long j18 = currentTimeMillis2 - this.f176686a.f176664s;
            if (j18 > 1000) {
                vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "amyfwang,error,record deltaTime:" + j18);
            }
            this.f176686a.f176664s = currentTimeMillis2;
        }
        tl.w wVar = this.f176686a.f176647b;
        if (wVar != null) {
            com.tencent.mm.plugin.voip.model.i1 i1Var5 = this.f176686a;
            if (i1Var5.B != 1) {
                i1Var5.f176649d.f176532x.f176866m0 = wVar.c();
                this.f176686a.f176649d.f176532x.recordCallback(bArr, i17);
            }
        }
    }
}
