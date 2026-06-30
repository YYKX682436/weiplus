package s74;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f404249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404250e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.widget.FrameLayout frameLayout, s74.o0 o0Var) {
        super(0);
        this.f404249d = frameLayout;
        this.f404250e = o0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$2");
        this.f404249d.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f404250e.B(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$2");
        return f0Var;
    }
}
