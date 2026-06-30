package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class zc implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ad f210949a;

    public zc(com.tencent.mm.ui.tools.ad adVar) {
        this.f210949a = adVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.ui.tools.ad adVar = this.f210949a;
        if (adVar.f210278d.f210236x != null) {
            h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
            com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = adVar.f210278d;
            ((g90.s) vVar).ij(showVideoUI, showVideoUI.f210236x, 2, 4, 4, new java.util.HashMap());
        }
        adVar.f210278d.finish();
        adVar.f210278d.overridePendingTransition(0, 0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
