package dq1;

/* loaded from: classes8.dex */
public final class d extends dq1.a {
    public d() {
        dq1.u[] uVarArr = dq1.u.f242358d;
    }

    @Override // dq1.k
    public boolean a(com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI ui6, dq1.b context, com.tencent.mm.protobuf.g actionBuffer, com.tencent.mm.protobuf.g gVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(actionBuffer, "actionBuffer");
        dq1.p pVar = dq1.p.f242353a;
        if (!pVar.a(dq1.c.f242346d, context, pVar.b())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizSchemeFinderFeed", "context self check fail!");
            return false;
        }
        r45.j00 j00Var = new r45.j00();
        try {
            j00Var.parseFrom(actionBuffer.g());
            zy2.h9 h9Var = new zy2.h9();
            h9Var.f477400a = j00Var.getString(0);
            h9Var.f477403d = j00Var.getInteger(1);
            h9Var.f477404e = j00Var.getInteger(2);
            h9Var.f477405f = j00Var.getInteger(3);
            h9Var.f477406g = j00Var.getInteger(4);
            h9Var.f477407h = j00Var.getInteger(5);
            h9Var.f477408i = j00Var.getInteger(6);
            h9Var.f477409j = true;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.tencent.mm.plugin.finder.assist.j5.f102283a.a(ui6.getContext(), h9Var);
            return true;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizSchemeFinderFeed", "e = " + e17.getMessage());
            return false;
        }
    }
}
