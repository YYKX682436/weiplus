package rd4;

/* loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.TemplateBackgroundVideoResultEvent f394249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd4.d f394250e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.autogen.events.TemplateBackgroundVideoResultEvent templateBackgroundVideoResultEvent, rd4.d dVar) {
        super(0);
        this.f394249d = templateBackgroundVideoResultEvent;
        this.f394250e = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1$callback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1$callback$1");
        com.tencent.mm.autogen.events.TemplateBackgroundVideoResultEvent templateBackgroundVideoResultEvent = this.f394249d;
        am.ty tyVar = templateBackgroundVideoResultEvent.f54888g;
        int i17 = tyVar.f8041a;
        java.lang.String str = tyVar.f8042b;
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "remux event return >> code: " + i17 + ", workTagId: " + str);
        am.ty tyVar2 = templateBackgroundVideoResultEvent.f54888g;
        rd4.d dVar = this.f394250e;
        if (i17 == 4001) {
            com.tencent.mm.plugin.sns.ui.o9 f17 = rd4.d.f(dVar);
            if (f17 != null) {
                kotlin.jvm.internal.o.d(str);
                f17.c(str, tyVar2.f8044d);
            }
        } else if (i17 != 4007) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "background remux is error, " + i17 + ", " + str);
            com.tencent.mm.plugin.sns.ui.o9 f18 = rd4.d.f(dVar);
            if (f18 != null) {
                kotlin.jvm.internal.o.d(str);
                f18.d(3, null, str);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "background remux done, " + str);
            pp0.o0 o0Var = (pp0.o0) i95.n0.c(pp0.o0.class);
            kotlin.jvm.internal.o.d(str);
            ((yy0.g8) o0Var).Ai(str, new rd4.b(str, dVar));
        }
        com.tencent.mm.plugin.sns.statistics.w0.f164989a.e(tyVar2.f8043c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1$callback$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1$callback$1");
        return f0Var;
    }
}
