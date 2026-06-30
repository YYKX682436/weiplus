package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pc implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ad f113856d;

    public pc(com.tencent.mm.plugin.finder.live.plugin.ad adVar) {
        this.f113856d = adVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.plugin.finder.live.plugin.ad adVar = this.f113856d;
        android.view.View view = adVar.f111868x;
        if (view != null && view.getMeasuredWidth() == 0) {
            return;
        }
        android.view.View view2 = adVar.f111868x;
        if (view2 != null && view2.getMeasuredHeight() == 0) {
            return;
        }
        android.view.View view3 = adVar.f111868x;
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        com.tencent.mm.plugin.finder.live.plugin.ad.t1(adVar);
    }
}
