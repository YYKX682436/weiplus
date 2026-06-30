package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class g4 implements com.tencent.mm.plugin.game.ui.w4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameLibraryUI f141398a;

    public g4(com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI) {
        this.f141398a = gameLibraryUI;
    }

    @Override // com.tencent.mm.plugin.game.ui.w4
    public void a(int i17) {
        com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI = this.f141398a;
        int firstVisiblePosition = gameLibraryUI.f140899d.getFirstVisiblePosition() - gameLibraryUI.C;
        int lastVisiblePosition = gameLibraryUI.f140899d.getLastVisiblePosition() - gameLibraryUI.C;
        if (i17 < firstVisiblePosition || i17 > lastVisiblePosition) {
            return;
        }
        gameLibraryUI.f140900e.j(gameLibraryUI.f140899d.getChildAt(i17 - firstVisiblePosition), i17);
    }
}
