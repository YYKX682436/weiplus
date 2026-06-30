package y94;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f460354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ju3.d0 d0Var) {
        super(0);
        this.f460354d = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$cropThumbView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$cropThumbView$2");
        java.lang.Object obj = this.f460354d;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.ViewGroup");
        com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView editVideoSeekBarView = (com.tencent.mm.plugin.recordvideo.plugin.cropvideo.EditVideoSeekBarView) ((android.view.ViewGroup) obj).findViewById(com.tencent.mm.R.id.ckv);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$cropThumbView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$cropThumbView$2");
        return editVideoSeekBarView;
    }
}
