package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f164134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.e2 f164135e;

    public d2(com.tencent.mm.plugin.sns.model.e2 e2Var, java.lang.Object obj) {
        this.f164135e = e2Var;
        this.f164134d = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.MagicAsyncTask$1$1");
        this.f164135e.f164167e.c(this.f164134d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.MagicAsyncTask$1$1");
    }
}
