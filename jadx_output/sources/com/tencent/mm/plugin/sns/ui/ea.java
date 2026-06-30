package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ea extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f168228a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f168229b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.Button f168230c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f168231d;

    public ea(android.widget.Button button, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f168228a = str;
        this.f168229b = str2;
        this.f168230c = button;
        this.f168231d = str3;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
        int i17 = 1;
        if (!za4.k.g().m(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f168228a)) {
            int f17 = za4.k.g().f(this.f168229b);
            i17 = f17 == 3 ? 2 : f17 == 2 ? 3 : f17 == 1 ? 4 : 0;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
        return valueOf;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
        int intValue = num.intValue();
        android.widget.Button button = this.f168230c;
        if (intValue == 1) {
            button.setText(com.tencent.mm.R.string.f493167j64);
        } else if (num.intValue() == 2) {
            button.setText(com.tencent.mm.R.string.f493166j63);
        } else if (num.intValue() == 3) {
            button.setText(com.tencent.mm.R.string.j67);
        } else if (num.intValue() == 4) {
            button.setText(com.tencent.mm.R.string.f493165j62);
        } else {
            button.setText(this.f168231d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
    }
}
