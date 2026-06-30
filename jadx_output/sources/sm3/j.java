package sm3;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm3.n f409878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp4.a f409879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sm3.o f409880f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(sm3.n nVar, kp4.a aVar, sm3.o oVar) {
        super(1);
        this.f409878d = nVar;
        this.f409879e = aVar;
        this.f409880f = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.tencent.mm.plugin.mv.ui.widget.RangeSliderView rangeSliderView = this.f409878d.f409893e;
        rangeSliderView.setProgress(rangeSliderView.getStart() + ((int) (((float) (longValue - this.f409879e.f311080j)) * this.f409880f.f409897e.getWidthPerMills())));
        return jz5.f0.f302826a;
    }
}
