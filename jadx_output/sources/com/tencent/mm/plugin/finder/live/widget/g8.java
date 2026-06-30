package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class g8 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.i8 f118413d;

    public g8(com.tencent.mm.plugin.finder.live.widget.i8 i8Var) {
        this.f118413d = i8Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        view.removeOnLayoutChangeListener(this);
        com.tencent.mm.plugin.finder.live.widget.i8.e0(this.f118413d);
    }
}
