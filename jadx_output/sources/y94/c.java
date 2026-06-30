package y94;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f460356d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17) {
        super(2);
        this.f460356d = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$initThumbBarView$1");
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$initThumbBarView$1");
        java.lang.Integer valueOf = java.lang.Integer.valueOf((int) ((floatValue2 - floatValue) * this.f460356d));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$initThumbBarView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$initThumbBarView$1");
        return valueOf;
    }
}
