package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class iw extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f169449a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f169450b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f169451c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f169452d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f169453e;

    public iw(android.widget.TextView textView, android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f169449a = str;
        this.f169450b = str2;
        this.f169451c = textView;
        this.f169452d = imageView;
        this.f169453e = str3;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        za4.k g17 = za4.k.g();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = this.f169449a;
        boolean m17 = g17.m(context, str);
        int i17 = 1;
        if (!m17) {
            int f17 = za4.k.g().f(this.f169450b);
            i17 = f17 == 3 ? 2 : f17 == 2 ? 3 : f17 == 1 ? 4 : 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineAdView", "pkg is " + str + ", state is " + i17 + ", cost time is " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
        return valueOf;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
        int intValue = num.intValue();
        android.widget.TextView textView = this.f169451c;
        if (intValue == 1) {
            textView.setText(com.tencent.mm.R.string.f493167j64);
        } else if (num.intValue() == 2) {
            textView.setText(com.tencent.mm.R.string.f493166j63);
        } else if (num.intValue() == 3) {
            textView.setText(com.tencent.mm.R.string.j67);
        } else if (num.intValue() == 4) {
            textView.setText(com.tencent.mm.R.string.f493165j62);
        } else {
            textView.setText(this.f169453e);
        }
        int intValue2 = num.intValue();
        android.widget.ImageView imageView = this.f169452d;
        if (intValue2 != 1) {
            imageView.setImageResource(com.tencent.mm.R.raw.light_download_icon);
        } else {
            imageView.setImageResource(com.tencent.mm.R.raw.album_advertise_link_icon);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.TimeLineAdView$DownLoadStateRefreshTask");
    }
}
