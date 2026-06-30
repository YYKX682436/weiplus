package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class l9 implements n55.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.n9 f169734b;

    public l9(java.lang.String str, com.tencent.mm.plugin.sns.ui.n9 n9Var) {
        this.f169733a = str;
        this.f169734b = n9Var;
    }

    @Override // n55.e
    public void a(o55.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1$1");
        com.tencent.mm.plugin.sns.ui.n9 n9Var = this.f169734b;
        java.lang.String workTagId = this.f169733a;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightWidgetBackgroundVideoHandler", "result is null, workTagId: " + workTagId);
            com.tencent.mm.plugin.sns.ui.o9 a17 = com.tencent.mm.plugin.sns.ui.n9.a(n9Var);
            if (a17 != null) {
                kotlin.jvm.internal.o.f(workTagId, "$workTagId");
                a17.d(3, null, workTagId);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SightWidgetBackgroundVideoHandler", "result is find " + workTagId);
            com.tencent.mm.plugin.sns.ui.o9 a18 = com.tencent.mm.plugin.sns.ui.n9.a(n9Var);
            if (a18 != null) {
                kotlin.jvm.internal.o.f(workTagId, "$workTagId");
                a18.d(1, aVar, workTagId);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler$remuxEventListener$1$callback$1$1");
    }
}
