package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public abstract class f2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f164185a = false;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f164186b = com.tencent.mm.plugin.sns.model.l4.Tj();

    public abstract java.lang.Object a(java.lang.Object... objArr);

    public abstract java.util.concurrent.ExecutorService b();

    public void c(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
    }

    public boolean d(java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        if (this.f164185a) {
            iz5.a.g("MicroMsg.MMAsyncTask Should construct a new Task", false);
        }
        this.f164185a = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreExecute", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreExecute", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        java.util.concurrent.ExecutorService b17 = b();
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
            return false;
        }
        b17.execute(new com.tencent.mm.plugin.sns.model.e2(this, objArr));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.model.MagicAsyncTask");
        return true;
    }
}
