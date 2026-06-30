package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class a3 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.b3 f164074a;

    public a3(com.tencent.mm.plugin.sns.model.b3 b3Var) {
        this.f164074a = b3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1");
        gm0.j1.i();
        if (!gm0.j1.b().m()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1");
            return;
        }
        com.tencent.mm.plugin.sns.model.b3 b3Var = this.f164074a;
        java.util.LinkedList linkedList = b3Var.f164089a;
        if (linkedList != null && !linkedList.isEmpty()) {
            r45.b50 b50Var = (r45.b50) b3Var.f164089a.getFirst();
            int i17 = b50Var.f370530d;
            b3Var.f164089a.removeFirst();
            int i18 = b50Var.f370530d;
            if (i18 == 45) {
                com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.model.y2(this, b50Var));
            } else if (i18 != 46) {
                b3Var.f164090b.sendEmptyMessage(0);
            } else {
                com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.model.z2(this, b50Var));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1");
            return;
        }
        com.tencent.mm.plugin.sns.model.c3 c3Var = b3Var.f164091c;
        c3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.tencent.mm.modelbase.o oVar = c3Var.f164117e;
        r45.la6 la6Var = (r45.la6) oVar.f70711b.f70700a;
        r45.ka6 ka6Var = (r45.ka6) oVar.f70710a.f70684a;
        byte[] c17 = o45.qi.c(ka6Var.f378567e.f371841f.g(), la6Var.f379281f.f371841f.g());
        if (c17 != null && c17.length > 0) {
            w11.c2.f441991a.d(c17, true);
        }
        ka6Var.f378567e.d(c17);
        if ((ka6Var.f378566d & la6Var.f379280e) == 0) {
            c3Var.f164118f.onSceneEnd(0, 0, "", c3Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        } else {
            c3Var.doScene(c3Var.dispatcher(), c3Var.f164118f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler$1");
    }
}
