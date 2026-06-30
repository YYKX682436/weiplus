package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vh4 f164734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.z3 f164735e;

    public w3(com.tencent.mm.plugin.sns.model.z3 z3Var, r45.vh4 vh4Var) {
        this.f164735e = z3Var;
        this.f164734d = vh4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.model.z3 z3Var = this.f164735e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SightCdnUpload$3");
        r45.vh4 vh4Var = this.f164734d;
        int i17 = vh4Var.f388236f + 1;
        vh4Var.f388236f = i17;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "add try count %d", java.lang.Integer.valueOf(i17));
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().parseFrom(com.tencent.mm.plugin.sns.model.z3.b(z3Var).h());
            mj4Var.B = vh4Var;
            com.tencent.mm.plugin.sns.model.z3.b(z3Var).m(mj4Var.toByteArray());
            com.tencent.mm.plugin.sns.model.l4.Hj().Y2(com.tencent.mm.plugin.sns.model.z3.b(z3Var).c(), com.tencent.mm.plugin.sns.model.z3.b(z3Var));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in checkUploadaddCount %s", e17.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SightCdnUpload$3");
    }
}
