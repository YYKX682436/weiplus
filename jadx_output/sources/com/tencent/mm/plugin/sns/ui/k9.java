package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class k9 implements n55.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.o9 f169613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169614b;

    public k9(com.tencent.mm.plugin.sns.ui.o9 o9Var, java.lang.String str) {
        this.f169613a = o9Var;
        this.f169614b = str;
    }

    @Override // n55.e
    public void a(o55.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$getRemuxVideoWork$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getRemuxVideoWork >> workType: ");
        sb6.append(aVar != null ? java.lang.Integer.valueOf(aVar.f343162a) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", sb6.toString());
        com.tencent.mm.plugin.sns.ui.o9 o9Var = this.f169613a;
        java.lang.String str = this.f169614b;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "workType is error");
            o9Var.d(3, aVar, str);
        } else {
            int i17 = aVar.f343162a;
            if (i17 == 4007) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "result is done " + str);
                o9Var.d(1, aVar, str);
            } else if (i17 == 4008) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "result is done error");
                o9Var.d(3, aVar, str);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "result is no done");
                o9Var.d(2, aVar, str);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$getRemuxVideoWork$1");
    }
}
