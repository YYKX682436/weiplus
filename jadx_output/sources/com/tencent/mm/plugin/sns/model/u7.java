package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class u7 implements com.tencent.mm.plugin.sns.model.y3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.o7 f164711a;

    public u7(com.tencent.mm.plugin.sns.model.o7 o7Var) {
        this.f164711a = o7Var;
    }

    public void a(boolean z17, com.tencent.mm.plugin.sns.model.z3 z3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightUpLoadEnd", "com.tencent.mm.plugin.sns.model.UploadManager$6");
        if (!z17) {
            this.f164711a.d();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightUpLoadEnd", "com.tencent.mm.plugin.sns.model.UploadManager$6");
    }
}
