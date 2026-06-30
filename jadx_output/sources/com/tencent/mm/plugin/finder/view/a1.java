package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class a1 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.c1 f131611d;

    public a1(com.tencent.mm.plugin.finder.view.c1 c1Var) {
        this.f131611d = c1Var;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        com.tencent.mm.plugin.finder.view.c1 c1Var = this.f131611d;
        com.tencent.mars.xlog.Log.i(c1Var.I, "KeyboardHeightObserver " + i17 + ' ' + z17);
        android.view.View view = c1Var.f212027f;
        if (view != null) {
            view.setPadding(0, 0, 0, i17);
        }
    }
}
