package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jv implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.lv f113169d;

    public jv(com.tencent.mm.plugin.finder.live.plugin.lv lvVar) {
        this.f113169d = lvVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        if (i17 == i28 && i18 == i29 && i19 == i37 && i27 == i38) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLeftBubbleAreaPlugin", "addOnLayoutChangeListener change");
        com.tencent.mm.plugin.finder.live.plugin.lv lvVar = this.f113169d;
        lvVar.getClass();
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.kv(lvVar));
        lvVar.f113438p.d();
    }
}
