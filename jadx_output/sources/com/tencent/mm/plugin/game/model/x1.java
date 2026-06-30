package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class x1 extends com.tencent.mm.plugin.game.model.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final m53.a2 f140515a;

    /* renamed from: b, reason: collision with root package name */
    public m53.j3 f140516b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.w1 f140517c;

    /* renamed from: d, reason: collision with root package name */
    public m53.c1 f140518d;

    /* renamed from: e, reason: collision with root package name */
    public m53.w5 f140519e;

    /* renamed from: f, reason: collision with root package name */
    public m53.h1 f140520f;

    public x1(m53.a2 a2Var, boolean z17) {
        if (a2Var == null) {
            this.f140515a = new m53.a2();
        } else {
            this.f140515a = a2Var;
            b(z17);
        }
    }

    public final void b(boolean z17) {
        m53.h hVar;
        m53.h hVar2;
        m53.a2 a2Var = this.f140515a;
        if (a2Var != null) {
            this.f140516b = a2Var.f323554g;
            m53.z0 z0Var = a2Var.f323551d;
            if (z0Var != null && (hVar2 = z0Var.f324215d) != null) {
                com.tencent.mm.plugin.game.model.w1 w1Var = new com.tencent.mm.plugin.game.model.w1();
                this.f140517c = w1Var;
                w1Var.f140502a = com.tencent.mm.plugin.game.model.t1.a(hVar2);
                com.tencent.mm.plugin.game.model.w1 w1Var2 = this.f140517c;
                com.tencent.mm.plugin.game.model.b bVar = w1Var2.f140502a;
                if (bVar != null) {
                    bVar.f140207j2 = a2Var.f323551d.f324218g;
                    bVar.f140212o2 = 10;
                    bVar.f140213p2 = 1002;
                    bVar.f140214q2 = 1;
                }
                m53.z0 z0Var2 = a2Var.f323551d;
                w1Var2.f140503b = z0Var2.f324217f;
                w1Var2.f140504c = z0Var2.f324216e;
                w1Var2.f140505d = a2Var.f323553f;
            }
            this.f140518d = a2Var.f323552e;
            this.f140519e = a2Var.f323555h;
            this.f140520f = a2Var.f323556i;
        }
        if (a2Var == null || !z17) {
            return;
        }
        m53.z0 z0Var3 = a2Var.f323551d;
        if (z0Var3 != null && (hVar = z0Var3.f324215d) != null) {
            r53.n.b(com.tencent.mm.plugin.game.model.t1.a(hVar));
        }
        ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).wi().a(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    public x1(byte[] bArr, boolean z17) {
        m53.a2 a2Var = new m53.a2();
        this.f140515a = a2Var;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            a2Var.parseFrom(bArr);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GamePBDataIndex4", "Parsing Failed: %s", e17.getMessage());
        }
        b(z17);
    }
}
