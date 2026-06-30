package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes10.dex */
public final class w5 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer f116771d;

    public w5(com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer finderLiveLikeContainer) {
        this.f116771d = finderLiveLikeContainer;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = {0, 0};
        com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer finderLiveLikeContainer = this.f116771d;
        finderLiveLikeContainer.getLocationInWindow(iArr);
        float f17 = 2;
        iArr[0] = (int) (iArr[0] + ((finderLiveLikeContainer.getScaleX() * finderLiveLikeContainer.getWidth()) / f17));
        iArr[1] = (int) (iArr[1] + ((finderLiveLikeContainer.getScaleY() * finderLiveLikeContainer.getHeight()) / f17));
        if (java.lang.Math.abs(finderLiveLikeContainer.K[0] - iArr[0]) <= 1) {
            if (java.lang.Math.abs(finderLiveLikeContainer.K[1] - iArr[1]) <= 1) {
                return;
            }
        }
        int[] iArr2 = finderLiveLikeContainer.K;
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        com.tencent.mars.xlog.Log.i(finderLiveLikeContainer.f115994v, "OnGlobalLayoutListener: " + iArr);
        finderLiveLikeContainer.B();
    }
}
