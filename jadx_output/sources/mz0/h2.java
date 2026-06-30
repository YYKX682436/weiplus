package mz0;

/* loaded from: classes5.dex */
public final class h2 implements com.tencent.mm.mj_template.sns.compose.widget.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f332967a = new java.util.ArrayList();

    @Override // com.tencent.mm.mj_template.sns.compose.widget.c7
    public void a(int i17, java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        pp0.k0 k0Var = (pp0.k0) i95.n0.c(pp0.k0.class);
        com.tencent.mm.mj_template.sns.compose.widget.k5 a17 = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m.a(templateId);
        ((yy0.o0) k0Var).Bi(templateId, i17, a17 != null ? a17.f70032i : null);
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.b7
    public void b(java.lang.String templateId, int i17) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        if (kotlin.jvm.internal.o.b(templateId, "@@miaojian@@") || kotlin.jvm.internal.o.b(templateId, "@@@miaojian@@@")) {
            return;
        }
        java.util.List list = this.f332967a;
        if (((java.util.ArrayList) list).contains(templateId)) {
            return;
        }
        ((java.util.ArrayList) list).add(templateId);
        pp0.k0 k0Var = (pp0.k0) i95.n0.c(pp0.k0.class);
        com.tencent.mm.mj_template.sns.compose.widget.k5 a17 = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m.a(templateId);
        ((yy0.o0) k0Var).Ai(templateId, i17, a17 != null ? a17.f70032i : null);
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.c7
    public void c(dw3.o0 launchType) {
        kotlin.jvm.internal.o.g(launchType, "launchType");
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.b7
    public void d(java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.r4(m7Var, null), 3, null);
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.c7
    public void e(int i17, java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        if (kotlin.jvm.internal.o.b(templateId, "@@miaojian@@") || kotlin.jvm.internal.o.b(templateId, "@@@miaojian@@@")) {
            return;
        }
        java.util.List list = this.f332967a;
        if (((java.util.ArrayList) list).contains(templateId)) {
            return;
        }
        ((java.util.ArrayList) list).add(templateId);
        pp0.k0 k0Var = (pp0.k0) i95.n0.c(pp0.k0.class);
        com.tencent.mm.mj_template.sns.compose.widget.k5 a17 = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m.a(templateId);
        ((yy0.o0) k0Var).Ai(templateId, i17, a17 != null ? a17.f70032i : null);
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.b7
    public void f(java.lang.String templateId, int i17) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        pp0.k0 k0Var = (pp0.k0) i95.n0.c(pp0.k0.class);
        com.tencent.mm.mj_template.sns.compose.widget.k5 a17 = com.tencent.mm.mj_template.sns.compose.widget.k5.f70025m.a(templateId);
        ((yy0.o0) k0Var).Bi(templateId, i17, a17 != null ? a17.f70032i : null);
    }
}
