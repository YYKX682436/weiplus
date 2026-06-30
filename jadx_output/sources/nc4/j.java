package nc4;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc4.d0 f336159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(nc4.d0 d0Var) {
        super(0);
        this.f336159d = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$entranceMap$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$entranceMap$2");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        nc4.d0 d0Var = this.f336159d;
        nc4.d0.O6(d0Var, linkedHashMap, new nc4.g0(d0Var.getContext()));
        nc4.d0.O6(d0Var, linkedHashMap, new nc4.b(d0Var.getContext()));
        nc4.d0.O6(d0Var, linkedHashMap, new nc4.h(d0Var.getContext()));
        nc4.d0.O6(d0Var, linkedHashMap, new nc4.j0(d0Var.getContext()));
        nc4.d0.O6(d0Var, linkedHashMap, new nc4.k0(d0Var.getContext()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$entranceMap$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$entranceMap$2");
        return linkedHashMap;
    }
}
