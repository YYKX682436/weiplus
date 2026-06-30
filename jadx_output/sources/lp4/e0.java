package lp4;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp4.f0 f320341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(lp4.f0 f0Var) {
        super(0);
        this.f320341d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup timeCropViewGroup = (com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup) ((android.view.ViewGroup) ((jz5.n) this.f320341d.f320344g).getValue()).findViewById(com.tencent.mm.R.id.f487391oi4);
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar seekSlider = timeCropViewGroup.getSeekSlider();
        if (seekSlider != null) {
            seekSlider.d();
        }
        return timeCropViewGroup;
    }
}
