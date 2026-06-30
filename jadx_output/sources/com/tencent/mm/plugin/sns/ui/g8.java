package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes5.dex */
public class g8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f168409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.RichTextImageView f168410e;

    public g8(com.tencent.mm.plugin.sns.ui.RichTextImageView richTextImageView, int i17) {
        this.f168410e = richTextImageView;
        this.f168409d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.RichTextImageView$1");
        int i17 = com.tencent.mm.plugin.sns.ui.RichTextImageView.f166615m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        com.tencent.mm.plugin.sns.ui.RichTextImageView richTextImageView = this.f168410e;
        android.widget.TextView textView = richTextImageView.f166617e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        java.lang.String str = richTextImageView.f166621i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        int i18 = this.f168409d;
        textView.setText(str.substring(0, i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        android.widget.TextView textView2 = richTextImageView.f166618f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        java.lang.String str2 = richTextImageView.f166621i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        java.lang.String str3 = richTextImageView.f166621i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        textView2.setText(str2.substring(i18, str3.length()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        android.widget.TextView textView3 = richTextImageView.f166618f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        textView3.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        richTextImageView.f166620h = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bottomH:");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        android.widget.TextView textView4 = richTextImageView.f166618f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.RichTextImageView");
        sb6.append(textView4.getHeight());
        com.tencent.mars.xlog.Log.e("test", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.RichTextImageView$1");
    }
}
