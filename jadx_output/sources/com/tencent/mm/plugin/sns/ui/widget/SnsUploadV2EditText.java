package com.tencent.mm.plugin.sns.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/SnsUploadV2EditText;", "Lcom/tencent/mm/plugin/sns/ui/SnsEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SnsUploadV2EditText extends com.tencent.mm.plugin.sns.ui.SnsEditText {
    public SnsUploadV2EditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadV2EditText", "init: manual add emoji watcher");
        jg5.c.f299665a.b(this, 1);
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsEditText, com.tencent.mm.ui.widget.MMEditText, fl5.i
    public fl5.i getRealEditText() {
        return this;
    }

    @Override // com.tencent.mm.ui.widget.MMEditText, fl5.i
    public void n(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insetText", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadV2EditText");
        getEditableText().insert(getSelectionStart(), str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insetText", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadV2EditText");
    }
}
