package s74;

/* loaded from: classes4.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s74.o2 o2Var) {
        super(0);
        this.f404478d = snsInfo;
        this.f404479e = o2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ad.widget.living.v R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$1");
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(this.f404478d) && (R = this.f404479e.R()) != null) {
            R.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$1");
        return f0Var;
    }
}
