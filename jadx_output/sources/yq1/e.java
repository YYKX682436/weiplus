package yq1;

/* loaded from: classes11.dex */
public final class e {
    public e(kotlin.jvm.internal.i iVar) {
    }

    public final void a() {
        java.util.LinkedList linkedList = bs1.a.a().f374454d;
        r45.hm6 hm6Var = linkedList != null ? (r45.hm6) linkedList.getFirst() : null;
        if (hm6Var == null) {
            return;
        }
        java.lang.String str = "export/xxx" + java.lang.System.currentTimeMillis();
        com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
        r45.lk lkVar = new r45.lk();
        lkVar.f379533d = hm6Var.f376295d;
        lkVar.f379534e = str;
        lkVar.f379535f = 20;
        b0Var.x(lkVar);
        b0Var.y(hm6Var.f376295d, str);
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Success!", 1).show();
        ((ku5.t0) ku5.t0.f312615d).h(yq1.c.f464425d, "BizFlutterDigestHelper");
    }

    public final void b() {
        if (!yq1.j.f464437c) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizProcessorCommand", "should not autoReboot now.");
            return;
        }
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Success! WeChat will kill self in 1 second...", 1).show();
        ku5.u0 u0Var = ku5.t0.f312615d;
        yq1.d dVar = yq1.d.f464426d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(dVar, 1000L, false);
    }
}
