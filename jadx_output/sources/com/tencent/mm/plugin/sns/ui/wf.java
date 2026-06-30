package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class wf implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public int f170747d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter f170748e;

    public wf(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        this.f170748e = snsCommentFooter;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$4");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f170748e;
        if (com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(snsCommentFooter).getText() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$4");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget snsEditTipsWidget = snsCommentFooter.f167103t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        snsEditTipsWidget.b(com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(snsCommentFooter).getText().toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int i17 = snsCommentFooter.f167106w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (com.tencent.mm.plugin.sns.ui.widget.t2.i(i17, 8) && !com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.sns.ui.SnsCommentFooter.m(snsCommentFooter)) && com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(snsCommentFooter).getText() != null && !com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(snsCommentFooter).getText().toString().startsWith(com.tencent.mm.plugin.sns.ui.SnsCommentFooter.m(snsCommentFooter))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "cur text %s", com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(snsCommentFooter).getText());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            snsCommentFooter.D = "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            snsCommentFooter.f167105v = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            snsCommentFooter.V(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            snsCommentFooter.f167107x = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        }
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter.l(snsCommentFooter).k();
        boolean n17 = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.n(snsCommentFooter);
        if (n17 && snsCommentFooter.D1) {
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter.h(snsCommentFooter, n17);
            snsCommentFooter.D1 = false;
        }
        if (!n17) {
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter.h(snsCommentFooter, n17);
            snsCommentFooter.D1 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$4");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$4");
        this.f170747d = charSequence == null ? 0 : charSequence.length();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$4");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$4");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f170748e;
        if (charSequence == null || charSequence.length() < q94.a.f360928a) {
            snsCommentFooter.V(16);
        } else if (charSequence.length() - this.f170747d > q94.a.f360928a) {
            snsCommentFooter.setCommentFlag(16);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$4");
    }
}
