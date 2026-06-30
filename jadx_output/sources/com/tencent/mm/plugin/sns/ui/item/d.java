package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class d implements w64.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bs f169325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder f169326b;

    public d(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem, com.tencent.mm.plugin.sns.ui.bs bsVar, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        this.f169325a = bsVar;
        this.f169326b = baseViewHolder;
    }

    @Override // w64.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$3");
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169325a.f168039e;
        if (iVar != null) {
            iVar.N(this.f169326b);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$3");
    }

    @Override // w64.l
    public android.view.View b() {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$3");
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f169326b;
        if (baseViewHolder instanceof com.tencent.mm.plugin.sns.ui.item.k) {
            viewGroup = ((com.tencent.mm.plugin.sns.ui.item.k) baseViewHolder).E0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$3");
        } else if (baseViewHolder instanceof com.tencent.mm.plugin.sns.ui.item.y) {
            viewGroup = (android.view.ViewGroup) ((com.tencent.mm.plugin.sns.ui.item.y) baseViewHolder).D0.f425165z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$3");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$3");
            viewGroup = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$3");
        return viewGroup;
    }
}
