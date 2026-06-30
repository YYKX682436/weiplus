package y94;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y94.f0 f460360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.String str, y94.f0 f0Var) {
        super(3);
        this.f460359d = str;
        this.f460360e = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$prepareAndPlayVideo$1");
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$prepareAndPlayVideo$1");
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(this.f460359d, true);
        if (d17 != null) {
            int i17 = d17.f162382a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
            y94.f0 f0Var = this.f460360e;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = f0Var.f460366h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
            if (recordConfigProvider == null) {
                kotlin.jvm.internal.o.o("configProvider");
                throw null;
            }
            if (i17 > recordConfigProvider.f155685w + 500) {
                ju3.d0 d0Var = f0Var.f465332d;
                kotlin.jvm.internal.o.e(d0Var, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) d0Var).findViewById(com.tencent.mm.R.id.n7i).performClick();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("EDIT_CROP_VIDEO_LENGTH_START_TIME_INT", 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = f0Var.f460366h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                if (recordConfigProvider2 == null) {
                    kotlin.jvm.internal.o.o("configProvider");
                    throw null;
                }
                bundle.putInt("EDIT_CROP_VIDEO_LENGTH_END_TIME_INT", recordConfigProvider2.f155685w);
                d0Var.w(ju3.c0.f301916y0, bundle);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$prepareAndPlayVideo$1");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$prepareAndPlayVideo$1");
        return f0Var2;
    }
}
