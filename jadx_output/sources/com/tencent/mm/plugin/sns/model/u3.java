package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SnsRemuxTaskEvent f164705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vh4 f164706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.z3 f164708g;

    public u3(com.tencent.mm.plugin.sns.model.z3 z3Var, com.tencent.mm.autogen.events.SnsRemuxTaskEvent snsRemuxTaskEvent, r45.vh4 vh4Var, java.lang.String str) {
        this.f164708g = z3Var;
        this.f164705d = snsRemuxTaskEvent;
        this.f164706e = vh4Var;
        this.f164707f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SightCdnUpload$1");
        com.tencent.mm.autogen.events.SnsRemuxTaskEvent snsRemuxTaskEvent = this.f164705d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "event callback errcode %d", java.lang.Integer.valueOf(snsRemuxTaskEvent.f54835h.f7849a));
        int i17 = snsRemuxTaskEvent.f54835h.f7849a;
        com.tencent.mm.plugin.sns.model.z3 z3Var = this.f164708g;
        if (i17 >= 0) {
            com.tencent.mm.plugin.sns.model.z3.a(z3Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            z3Var.f(this.f164706e, this.f164707f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            z3Var.g();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SightCdnUpload$1");
    }
}
