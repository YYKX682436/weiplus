package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f164166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.f2 f164167e;

    public e2(com.tencent.mm.plugin.sns.model.f2 f2Var, java.lang.Object[] objArr) {
        this.f164167e = f2Var;
        this.f164166d = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.MagicAsyncTask$1");
        java.lang.Object[] objArr = this.f164166d;
        com.tencent.mm.plugin.sns.model.f2 f2Var = this.f164167e;
        java.lang.Object a17 = f2Var.a(objArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        com.tencent.mm.sdk.platformtools.n3 n3Var = f2Var.f164186b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        n3Var.post(new com.tencent.mm.plugin.sns.model.d2(this, a17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.MagicAsyncTask$1");
    }
}
