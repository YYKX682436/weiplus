package com.tencent.mm.plugin.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.do, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cdo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q1 f168202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f168203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity f168204f;

    public Cdo(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity, r45.q1 q1Var, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        this.f168204f = snsOnlineVideoActivity;
        this.f168202d = q1Var;
        this.f168203e = timeLineObject;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$9");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.q1 q1Var = this.f168202d;
        if (q1Var.f383556m == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$9");
            return;
        }
        int i18 = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.C1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2402", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = this.f168204f;
        snsOnlineVideoActivity.F = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2402", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        java.lang.String Ai = ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ai(q1Var.f383556m.f380054d, false);
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f168203e;
        if (com.tencent.mm.plugin.sns.storage.SnsInfo.isPhotoType(timeLineObject.ContentObj.f369837e)) {
            i17 = 2;
        } else {
            int i19 = timeLineObject.ContentObj.f369837e;
            i17 = i19 == 3 ? 5 : i19 == 15 ? 38 : 0;
        }
        if (za4.z0.z(timeLineObject, snsOnlineVideoActivity, 11, false)) {
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity2 = this.f168204f;
            r45.m1 m1Var = q1Var.f383556m;
            ((com.tencent.mm.app.o7) wi6).Ni(snsOnlineVideoActivity2, m1Var.f380054d, Ai, timeLineObject.UserName, i17, 19, 9, m1Var.f380055e, 0L, timeLineObject.Id);
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$9");
            return;
        }
        int i27 = q1Var.f383550d;
        if (i27 == 4) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", q1Var.f383551e);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, snsOnlineVideoActivity);
            o25.s1 wi7 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity3 = this.f168204f;
            r45.m1 m1Var2 = q1Var.f383556m;
            ((com.tencent.mm.app.o7) wi7).Ni(snsOnlineVideoActivity3, m1Var2.f380054d, Ai, timeLineObject.UserName, i17, 19, 1, m1Var2.f380055e, 0L, timeLineObject.Id);
        } else if (i27 != 5) {
            if (i27 == 6) {
                int b17 = com.tencent.mm.plugin.sns.ui.h7.b(snsOnlineVideoActivity, q1Var);
                if (b17 == 1) {
                    com.tencent.mm.autogen.events.GameCenterOperationEvent gameCenterOperationEvent = new com.tencent.mm.autogen.events.GameCenterOperationEvent();
                    am.ke keVar = gameCenterOperationEvent.f54357g;
                    keVar.f7141b = snsOnlineVideoActivity;
                    keVar.f7140a = 2;
                    r45.m1 m1Var3 = q1Var.f383556m;
                    keVar.f7142c = m1Var3.f380054d;
                    keVar.f7143d = m1Var3.f380057g;
                    keVar.f7144e = m1Var3.f380056f;
                    keVar.f7145f = 3;
                    gameCenterOperationEvent.e();
                    o25.s1 wi8 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                    com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity4 = this.f168204f;
                    r45.m1 m1Var4 = q1Var.f383556m;
                    ((com.tencent.mm.app.o7) wi8).Ni(snsOnlineVideoActivity4, m1Var4.f380054d, Ai, timeLineObject.UserName, i17, 19, 6, m1Var4.f380055e, 0L, timeLineObject.Id);
                } else if (b17 == 2) {
                    com.tencent.mm.autogen.events.GameCenterOperationEvent gameCenterOperationEvent2 = new com.tencent.mm.autogen.events.GameCenterOperationEvent();
                    am.ke keVar2 = gameCenterOperationEvent2.f54357g;
                    keVar2.f7141b = snsOnlineVideoActivity;
                    keVar2.f7140a = 1;
                    r45.m1 m1Var5 = q1Var.f383556m;
                    keVar2.f7142c = m1Var5.f380054d;
                    keVar2.f7143d = m1Var5.f380057g;
                    keVar2.f7144e = m1Var5.f380056f;
                    keVar2.f7145f = 3;
                    gameCenterOperationEvent2.e();
                    o25.s1 wi9 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                    com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity5 = this.f168204f;
                    r45.m1 m1Var6 = q1Var.f383556m;
                    ((com.tencent.mm.app.o7) wi9).Ni(snsOnlineVideoActivity5, m1Var6.f380054d, Ai, timeLineObject.UserName, i17, 19, 3, m1Var6.f380055e, 0L, timeLineObject.Id);
                }
            }
        } else if (q1Var.f383552f == 1) {
            com.tencent.mm.autogen.events.GameCenterOperationEvent gameCenterOperationEvent3 = new com.tencent.mm.autogen.events.GameCenterOperationEvent();
            am.ke keVar3 = gameCenterOperationEvent3.f54357g;
            keVar3.f7140a = 2;
            keVar3.f7145f = 3;
            keVar3.f7142c = q1Var.f383556m.f380054d;
            keVar3.f7141b = snsOnlineVideoActivity;
            gameCenterOperationEvent3.e();
            o25.s1 wi10 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity6 = this.f168204f;
            r45.m1 m1Var7 = q1Var.f383556m;
            ((com.tencent.mm.app.o7) wi10).Ni(snsOnlineVideoActivity6, m1Var7.f380054d, Ai, timeLineObject.UserName, i17, 19, 6, m1Var7.f380055e, 0L, timeLineObject.Id);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$9");
    }
}
