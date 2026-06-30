package nc4;

/* loaded from: classes4.dex */
public final class j0 implements nc4.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f336160a;

    public j0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f336160a = context;
    }

    @Override // nc4.c
    public db5.h4 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        android.content.Context context = this.f336160a;
        db5.h4 h4Var = new db5.h4(context, 7, 0);
        h4Var.f228368i = i65.a.r(context, com.tencent.mm.R.string.btq);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        return h4Var;
    }

    @Override // nc4.c
    public java.lang.Object b(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        android.content.Context context = this.f336160a;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        boolean b17 = dw3.c.f244181a.b(activity, "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF");
        db5.e1.j(activity, b17 ? com.tencent.mm.R.string.f490414ub : com.tencent.mm.R.string.f490413ua, com.tencent.mm.R.string.f490573yv, com.tencent.mm.R.string.f490507x1, com.tencent.mm.R.string.f490347sg, new nc4.h0(lVar, b17, activity), new nc4.i0(lVar));
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        return f0Var;
    }

    @Override // nc4.c
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
    }

    @Override // nc4.c
    public boolean show() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_home_to_ponenix_enable, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "SecondCutEntrance: " + fj6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        return fj6;
    }

    @Override // nc4.c
    public int type() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        int h17 = nc4.d.f336127i.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        return h17;
    }
}
