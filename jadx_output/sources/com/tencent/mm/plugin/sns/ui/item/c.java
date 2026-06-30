package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class c implements com.tencent.mm.plugin.sns.ui.widget.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bs f169324a;

    public c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem, com.tencent.mm.plugin.sns.ui.bs bsVar) {
        this.f169324a = bsVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.g3
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSpread", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$2");
        ((com.tencent.mm.plugin.sns.ui.gs) this.f169324a.H).a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSpread", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.g3
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$2");
        ((com.tencent.mm.plugin.sns.ui.gs) this.f169324a.H).b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$2");
    }
}
