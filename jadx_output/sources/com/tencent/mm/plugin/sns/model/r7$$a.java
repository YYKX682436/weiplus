package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public final /* synthetic */ class r7$$a implements com.tencent.mm.plugin.sns.model.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.r7 f164654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f164655b;

    public /* synthetic */ r7$$a(com.tencent.mm.plugin.sns.model.r7 r7Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f164654a = r7Var;
        this.f164655b = snsInfo;
    }

    public final void a(boolean z17) {
        com.tencent.mm.plugin.sns.model.r7 r7Var = this.f164654a;
        r7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$run$0", "com.tencent.mm.plugin.sns.model.UploadManager$3");
        if (z17) {
            r7Var.f164653d.l(this.f164655b, -1, 7, "sns BackVideo is remux error");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$run$0", "com.tencent.mm.plugin.sns.model.UploadManager$3");
    }
}
