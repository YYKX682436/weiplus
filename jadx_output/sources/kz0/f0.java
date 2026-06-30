package kz0;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.c1 f313695d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var) {
        super(1);
        this.f313695d = c1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var = this.f313695d;
        c1Var.f69893x = false;
        if (!booleanValue) {
            if (!c1Var.f69894y && c1Var.f69891v) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onInitSelectTemplateSelected: " + c1Var.f69880k);
                c1Var.f69891v = false;
                com.tencent.mm.mj_template.sns.compose.widget.a5 a5Var = new com.tencent.mm.mj_template.sns.compose.widget.a5(c1Var.f69880k);
                if (c1Var.f69872c) {
                    c1Var.a(a5Var, null);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onTemplateSelected: " + a5Var.f70077a);
                    kotlinx.coroutines.l.d(c1Var.f69870a, null, null, new com.tencent.mm.mj_template.sns.compose.widget.b1(c1Var, a5Var, null), 3, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
