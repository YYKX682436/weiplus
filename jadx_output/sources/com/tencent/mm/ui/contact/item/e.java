package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class e extends com.tencent.mm.ui.contact.item.c0 {
    public boolean G;
    public int H;
    public java.lang.String I;

    public e(int i17) {
        super(i17);
        this.H = 0;
    }

    @Override // com.tencent.mm.ui.contact.item.c0, com.tencent.mm.ui.contact.item.d
    public void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar) {
        java.lang.String str;
        int i17 = this.H;
        if (i17 != 0 && (str = this.I) != null) {
            this.D = i17;
            this.C = str;
            return;
        }
        com.tencent.mm.storage.z3 z3Var = this.B;
        if (!this.G) {
            gm0.j1.i();
            z3Var = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f206819z, true);
            f(z3Var);
            this.G = true;
        }
        if (z3Var == null) {
            this.f206818y = "";
            return;
        }
        this.f206818y = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(z3Var), i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
        this.f206819z = z3Var.d1();
    }
}
