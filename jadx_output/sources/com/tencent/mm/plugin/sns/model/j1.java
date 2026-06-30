package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f164318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i1 f164319e;

    public j1(com.tencent.mm.plugin.sns.model.i1 i1Var, r45.jj4 jj4Var) {
        this.f164319e = i1Var;
        this.f164318d = jj4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$10");
        com.tencent.mm.plugin.sns.model.i1.c(this.f164319e, 1, this.f164318d, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$10");
    }
}
