package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class r3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f145573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f145574b;

    public r3(com.tencent.mm.ui.widget.dialog.u3 u3Var, android.content.Context context) {
        this.f145573a = u3Var;
        this.f145574b = context;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopePreview", "do confirm errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f145573a;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            java.lang.String str = fVar.f70617c;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l0g);
            }
            db5.e1.y(this.f145574b, str, "", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.gk9), new com.tencent.mm.plugin.luckymoney.model.q3(this));
            return null;
        }
        java.util.Iterator it = ((r45.tm3) fVar.f70618d).f386570d.iterator();
        while (it.hasNext()) {
            r45.mm5 mm5Var = (r45.mm5) it.next();
            ot0.q v17 = ot0.q.v(mm5Var.f380664d);
            ot0.c cVar = (ot0.c) v17.y(ot0.c.class);
            r45.xv3 xv3Var = new r45.xv3();
            xv3Var.f390478e = cVar.f348412e;
            xv3Var.f390481h = cVar.f348413f;
            xv3Var.f390479f = cVar.f348416i;
            xv3Var.f390482i = cVar.f348417j;
            xv3Var.f390480g = cVar.f348418k;
            xv3Var.f390483m = cVar.f348419l;
            xv3Var.f390493w = cVar.f348430w;
            xv3Var.A = cVar.f348431x;
            xv3Var.f390494x = cVar.f348433z;
            xv3Var.B = cVar.A;
            xv3Var.D = cVar.B;
            xv3Var.f390495y = cVar.C;
            xv3Var.C = cVar.D;
            xv3Var.E = cVar.E;
            xv3Var.F = cVar.F;
            xv3Var.G = cVar.G;
            xv3Var.M = cVar.H;
            xv3Var.f390487q = cVar.f348424q;
            xv3Var.f390488r = cVar.f348425r;
            xv3Var.f390485o = cVar.f348422o;
            xv3Var.f390486p = cVar.f348423p;
            r45.nm5 nm5Var = mm5Var.f380667g;
            if (nm5Var != null) {
                nm5Var.G = cVar.f348420m;
            }
            com.tencent.mm.plugin.luckymoney.model.p3 p3Var = new com.tencent.mm.plugin.luckymoney.model.p3(this, mm5Var, v17);
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
            gb3.j jVar = (gb3.j) i95.n0.c(gb3.j.class);
            java.lang.String str2 = xv3Var.f390478e;
            java.lang.String str3 = xv3Var.f390481h;
            com.tencent.mm.plugin.luckymoney.model.s3 s3Var = new com.tencent.mm.plugin.luckymoney.model.s3(atomicInteger, p3Var);
            com.tencent.mm.plugin.luckymoney.model.w2 w2Var = (com.tencent.mm.plugin.luckymoney.model.w2) jVar;
            w2Var.getClass();
            w2Var.ij(str2, str3, "", new com.tencent.mm.plugin.luckymoney.model.h2(w2Var, s3Var));
            gb3.j jVar2 = (gb3.j) i95.n0.c(gb3.j.class);
            java.lang.String str4 = xv3Var.f390479f;
            java.lang.String str5 = xv3Var.f390482i;
            com.tencent.mm.plugin.luckymoney.model.t3 t3Var = new com.tencent.mm.plugin.luckymoney.model.t3(atomicInteger, p3Var);
            com.tencent.mm.plugin.luckymoney.model.w2 w2Var2 = (com.tencent.mm.plugin.luckymoney.model.w2) jVar2;
            w2Var2.getClass();
            w2Var2.ij(str4, str5, "", new com.tencent.mm.plugin.luckymoney.model.h2(w2Var2, t3Var));
            gb3.j jVar3 = (gb3.j) i95.n0.c(gb3.j.class);
            java.lang.String str6 = xv3Var.f390480g;
            java.lang.String str7 = xv3Var.f390483m;
            com.tencent.mm.plugin.luckymoney.model.u3 u3Var2 = new com.tencent.mm.plugin.luckymoney.model.u3(atomicInteger, p3Var);
            com.tencent.mm.plugin.luckymoney.model.w2 w2Var3 = (com.tencent.mm.plugin.luckymoney.model.w2) jVar3;
            w2Var3.getClass();
            w2Var3.ij(str6, str7, "", new com.tencent.mm.plugin.luckymoney.model.h2(w2Var3, u3Var2));
            gb3.j jVar4 = (gb3.j) i95.n0.c(gb3.j.class);
            java.lang.String str8 = xv3Var.f390487q;
            java.lang.String str9 = xv3Var.f390488r;
            com.tencent.mm.plugin.luckymoney.model.v3 v3Var = new com.tencent.mm.plugin.luckymoney.model.v3(atomicInteger, p3Var);
            com.tencent.mm.plugin.luckymoney.model.w2 w2Var4 = (com.tencent.mm.plugin.luckymoney.model.w2) jVar4;
            w2Var4.getClass();
            w2Var4.ij(str8, str9, "", new com.tencent.mm.plugin.luckymoney.model.h2(w2Var4, v3Var));
            gb3.j jVar5 = (gb3.j) i95.n0.c(gb3.j.class);
            java.lang.String str10 = xv3Var.f390485o;
            java.lang.String str11 = xv3Var.f390486p;
            com.tencent.mm.plugin.luckymoney.model.w3 w3Var = new com.tencent.mm.plugin.luckymoney.model.w3(atomicInteger, p3Var);
            com.tencent.mm.plugin.luckymoney.model.w2 w2Var5 = (com.tencent.mm.plugin.luckymoney.model.w2) jVar5;
            w2Var5.getClass();
            w2Var5.ij(str10, str11, "", new com.tencent.mm.plugin.luckymoney.model.h2(w2Var5, w3Var));
            ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).qj(nm5Var, true);
        }
        return null;
    }
}
