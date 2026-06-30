package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class b implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter f171081d;

    public b(com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter) {
        this.f171081d = absSnsUploadSayFooter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$2");
        int i17 = com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter.f170755t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        final com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter = this.f171081d;
        absSnsUploadSayFooter.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toggleSmileyPanel", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        int visibility = absSnsUploadSayFooter.f170757g.getVisibility();
        com.tencent.mm.ui.MMActivity mMActivity = absSnsUploadSayFooter.f170756f;
        if (visibility == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUpload.AbsSayFooter", "toggleSmileyPanel: showSmileyPanel");
            absSnsUploadSayFooter.h();
            mMActivity.hideVKB();
            absSnsUploadSayFooter.f170758h.k();
            absSnsUploadSayFooter.f170759i.setImageResource(absSnsUploadSayFooter.f170766s);
            absSnsUploadSayFooter.f170759i.setContentDescription(mMActivity.getString(com.tencent.mm.R.string.f493209jb0));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUpload.AbsSayFooter", "toggleSmileyPanel: hideSmileyPanel");
            absSnsUploadSayFooter.f170758h.k();
            mMActivity.showVKB();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            absSnsUploadSayFooter.f170763p = false;
            absSnsUploadSayFooter.f170757g.h();
            absSnsUploadSayFooter.getInputPanelHelper().f5900t = new al5.d0() { // from class: com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$$a
                @Override // al5.d0
                public final void a(boolean z17) {
                    int i18 = com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter.f170755t;
                    com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter2 = com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter.this;
                    absSnsUploadSayFooter2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$hideSmileyPanel$0", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
                    if (z17) {
                        absSnsUploadSayFooter2.f170757g.setVisibility(8);
                    }
                    absSnsUploadSayFooter2.getInputPanelHelper().f5900t = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$hideSmileyPanel$0", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
                }
            };
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            absSnsUploadSayFooter.f170759i.setImageResource(absSnsUploadSayFooter.f170765r);
            absSnsUploadSayFooter.f170759i.setContentDescription(mMActivity.getString(com.tencent.mm.R.string.j_i));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toggleSmileyPanel", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter$2");
        return null;
    }
}
