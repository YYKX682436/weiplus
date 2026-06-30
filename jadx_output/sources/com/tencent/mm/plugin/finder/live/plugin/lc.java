package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lc extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nc f113375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f113376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f113377f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jc f113378g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f113379h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f113380i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f113381m;

    public lc(com.tencent.mm.plugin.finder.live.plugin.nc ncVar, android.view.View view, android.view.View view2, com.tencent.mm.plugin.finder.live.plugin.jc jcVar, int i17, yz5.a aVar, yz5.a aVar2) {
        this.f113375d = ncVar;
        this.f113376e = view;
        this.f113377f = view2;
        this.f113378g = jcVar;
        this.f113379h = i17;
        this.f113380i = aVar;
        this.f113381m = aVar2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.nc.a(this.f113375d, this.f113376e, this.f113377f, this.f113378g);
        java.lang.String str = "Animation cancelled for buttonType: " + this.f113379h;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("FinderLiveButtonEnhanceInteractionAnimator", str, null);
        yz5.a aVar = this.f113381m;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.nc.a(this.f113375d, this.f113376e, this.f113377f, this.f113378g);
        java.lang.String str = "Animation completed for buttonType: " + this.f113379h;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("FinderLiveButtonEnhanceInteractionAnimator", str, null);
        yz5.a aVar = this.f113380i;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
