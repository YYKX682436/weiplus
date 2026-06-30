package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes10.dex */
public final class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer f116737d;

    public v5(com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer finderLiveLikeContainer) {
        this.f116737d = finderLiveLikeContainer;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer finderLiveLikeContainer = this.f116737d;
        android.os.Vibrator vibrator = finderLiveLikeContainer.M;
        if (vibrator != null) {
            try {
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(android.os.VibrationEffect.createOneShot(10L, 255));
                } else {
                    vibrator.vibrate(10L);
                }
            } catch (java.lang.SecurityException e17) {
                com.tencent.mars.xlog.Log.e(finderLiveLikeContainer.f115994v, "Vibrate permission denied: " + e17.getMessage());
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e(finderLiveLikeContainer.f115994v, "Vibrate failed: " + e18.getMessage());
            }
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer.A(finderLiveLikeContainer, false);
        finderLiveLikeContainer.G.postDelayed(this, 200L);
    }
}
