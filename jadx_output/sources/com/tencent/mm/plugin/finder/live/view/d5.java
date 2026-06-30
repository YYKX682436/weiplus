package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class d5 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 f116245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f116246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f116247f;

    public d5(com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 finderLiveFloatContainerV2, boolean z17, yz5.a aVar) {
        this.f116245d = finderLiveFloatContainerV2;
        this.f116246e = z17;
        this.f116247f = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 finderLiveFloatContainerV2 = this.f116245d;
        finderLiveFloatContainerV2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "showStatePanel: global layout");
        if (finderLiveFloatContainerV2.f115874e || finderLiveFloatContainerV2.f115877h) {
            com.tencent.mars.xlog.Log.i("FinderLiveFloatContainerV2", "showStatePanel: reset position,isFirstShow:" + finderLiveFloatContainerV2.f115874e + ",shouldResetPosition:" + finderLiveFloatContainerV2.f115877h + ",defaultX:" + finderLiveFloatContainerV2.f115875f + ",defaultY:" + finderLiveFloatContainerV2.f115876g);
            finderLiveFloatContainerV2.j(finderLiveFloatContainerV2.f115875f, finderLiveFloatContainerV2.f115876g);
            finderLiveFloatContainerV2.f(false);
        } else {
            finderLiveFloatContainerV2.i(false);
        }
        finderLiveFloatContainerV2.f115874e = false;
        finderLiveFloatContainerV2.b();
        android.animation.ValueAnimator valueAnimator = finderLiveFloatContainerV2.f115887u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        finderLiveFloatContainerV2.f115887u = null;
        boolean z17 = this.f116246e;
        yz5.a aVar = this.f116247f;
        if (!z17) {
            finderLiveFloatContainerV2.setAlpha(1.0f);
            finderLiveFloatContainerV2.f115881o = false;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        finderLiveFloatContainerV2.setAlpha(0.0f);
        finderLiveFloatContainerV2.f115881o = true;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(finderLiveFloatContainerV2.f115889w);
        ofFloat.addListener(new com.tencent.mm.plugin.finder.live.view.b5(finderLiveFloatContainerV2, aVar));
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.live.view.c5(finderLiveFloatContainerV2));
        ofFloat.start();
        finderLiveFloatContainerV2.f115887u = ofFloat;
    }
}
