package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class TranslateCommentTextView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.MaskTextView f167653d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsTranslateResultView f167654e;

    public TranslateCommentTextView(android.content.Context context) {
        super(context);
        a();
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.d0p, this);
        this.f167653d = (com.tencent.mm.plugin.sns.ui.MaskTextView) findViewById(com.tencent.mm.R.id.f483851c84);
        com.tencent.mm.plugin.sns.ui.SnsTranslateResultView snsTranslateResultView = (com.tencent.mm.plugin.sns.ui.SnsTranslateResultView) findViewById(com.tencent.mm.R.id.nc8);
        this.f167654e = snsTranslateResultView;
        snsTranslateResultView.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
    }

    public android.widget.TextView getOriginCommentTextView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOriginCommentTextView", "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
        com.tencent.mm.plugin.sns.ui.MaskTextView maskTextView = this.f167653d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOriginCommentTextView", "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
        return maskTextView;
    }

    public com.tencent.mm.plugin.sns.ui.SnsTranslateResultView getTranslateResultView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTranslateResultView", "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
        com.tencent.mm.plugin.sns.ui.SnsTranslateResultView snsTranslateResultView = this.f167654e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTranslateResultView", "com.tencent.mm.plugin.sns.ui.TranslateCommentTextView");
        return snsTranslateResultView;
    }

    public TranslateCommentTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
