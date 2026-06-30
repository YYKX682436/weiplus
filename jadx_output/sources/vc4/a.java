package vc4;

/* loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter f435273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter) {
        super(1);
        this.f435273d = improveItemFooter;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$1");
        java.lang.String localId = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$1");
        kotlin.jvm.internal.o.g(localId, "localId");
        com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter = this.f435273d;
        zc4.b b17 = com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.b(improveItemFooter);
        if (kotlin.jvm.internal.o.b(localId, (b17 == null || (n17 = b17.n()) == null) ? null : n17.W0())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getHolder$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter");
            in5.s0 s0Var = improveItemFooter.f169077d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getHolder$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter");
            if (s0Var != null && com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.b(improveItemFooter) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getHolder$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter");
                in5.s0 s0Var2 = improveItemFooter.f169077d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getHolder$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter");
                kotlin.jvm.internal.o.d(s0Var2);
                zc4.b b18 = com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter.b(improveItemFooter);
                kotlin.jvm.internal.o.d(b18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPosition$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter");
                int i17 = improveItemFooter.f169080g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPosition$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getViewType$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter");
                int i18 = improveItemFooter.f169079f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getViewType$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter");
                improveItemFooter.j(s0Var2, b18, i17, i18);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$1");
        return f0Var;
    }
}
