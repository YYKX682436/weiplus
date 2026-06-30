package uc4;

/* loaded from: classes4.dex */
public final class h0 extends uc4.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGameAboutClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGameAboutClick");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = c17.c1().getTimeLine();
        kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
        r45.q1 q1Var = timeLine.actionInfo;
        if (q1Var.f383556m == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGameAboutClick");
            return;
        }
        java.lang.String Ai = ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ai(q1Var.f383556m.f380054d, false);
        if (com.tencent.mm.plugin.sns.storage.SnsInfo.isPhotoType(timeLine.ContentObj.f369837e)) {
            i17 = 2;
        } else {
            int i18 = timeLine.ContentObj.f369837e;
            i17 = i18 == 3 ? 5 : i18 == 15 ? 38 : 0;
        }
        android.content.Context b17 = b();
        kotlin.jvm.internal.o.e(b17, "null cannot be cast to non-null type android.app.Activity");
        if (za4.z0.z(timeLine, (android.app.Activity) b17, 11, false)) {
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            android.content.Context b18 = b();
            r45.m1 m1Var = q1Var.f383556m;
            ((com.tencent.mm.app.o7) wi6).Ni(b18, m1Var.f380054d, Ai, timeLine.UserName, i17, 11, 9, m1Var.f380055e, 0L, timeLine.Id);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGameAboutClick");
            return;
        }
        int i19 = q1Var.f383550d;
        if (i19 == 4) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", q1Var.f383551e);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, b());
            o25.s1 wi7 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            android.content.Context b19 = b();
            r45.m1 m1Var2 = q1Var.f383556m;
            ((com.tencent.mm.app.o7) wi7).Ni(b19, m1Var2.f380054d, Ai, timeLine.UserName, i17, 11, 1, m1Var2.f380055e, 0L, timeLine.Id);
        } else if (i19 != 5) {
            if (i19 == 6) {
                int b27 = com.tencent.mm.plugin.sns.ui.h7.b(b(), q1Var);
                if (b27 == 1) {
                    com.tencent.mm.autogen.events.GameCenterOperationEvent gameCenterOperationEvent = new com.tencent.mm.autogen.events.GameCenterOperationEvent();
                    android.content.Context b28 = b();
                    am.ke keVar = gameCenterOperationEvent.f54357g;
                    keVar.f7141b = b28;
                    keVar.f7140a = 2;
                    r45.m1 m1Var3 = q1Var.f383556m;
                    keVar.f7142c = m1Var3.f380054d;
                    keVar.f7143d = m1Var3.f380057g;
                    keVar.f7144e = m1Var3.f380056f;
                    keVar.f7145f = 3;
                    gameCenterOperationEvent.e();
                    o25.s1 wi8 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                    android.content.Context b29 = b();
                    r45.m1 m1Var4 = q1Var.f383556m;
                    ((com.tencent.mm.app.o7) wi8).Ni(b29, m1Var4.f380054d, Ai, timeLine.UserName, i17, 11, 6, m1Var4.f380055e, 0L, timeLine.Id);
                } else if (b27 == 2) {
                    com.tencent.mm.autogen.events.GameCenterOperationEvent gameCenterOperationEvent2 = new com.tencent.mm.autogen.events.GameCenterOperationEvent();
                    android.content.Context b37 = b();
                    am.ke keVar2 = gameCenterOperationEvent2.f54357g;
                    keVar2.f7141b = b37;
                    keVar2.f7140a = 1;
                    r45.m1 m1Var5 = q1Var.f383556m;
                    keVar2.f7142c = m1Var5.f380054d;
                    keVar2.f7143d = m1Var5.f380057g;
                    keVar2.f7144e = m1Var5.f380056f;
                    keVar2.f7145f = 3;
                    gameCenterOperationEvent2.e();
                    o25.s1 wi9 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                    android.content.Context b38 = b();
                    r45.m1 m1Var6 = q1Var.f383556m;
                    ((com.tencent.mm.app.o7) wi9).Ni(b38, m1Var6.f380054d, Ai, timeLine.UserName, i17, 11, 3, m1Var6.f380055e, 0L, timeLine.Id);
                }
            }
        } else if (q1Var.f383552f == 1) {
            com.tencent.mm.autogen.events.GameCenterOperationEvent gameCenterOperationEvent3 = new com.tencent.mm.autogen.events.GameCenterOperationEvent();
            am.ke keVar3 = gameCenterOperationEvent3.f54357g;
            keVar3.f7140a = 2;
            keVar3.f7145f = 3;
            keVar3.f7142c = q1Var.f383556m.f380054d;
            keVar3.f7141b = b();
            gameCenterOperationEvent3.e();
            o25.s1 wi10 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            android.content.Context b39 = b();
            r45.m1 m1Var7 = q1Var.f383556m;
            ((com.tencent.mm.app.o7) wi10).Ni(b39, m1Var7.f380054d, Ai, timeLine.UserName, i17, 11, 6, m1Var7.f380055e, 0L, timeLine.Id);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGameAboutClick");
    }
}
