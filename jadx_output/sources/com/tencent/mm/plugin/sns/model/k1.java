package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.memory.r f164346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i1 f164347g;

    public k1(com.tencent.mm.plugin.sns.model.i1 i1Var, int i17, java.lang.String str, com.tencent.mm.memory.r rVar) {
        this.f164347g = i1Var;
        this.f164344d = i17;
        this.f164345e = str;
        this.f164346f = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$11");
        this.f164347g.L(this.f164344d + "-" + this.f164345e, this.f164346f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$11");
    }
}
