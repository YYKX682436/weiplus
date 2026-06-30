package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class uh implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f170580d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentUI f170581e;

    public uh(com.tencent.mm.plugin.sns.ui.SnsCommentUI snsCommentUI) {
        this.f170581e = snsCommentUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
        com.tencent.mm.plugin.sns.ui.SnsCommentUI snsCommentUI = this.f170581e;
        android.text.Editable text = com.tencent.mm.plugin.sns.ui.SnsCommentUI.T6(snsCommentUI).getText();
        java.util.List list = this.f170580d;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            text.removeSpan((android.text.style.ForegroundColorSpan) it.next());
        }
        ((java.util.LinkedList) list).clear();
        java.lang.String obj = com.tencent.mm.plugin.sns.ui.SnsCommentUI.T6(snsCommentUI).getText().toString();
        ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
        java.util.regex.Matcher matcher = com.tencent.mm.pluginsdk.ui.span.b0.f191186u.matcher(obj);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(snsCommentUI.getResources().getColor(com.tencent.mm.R.color.Link_100));
            ((java.util.LinkedList) list).add(foregroundColorSpan);
            text.setSpan(foregroundColorSpan, start, end, 33);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
    }
}
