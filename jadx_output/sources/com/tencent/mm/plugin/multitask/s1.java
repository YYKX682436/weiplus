package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class s1 implements com.tencent.mm.plugin.multitask.m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.multitask.r1 f150502d = new com.tencent.mm.plugin.multitask.r1(null);

    /* renamed from: e, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.multitask.s1 f150503e;

    @Override // com.tencent.mm.plugin.multitask.m0
    public void a() {
        tk3.t a17 = tk3.t.f419947o.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewUIManager", "initMultiTaskFloatBall: " + ((km0.c) gm0.j1.p().a()).f308987a);
        if (((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).Di()) {
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.o4.M("multi_task_ui_storage").q("multi_task_float_ball_create_time", 0L);
                if (currentTimeMillis < a17.o()) {
                    d75.b.g(new tk3.s(a17, a17.o() - currentTimeMillis));
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.multitask.m0
    public float c() {
        java.lang.Float f17;
        tk3.t a17 = tk3.t.f419947o.a();
        if (!a17.p() || (f17 = (java.lang.Float) a17.f419956n.get(a17.f419955m)) == null) {
            return 0.0f;
        }
        return f17.floatValue();
    }

    @Override // com.tencent.mm.plugin.multitask.m0
    public void e(int i17) {
        tk3.t.f419947o.a().f419954i = i17;
    }

    @Override // kk3.c
    public void f(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, qn5.a aVar) {
        tk3.t.f419947o.a().f(multiTaskInfo, aVar);
    }

    @Override // jk3.f
    public void g(boolean z17, boolean z18) {
        tk3.t.f419947o.a().g(z17, z18);
    }

    @Override // com.tencent.mm.plugin.multitask.m0
    public void i(java.lang.Boolean bool, java.lang.Boolean bool2) {
        tk3.t.f419947o.a().g(bool != null ? bool.booleanValue() : false, bool2 != null ? bool2.booleanValue() : false);
    }

    @Override // com.tencent.mm.plugin.multitask.m0
    public void j(java.lang.Boolean bool, java.lang.Boolean bool2) {
        tk3.t a17 = tk3.t.f419947o.a();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewUIManager", "hideFloatBall isFloatBallContainerExisted: %s", java.lang.Boolean.valueOf(a17.p()));
        d75.b.g(new tk3.n(a17, valueOf, valueOf2));
    }
}
