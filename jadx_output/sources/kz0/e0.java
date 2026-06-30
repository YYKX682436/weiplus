package kz0;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.c1 f313683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m7 f313684e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var, com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var) {
        super(1);
        this.f313683d = c1Var;
        this.f313684e = m7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var = this.f313683d;
        if (booleanValue != c1Var.f69894y && booleanValue) {
            java.lang.String a17 = this.f313684e.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "setInitialSelectId ".concat(a17));
            c1Var.f69880k = a17;
            if (a17.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "updateInitialItemSelectedState: " + c1Var.f69880k + ", templateDataSize: " + ((java.util.List) ((n0.q4) c1Var.f69879j).getValue()).size());
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update item to select ");
                sb6.append(c1Var.f69880k);
                sb6.append(' ');
                com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = c1Var.f69884o;
                sb6.append(m5Var != null ? m5Var.f70077a : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", sb6.toString());
                com.tencent.mm.mj_template.sns.compose.widget.k5 a18 = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m.a(c1Var.f69880k);
                com.tencent.mm.mj_template.sns.compose.widget.e5 e5Var = a18 instanceof com.tencent.mm.mj_template.sns.compose.widget.e5 ? (com.tencent.mm.mj_template.sns.compose.widget.e5) a18 : null;
                if (e5Var != null) {
                    c1Var.f69881l = c1Var.f69880k;
                }
                com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var2 = c1Var.f69884o;
                if (!kotlin.jvm.internal.o.b(m5Var2 != null ? m5Var2.f70077a : null, c1Var.f69880k)) {
                    com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var3 = c1Var.f69884o;
                    com.tencent.mm.mj_template.sns.compose.widget.r rVar = m5Var3 != null ? m5Var3.f70078b : null;
                    if (rVar != null) {
                        rVar.b(false);
                    }
                    c1Var.f69884o = e5Var;
                    n0.v2 v2Var = c1Var.f69882m;
                    if (e5Var != null) {
                        com.tencent.mm.mj_template.sns.compose.widget.r rVar2 = e5Var.f70078b;
                        if (rVar2 != null) {
                            rVar2.b(true);
                        }
                        ((n0.q4) v2Var).setValue(java.lang.Boolean.TRUE);
                    } else {
                        ((n0.q4) v2Var).setValue(java.lang.Boolean.FALSE);
                    }
                }
            }
        }
        if (!c1Var.f69893x && c1Var.f69894y != booleanValue) {
            c1Var.f69893x = true;
        }
        c1Var.f69894y = booleanValue;
        return jz5.f0.f302826a;
    }
}
