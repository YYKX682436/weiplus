package z35;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView f470008d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView) {
        super(0);
        this.f470008d = expandableHeroSeekBarView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (com.tencent.mm.ui.blur.mask.BlurMaskView) this.f470008d.findViewById(com.tencent.mm.R.id.vlx);
    }
}
