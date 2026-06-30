package wl4;

/* loaded from: classes14.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.playapp.custom.TingCustomFlotBallView f447090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.ting.playapp.custom.TingCustomFlotBallView tingCustomFlotBallView) {
        super(0);
        this.f447090d = tingCustomFlotBallView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f447090d.f174719d;
        if (mMRoundCornerImageView != null) {
            mMRoundCornerImageView.setImageResource(((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ui());
        }
        return jz5.f0.f302826a;
    }
}
