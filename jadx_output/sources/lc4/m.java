package lc4;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final lc4.m f317971d = new lc4.m();

    public m() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadFront$2$2");
        ym3.d it = (ym3.d) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadFront$2$2");
        kotlin.jvm.internal.o.g(it, "it");
        java.util.ArrayList O6 = com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.O6();
        java.util.ArrayList arrayList = it.f463149c;
        java.util.Set d07 = kz5.n0.d0(O6, kz5.n0.X0(arrayList));
        if (!d07.isEmpty()) {
            java.util.Set Y0 = kz5.n0.Y0(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.O6(), arrayList);
            com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.O6().clear();
            arrayList.clear();
            arrayList.addAll(Y0);
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataUIC", "intersectResult size:" + d07.size());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadFront$2$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadFront$2$2");
        return f0Var;
    }
}
