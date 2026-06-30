package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class s2 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDetailUI2 f141753d;

    public s2(com.tencent.mm.plugin.game.ui.GameDetailUI2 gameDetailUI2) {
        this.f141753d = gameDetailUI2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.game.ui.GameDetailUI2 gameDetailUI2 = this.f141753d;
        if (gameDetailUI2.f140750i.getLineCount() > 3) {
            gameDetailUI2.f140751m.setVisibility(0);
        } else {
            gameDetailUI2.f140751m.setVisibility(8);
        }
    }
}
