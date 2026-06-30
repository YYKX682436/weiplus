package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i1 f164712d;

    public v1(com.tencent.mm.plugin.sns.model.i1 i1Var) {
        this.f164712d = i1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.model.i1 i1Var = this.f164712d;
        boolean z17 = i1Var.f164259h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LazyerImageLoader2", "[%s]already start,ignore start event2", "[image-flow]");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$6");
            return;
        }
        if (com.tencent.mm.plugin.sns.model.i1.d(i1Var).size() > 0) {
            com.tencent.mm.plugin.sns.model.a2 a2Var = (com.tencent.mm.plugin.sns.model.a2) com.tencent.mm.plugin.sns.model.i1.d(i1Var).removeLast();
            com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] LazyerImageLoader2 start key:%s size:%s", "[image-flow]", a2Var.g(), com.tencent.mm.plugin.sns.model.a2.e(a2Var), java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.model.i1.d(i1Var).size()));
            a2Var.d("");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$6");
    }
}
