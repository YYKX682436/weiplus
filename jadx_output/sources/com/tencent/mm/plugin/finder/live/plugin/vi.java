package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vi implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wi f114727d;

    public vi(com.tencent.mm.plugin.finder.live.plugin.wi wiVar) {
        this.f114727d = wiVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f114727d.f114940p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.tencent.mm.plugin.finder.live.plugin.wi wiVar = this.f114727d;
        wiVar.f114948x = null;
        com.tencent.mm.plugin.finder.live.plugin.l.b1(wiVar, wiVar.f114940p, wiVar.f114941q, false, 4, null);
    }
}
