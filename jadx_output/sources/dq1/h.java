package dq1;

/* loaded from: classes8.dex */
public final class h extends dq1.a {
    public h() {
        dq1.u[] uVarArr = dq1.u.f242358d;
    }

    @Override // dq1.k
    public boolean a(com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI ui6, dq1.b context, com.tencent.mm.protobuf.g actionBuffer, com.tencent.mm.protobuf.g gVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(actionBuffer, "actionBuffer");
        dq1.p pVar = dq1.p.f242353a;
        if (!pVar.a(dq1.c.f242346d, context, pVar.b())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizSchemeFinderProfile", "context self check fail!");
            return false;
        }
        r45.l00 l00Var = new r45.l00();
        try {
            l00Var.parseFrom(actionBuffer.g());
            java.lang.String string = l00Var.getString(0);
            if (string == null || string.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizSchemeFinderProfile", "exportUsername is empty!");
                return false;
            }
            zy2.i9 i9Var = new zy2.i9();
            i9Var.f477420a = l00Var.getString(0);
            i9Var.f477424e = l00Var.getInteger(3);
            i9Var.f477422c = l00Var.getInteger(1);
            i9Var.f477423d = l00Var.getInteger(2);
            i9Var.f477425f = true;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.tencent.mm.plugin.finder.assist.j5.f102283a.c(ui6.getContext(), i9Var);
            return true;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizSchemeFinderProfile", "parse CheckExternalFinderOpenProfileActionBuffer error: e = " + e17.getMessage());
            return false;
        }
    }
}
