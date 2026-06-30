package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class u7 implements kotlin.coroutines.Continuation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.p7 f170567d;

    public u7(com.tencent.mm.plugin.sns.ui.p7 p7Var) {
        this.f170567d = p7Var;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.PicWidget$5");
        oz5.m mVar = oz5.m.f350329d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.PicWidget$5");
        return mVar;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.PicWidget$5");
        this.f170567d.a(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.PicWidget$5");
    }
}
