package nc4;

/* loaded from: classes4.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc4.c f336176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nc4.d0 f336177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f336178f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(nc4.c cVar, nc4.d0 d0Var, boolean z17) {
        super(1);
        this.f336176d = cVar;
        this.f336177e = d0Var;
        this.f336178f = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1$1");
        nc4.c cVar = this.f336176d;
        int type = cVar.type();
        int h17 = nc4.d.f336127i.h();
        nc4.d0 d0Var = this.f336177e;
        if (type == h17) {
            int type2 = cVar.type();
            int i17 = booleanValue ? 1 : 2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$report", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
            d0Var.S6(type2, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$report", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        } else {
            int type3 = cVar.type();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report$default", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
            d0Var.S6(type3, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report$default", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        }
        xa4.b.f452821a.a(this.f336178f, cVar.type(), 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$2$1$1");
        return f0Var;
    }
}
