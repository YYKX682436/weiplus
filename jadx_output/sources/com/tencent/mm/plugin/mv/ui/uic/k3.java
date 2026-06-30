package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class k3 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h4 f151245d;

    public k3(com.tencent.mm.plugin.mv.ui.uic.h4 h4Var) {
        this.f151245d = h4Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "initEditUI: " + i18 + ", " + i27 + "; " + i29 + ", " + i38);
        this.f151245d.f151168o.f151158a = i19 - i17;
    }
}
