package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class l6 implements kotlin.coroutines.Continuation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.i6 f169730d;

    public l6(com.tencent.mm.plugin.sns.ui.i6 i6Var) {
        this.f169730d = i6Var;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.NewSightWidget$12");
        oz5.m mVar = oz5.m.f350329d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.NewSightWidget$12");
        return mVar;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.NewSightWidget$12");
        this.f169730d.a(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.NewSightWidget$12");
    }
}
