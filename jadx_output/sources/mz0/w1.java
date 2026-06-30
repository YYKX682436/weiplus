package mz0;

/* loaded from: classes5.dex */
public final class w1 implements az0.e {
    public void a(java.lang.String templateId, float f17) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        com.tencent.mm.mj_template.sns.compose.widget.k5 a17 = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m.a(templateId);
        n0.v2 v2Var = a17 != null ? a17.f70033j : null;
        if (v2Var == null) {
            return;
        }
        v2Var.setValue(java.lang.Float.valueOf(f17));
    }

    public void b(java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        com.tencent.mm.mj_template.sns.compose.widget.k5 a17 = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m.a(templateId);
        if (a17 != null) {
            a17.f70033j.setValue(java.lang.Float.valueOf(-1.0f));
        }
    }
}
