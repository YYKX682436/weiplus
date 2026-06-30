package fg2;

/* loaded from: classes10.dex */
public final class j1 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f262109a;

    public j1(android.widget.RelativeLayout relativeLayout, com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView, com.tencent.mm.view.MMPAGView mMPAGView, android.widget.RelativeLayout relativeLayout2) {
        this.f262109a = relativeLayout;
    }

    public static fg2.j1 a(android.view.View view) {
        int i17 = com.tencent.mm.R.id.eog;
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView = (com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView) x4.b.a(view, com.tencent.mm.R.id.eog);
        if (finderLiveGiftTextView != null) {
            i17 = com.tencent.mm.R.id.eoi;
            com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) x4.b.a(view, com.tencent.mm.R.id.eoi);
            if (mMPAGView != null) {
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
                return new fg2.j1(relativeLayout, finderLiveGiftTextView, mMPAGView, relativeLayout);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262109a;
    }
}
