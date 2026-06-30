package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class m9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.VideoBackgroundRemuxResultEventEvent f169900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.n9 f169901e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(com.tencent.mm.autogen.events.VideoBackgroundRemuxResultEventEvent videoBackgroundRemuxResultEventEvent, com.tencent.mm.plugin.sns.ui.n9 n9Var) {
        super(0);
        this.f169900d = videoBackgroundRemuxResultEventEvent;
        this.f169901e = n9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1");
        com.tencent.mm.autogen.events.VideoBackgroundRemuxResultEventEvent videoBackgroundRemuxResultEventEvent = this.f169900d;
        am.l00 l00Var = videoBackgroundRemuxResultEventEvent.f54932g;
        int i17 = l00Var.f7204a;
        java.lang.String str = l00Var.f7205b;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "remux event return >> code: " + i17 + ", workTagId: " + str);
        am.l00 l00Var2 = videoBackgroundRemuxResultEventEvent.f54932g;
        com.tencent.mm.plugin.sns.ui.n9 n9Var = this.f169901e;
        if (i17 == 4001) {
            com.tencent.mm.plugin.sns.ui.o9 a17 = com.tencent.mm.plugin.sns.ui.n9.a(n9Var);
            if (a17 != null) {
                kotlin.jvm.internal.o.d(str);
                a17.c(str, l00Var2.f7207d);
            }
        } else if (i17 != 4007) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightWidgetBackgroundVideoHandler", "background remux is error, " + i17 + ", " + str);
            com.tencent.mm.plugin.sns.ui.o9 a18 = com.tencent.mm.plugin.sns.ui.n9.a(n9Var);
            if (a18 != null) {
                kotlin.jvm.internal.o.d(str);
                a18.d(3, null, str);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "background remux done, " + str);
            n55.f fVar = (n55.f) i95.n0.c(n55.f.class);
            kotlin.jvm.internal.o.d(str);
            ((wp4.x) fVar).wi(str, new com.tencent.mm.plugin.sns.ui.l9(str, n9Var));
        }
        com.tencent.mm.plugin.sns.statistics.w0.f164989a.e(l00Var2.f7206c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1");
        return f0Var;
    }
}
