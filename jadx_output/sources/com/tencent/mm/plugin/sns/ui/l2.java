package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.y7 f169726d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.plugin.sns.model.y7 y7Var) {
        super(1);
        this.f169726d = y7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$3");
        java.lang.String imgUrl = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$3");
        kotlin.jvm.internal.o.g(imgUrl, "imgUrl");
        com.tencent.mm.plugin.sns.model.y7 y7Var = this.f169726d;
        y7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        r45.jj4 p17 = y7Var.p("", 2, imgUrl, imgUrl);
        p17.f377857f = "";
        if (!com.tencent.mm.sdk.platformtools.t8.K0("")) {
            p17.f377864o = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0("")) {
            p17.f377857f = "";
        }
        y7Var.f164781f.ContentObj.f369840h.add(p17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addImageMediaObjByUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$3");
        return f0Var;
    }
}
