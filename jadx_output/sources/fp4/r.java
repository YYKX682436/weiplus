package fp4;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp4.s f265373d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(fp4.s sVar) {
        super(0);
        this.f265373d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup timeCropViewGroup = (com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup) ((android.view.ViewGroup) ((jz5.n) this.f265373d.f265375g).getValue()).findViewById(com.tencent.mm.R.id.f487391oi4);
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar seekSlider = timeCropViewGroup.getSeekSlider();
        if (seekSlider != null) {
            seekSlider.d();
        }
        return timeCropViewGroup;
    }
}
