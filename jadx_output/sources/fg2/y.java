package fg2;

/* loaded from: classes10.dex */
public final class y implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f262396a;

    public y(android.widget.RelativeLayout relativeLayout, android.widget.ImageView imageView, com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView, android.widget.RelativeLayout relativeLayout2, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f262396a = relativeLayout;
    }

    public static fg2.y a(android.view.View view) {
        int i17 = com.tencent.mm.R.id.agx;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(view, com.tencent.mm.R.id.agx);
        if (imageView != null) {
            i17 = com.tencent.mm.R.id.f483768c03;
            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView = (com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView) x4.b.a(view, com.tencent.mm.R.id.f483768c03);
            if (finderLiveGiftTextView != null) {
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
                i17 = com.tencent.mm.R.id.iy7;
                com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) x4.b.a(view, com.tencent.mm.R.id.iy7);
                if (mMPAGView != null) {
                    return new fg2.y(relativeLayout, imageView, finderLiveGiftTextView, relativeLayout, mMPAGView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262396a;
    }
}
