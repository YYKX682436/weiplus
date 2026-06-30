package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.c3 f171084d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(com.tencent.mm.plugin.sns.ui.widget.c3 c3Var) {
        super(1);
        this.f171084d = c3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$onOpenChanged$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$onOpenChanged$1");
        com.tencent.mm.plugin.sns.ui.widget.c3 c3Var = this.f171084d;
        if (booleanValue && c3Var.j() != 1 && c3Var.j() != 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            c3Var.f171101e = 2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            com.tencent.mm.plugin.sns.ui.widget.y2 y2Var = c3Var.f171102f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            if (y2Var != null) {
                y2Var.c(c3Var.j(), true);
            }
        } else if (!booleanValue && c3Var.j() != 0 && c3Var.j() != 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            c3Var.f171101e = 3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            com.tencent.mm.plugin.sns.ui.widget.y2 y2Var2 = c3Var.f171102f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            if (y2Var2 != null) {
                y2Var2.c(c3Var.j(), true);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$onOpenChanged$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$onOpenChanged$1");
        return f0Var;
    }
}
