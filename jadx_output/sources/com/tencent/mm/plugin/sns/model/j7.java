package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class j7 extends com.tencent.mm.pluginsdk.model.j3 {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f164333c = "";

    @Override // com.tencent.mm.pluginsdk.model.j3
    public java.lang.Object a(java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        return bool;
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public java.util.concurrent.ExecutorService b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        java.util.concurrent.ExecutorService cj6 = com.tencent.mm.plugin.sns.model.l4.cj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        return cj6;
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public void c(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
        java.lang.String str = this.f164333c;
        Cj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
        Cj.C(str, -1, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public void d(java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        ca4.u0 u0Var = ((ca4.u0[]) objArr)[0];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreExecute", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
    }

    @Override // com.tencent.mm.pluginsdk.model.j3
    public void e(java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgressUpdate", "com.tencent.mm.plugin.sns.model.SnsWriteFileTask");
    }
}
