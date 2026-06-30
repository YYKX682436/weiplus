package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class fq implements android.widget.TextView.OnEditorActionListener {
    public fq(com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter snsSightUploadSayFooter) {
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEditorAction", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEditorAction", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$2");
        return false;
    }
}
