package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f169881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f169882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.o f169883f;

    public m(com.tencent.mm.plugin.sns.ui.o oVar, java.util.List list, boolean z17) {
        this.f169883f = oVar;
        this.f169881d = list;
        this.f169882e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.AdapterLoader$2");
        java.util.List list = this.f169881d;
        com.tencent.mm.plugin.sns.ui.o oVar = this.f169883f;
        oVar.c(list);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        oVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeState", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        com.tencent.mm.plugin.sns.model.l4.Uj().post(new com.tencent.mm.plugin.sns.ui.n(oVar, this.f169882e));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeState", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.AdapterLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.AdapterLoader$2");
    }
}
