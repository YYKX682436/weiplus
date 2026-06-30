package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class sk extends com.tencent.mm.ui.chatting.b6 {
    public sk(yb5.d dVar, int i17, com.tencent.mm.storage.f9 f9Var) {
        super(dVar);
        if (i17 == 1) {
            b(f9Var);
        }
    }

    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        b(((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).c());
    }

    public final void b(com.tencent.mm.storage.f9 f9Var) {
        if (c01.d9.b().E()) {
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
            int ag6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).ag();
            yb5.d dVar = this.f198492d;
            if (ag6 != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiClickListener", "exit in teen mode");
                ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(dVar.g());
                return;
            }
            com.tencent.mm.storage.emotion.EmojiInfo M = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).M(f9Var);
            if (M == null || M.k()) {
                return;
            }
            java.lang.String z07 = f9Var.z0();
            if (z07 == null) {
                z07 = "";
            }
            d22.d dVar2 = new d22.d(z07, M);
            java.lang.String Q0 = f9Var.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            dVar2.f364007i = Q0;
            dVar2.f364008j = f9Var.I0();
            java.lang.String j17 = f9Var.j();
            dVar2.f364009k = j17 != null ? j17 : "";
            dVar2.f364010l = dVar.x();
            dVar2.f364156b = true;
            dVar2.f364155a = 9;
            d22.u.f225876a.a(dVar.g(), dVar2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11592, 0);
        }
    }
}
