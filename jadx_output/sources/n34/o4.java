package n34;

/* loaded from: classes3.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public static final n34.o4 f334697a = new n34.o4();

    /* renamed from: b, reason: collision with root package name */
    public static int f334698b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f334699c = 10;

    public final void a(android.content.Context context, yz5.a func) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showFirstSettingDialog", "com.tencent.mm.plugin.sns.SnsStarUIHelper");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(func, "func");
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 0, false);
        z2Var.y(context.getResources().getString(com.tencent.mm.R.string.f493244jf2));
        z2Var.x(1);
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.crr, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        z2Var.j(inflate);
        z2Var.F = new n34.m4(z2Var);
        z2Var.l(new n34.n4(func));
        z2Var.C();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsFirstSettingIsShow", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_STAR_SETTING_TEACH_SHOW_INT, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsFirstSettingIsShow", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showFirstSettingDialog", "com.tencent.mm.plugin.sns.SnsStarUIHelper");
    }
}
