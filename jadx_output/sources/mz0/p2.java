package mz0;

/* loaded from: classes5.dex */
public final class p2 implements com.tencent.mm.mj_template.sns.compose.widget.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mz0.x2 f333024a;

    public p2(mz0.x2 x2Var) {
        this.f333024a = x2Var;
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.c7
    public void a(int i17, java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.b7
    public void b(java.lang.String templateId, int i17) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        dx1.f fVar = dx1.g.f244489a;
        bx1.u uVar = bx1.u.f36310e;
        fVar.j("SnsTemplate", "egviewcnt", 1, uVar);
        fVar.m("SnsTemplate", "egdetail", "egids", templateId, uVar, "#");
        if (kotlin.jvm.internal.o.b(templateId, "@@miaojian@@")) {
            bz0.j jVar = bz0.j.f36750a;
            bz0.j.f36751b.f58988l = 1;
            c(dw3.o0.f244242f);
        } else {
            bz0.j jVar2 = bz0.j.f36750a;
            java.util.ArrayList arrayList = (java.util.ArrayList) bz0.j.f36753d;
            if (arrayList.contains(templateId)) {
                return;
            }
            arrayList.add(templateId);
        }
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.c7
    public void c(dw3.o0 launchType) {
        kotlin.jvm.internal.o.g(launchType, "launchType");
        nu3.g.f340216a.c(this.f333024a.getContext(), launchType);
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.b7
    public void d(java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        bz0.j jVar = bz0.j.f36750a;
        bz0.j.f36761l = new bz0.h(templateId, false, null, null, 14, null);
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.c7
    public void e(int i17, java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        if (kotlin.jvm.internal.o.b(templateId, "@@@miaojian@@@")) {
            bz0.j jVar = bz0.j.f36750a;
            bz0.j.f36751b.f58988l = 1;
            c(dw3.o0.f244243g);
        } else {
            java.util.TreeMap treeMap = bz0.j.f36754e;
            if (treeMap.containsKey(java.lang.Integer.valueOf(i17))) {
                return;
            }
            treeMap.put(java.lang.Integer.valueOf(i17), templateId);
        }
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.b7
    public void f(java.lang.String templateId, int i17) {
        n0.e5 e5Var;
        n0.e5 e5Var2;
        kotlin.jvm.internal.o.g(templateId, "templateId");
        dx1.f fVar = dx1.g.f244489a;
        bx1.u uVar = bx1.u.f36310e;
        fVar.j("SnsTemplate", "egpreviewcnt", 1, uVar);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        mz0.x2 x2Var = this.f333024a;
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "egpreviewtime", java.lang.Long.valueOf(currentTimeMillis - x2Var.K), uVar, false, null, null, 224, null);
        ty0.b1 b1Var = x2Var.f332889m;
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "musicStatus", java.lang.Integer.valueOf(((b1Var == null || (e5Var2 = b1Var.f422794d) == null || !((java.lang.Boolean) e5Var2.getValue()).booleanValue()) ? 0 : 1) ^ 1), null, false, null, null, 240, null);
        ty0.b1 b1Var2 = x2Var.f332889m;
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "oriMusicStatus", java.lang.Integer.valueOf(1 ^ ((b1Var2 == null || (e5Var = b1Var2.f422795e) == null || !((java.lang.Boolean) e5Var.getValue()).booleanValue()) ? 0 : 1)), null, false, null, null, 240, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "td", java.lang.Integer.valueOf(x2Var.f333080J), null, true, "egtd", null, 144, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "maasSessionKey", bz0.a.f36722a, null, false, null, null, 240, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "egid", templateId, null, false, null, null, 240, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "eglocation", java.lang.Integer.valueOf(i17), null, false, null, null, 240, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "musicSearchFlag", 0, null, false, null, null, 240, null);
        dx1.f.n(fVar, "SnsTemplate", "editdetail", "musiccnt", 0, uVar, false, null, null, 224, null);
        bz0.j jVar = bz0.j.f36750a;
        jVar.a(templateId, "");
        jVar.b(templateId, "");
    }
}
