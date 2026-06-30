package fg2;

/* loaded from: classes10.dex */
public final class a0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f261936a;

    public a0(android.widget.RelativeLayout relativeLayout, com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView, android.widget.RelativeLayout relativeLayout2, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f261936a = relativeLayout;
    }

    public static fg2.a0 a(android.view.View view) {
        int i17 = com.tencent.mm.R.id.f483768c03;
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView = (com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView) x4.b.a(view, com.tencent.mm.R.id.f483768c03);
        if (finderLiveGiftTextView != null) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
            com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) x4.b.a(view, com.tencent.mm.R.id.iy7);
            if (mMPAGView != null) {
                return new fg2.a0(relativeLayout, finderLiveGiftTextView, relativeLayout, mMPAGView);
            }
            i17 = com.tencent.mm.R.id.iy7;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f261936a;
    }
}
