package cw2;

/* loaded from: classes2.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout f223963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout) {
        super(0);
        this.f223963d = finderFeedNewSeekBarLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout = this.f223963d;
        android.view.View A = com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout.A(finderFeedNewSeekBarLayout, com.tencent.mm.R.id.ehd);
        if (A != null) {
            if (!(A.getVisibility() == 0)) {
                A = null;
            }
            if (A != null) {
                return A;
            }
        }
        return com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout.A(finderFeedNewSeekBarLayout, com.tencent.mm.R.id.f487278o45);
    }
}
