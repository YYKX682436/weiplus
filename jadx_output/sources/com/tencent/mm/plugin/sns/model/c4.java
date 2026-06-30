package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f164121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f164122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.f4 f164123g;

    public c4(com.tencent.mm.plugin.sns.model.f4 f4Var, java.lang.String str, long j17, long j18) {
        this.f164123g = f4Var;
        this.f164120d = str;
        this.f164121e = j17;
        this.f164122f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$2");
        com.tencent.mm.plugin.sns.model.g4.f(this.f164123g.f164191d).onDataAvailable(this.f164120d, this.f164121e, this.f164122f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$2");
    }
}
