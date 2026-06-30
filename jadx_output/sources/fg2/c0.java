package fg2;

/* loaded from: classes10.dex */
public final class c0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.RoundCornerRelativeLayout f261957a;

    public c0(com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout, com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView, com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout2, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f261957a = roundCornerRelativeLayout;
    }

    public static fg2.c0 a(android.view.View view) {
        int i17 = com.tencent.mm.R.id.f483768c03;
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView = (com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView) x4.b.a(view, com.tencent.mm.R.id.f483768c03);
        if (finderLiveGiftTextView != null) {
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) view;
            com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) x4.b.a(view, com.tencent.mm.R.id.iy7);
            if (mMPAGView != null) {
                return new fg2.c0(roundCornerRelativeLayout, finderLiveGiftTextView, roundCornerRelativeLayout, mMPAGView);
            }
            i17 = com.tencent.mm.R.id.iy7;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f261957a;
    }
}
