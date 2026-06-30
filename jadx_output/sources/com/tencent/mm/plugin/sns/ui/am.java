package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public class am implements a84.l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f167774a;

    /* renamed from: b, reason: collision with root package name */
    public final int f167775b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f167776c;

    public am(android.widget.TextView textView, java.lang.String str) {
        this.f167774a = new java.lang.ref.WeakReference(textView);
        this.f167775b = i65.a.b(textView.getContext(), 16);
        this.f167776c = str;
    }

    @Override // a84.l
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.ref.WeakReference weakReference;
        java.lang.String str = this.f167776c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$DownloadCallback");
        try {
            weakReference = this.f167774a;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsMsgUI", "onDownloadResult, exp=" + th6.toString());
        }
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$DownloadCallback");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) weakReference.get();
        if (textView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$DownloadCallback");
            return;
        }
        java.lang.Object tag = textView.getTag(com.tencent.mm.R.id.n5q);
        if (tag instanceof java.lang.String) {
            java.lang.String str2 = (java.lang.String) tag;
            if (!android.text.TextUtils.isEmpty(str) && str.equals(str2) && z17 && bitmap != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "onDownloadResult: success");
                android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), bitmap);
                int i17 = this.f167775b;
                bitmapDrawable.setBounds(0, 0, i17, i17);
                textView.setCompoundDrawables(bitmapDrawable, null, null, null);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$DownloadCallback");
    }
}
