package x84;

/* loaded from: classes4.dex */
public final class b implements a84.l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f452577a;

    /* renamed from: b, reason: collision with root package name */
    public final int f452578b;

    /* renamed from: c, reason: collision with root package name */
    public final int f452579c;

    /* renamed from: d, reason: collision with root package name */
    public final int f452580d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f452581e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f452582f;

    public b(android.widget.TextView textView, java.lang.String imgUrl, int i17, int i18, int i19, boolean z17) {
        kotlin.jvm.internal.o.g(textView, "textView");
        kotlin.jvm.internal.o.g(imgUrl, "imgUrl");
        this.f452577a = imgUrl;
        this.f452578b = i17;
        this.f452579c = i18;
        this.f452580d = i19;
        this.f452581e = z17;
        this.f452582f = new java.lang.ref.WeakReference(textView);
    }

    @Override // a84.l
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.String str = this.f452577a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$DownloadCallback");
        boolean z18 = this.f452581e;
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdHandleImageSpanLogic", "onDownloadResult, exp=" + th6);
        }
        if (bitmap == null || !z17) {
            com.tencent.mars.xlog.Log.e("AdHandleImageSpanLogic", "bitmap is null or isSuccess is " + z17 + ", isRefresh is " + z18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$DownloadCallback");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) this.f452582f.get();
        if (textView == null) {
            com.tencent.mars.xlog.Log.w("AdHandleImageSpanLogic", "mTextViewRef getRef is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$DownloadCallback");
            return;
        }
        java.lang.Object tag = textView.getTag(com.tencent.mm.R.id.n5q);
        java.lang.String str2 = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        com.tencent.mars.xlog.Log.i("AdHandleImageSpanLogic", "imgUrl is " + str + ", tagUrl is " + str2 + ", isRefresh is " + z18);
        if (kotlin.jvm.internal.o.b(str, str2)) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(textView.getText());
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), bitmap);
            bitmapDrawable.setBounds(0, 0, this.f452578b, this.f452579c);
            al5.w wVar = new al5.w(bitmapDrawable, 1);
            wVar.f6079d = this.f452580d;
            if (!z18 && !r26.n0.E(spannableStringBuilder, (char) 8199, false, 2, null)) {
                spannableStringBuilder.append((char) 8199);
            }
            spannableStringBuilder.setSpan(wVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 34);
            textView.setText(spannableStringBuilder);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$DownloadCallback");
    }
}
