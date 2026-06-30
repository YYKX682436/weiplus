package y94;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y94.a0 f460387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(y94.a0 a0Var) {
        super(0);
        this.f460387d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$context$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$context$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getParentLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.view.ViewGroup H = this.f460387d.H();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getParentLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.content.Context context = H.getContext();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$context$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$context$2");
        return context;
    }
}
