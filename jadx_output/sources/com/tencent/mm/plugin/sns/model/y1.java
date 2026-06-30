package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f164764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.s7 f164765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164766f;

    public y1(com.tencent.mm.plugin.sns.model.i1 i1Var, r45.jj4 jj4Var, com.tencent.mm.storage.s7 s7Var, java.lang.String str) {
        this.f164764d = jj4Var;
        this.f164765e = s7Var;
        this.f164766f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$9");
        com.tencent.mm.plugin.sns.model.l4.Cj().e(this.f164764d, 4, null, this.f164765e, this.f164766f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$9");
    }
}
