package y94;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f460373d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ju3.d0 d0Var) {
        super(0);
        this.f460373d = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$titleLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$titleLayout$2");
        java.lang.Object obj = this.f460373d;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.View findViewById = ((android.view.ViewGroup) obj).findViewById(com.tencent.mm.R.id.t0s);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$titleLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$titleLayout$2");
        return findViewById;
    }
}
