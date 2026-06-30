package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class d0 implements com.tencent.mm.plugin.game.ui.w4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameCategoryUI f141357a;

    public d0(com.tencent.mm.plugin.game.ui.GameCategoryUI gameCategoryUI) {
        this.f141357a = gameCategoryUI;
    }

    @Override // com.tencent.mm.plugin.game.ui.w4
    public void a(int i17) {
        com.tencent.mm.plugin.game.ui.GameCategoryUI gameCategoryUI = this.f141357a;
        int firstVisiblePosition = gameCategoryUI.f140685d.getFirstVisiblePosition();
        int lastVisiblePosition = gameCategoryUI.f140685d.getLastVisiblePosition();
        if (i17 < firstVisiblePosition || i17 > lastVisiblePosition) {
            return;
        }
        gameCategoryUI.f140686e.j(gameCategoryUI.f140685d.getChildAt(i17 - firstVisiblePosition), i17);
    }
}
