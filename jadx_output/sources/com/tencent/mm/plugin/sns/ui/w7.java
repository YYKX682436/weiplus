package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class w7 extends com.tencent.mm.plugin.sns.model.f2 {

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.y7 f170735c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f170736d;

    /* renamed from: e, reason: collision with root package name */
    public final android.app.ProgressDialog f170737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.p7 f170738f;

    public w7(com.tencent.mm.plugin.sns.ui.p7 p7Var, com.tencent.mm.plugin.sns.model.y7 y7Var, java.util.List list) {
        this.f170738f = p7Var;
        this.f170737e = null;
        this.f170735c = y7Var;
        this.f170736d = list;
        com.tencent.mm.ui.MMActivity mMActivity = p7Var.f169957c;
        this.f170737e = db5.e1.Q(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490573yv), p7Var.f169957c.getString(com.tencent.mm.R.string.f490469vy), false, false, new com.tencent.mm.plugin.sns.ui.v7(this, p7Var));
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public java.lang.Object a(java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.model.y7 y7Var = this.f170735c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.PicWidget");
        this.f170738f.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commitImp", "com.tencent.mm.plugin.sns.ui.PicWidget");
        y7Var.V(this.f170736d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commitImp", "com.tencent.mm.plugin.sns.ui.PicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.PicWidget");
        this.f170735c = y7Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAsyncTask", "commit imp time " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        return bool;
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public java.util.concurrent.ExecutorService b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        java.util.concurrent.ExecutorService Sj = com.tencent.mm.plugin.sns.model.l4.Sj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        return Sj;
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public void c(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        super.c((java.lang.Boolean) obj);
        this.f170737e.dismiss();
        com.tencent.mm.plugin.sns.model.y7 y7Var = this.f170735c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.PicWidget");
        this.f170738f.p(y7Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.PicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.PicWidget$CommitTask");
    }
}
