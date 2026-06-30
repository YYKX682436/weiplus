package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nb implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.tb f113606d;

    public nb(com.tencent.mm.plugin.finder.live.plugin.tb tbVar) {
        this.f113606d = tbVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean isShown;
        com.tencent.mm.plugin.finder.live.plugin.tb tbVar = this.f113606d;
        if (tbVar.t1().isShown()) {
            jz5.g gVar = com.tencent.mm.plugin.finder.live.plugin.tb.B;
            jz5.g gVar2 = com.tencent.mm.plugin.finder.live.plugin.tb.B;
            if (((android.graphics.Rect) ((jz5.n) gVar2).getValue()).right > 0 && ((android.graphics.Rect) ((jz5.n) gVar2).getValue()).bottom > 0) {
                android.graphics.Rect rect = new android.graphics.Rect();
                tbVar.t1().getGlobalVisibleRect(rect);
                isShown = tbVar.t1().isShown() && rect.intersect((android.graphics.Rect) ((jz5.n) gVar2).getValue());
                tbVar.z1(isShown);
            }
        }
        isShown = tbVar.t1().isShown();
        tbVar.z1(isShown);
    }
}
