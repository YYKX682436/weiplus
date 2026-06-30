package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class ap implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.cp f131678d;

    public ap(com.tencent.mm.plugin.finder.view.cp cpVar) {
        this.f131678d = cpVar;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        android.view.Window b17;
        android.view.View decorView;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTeamInputCoinValueBottomPage", "KeyboardHeightObserver " + i17 + ' ' + z17);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f131678d.f211798d;
        if (y1Var == null || (b17 = y1Var.b()) == null || (decorView = b17.getDecorView()) == null) {
            return;
        }
        decorView.setPadding(0, 0, 0, i17);
    }
}
