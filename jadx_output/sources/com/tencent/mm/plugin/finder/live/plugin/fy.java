package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fy implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f112609d;

    public fy(com.tencent.mm.plugin.finder.live.plugin.ty tyVar) {
        this.f112609d = tyVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f112609d;
        tyVar.G.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        tyVar.G.scrollBy(0, 1);
    }
}
