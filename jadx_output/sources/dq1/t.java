package dq1;

/* loaded from: classes8.dex */
public final class t extends dq1.a {
    public t() {
        dq1.u[] uVarArr = dq1.u.f242358d;
    }

    @Override // dq1.k
    public boolean a(com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI ui6, dq1.b context, com.tencent.mm.protobuf.g actionBuffer, com.tencent.mm.protobuf.g gVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(actionBuffer, "actionBuffer");
        dq1.p pVar = dq1.p.f242353a;
        if (!pVar.a(dq1.c.f242346d, context, pVar.b())) {
            return false;
        }
        r45.n00 n00Var = new r45.n00();
        try {
            n00Var.parseFrom(actionBuffer.g());
            ab0.a Di = ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Di(ui6.getContext(), n00Var.f380971d, 1, null, null, false, new dq1.s(new java.lang.ref.WeakReference(ui6), this));
            com.tencent.mm.ui.widget.dialog.u3 u3Var = ui6.f93877h;
            if (u3Var == null) {
                return true;
            }
            u3Var.setOnCancelListener(new dq1.r(Di, ui6));
            return true;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizSchemeWWProfile", "e = " + e17.getMessage());
            return false;
        }
    }
}
