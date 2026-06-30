package px2;

/* loaded from: classes2.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout f358868d;

    public b(com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout) {
        this.f358868d = finderLandscapePreviewLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout = this.f358868d;
        finderLandscapePreviewLayout.getIconLayout().getLocationOnScreen(iArr);
        finderLandscapePreviewLayout.getTopMask().getLayoutParams().height = finderLandscapePreviewLayout.getIconLayout().getHeight() + iArr[1] + ((int) finderLandscapePreviewLayout.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479723df));
    }
}
