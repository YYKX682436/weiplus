package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class re implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f114128d;

    public re(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f114128d = mgVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int i39 = i19 - i17;
        if (i37 - i28 != i39) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "new List width: " + i65.a.c(view.getContext(), i39));
            ((we2.s) this.f114128d.S0().a(we2.s.class)).f445257i = i39;
        }
    }
}
