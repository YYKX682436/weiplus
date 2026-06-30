package kz0;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m7 f313810d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var) {
        super(1);
        this.f313810d = m7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        com.tencent.maas.model.MJTemplateInfo it = (com.tencent.maas.model.MJTemplateInfo) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.mj_template.sns.compose.widget.k5 b17 = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m.b(it, com.tencent.mm.mj_template.sns.compose.widget.k5.f70026n);
        com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var = this.f313810d;
        m7Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addMoreTemplate: ");
        java.lang.String templateId = b17.f70077a;
        sb6.append(templateId);
        sb6.append(", true");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", sb6.toString());
        java.util.Iterator it6 = m7Var.b().iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.mj_template.sns.compose.widget.m5) obj2).f70077a, templateId)) {
                break;
            }
        }
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = (com.tencent.mm.mj_template.sns.compose.widget.m5) obj2;
        if (m7Var.b().contains(b17) || m5Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplate.SnsTemplateListState", "added tamplateInfo has existed in template list");
        } else {
            m7Var.f70097o.add(b17);
            m7Var.g(null);
            m7Var.f70103u = true;
            bz0.j jVar = bz0.j.f36750a;
            kotlin.jvm.internal.o.g(templateId, "templateId");
            com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasReport25621", "addRecommendFromMoreTemplate: ".concat(templateId));
            ((java.util.ArrayList) bz0.j.f36757h).add(templateId);
            java.util.ArrayList arrayList = (java.util.ArrayList) bz0.j.f36753d;
            if (!arrayList.contains(templateId)) {
                arrayList.add(templateId);
            }
        }
        if (m7Var.f70089g) {
            m7Var.f(templateId);
        } else {
            m7Var.e(templateId);
        }
        return jz5.f0.f302826a;
    }
}
