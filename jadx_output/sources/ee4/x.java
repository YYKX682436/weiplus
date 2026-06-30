package ee4;

/* loaded from: classes4.dex */
public final class x extends com.tencent.mm.plugin.sns.model.f2 {

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.y7 f251764c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f251765d;

    /* renamed from: e, reason: collision with root package name */
    public final ee4.c0 f251766e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f251767f;

    public x(com.tencent.mm.plugin.sns.model.y7 packHelper, java.util.List paths, ee4.c0 commitPc, boolean z17) {
        kotlin.jvm.internal.o.g(packHelper, "packHelper");
        kotlin.jvm.internal.o.g(paths, "paths");
        kotlin.jvm.internal.o.g(commitPc, "commitPc");
        this.f251764c = packHelper;
        this.f251765d = paths;
        this.f251766e = commitPc;
        this.f251767f = z17;
        if (z17) {
            commitPc.j().q();
        }
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public java.lang.Object a(java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        java.lang.String[] params = (java.lang.String[]) objArr;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        kotlin.jvm.internal.o.g(params, "params");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$commitImp", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        this.f251766e.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commitImp", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        this.f251764c.V(this.f251765d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commitImp", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$commitImp", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAsyncTask", "commit imp time " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        return bool;
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public java.util.concurrent.ExecutorService b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        java.util.concurrent.ExecutorService Sj = com.tencent.mm.plugin.sns.model.l4.Sj();
        kotlin.jvm.internal.o.f(Sj, "getTaskExecutor(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        return Sj;
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public void c(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        super.c(java.lang.Boolean.valueOf(booleanValue));
        boolean z17 = this.f251767f;
        ee4.c0 c0Var = this.f251766e;
        if (z17) {
            c0Var.j().p();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$commitDone", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        c0Var.p(this.f251764c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$commitDone", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$CommitTask");
    }
}
