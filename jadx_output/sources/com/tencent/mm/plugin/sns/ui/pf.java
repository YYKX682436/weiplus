package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class pf implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f170214d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter f170215e;

    public pf(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        this.f170215e = snsCommentFooter;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f170215e;
        android.text.Editable text = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(snsCommentFooter).getText();
        java.util.List list = this.f170214d;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            text.removeSpan((android.text.style.ForegroundColorSpan) it.next());
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        linkedList.clear();
        java.lang.String obj = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(snsCommentFooter).getText().toString();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_enable_moments_chat_emoji_search_sync, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = snsCommentFooter.f167101r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (chatFooterPanel != null && fj6) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = snsCommentFooter.f167101r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            chatFooterPanel2.setToSendText(obj);
        }
        ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
        java.util.regex.Matcher matcher = com.tencent.mm.pluginsdk.ui.span.b0.f191186u.matcher(obj);
        while (matcher.find()) {
            matcher.group();
            int start = matcher.start();
            int end = matcher.end();
            android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(snsCommentFooter.getResources().getColor(com.tencent.mm.R.color.Link_100));
            linkedList.add(foregroundColorSpan);
            text.setSpan(foregroundColorSpan, start, end, 33);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
    }
}
