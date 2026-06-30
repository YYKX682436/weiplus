package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class gs implements com.tencent.mm.plugin.sns.ui.widget.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bs f168462a;

    public gs(com.tencent.mm.plugin.sns.ui.bs bsVar) {
        this.f168462a = bsVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.g3
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSpread", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$6");
        this.f168462a.f168035a.notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSpread", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$6");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.g3
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$6");
        this.f168462a.f168035a.notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShrink", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$6");
    }
}
