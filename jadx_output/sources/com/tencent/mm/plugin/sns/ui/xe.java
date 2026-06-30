package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class xe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q1 f171506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f171507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBrowseUI f171508f;

    public xe(com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI, r45.q1 q1Var, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        this.f171508f = snsBrowseUI;
        this.f171506d = q1Var;
        this.f171507e = timeLineObject;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsBrowseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.q1 q1Var = this.f171506d;
        if (q1Var.f383556m == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsBrowseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$3");
            return;
        }
        java.lang.String Ai = ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ai(q1Var.f383556m.f380054d, false);
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f171507e;
        if (com.tencent.mm.plugin.sns.storage.SnsInfo.isPhotoType(timeLineObject.ContentObj.f369837e)) {
            i17 = 2;
        } else {
            int i18 = timeLineObject.ContentObj.f369837e;
            i17 = i18 == 3 ? 5 : i18 == 15 ? 4 : 0;
        }
        com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI = this.f171508f;
        if (za4.z0.z(timeLineObject, snsBrowseUI, 11, false)) {
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI2 = this.f171508f;
            r45.m1 m1Var = q1Var.f383556m;
            ((com.tencent.mm.app.o7) wi6).Ni(snsBrowseUI2, m1Var.f380054d, Ai, timeLineObject.UserName, i17, 18, 9, m1Var.f380055e, 0L, timeLineObject.Id);
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsBrowseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$3");
            return;
        }
        int i19 = q1Var.f383550d;
        if (i19 == 4) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", q1Var.f383551e);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, snsBrowseUI);
            o25.s1 wi7 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI3 = this.f171508f;
            r45.m1 m1Var2 = q1Var.f383556m;
            ((com.tencent.mm.app.o7) wi7).Ni(snsBrowseUI3, m1Var2.f380054d, Ai, timeLineObject.UserName, i17, 18, 1, m1Var2.f380055e, 0L, timeLineObject.Id);
        } else if (i19 != 5) {
            if (i19 == 6) {
                int b17 = com.tencent.mm.plugin.sns.ui.h7.b(snsBrowseUI, q1Var);
                if (b17 == 1) {
                    com.tencent.mm.autogen.events.GameCenterOperationEvent gameCenterOperationEvent = new com.tencent.mm.autogen.events.GameCenterOperationEvent();
                    am.ke keVar = gameCenterOperationEvent.f54357g;
                    keVar.f7141b = snsBrowseUI;
                    keVar.f7140a = 2;
                    r45.m1 m1Var3 = q1Var.f383556m;
                    keVar.f7142c = m1Var3.f380054d;
                    keVar.f7143d = m1Var3.f380057g;
                    keVar.f7144e = m1Var3.f380056f;
                    keVar.f7145f = 3;
                    gameCenterOperationEvent.e();
                    o25.s1 wi8 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                    com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI4 = this.f171508f;
                    r45.m1 m1Var4 = q1Var.f383556m;
                    ((com.tencent.mm.app.o7) wi8).Ni(snsBrowseUI4, m1Var4.f380054d, Ai, timeLineObject.UserName, i17, 18, 6, m1Var4.f380055e, 0L, timeLineObject.Id);
                } else if (b17 == 2) {
                    com.tencent.mm.autogen.events.GameCenterOperationEvent gameCenterOperationEvent2 = new com.tencent.mm.autogen.events.GameCenterOperationEvent();
                    am.ke keVar2 = gameCenterOperationEvent2.f54357g;
                    keVar2.f7141b = snsBrowseUI;
                    keVar2.f7140a = 1;
                    r45.m1 m1Var5 = q1Var.f383556m;
                    keVar2.f7142c = m1Var5.f380054d;
                    keVar2.f7143d = m1Var5.f380057g;
                    keVar2.f7144e = m1Var5.f380056f;
                    keVar2.f7145f = 3;
                    gameCenterOperationEvent2.e();
                    o25.s1 wi9 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                    com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI5 = this.f171508f;
                    r45.m1 m1Var6 = q1Var.f383556m;
                    ((com.tencent.mm.app.o7) wi9).Ni(snsBrowseUI5, m1Var6.f380054d, Ai, timeLineObject.UserName, i17, 18, 3, m1Var6.f380055e, 0L, timeLineObject.Id);
                }
            }
        } else if (q1Var.f383552f == 1) {
            com.tencent.mm.autogen.events.GameCenterOperationEvent gameCenterOperationEvent3 = new com.tencent.mm.autogen.events.GameCenterOperationEvent();
            am.ke keVar3 = gameCenterOperationEvent3.f54357g;
            keVar3.f7140a = 2;
            keVar3.f7145f = 3;
            keVar3.f7142c = q1Var.f383556m.f380054d;
            keVar3.f7141b = snsBrowseUI;
            gameCenterOperationEvent3.e();
            o25.s1 wi10 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI6 = this.f171508f;
            r45.m1 m1Var7 = q1Var.f383556m;
            ((com.tencent.mm.app.o7) wi10).Ni(snsBrowseUI6, m1Var7.f380054d, Ai, timeLineObject.UserName, i17, 18, 6, m1Var7.f380055e, 0L, timeLineObject.Id);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsBrowseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$3");
    }
}
