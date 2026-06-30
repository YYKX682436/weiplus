package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f164143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f164144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.f4 f164145g;

    public d4(com.tencent.mm.plugin.sns.model.f4 f4Var, java.lang.String str, long j17, long j18) {
        this.f164145g = f4Var;
        this.f164142d = str;
        this.f164143e = j17;
        this.f164144f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$3");
        com.tencent.mm.plugin.sns.model.g4.f(this.f164145g.f164191d).f(this.f164142d, this.f164143e, this.f164144f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$3");
    }
}
