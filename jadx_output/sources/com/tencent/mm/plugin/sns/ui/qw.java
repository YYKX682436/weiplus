package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class qw implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.kw f170369d;

    public qw(com.tencent.mm.plugin.sns.ui.kw kwVar) {
        this.f170369d = kwVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$13");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.cw) {
            com.tencent.mm.plugin.sns.ui.cw cwVar = (com.tencent.mm.plugin.sns.ui.cw) view.getTag();
            cwVar.getClass();
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(null);
            com.tencent.mm.plugin.sns.ui.kw kwVar = this.f170369d;
            if (K0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineClickEvent", "show source profile fail, username is null");
                dp.a.makeText(com.tencent.mm.plugin.sns.ui.kw.b(kwVar), com.tencent.mm.plugin.sns.ui.kw.b(kwVar).getString(com.tencent.mm.R.string.fds, 3, -1), 0).show();
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$13");
                return;
            }
            gm0.j1.i();
            com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            cwVar.getClass();
            com.tencent.mm.storage.z3 n17 = Bi.n(null, true);
            if (n17 != null && n17.d1().equals(null)) {
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(268435456);
                intent.putExtra("Contact_User", (java.lang.String) null);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, ((java.lang.String) null) + ",37");
                intent.putExtra("Contact_Scene", 37);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, com.tencent.mm.plugin.sns.ui.kw.b(kwVar));
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$13");
                return;
            }
            ((c01.k7) c01.n8.a()).b(null, 3, new com.tencent.mm.plugin.sns.ui.ow(this));
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(com.tencent.mm.plugin.sns.ui.kw.b(kwVar), com.tencent.mm.plugin.sns.ui.kw.b(kwVar).getString(com.tencent.mm.R.string.f490573yv), com.tencent.mm.plugin.sns.ui.kw.b(kwVar).getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.sns.ui.pw(this, cwVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            kwVar.f169655c = Q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$13");
    }
}
