package ze5;

/* loaded from: classes9.dex */
public final class c5 {
    public c5(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(ze5.c5 c5Var, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str, we5.y0 y0Var, boolean z17) {
        ot0.q qVar;
        c5Var.getClass();
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        java.lang.String U1 = f9Var.U1();
        y0Var.d(new ze5.z4(dVar, f9Var));
        if (U1 != null) {
            qVar = ot0.q.v(U1);
            ot0.o0.a(U1);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgRecordMvvm", "amessage, msgid:%s, user:%s", java.lang.Long.valueOf(f9Var.getMsgId()), str);
            qVar = null;
        }
        if (qVar == null) {
            return;
        }
        int i17 = ct.t2.C0;
        i95.m c17 = i95.n0.c(ct.t2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ct.t2 t2Var = (ct.t2) c17;
        android.app.Activity g17 = dVar.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        l15.c cVar = new l15.c();
        java.lang.String U12 = f9Var.U1();
        if (U12 == null) {
            U12 = "";
        }
        cVar.fromXml(U12);
        y0Var.d(new ze5.b5(dVar2, dVar, ((te5.y) t2Var).wi(g17, cVar), a0Var, f9Var));
    }
}
