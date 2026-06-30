package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class v3 implements di3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.z3 f164719a;

    public v3(com.tencent.mm.plugin.sns.model.z3 z3Var) {
        this.f164719a = z3Var;
    }

    @Override // di3.i
    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideoFile", "com.tencent.mm.plugin.sns.model.SightCdnUpload$2");
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "iUpdateVideoFile");
        com.tencent.mm.plugin.sns.model.z3.a(this.f164719a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideoFile", "com.tencent.mm.plugin.sns.model.SightCdnUpload$2");
        return false;
    }
}
