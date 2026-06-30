package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class ow implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.qw f170128a;

    public ow(com.tencent.mm.plugin.sns.ui.qw qwVar) {
        this.f170128a = qwVar;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$13$1");
        com.tencent.mm.plugin.sns.ui.qw qwVar = this.f170128a;
        com.tencent.mm.plugin.sns.ui.kw kwVar = qwVar.f170369d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = kwVar.f169655c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.plugin.sns.ui.kw kwVar2 = qwVar.f170369d;
        if (u3Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = kwVar2.f169655c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            u3Var2.dismiss();
        }
        if (z17) {
            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
            com.tencent.mm.modelavatar.g.f(str, 3);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.wi().i(str);
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456);
            intent.putExtra("Contact_User", str);
            intent.putExtra("Contact_Scene", 37);
            gm0.j1.i();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 != null && n17.k2()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, str + ",37");
                intent.putExtra("Contact_Scene", 37);
            }
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, com.tencent.mm.plugin.sns.ui.kw.b(kwVar2));
        } else {
            dp.a.makeText(com.tencent.mm.plugin.sns.ui.kw.b(kwVar2), com.tencent.mm.plugin.sns.ui.kw.b(kwVar2).getString(com.tencent.mm.R.string.fds, 3, -1), 0).show();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$13$1");
    }
}
