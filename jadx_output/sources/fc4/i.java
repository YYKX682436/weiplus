package fc4;

/* loaded from: classes4.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q1 f261163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f261164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fc4.j f261165f;

    public i(r45.q1 q1Var, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, fc4.j jVar) {
        this.f261163d = q1Var;
        this.f261164e = timeLineObject;
        this.f261165f = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC$initGameMoreButton$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/flexible/FlexibleGameMoreUIC$initGameMoreButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.q1 q1Var = this.f261163d;
        kotlin.jvm.internal.o.d(q1Var);
        if (q1Var.f383556m == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleGameMoreUIC$initGameMoreButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC$initGameMoreButton$1");
            return;
        }
        java.lang.String Ai = ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ai(q1Var.f383556m.f380054d, false);
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f261164e;
        if (com.tencent.mm.plugin.sns.storage.SnsInfo.isPhotoType(timeLineObject.ContentObj.f369837e)) {
            i17 = 2;
        } else {
            int i18 = timeLineObject.ContentObj.f369837e;
            i17 = i18 == 3 ? 5 : i18 == 15 ? 38 : 0;
        }
        fc4.j jVar = this.f261165f;
        if (za4.z0.z(timeLineObject, jVar.getContext(), 11, false)) {
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            android.app.Activity context = jVar.getContext();
            r45.m1 m1Var = q1Var.f383556m;
            ((com.tencent.mm.app.o7) wi6).Ni(context, m1Var.f380054d, Ai, timeLineObject.UserName, i17, 19, 9, m1Var.f380055e, 0L, timeLineObject.Id);
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleGameMoreUIC$initGameMoreButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC$initGameMoreButton$1");
            return;
        }
        int i19 = q1Var.f383550d;
        if (i19 == 4) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", q1Var.f383551e);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, jVar.getContext());
            o25.s1 wi7 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            android.app.Activity context2 = jVar.getContext();
            r45.m1 m1Var2 = q1Var.f383556m;
            ((com.tencent.mm.app.o7) wi7).Ni(context2, m1Var2.f380054d, Ai, timeLineObject.UserName, i17, 19, 1, m1Var2.f380055e, 0L, timeLineObject.Id);
        } else if (i19 != 5) {
            if (i19 == 6) {
                int b17 = com.tencent.mm.plugin.sns.ui.h7.b(jVar.getContext(), q1Var);
                if (b17 == 1) {
                    com.tencent.mm.autogen.events.GameCenterOperationEvent gameCenterOperationEvent = new com.tencent.mm.autogen.events.GameCenterOperationEvent();
                    android.app.Activity context3 = jVar.getContext();
                    am.ke keVar = gameCenterOperationEvent.f54357g;
                    keVar.f7141b = context3;
                    keVar.f7140a = 2;
                    r45.m1 m1Var3 = q1Var.f383556m;
                    keVar.f7142c = m1Var3.f380054d;
                    keVar.f7143d = m1Var3.f380057g;
                    keVar.f7144e = m1Var3.f380056f;
                    keVar.f7145f = 3;
                    gameCenterOperationEvent.e();
                    o25.s1 wi8 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                    android.app.Activity context4 = jVar.getContext();
                    r45.m1 m1Var4 = q1Var.f383556m;
                    ((com.tencent.mm.app.o7) wi8).Ni(context4, m1Var4.f380054d, Ai, timeLineObject.UserName, i17, 19, 6, m1Var4.f380055e, 0L, timeLineObject.Id);
                } else if (b17 == 2) {
                    com.tencent.mm.autogen.events.GameCenterOperationEvent gameCenterOperationEvent2 = new com.tencent.mm.autogen.events.GameCenterOperationEvent();
                    android.app.Activity context5 = jVar.getContext();
                    am.ke keVar2 = gameCenterOperationEvent2.f54357g;
                    keVar2.f7141b = context5;
                    keVar2.f7140a = 1;
                    r45.m1 m1Var5 = q1Var.f383556m;
                    keVar2.f7142c = m1Var5.f380054d;
                    keVar2.f7143d = m1Var5.f380057g;
                    keVar2.f7144e = m1Var5.f380056f;
                    keVar2.f7145f = 3;
                    gameCenterOperationEvent2.e();
                    o25.s1 wi9 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                    android.app.Activity context6 = jVar.getContext();
                    r45.m1 m1Var6 = q1Var.f383556m;
                    ((com.tencent.mm.app.o7) wi9).Ni(context6, m1Var6.f380054d, Ai, timeLineObject.UserName, i17, 19, 3, m1Var6.f380055e, 0L, timeLineObject.Id);
                }
            }
        } else if (q1Var.f383552f == 1) {
            com.tencent.mm.autogen.events.GameCenterOperationEvent gameCenterOperationEvent3 = new com.tencent.mm.autogen.events.GameCenterOperationEvent();
            am.ke keVar3 = gameCenterOperationEvent3.f54357g;
            keVar3.f7140a = 2;
            keVar3.f7145f = 3;
            keVar3.f7142c = q1Var.f383556m.f380054d;
            keVar3.f7141b = jVar.getContext();
            gameCenterOperationEvent3.e();
            o25.s1 wi10 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            android.app.Activity context7 = jVar.getContext();
            r45.m1 m1Var7 = q1Var.f383556m;
            ((com.tencent.mm.app.o7) wi10).Ni(context7, m1Var7.f380054d, Ai, timeLineObject.UserName, i17, 19, 6, m1Var7.f380055e, 0L, timeLineObject.Id);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleGameMoreUIC$initGameMoreButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleGameMoreUIC$initGameMoreButton$1");
    }
}
