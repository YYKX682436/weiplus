package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class p3 implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mm5 f145541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.q f145542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.r3 f145543f;

    public p3(com.tencent.mm.plugin.luckymoney.model.r3 r3Var, r45.mm5 mm5Var, ot0.q qVar) {
        this.f145543f = r3Var;
        this.f145541d = mm5Var;
        this.f145542e = qVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopePreview", "download finish: %s", java.lang.Integer.valueOf(message.arg1));
        if (message.arg1 == 3) {
            com.tencent.mm.plugin.luckymoney.model.z3.b();
            com.tencent.mm.plugin.luckymoney.model.z3.d();
            r45.mm5 mm5Var = this.f145541d;
            java.lang.String str = mm5Var.f380664d;
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.d1(str);
            f9Var.r1(2);
            f9Var.u1("1@fackuser");
            f9Var.e1(c01.w9.o("1@fackuser"));
            f9Var.j1(0);
            f9Var.setType(436207665);
            long M9 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
            at4.k1 z07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().z0(this.f145542e.f348704r1);
            if (z07 != null) {
                z07.field_hbType = 0;
                z07.field_hbStatus = 0;
                z07.field_receiveStatus = 0;
                z07.field_receiveAmount = 0L;
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().replace(z07);
            }
            ((java.util.HashMap) gb3.l.f270019c).put(java.lang.Long.valueOf(M9), mm5Var);
            j05.e eVar = com.tencent.mm.plugin.luckymoney.model.z3.f145735a;
            if (eVar != null) {
                ((pg0.q2) eVar).f354046a.onCompletion();
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f145543f.f145573a;
            if (u3Var != null) {
                u3Var.dismiss();
            }
        }
        return false;
    }
}
