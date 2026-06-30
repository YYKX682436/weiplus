package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class xi implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsHeader f171517d;

    public xi(com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader) {
        this.f171517d = snsHeader;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeader$6");
        java.lang.Integer num = (java.lang.Integer) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeader$6");
        int intValue = num.intValue();
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = this.f171517d;
        com.tencent.mm.plugin.sns.ui.widget.c3 b17 = com.tencent.mm.plugin.sns.ui.SnsHeader.b(snsHeader);
        b17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        int i17 = b17.f171099c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        if (intValue != i17) {
            com.tencent.mm.plugin.sns.ui.widget.c3 b18 = com.tencent.mm.plugin.sns.ui.SnsHeader.b(snsHeader);
            int intValue2 = num.intValue();
            b18.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            b18.f171099c = intValue2;
            com.tencent.mm.plugin.sns.ui.widget.o oVar = b18.f171105i;
            oVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            oVar.f171236b = intValue2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            com.tencent.mm.plugin.sns.ui.SnsHeader.b(snsHeader).i(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeader$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeader$6");
        return null;
    }
}
