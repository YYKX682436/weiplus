package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class fu implements fl5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.hu f168360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter f168361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fl5.i f168362c;

    public fu(com.tencent.mm.plugin.sns.ui.hu huVar, com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter, fl5.i iVar) {
        this.f168360a = huVar;
        this.f168361b = absSnsUploadSayFooter;
        this.f168362c = iVar;
    }

    @Override // fl5.h
    public final void a(int i17, int i18, android.text.Layout layout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSelectionChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$2");
        com.tencent.mm.plugin.sns.ui.hu huVar = this.f168360a;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.hu.c(huVar), "onSelectionChanged: selStart = selEnd = 0, skip");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectionChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$2");
            return;
        }
        com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter = this.f168361b;
        int i19 = pm0.v.r(absSnsUploadSayFooter).top;
        com.tencent.mm.plugin.sns.ui.hu.c(huVar);
        this.f168362c.j().getScrollY();
        if (absSnsUploadSayFooter.getVisibility() != 0 || i19 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            huVar.f168539f = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            com.tencent.mm.plugin.sns.ui.hu.c(huVar);
        } else {
            com.tencent.mm.plugin.sns.ui.hu.b(huVar, com.tencent.mm.plugin.sns.ui.hu.a(huVar, i17, layout, i19));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectionChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$2");
    }
}
