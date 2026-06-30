package lt3;

/* loaded from: classes10.dex */
public final class t implements fp0.p {
    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        lt3.q task = (lt3.q) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoMixHandler", "loader finish! taskId:" + task.f321271f.field_taskId + ", status " + status);
        lt3.v.f321278b = false;
        yz5.a aVar = lt3.v.f321282f;
        if (aVar != null) {
            aVar.invoke();
        }
        lt3.v.f321282f = null;
        int ordinal = status.ordinal();
        if (ordinal == 2) {
            lt3.v vVar = lt3.v.f321277a;
            lt3.g gVar = task.f321271f;
            int i17 = gVar.field_fromScene;
            java.lang.String field_taskId = gVar.field_taskId;
            kotlin.jvm.internal.o.f(field_taskId, "field_taskId");
            lt3.v.a(vVar, i17, field_taskId, true, task.f321272g);
            vVar.b();
            return;
        }
        if (ordinal == 3) {
            lt3.v vVar2 = lt3.v.f321277a;
            lt3.g gVar2 = task.f321271f;
            int i18 = gVar2.field_fromScene;
            java.lang.String field_taskId2 = gVar2.field_taskId;
            kotlin.jvm.internal.o.f(field_taskId2, "field_taskId");
            lt3.v.a(vVar2, i18, field_taskId2, false, task.f321272g);
            vVar2.b();
            return;
        }
        if (ordinal != 4) {
            return;
        }
        lt3.e eVar = lt3.e.f321209a;
        lt3.g gVar3 = task.f321271f;
        int i19 = gVar3.field_fromScene;
        java.lang.String field_taskId3 = gVar3.field_taskId;
        kotlin.jvm.internal.o.f(field_taskId3, "field_taskId");
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.BgMixManager", "notifyWait, taskId:".concat(field_taskId3));
        ((ku5.t0) ku5.t0.f312615d).h(new lt3.d(i19, field_taskId3), "BgMixManager_notifyWait");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.String field_taskId4 = task.f321271f.field_taskId;
        kotlin.jvm.internal.o.f(field_taskId4, "field_taskId");
        lt3.r rVar = new lt3.r(field_taskId4, task.f321272g);
        h0Var.f310123d = rVar;
        lt3.v.f321280d.add(rVar);
        pm0.v.V(30000L, new lt3.s(h0Var));
    }
}
